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
 * Created by dell on 2017/2/3.五官科Fragment
 */
public class organsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //二级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("内耳眩晕症");
        diease1.setContent("[取穴]  主穴：耳尖放血、内耳、外耳、枕、三焦、肾、肝、胆、晕点、颞  配穴：贲门、神经系统皮质下、交感、心血管系统皮质下");
        mList.add(diease1);
        Diease diease2 = new Diease();
        diease2.setTitle("耳鸣");
        diease2.setContent("[取穴]  耳尖放血、内耳、颞、三焦、肾、肝、胆");
        mList.add(diease2);
        Diease diease3 = new Diease();
        diease3.setTitle("听力下降、耳聋");
        diease3.setContent("[取穴]  主穴：内耳、外耳、三焦、颞、耳尖放血、速听点(肘)  配穴：肾、胆、交感、目");
        mList.add(diease3);
        Diease diease4 = new Diease();
        diease4.setTitle("中耳炎");
        diease4.setContent("[取穴]  主穴：内耳、外耳、肾上腺  配穴：目2、耳尖、颞、心血管系统皮质下");
        mList.add(diease4);
        Diease diease5 = new Diease();
        diease5.setTitle("耳痛");
        diease5.setContent("[取穴]  主穴：相应部位、耳颞神经刺激点、三焦  配穴：外耳、内分泌、肾上腺、神门、枕、耳尖");
        mList.add(diease5);
        Diease diease6 = new Diease();
        diease6.setTitle("鼻炎");
        diease6.setContent("[取穴]  主穴：内鼻、肺、外耳  配穴：内分泌、肾上腺");
        mList.add(diease6);
        Diease diease7 = new Diease();
        diease7.setTitle("过敏性鼻炎");
        diease7.setContent("[取穴]  主穴：内鼻、肺、肾上腺、过敏区、内分泌、耳尖  配穴：体质弱者取脾、肾");
        mList.add(diease7);
        Diease diease8 = new Diease();
        diease8.setTitle("副鼻窦炎");
        diease8.setContent("[取穴]  内鼻、上颌、额、肾上腺、内分泌、耳尖放血");
        mList.add(diease8);
        Diease diease9 = new Diease();
        diease9.setTitle("肾虚腰痛");
        diease9.setContent("[取穴]  主穴：肾、肝、脾、膀胱、相应部位");
        mList.add(diease9);
        Diease diease10 = new Diease();
        diease10.setTitle("鼻咽炎");
        diease10.setContent("[取穴]  鼻咽、三焦、气管、过敏区、耳尖放血、交感");
        mList.add(diease10);
        Diease diease11 = new Diease();
        diease11.setTitle("鼻衄");
        diease11.setContent("[取穴]  主穴：内鼻、肺、肾上腺、脾  配穴：膈、脑垂体、胃");
        mList.add(diease11);
        Diease diease12 = new Diease();
        diease12.setTitle("嗅觉失灵");
        diease12.setContent("[取穴]  主穴：内鼻、肺、脑干、嗅中枢(耳垂4区)  配穴：外耳、肾上腺、内分泌、大肠、神经系统皮质下");
        mList.add(diease12);
        Diease diease13 = new Diease();
        diease13.setTitle("扁桃体炎");
        diease13.setContent("[取穴]  耳尖放血、扁桃体、咽喉、内分泌、气管、轮6");
        mList.add(diease13);
        Diease diease14 = new Diease();
        diease14.setTitle("急性咽喉炎");
        diease14.setContent("[取穴]  主穴：耳尖放血、咽喉、口、气管、喉牙、肾上腺、内分泌  配穴：膈、神门、大肠");
        mList.add(diease14);
        Diease diease15 = new Diease();
        diease15.setTitle("慢性咽喉炎");
        diease15.setContent("[主穴]  咽、喉、内分泌、肾上腺、气管、口、肺");
        mList.add(diease15);
        Diease diease16 = new Diease();
        diease16.setTitle("喉炎");
        diease16.setContent("[取穴]  喉、三焦、气管、肾上腺、耳尖放血、交感");
        mList.add(diease16);
        Diease diease17 = new Diease();
        diease17.setTitle("声带麻痹、声音嘶哑");
        diease17.setContent("[取穴]  声带、气管、口、三焦、喉、肺");
        mList.add(diease17);
        Diease diease18 = new Diease();
        diease18.setTitle("咽喉异物感(梅核气)");
        diease18.setContent("[取穴]  肝、肺、食道、咽喉、气管、三焦、脾、神经系统皮质下");
        mList.add(diease18);
        Diease diease19 = new Diease();
        diease19.setTitle("复发性口腔溃疡");
        diease19.setContent("[取穴]  z主穴：相应部位、心、口、脾、耳尖、肾上腺、过敏区、内分泌  配穴：失眠取神经衰弱区、神经衰弱点；纳呆取胃");
        mList.add(diease19);
        Diease diease20 = new Diease();
        diease20.setTitle("颞颌关节紊乱");
        diease20.setContent("[取穴]  主穴：颞颌关节、口、三焦、喉牙  配穴：大肠、胃、轮3与轮4之间放血");
        mList.add(diease20);
        Diease diease21 = new Diease();
        diease21.setTitle("牙周炎");
        diease21.setContent("[取穴]  主穴：相应部位、口、肾上腺、三焦  配穴：大肠、肾、胃、轮3～轮4放血");
        mList.add(diease21);
        Diease diease22 = new Diease();
        diease22.setTitle("牙龈出血");
        diease22.setContent("[取穴]  主穴：相应部位、口、气管、肾上腺、脾  配穴：大肠、胃");
        mList.add(diease22);
        Diease diease23 = new Diease();
        diease23.setTitle("腱鞘囊肿");
        diease23.setContent("[取穴]  主穴：三焦、口、上颌或下颌、牙  配穴：  上牙痛：取胃  下牙痛：取大肠  胃火牙痛：取耳尖放血  虚火牙痛：取肾");
        mList.add(diease23);
        Diease diease24 = new Diease();
        diease24.setTitle("雷诺病");
        diease24.setContent("[取穴]  交感、心、肺、心血管皮质下、肝、脾、相应部位、热穴");
        mList.add(diease24);
        Diease diease25 = new Diease();
        diease25.setTitle("龈炎");
        diease25.setContent("[取穴]  口、胃、脾、上颌、下颌、大肠");
        mList.add(diease25);
        Diease diease26 = new Diease();
        diease26.setTitle("舌痛");
        diease26.setContent("[取穴]  心、舌、脾、三焦");
        mList.add(diease26);
        Diease diease27 = new Diease();
        diease27.setTitle("舌咽神经痛");
        diease27.setContent("[取穴]  三焦、心、相应部位、舌");
        mList.add(diease27);
        Diease diease28 = new Diease();
        diease28.setTitle("舌质麻木");
        diease28.setContent("[取穴]  心、舌、三焦、小肠");
        mList.add(diease28);
        Diease diease29 = new Diease();
        diease29.setTitle("急性结膜炎");
        diease29.setContent("[取穴]  耳尖、肺、眼、目2、肾上腺");
        mList.add(diease29);
        Diease diease30 = new Diease();
        diease30.setTitle("睑腺炎、麦粒肿、霰粒肿");
        diease30.setContent("[取穴]  耳尖放血、脾、眼、目2  主穴：口、三焦、喉牙");
        mList.add(diease30);
        Diease diease31 = new Diease();
        diease31.setTitle("球结核膜出血");
        diease31.setContent("[取穴]  肺、肾上腺、眼、脾、耳尖放血");
        mList.add(diease31);
        Diease diease32 = new Diease();
        diease32.setTitle("近视");
        diease32.setContent("[取穴]  耳尖放血、脾、肾、目、眼、肝");
        mList.add(diease32);
        Diease diease33 = new Diease();
        diease33.setTitle("青光眼");
        diease33.setContent("[取穴]  主穴：眼、目1、肝、肾、降压点、枕、耳尖  配穴：神经系统皮质下、神门");
        mList.add(diease33);
        Diease diease34 = new Diease();
        diease34.setTitle("中心性视网膜炎");
        diease34.setContent("[取穴]  耳尖放血、交感、眼、肝、肾、目1、目2、枕");
        mList.add(diease34);
        Diease diease35 = new Diease();
        diease35.setTitle("视神经萎缩");
        diease35.setContent("[取穴]  主穴：尿道、膀胱、枕、脑垂体、神经系统皮质下");
        mList.add(diease35);
        Diease diease36 = new Diease();
        diease36.setTitle("视神经萎缩");
        diease36.setContent("(取穴]  眼、目1、目2、交感、枕、肝、肾、心血管皮质下");
        mList.add(diease36);
        Diease diease37 = new Diease();
        diease37.setTitle("眼睑痉挛");
        diease37.setContent("[取穴]  三焦、眼、脾、肝、神经系统皮质下");
        mList.add(diease37);


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
