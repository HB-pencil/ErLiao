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
 * Created by dell on 2017/2/2.泌尿系统疾病Fragment。
 */
public class urinationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //三级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层实例化
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("肾小球炎");
        diease1.setContent("[取穴]  肾、肝、脾、肺、三焦、过敏区、肾上腺、肾炎点、内分泌、耳尖放血");
        mList.add(diease1);

        Diease diease2 = new Diease();
        diease2.setTitle("肾盂肾炎");
        diease2.setContent("[取穴]  主穴：肾、尿道、三焦、内分泌、脾、耳尖  配穴：肝、膝胱");
        mList.add(diease2);


        //适配器
        MyAdapter adapter = new MyAdapter(mList);
        mRecyclerView.setAdapter(adapter);

        return view;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mTextViewo;
        TextView mTextViewt;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewo = (TextView) itemView.findViewById(R.id.text_one);
            mTextViewt = (TextView) itemView.findViewById(R.id.text_two);

        }
        public void bindData(Diease diease){
            mTextViewo.setText(diease.getTitle());
            mTextViewt.setText(diease.getContent());
        }

    }

    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

        private List<Diease> mList;

        public MyAdapter(List<Diease> lists){
            mList = lists;
        }

        @Override
        public MyViewHolder onCreateViewHolder (ViewGroup viewGroup,int ViewType){
            LayoutInflater layout = LayoutInflater.from(getActivity());
            View view = layout.inflate(R.layout.list_item_second,viewGroup,false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder,int position){
            holder.bindData(mList.get(position));
        }

        @Override
        public int getItemCount(){
            return mList.size();
        }
    }
}
