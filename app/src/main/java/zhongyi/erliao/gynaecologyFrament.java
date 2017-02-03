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
 * Created by dell on 2017/2/3.妇科疾病Fragment
 */
public class gynaecologyFrament extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //二级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("月经不调");
        diease1.setContent("[取穴]  主穴：子宫、卵巢、脑垂体、肾、肝、丘脑  配穴：  月经过多、经期提前：取脾、肾上腺、膈  月经过少、经期错后：取交感、心血管皮质下、促性腺激素点  经期先后不定：神经系统皮质下、身心穴、促性腺激素点");
        mList.add(diease1);
        Diease diease2 = new Diease();
        diease2.setTitle("痛经");
        diease2.setContent("[取穴]  主穴：子宫、内分泌、卵巢、下焦、神经系统皮质下  配穴：神门、腹、肝、脑垂体、盆腔");
        mList.add(diease2);
        Diease diease3 = new Diease();
        diease3.setTitle("闭经");
        diease3.setContent("[取穴]  子官、卵巢、脑垂体、肾、肝、内分泌、脾、交感、心血管系统皮质下");
        mList.add(diease3);
        Diease diease4 = new Diease();
        diease4.setTitle("功能性子宫出血");
        diease4.setContent("[取穴]  主穴：子宫、脑垂体、卵巢、内分泌、脾、肝、肾  配穴：膈、肾上腺");
        mList.add(diease4);
        Diease diease5 = new Diease();
        diease5.setTitle("耳痛");
        diease5.setContent("[取穴]  主穴：相应部位、耳颞神经刺激点、三焦  配穴：外耳、内分泌、肾上腺、神门、枕、耳尖");
        mList.add(diease5);
        Diease diease6 = new Diease();
        diease6.setTitle("宫颈炎");
        diease6.setContent("[取穴]  主穴：耳尖放血、宫颈、肝、脾、肾、三焦、内分泌、肾上腺  配穴：腹部坠胀取下焦、腹；腰酸取腰骶椎");
        mList.add(diease6);
        Diease diease7 = new Diease();
        diease7.setTitle("子宫内膜炎");
        diease7.setContent("[取穴]  主穴：子宫、脑垂体、卵巢、内分泌、肾上腺、脾、耳尖放血  配穴：三焦、肾、肝");
        mList.add(diease7);
        Diease diease8 = new Diease();
        diease8.setTitle("输卵管炎");
        diease8.setContent("[取穴]  输卵管、下焦、内分泌、三焦、肝、肾上腺");
        mList.add(diease8);
        Diease diease9 = new Diease();
        diease9.setTitle("卵巢炎");
        diease9.setContent("[取穴]  卵巢、内分泌、肾上腺、肝、下焦");
        mList.add(diease9);
        Diease diease10 = new Diease();
        diease10.setTitle("附件炎");
        diease10.setContent("[取穴]  附件、内分泌、卵巢、肝、下焦、盆腔");
        mList.add(diease10);
        Diease diease11 = new Diease();
        diease11.setTitle("带症");
        diease11.setContent("[取穴]  相应部位、下焦、肝、脾、肾、内分泌、三焦、耳尖放血");
        mList.add(diease11);
        Diease diease12 = new Diease();
        diease12.setTitle("盆腔炎");
        diease12.setContent("[取穴]  耳尖、盆腔、内分泌、肾上腺、脾、肝");
        mList.add(diease12);
        Diease diease13 = new Diease();
        diease13.setTitle("绝经期症候群");
        diease13.setContent("[取穴]  主穴：子宫、内分泌、卵巢、腺垂体、丘脑、肾、肝  配穴：  心悸者加心、降率穴心血管皮质下  失眠者加神经衰弱点、神经系统皮质下  烦躁易怒者加枕小神经点  五心烦热者加交感、耳尖放血  浮肿便溏加脾、三焦");
        mList.add(diease13);
        Diease diease14 = new Diease();
        diease14.setTitle("子宫脱垂");
        diease14.setContent("[取穴]  主穴：宫颈、子宫、肾、肝、脾、腺垂体、内分泌  配穴：下焦、腹");
        mList.add(diease14);
        Diease diease15 = new Diease();
        diease15.setTitle("少乳");
        diease15.setContent("[取穴]  乳腺、脑垂体、内分泌、丘脑、肝、肾、神经系统皮质下");
        mList.add(diease15);
        Diease diease16 = new Diease();
        diease16.setTitle("妊娠呕吐");
        diease16.setContent("[取穴]  神经系统皮质下、贲门、胃、肝、神门、枕");
        mList.add(diease16);
        Diease diease17 = new Diease();
        diease17.setTitle("产后出血");
        diease17.setContent("[取穴]  子宫、脑垂体、肾上腺、脾");


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
