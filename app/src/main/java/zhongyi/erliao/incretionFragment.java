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
 * Created by dell on 2017/2/2.内分泌Fragment
 */
public class incretionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //三级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层实例化
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("糖尿病");
        diease1.setContent("[取穴]  主穴：糖尿病点、胰、胆、耳中、内分泌、丘脑、脑垂体、三焦、消化系统皮质下  配穴：口渴：加取渴点、口；易饿：加取饥点；多尿：加取膀胱、尿道；皮肤瘙痒：加取过敏区、相应部位点刺放血；四肢麻木：加取枕小神经点、耳大神经点、相应部位");
        mList.add(diease1);

        Diease diease2 = new Diease();
        diease2.setTitle("尿崩症");
        diease2.setContent("[取穴]  主穴：脑垂体、丘脑、内分泌、渴点、口  配穴：膀胱、尿道、枕、肾");
        mList.add(diease2);

        Diease diease3 = new Diease();
        diease3.setTitle("甲状腺功能亢进");
        diease3.setContent("[取穴]  主穴：甲状腺、内分泌、丘脑、脑垂体、神经系统皮质下  配穴：心、饥点、降率穴、耳尖、神门、枕、枕小神经点、脾、VI、子宫、睾丸、卵巢、交感、相应部位");
        mList.add(diease3);

        Diease diease4 = new Diease();
        diease4.setTitle("甲状腺功能减退（甲低）");
        diease4.setContent("[取穴]  主穴：甲状腺、丘脑、脑垂体、内分泌、三焦、脾、肾、神经系统皮质下  配穴：相应部位，女性多取卵巢、促性腺激素点、肾上腺");
        mList.add(diease4);

        Diease diease5 = new Diease();
        diease5.setTitle("(五)肾上腺功能低下\n\n");
        diease5.setContent("[取穴]  主穴：肾上腺、肾、内分泌、脑垂体、丘脑  配穴：促性腺激素点、肝、脾");
        mList.add(diease5);

        Diease diease6 = new Diease();
        diease6.setTitle("库欣综合征（内分泌疾病）");
        diease6.setContent("[取穴]  主穴：肾、脑垂体、肾上腺、内分泌、丘脑  配穴：耳尖放血、三焦、脾、肺");
        mList.add(diease6);



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
