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
 * Created by dell on 2017/2/3.耳穴防病Fragment
 */
public class precautionFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //二级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("预防感冒");
        diease1.setContent("[取穴]  耳尖放血、过敏区、内分泌、肾上腺、内鼻、肺、脾");
        mList.add(diease1);
        Diease diease2 = new Diease();
        diease2.setTitle("预防晕车、晕船、晕机");
        diease2.setContent("[取穴]  贲门、胃、枕、晕点、内耳、皮质下，汽油等异味过敏加过敏区");
        mList.add(diease2);
        Diease diease3 = new Diease();
        diease3.setTitle("预防输血(液)反应");
        diease3.setContent("[取穴]  肾上腺、过敏区、内分泌、神门");
        mList.add(diease3);
        Diease diease4 = new Diease();
        diease4.setTitle("戒烟");
        diease4.setContent("[取穴]  神门、肺、口");
        mList.add(diease4);
        Diease diease5 = new Diease();
        diease5.setTitle("竞技综合征");
        diease5.setContent("[取穴]  主穴：心、肾、皮质下、额、脑、神门  配穴：随症加减");
        mList.add(diease5);
        Diease diease6 = new Diease();
        diease6.setTitle("流行性腮腺炎");
        diease6.setContent("[取穴]  主穴：腮腺、内分泌、肾上腺、下颌、耳尖或轮4、轮5、轮6放血  配穴：肝、胆、胃");
        mList.add(diease6);

        //适配器
        MyAdapter adapter = new MyAdapter(mList);
        mRecyclerView.setAdapter(adapter);

        return view;
    }
    private class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTextViewo;
        TextView mTextViewt;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewo = (TextView) itemView.findViewById(R.id.text_one);
            mTextViewt = (TextView) itemView.findViewById(R.id.text_two);
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
            holder.mTextViewo.setText(mList.get(position).getTitle());
            holder.mTextViewt.setText(mList.get(position).getContent());
        }

        @Override
        public int getItemCount(){
            return mList.size();
        }
    }
}
