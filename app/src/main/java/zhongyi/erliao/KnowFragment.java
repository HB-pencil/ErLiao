package zhongyi.erliao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/18.耳疗知识内容
 */
public class KnowFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //一级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
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


    private class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

         TextView mTextView;

         public MyViewHolder(View itemView){
             super(itemView);
             itemView.setOnClickListener(this);
            mTextView = (TextView) itemView;
        }

        @Override
        public void onClick(View view){
            if(mTextView.getText().toString().equals("第一节 内科疾病")){
               Intent intent = neikeActivity.newInstance(getActivity());
               startActivity(intent);

            }else if(mTextView.getText().toString().equals("第二节 外科疾病")){
                Intent intent = waikeActivity.newInstance(getActivity());
                startActivity(intent);
            }else if(mTextView.getText().toString().equals("第三节 五官科疾病")){
                Intent intent = organsActivity.newInstance(getActivity());
                startActivity(intent);
            }else if(mTextView.getText().toString().equals("第四节 妇科疾病")){
                Intent intent = gynaecologyActivity.newInstance(getActivity());
                startActivity(intent);
            }else if(mTextView.getText().toString().equals("第五节 皮肤病")){
                Intent intent = skinActivity.newInstance(getActivity());
                startActivity(intent);
            }else if(mTextView.getText().toString().equals("第六节 耳穴防病")){
                Intent intent = precautionActivity.newInstance(getActivity());
                startActivity(intent);
            }
            else{
                Toast.makeText(getActivity(),"Click",Toast.LENGTH_SHORT).show();
            }
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
