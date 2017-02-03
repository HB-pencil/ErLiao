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
 * Created by dell on 2017/2/2.神经、精神疾病Fragment
 */
public class nerveFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //三级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层实例化
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("神经衰弱");
        diease1.setContent("[取穴]  主穴：耳尖放血、神门、心、神经系统皮质下、枕、神经衰弱区、神经衰弱点  配穴：  心脾不足型：脾；肝郁气滞型：肝；  心虚胆怯型：胆；  心肾不交型：肾；胃失和降型：胃。  多梦:用耳背多梦区早醒：睡眠浅、易醒，醒后不易入睡，睡眠时间短，用神经衰弱点，亦称“早醒点”，与早醒点相对应的耳背穴，为睡眠深沉穴，通常神经衰弱点和睡眠深沉穴对贴，以加强睡眠深度，延长睡眠时间");
        mList.add(diease1);

        Diease diease2 = new Diease();
        diease2.setTitle("多梦");
        diease2.setContent("[取穴]  主穴：耳尖放血、心、神经系统皮质下、神经衰弱区、神经衰弱点、多梦区  配穴：心肾不交，取肾；心脾两虚，取脾；肝郁气滞，取肝、胆");
        mList.add(diease2);

        Diease diease3 = new Diease();
        diease3.setTitle("头痛");
        diease3.setContent("[取穴]  主穴：耳尖放血、相应部位、神经系统皮质下  配穴：前头痛、偏头痛、头项痛、全头痛：取外交感  后头痛：枕小神终点");
        mList.add(diease3);

        Diease diease4 = new Diease();
        diease4.setTitle("头晕");
        diease4.setContent("[取穴]  主穴：耳尖放血、晕区、肝、枕、外交感  配穴：内耳眩晕症：内耳、贲门、脾  贫血引起的头晕：脾、三焦  自主神经功能紊乱引起的头晕：交感、神经系统皮质下  脑动脉供血不足引起的头晕：脑、心血管系统皮质下");
        mList.add(diease4);

        Diease diease5 = new Diease();
        diease5.setTitle("脑震荡后遗症");
        diease5.setContent("[取穴]  主穴：耳尖放血、肾、脑、脑干、神经系统皮质下、相应部位、心  配穴：枕小神绎点、神门");
        mList.add(diease5);

        Diease diease6 = new Diease();
        diease6.setTitle("三叉神经痛");
        diease6.setContent("[取穴]  主穴：耳颞神经刺激点、三焦、神经系统皮质下、脑干、神门、枕、相应部位  配穴：外鼻、外耳、大肠");
        mList.add(diease6);

        Diease diease7 = new Diease();
        diease7.setTitle("面肌痉挛");
        diease7.setContent("[取穴]  主穴：三焦、口、神经系统皮质下、脑干、肝、脾、相应部位  配穴：大肠、神门、枕");
        mList.add(diease7);

        Diease diease8 = new Diease();
        diease8.setTitle("面神经麻痹");
        diease8.setContent("[取穴]  主穴：三焦、相应部位、脑干、神经系统皮质下、内分泌、肾上腺  配穴：脾、肝");
        mList.add(diease8);

        Diease diease9 = new Diease();
        diease9.setTitle("幻肢痛");
        diease9.setContent("[取穴]  主穴：相应部位、神经系统皮质下、神门、枕小神经点、耳大神经点  配穴：烧灼性神经痛不能入睡者，取神经衰弱区、神经衰弱点、耳尖放血");
        mList.add(diease9);

        Diease diease10 = new Diease();
        diease10.setTitle("癫痫");
        diease10.setContent("[取穴]  主穴：癫痫点、脑干、神经系统皮质下、脑、神门、枕、肝、肾  配穴：枕小神经点、耳颞神经点");
        mList.add(diease10);

        Diease diease11 = new Diease();
        diease11.setTitle("癔症");
        diease11.setContent("[取穴]  主穴：心、神经系统皮质下、神门、额、肝、脑干、身心穴、快活穴  配穴：咽喉、口");
        mList.add(diease11);

        Diease diease12 = new Diease();
        diease12.setTitle("精神分裂症");
        diease12.setContent("[取穴]  主穴：耳尖放血、额、肝、心、脑干、神经系统皮质下、身心穴、快活穴  配穴：躁狂型神门、枕：抑郁型脾");
        mList.add(diease12);

        Diease diease13 = new Diease();
        diease13.setTitle("忧郁、焦虑、神经紧张");
        diease13.setContent("[取穴]  主穴：身心穴(焦虑穴)、快活穴、神经系统皮质下、神门、枕  配穴：神经衰弱区、神经衰弱点、肝、心");
        mList.add(diease13);

        Diease diease14 = new Diease();
        diease14.setTitle("疲劳综合征");
        diease14.setContent("[取穴]  主穴：脾、口、三焦、内分泌、肝、肾  配穴：相应部位、耳尖放血、身心穴、快活穴");
        mList.add(diease14);

        Diease diease15 = new Diease();
        diease15.setTitle("自主神经功能紊乱");
        diease15.setContent("[取穴]  主穴：心、交感、脑垂体、神经系统皮质下、额、枕、肾、相应部位  配穴：依症状配方");
        mList.add(diease15);


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
