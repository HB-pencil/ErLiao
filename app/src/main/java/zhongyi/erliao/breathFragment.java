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
 * Created by dell on 2017/2/2.呼吸系统疾病Fragment
 */
public class breathFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //三级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层实例化
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("支气管炎");
        diease1.setContent("[取穴]  主穴：耳尖放血、气管、支气管、平喘、神门、肺  配穴：枕、内分泌、脾、大肠");
        mList.add(diease1);

        Diease diease2 = new Diease();
        diease2.setTitle("支气管哮喘");
        diease2.setContent("[取穴]  主穴：肺、支气管、交感、肾上腺、平喘、过敏区、内分泌  配穴：神门、枕、肾、前列腺、胸、心血管系统皮质下、耳尖放血");
        mList.add(diease2);

        Diease diease3 = new Diease();
        diease3.setTitle("胸痛");
        diease3.setContent("[取穴]相应部位  在耳穴对耳轮内侧缘中点、上部、下部用耳穴探测器探测其阳性反应点，然后用王不留行籽贴压,贴压后用指功法，使气直至病所，胸痛即刻缓解或消失。若伴有胸闷气短时，因交感、心血管皮质下与胸穴构成三角，贴压后，即可宽胸利膈，气机通畅");
        mList.add(diease3);

        Diease diease4 = new Diease();
        diease4.setTitle("感冒");
        diease4.setContent("[取穴]  主穴：耳尖放血、肺、内鼻、咽、喉。  配穴：发热时：取耳尖、屏尖、肾上腺点刺放血  头痛：感冒多为前头痛，取额  偏头痛：取外交感、颞。  后头痛，伴有头昏、头晕：取枕、晕区  头顶痛：取肝、顶  全身肌肉酸痛、乏力：取疲劳快活点(相当于口穴)、脾、肝、三焦  咳嗽、咳痰：取气管、支气管、平喘  胸闷、胸痛：取胸三角、交感、胸、心血管系统皮质下  胃纳不佳、腹胀、便秘：取胃、大肠、腹胀区");
        mList.add(diease4);



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
