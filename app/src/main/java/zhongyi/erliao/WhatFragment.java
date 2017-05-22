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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/18.
 */
public class WhatFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.what_layout,viewGroup,false);

        //列表
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.what_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        //数据
        List<String> mList = new ArrayList<>();
        mList.add("一、耳穴简介");
        mList.add("二、耳穴亚豆法原理");
        mList.add("三、操作");
        mList.add("四、注意事项");

        recyclerView.setAdapter(new cusAdapter(mList));

        return view;
    }

    private class cusViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;
        public cusViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            textView = (TextView) itemView;
        }
        @Override
        public void onClick(View view){
            if(textView.getText().toString().equals("一、耳穴简介")){
                Intent intent = pointIntroduce.newInstance(getActivity());
                startActivity(intent);
            }else if(textView.getText().toString().equals("二、耳穴亚豆法原理")){
                Intent intent = pointTheory.newInstance(getActivity());
                startActivity(intent);
            }else if(textView.getText().toString().equals("三、操作")){
                Intent intent = pointOperation.newInstance(getActivity());
                startActivity(intent);
            }else if(textView.getText().toString().equals("四、注意事项")){
                Intent intent = new Intent(pointNotice.newInstance(getActivity()));
                startActivity(intent);
            }
        }
    }

    private class cusAdapter extends RecyclerView.Adapter<cusViewHolder>{
        private List<String> mList;

        public cusAdapter(List<String> list){
            mList = list;
        }

        @Override
        public cusViewHolder onCreateViewHolder(ViewGroup viewGroup,int ViewType){
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater.inflate(android.R.layout.simple_list_item_1,viewGroup,false);

            return new cusViewHolder(view);
        }
        @Override
        public void onBindViewHolder(cusViewHolder holder,int position){
            holder.textView.setText(mList.get(position));
        }
        @Override
        public int getItemCount(){
            return mList.size();
        }
    }
}
