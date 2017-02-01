package zhongyi.erliao;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/18.
 */
public class KnowFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.know_list_fragment_item,viewGroup,false);

        //一级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.one);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<String> mList = new ArrayList<>();
        mList.add("第一节 内科疾病");
        mList.add("第二节 外科疾病");
        mList.add("第三节 五官科疾病");
        mList.add("第四节 妇科疾病");
        mList.add("第五节 皮肤病");
        mList.add("第六节 耳穴防病");

        //适配器
        MyAdapter adapter = new MyAdapter(mList);
        mRecyclerView.setAdapter(adapter);

        return view;
    }


    private class MyViewHolder extends RecyclerView.ViewHolder{

         TextView mTextView;

         public MyViewHolder(View itemView){
             super(itemView);
            mTextView = (TextView) itemView;
        }

    }

    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

        private List<String> mList;

        public MyAdapter(List<String> lists){
            mList = lists;
        }

        @Override
        public MyViewHolder onCreateViewHolder (ViewGroup viewGroup,int ViewType){
            LayoutInflater layout = LayoutInflater.from(getActivity());
            View view = layout.inflate(android.R.layout.simple_list_item_1,viewGroup,false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder,int position){
            holder.mTextView.setText(mList.get(position));
        }

        @Override
        public int getItemCount(){
            return mList.size();
        }
    }
}
