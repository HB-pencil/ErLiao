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
 * Created by dell on 2017/2/1.消化系统疾病fragment。
 */
public class digestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup viewGroup,Bundle savedInstanceState){
          View view = layout.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //三级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

       //模型层实例化
        Diease diease1 = new Diease();
        diease1.setTitle("胃炎");
        diease1.setContent("[取穴]  主穴：胃、脾、消化系统皮质下  配穴：浅表性胃炎：取交感  萎缩性胃炎：取胰、胆、内分泌  肝胃不和型：取肝、胆、三焦");

        Diease diease2 = new Diease();
        diease2.setTitle("胃、十二指肠溃疡");
        diease2.setContent("[取穴]  主穴：胃、十二指肠、消化系统皮质下、贲门、脾  配穴：交感、神门  胃阴不足性：取胰、内分泌");

        Diease diease3 = new Diease();
        diease3.setTitle("十二指肠球炎");
        diease3.setContent("[取穴]  主穴：十二指肠、胃、贲门、脾、消化系统皮质下  配穴：交感、胆、胰");

        Diease diease4 = new Diease();
        diease4.setTitle("急性胃肠炎");
        diease4.setContent("[取穴]  主穴：耳尖放血、胃、大肠、小肠、直肠、下焦、脾、交感  配穴：贲门");

        Diease diease5= new Diease();
        diease5.setTitle("胰腺炎");
        diease5.setContent("[取穴]  主穴：胰、胆、脾、十二指肠、内分泌、消化系统皮质下  配穴：肝");

        Diease diease6 = new Diease();
        diease6.setTitle("便秘");
        diease6.setContent("[取穴]  主穴：大肠、三焦、脾、腹、消化系统皮质下  配穴：肺、乙状结肠");

        Diease diease7 = new Diease();
        diease7.setTitle("");
        diease7.setContent("[取穴]  主穴：直肠、大肠、神门、枕、脾、交感、耳穴放血  配穴：脾。肾阳虚型：肾  肠胃不和型：小肠、胃  过敏性结肠炎：加过敏区、内分泌");

        Diease diease8 = new Diease();
        diease8.setTitle("反酸、恶心");
        diease8.setContent("[取穴]  主穴：胃、肝、交感、脾、贲门、枕、神经系统皮质下");

        Diease diease9 = new Diease();
        diease9.setTitle("膈肌痉挛(呃逆)");
        diease9.setContent("[取穴]  主穴：膈、胃、贲门、神门、交感、神经系统皮质下、肝  配穴：耳迷根");

        Diease diease10 = new Diease();
        diease10.setTitle("食管炎");
        diease10.setContent("[取穴]  主穴：食道、贲门、消化系统皮质下、交感  配穴：神门、枕、小肠");

        Diease diease11 = new Diease();
        diease11.setTitle("胃肠功能紊乱");
        diease11.setContent("[取穴]  主穴：胃、小肠、乙状结肠、消化系统皮质下、交感、脾  配穴：反酸、嗳气、恶心：取贲门  食后腹胀：肝、胆、腹胀区  头痛、头昏、失眠：耳尖放血  焦虑不安：身心穴");

        Diease diease12 = new Diease();
        diease12.setTitle("消化不良");
        diease12.setContent("[取穴]  主穴：胃、贲门、小肠、大肠、直肠、脾、消化系统皮质下  配穴：酮穴．神门、枕、耳尖放血");

        Diease diease13 = new Diease();
        diease13.setTitle("慢性肝炎");
        diease13.setContent("[取穴]  主穴：肝、脾、三焦、内分泌、消化系统皮质下、肾上腺  配穴：肋缘下、耳中、耳肝点、腹胀区");

        Diease diease14 = new Diease();
        diease14.setTitle("肝炎后综合征");
        diease14.setContent("[取穴]  主穴：肝、胆、腹胀区、三焦、耳中、消化系统皮质下  配穴：耳肝点、内分泌、肋缘下");

        List<Diease> mList = new ArrayList<>();
        mList.add(diease1);
        mList.add(diease2);
        mList.add(diease3);
        mList.add(diease4);
        mList.add(diease5);
        mList.add(diease6);
        mList.add(diease7);
        mList.add(diease8);
        mList.add(diease9);
        mList.add(diease10);
        mList.add(diease11);
        mList.add(diease12);
        mList.add(diease13);
        mList.add(diease14);

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
