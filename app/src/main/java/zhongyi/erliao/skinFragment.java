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
 * Created by dell on 2017/2/3.皮肤疾病Fragment
 */
public class skinFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //二级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("皮肤瘙痒症");
        diease1.setContent("[取穴]  主穴：耳尖放血、相应部点刺放血，肺、肝、脾、内分泌、膈、神门、枕、过敏区、肾上腺  配穴：大肠");
        mList.add(diease1);
        Diease diease2 = new Diease();
        diease2.setTitle("荨麻疹");
        diease2.setContent("[取穴]  主穴：耳尖放血、过敏区、肾上腺、内分泌、肝、脾、肺、神门、膈  配穴：胃、小肠、大肠、枕");
        mList.add(diease2);
        Diease diease5 = new Diease();
        diease5.setTitle("接触性皮炎");
        diease5.setContent("[取穴]  主穴：耳尖放血、过敏区、相应部点刺放血、脾、肺、膈、肾上腺、过敏区、内分泌、脑垂体  配穴：疼痛较甚者取神门、枕");
        mList.add(diease5);
        Diease diease6 = new Diease();
        diease6.setTitle("带状疱疹");
        diease6.setContent("[取穴]  主穴：耳尖放血、过敏区、相应部位、胆、肺、肝、过敏区、内分泌、肾上腺  配穴：疼痛较甚者，取神门、枕；不眠者，取神经衰弱区点");
        mList.add(diease6);
        Diease diease7 = new Diease();
        diease7.setTitle("痔疮");
        diease7.setContent("[取穴]  主穴：耳尖放血、相应部位点刺放血、肺、脾、内分泌、肾上腺  配穴：热盛者取心、大肠，痒甚者取神门");
        mList.add(diease7);
        Diease diease8 = new Diease();
        diease8.setTitle("扁平疣");
        diease8.setContent("[取穴]  耳尖放血、相应部位点刺放血、肺、脾、肝、内分泌、肾上腺");
        mList.add(diease8);
        Diease diease9 = new Diease();
        diease9.setTitle("多汗症");
        diease9.setContent("[取穴]  主穴：交感、神经系统皮质下、心、肺、相应部位  配穴：神门、枕");
        mList.add(diease9);
        Diease diease10 = new Diease();
        diease10.setTitle("神经性皮炎");
        diease10.setContent("[取穴]  主穴：耳尖放血、相应部位点刺放血、肺、肝、心、神门、枕、神经系统皮质下  配穴：泛发性神经性皮炎，肺区、过敏区、点刺放血");
        mList.add(diease10);
        Diease diease11 = new Diease();
        diease11.setTitle("脂溢性皮炎");
        diease11.setContent("[取穴]  主穴：相应部位点刺放血、肝、肺、胰、小肠、交感、神经系统皮质下  配穴：热甚者，加取大肠");
        mList.add(diease11);
        Diease diease12 = new Diease();
        diease12.setTitle("黄褐斑");
        diease12.setContent("[取穴]  主穴：相应部位点刺放血、脑垂体、肾上腺、内分泌、肾、肺、肝、脾、丘脑  配穴：月经不调者加取子宫、卵巢。男性加取前列腺");
        mList.add(diease12);
        Diease diease13 = new Diease();
        diease13.setTitle("白癜风");
        diease13.setContent("[取穴]  相应部位或肺区点刺放血、肾、肝、脾、脑垂体、肾上腺、内分泌、过敏区、丘脑、神经系统皮  质下");
        mList.add(diease13);
        Diease diease14 = new Diease();
        diease14.setTitle("盘状红斑狼疮");
        diease14.setContent("[取穴]  相应部位点刺放血、肺、肾、脾、内分泌、肾上腺、过敏区");
        mList.add(diease14);
        Diease diease15 = new Diease();
        diease15.setTitle("酒渣鼻");
        diease15.setContent("[取穴]  耳尖放血、外鼻区及相应部位点刺放血、肺、胃、内分泌、肾上腺、脾");
        mList.add(diease15);
        Diease diease16 = new Diease();
        diease16.setTitle("脱发");
        diease16.setContent("[取穴]  主穴：相应部位、肾、肺、脾、内分泌、肾上腺、神经系统皮质下  配穴：大肠、肝、胆、膀胱");
        mList.add(diease16);
        Diease diease17 = new Diease();
        diease17.setTitle("湿疹");
        diease17.setContent("[取穴]  主穴：相应部位、肺、脾、内分泌、肾上腺、过敏区  配穴：心、神门、枕、膈、大肠");
        mList.add(diease17);
        Diease diease18 = new Diease();
        diease18.setTitle("牛皮癣");
        diease18.setContent("[取穴]  主穴：耳尖、轮4放血、过敏区、肺、脾、内分泌  配穴：银屑性关节炎伴同银屑病肝患关节炎者，有关节痛并丧失劳动力，通常侵犯小关节，如指、趾的末端关节及脊柱，引起脊柱关节炎。可取相应部位");
        mList.add(diease18);
        Diease diease19 = new Diease();
        diease19.setTitle("玫瑰糠疹");
        diease19.setContent("[取穴]  相应部位、肝、肺、脾、内分泌、耳尖放血、过敏区");
        mList.add(diease19);
        Diease diease20 = new Diease();
        diease20.setTitle("皮肤划痕症");
        diease20.setContent("[取穴]  相应部位、肝、肺、脾、内分泌、耳尖放血、过敏区");
        mList.add(diease20);
        Diease diease21= new Diease();
        diease21.setTitle("瘢痕疙瘩");
        diease21.setContent("[取穴]  过敏区、内分泌、肾上腺、耳尖放血、相应部位、肺、肝、脾");
        mList.add(diease21);
        Diease diease22 = new Diease();
        diease22.setTitle("结节性痒疹");
        diease22.setContent("[取穴]  过敏区、内分泌、肾上腺、耳尖放血、相应部位、肺、肝、脾");
        mList.add(diease22);
        Diease diease23= new Diease();
        diease23.setTitle("结节性红斑");
        diease23.setContent("[取穴]  过敏区、内分泌、肾上腺、耳尖放血、相应部位、肺、肝、脾");
        mList.add(diease23);
        Diease diease24 = new Diease();
        diease24.setTitle("鱼鳞癣");
        diease24.setContent("[取穴]  内分泌、相应部位、肺、脾");

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
