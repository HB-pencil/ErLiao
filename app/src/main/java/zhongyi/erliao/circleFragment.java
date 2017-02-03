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
 * Created by dell on 2017/2/2.循环系统疾病Fragment。
 */
public class circleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //三级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层实例化
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("高血压");
        diease1.setContent("(取穴]  主穴：耳尖放血、降压点、心、额、心血管皮质下、神经系统皮质下、肝、交感  配穴：  阴阳两虚型、肝肾阴虚型：肾  头晕：枕、晕区");
        mList.add(diease1);

        Diease diease2 = new Diease();
        diease2.setTitle("低血压");
        diease2.setContent("[取穴]  肾上腺、升压点、脑垂体、内分泌、肝、肾、心");
        mList.add(diease2);

        Diease diease3 = new Diease();
        diease3.setTitle("冠心病");
        diease3.setContent("[取穴]  主穴：心、小肠、心血管系统皮质下、交感  配穴：胸、肝");
        mList.add(diease3);

        Diease diease4 = new Diease();
        diease4.setTitle("心律失常");
        diease4.setContent("心动过速：[取穴]  主穴：心、小肠、胸、心血管系统皮质下、降率穴  配穴：神门、枕、小肠  [取穴]  心动过缓：主穴：心、交感、肾上腺、胸、心血管系统皮质下  配穴：肝  心律不齐[取穴]  主穴：心、小肠、胸、心血管系统皮质下");
        mList.add(diease4);

        Diease diease5 = new Diease();
        diease5.setTitle("心血管神经官能症");
        diease5.setContent("[取穴]  主穴：心、胸、神经系统皮质下、心血管系统皮质下  配穴：肺、神门、枕、小肠");
        mList.add(diease5);

        Diease diease6 = new Diease();
        diease6.setTitle("脑血管意外");
        diease6.setContent("[取穴]  主穴：脑、脑干、心血管皮质下、神经系统皮质下、心、耳大神经点、枕小神经点、相应部位  配穴：三焦、脾、肝");
        mList.add(diease6);

        Diease diease7 = new Diease();
        diease7.setTitle("无脉症");
        diease7.setContent("[取穴]  主穴：心、肺、交感、肝、心血管系统皮质下、肾上腺、相应部位  配穴：内分泌、肾");
        mList.add(diease7);

        Diease diease8 = new Diease();
        diease8.setTitle("心肌炎");
        diease8.setContent("[取穴]  主穴：心、胸、小肠、心血管皮质下、内分泌  配穴：降率穴");
        mList.add(diease8);

        Diease diease9 = new Diease();
        diease9.setTitle("风湿性心脏病");
        diease9.setContent("[取穴]  主穴：心、肺、小肠、胸、心血管系统皮质下  配穴：脾、三焦");
        mList.add(diease9);



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
