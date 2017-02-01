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
 * Created by dell on 2017/2/1.消化系统疾病fragment。
 */
public class digestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup,Bundle savedInstanceState){
          View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);
        //二级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.one);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<String> mList = new ArrayList<>();
        mList.add("胃炎");
        mList.add("胃、十二指肠溃疡");
        mList.add("十二指肠球炎");
        mList.add("急性胃肠炎");
        mList.add("胰腺炎");
        mList.add("便秘");
        mList.add("腹泻");
        mList.add("反酸、恶心");
        mList.add("膈肌痉挛(呃逆)");
        mList.add("食管炎");
        mList.add("胃肠功能紊乱");
        mList.add("消化不良");
        mList.add("慢性肝炎");
        mList.add("肝炎后综合症");


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
