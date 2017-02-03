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
 * Created by dell on 2017/2/3.
 */
public class waikeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_list_fragment_item,viewGroup,false);

        //二级RecyclerView;
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //模型层
        List<Diease> mList = new ArrayList<>();
        Diease diease1 = new Diease();
        diease1.setTitle("软组织损伤");
        diease1.setContent("[取穴]  主穴：相应部位、耳尖放血，依病变部位选穴轮1、轮2、轮3、轮4放血  配穴:  腰扭伤、尾骨挫伤：取相对应的耳背部阳性反应点  腕关节损伤：取轮1放血、枕小神经点  踝关节、膝关节损伤：耳尖放血  胸部挫伤：轮4放血、耳大神经点");
        mList.add(diease1);
        Diease diease2 = new Diease();
        diease2.setTitle("落枕");
        diease2.setContent("[取穴]  主穴：相应部位、轮4放血  配穴：耳大神经点");
        mList.add(diease2);
        Diease diease3 = new Diease();
        diease3.setTitle("肩关节周围炎");
        diease3.setContent("[取穴]  主穴：肩三点、锁骨、肩节、肩、轮4或轮3放血  配穴：耳大神经点");
        mList.add(diease3);
        Diease diease4 = new Diease();
        diease4.setTitle("风湿性关节炎");
        diease4.setContent("[取穴]  主穴：相应部位、内分泌、肾上腺、过敏区、耳尖  配穴：肾、肝、脾、三焦");
        mList.add(diease4);
        Diease diease5 = new Diease();
        diease5.setTitle("类风湿性关节炎");
        diease5.setContent("[取穴]  主穴：相应部位、耳尖放血、肾上腺、内分泌、枕小神经点、心血管系统皮质下  配穴：肾、肝、脾、三焦");
        mList.add(diease5);
        Diease diease6 = new Diease();
        diease6.setTitle("骨性关节炎");
        diease6.setContent("[取穴]  主穴：相应部位、内分泌、肾上腺  配穴：肾、肝、脾");
        mList.add(diease6);
        Diease diease7 = new Diease();
        diease7.setTitle("痛风");
        diease7.setContent("[取穴]  主穴：相应部位、肾、肝、脾、三焦、内分泌、耳尖放血");
        mList.add(diease7);
        Diease diease8 = new Diease();
        diease8.setTitle("腰椎骨质增生");
        diease8.setContent("[取穴]  主穴：相应部位、肾、内分泌、膀胱、肾上腺");
        mList.add(diease8);
        Diease diease9 = new Diease();
        diease9.setTitle("肾虚腰痛");
        diease9.setContent("[取穴]  主穴：肾、肝、脾、膀胱、相应部位");
        mList.add(diease9);
        Diease diease10 = new Diease();
        diease10.setTitle("腰棘间韧带、椎旁韧带劳损");
        diease10.setContent("[取穴]  相应部位及相对应的耳背腰椎区的阳性反应点");
        mList.add(diease10);
        Diease diease11 = new Diease();
        diease11.setTitle("骶髂关节炎");
        diease11.setContent("[取穴]  取相应部位");
        mList.add(diease11);
        Diease diease12 = new Diease();
        diease12.setTitle("坐骨神经痛");
        diease12.setContent("[取穴]  主穴：坐骨神经三角区(由耳背腰骶椎、胭窝及耳背坐骨神经构成)  配穴：  耳前相应部位  腓肠肌痛：取腓肠肌  腘窝痛：取腘窝  臀部痛：取臀、髋关节  足底痛或麻木：取足底一条线：跟、足心、趾");
        mList.add(diease12);
        Diease diease13 = new Diease();
        diease13.setTitle("臀部肌纤维炎");
        diease13.setContent("[取穴]  坐骨神经三角区、臀、髋关节及相对应的耳背部");
        mList.add(diease13);
        Diease diease14 = new Diease();
        diease14.setTitle("臀部肌纤维炎");
        diease14.setContent("[取穴]  腓肠肌点、肝、脾、交感、心血管系统皮质下");
        mList.add(diease14);
        Diease diease15 = new Diease();
        diease15.setTitle("跟痛、跟骨骨质增生");
        diease15.setContent("[取穴]  主穴：跟、肾、肝  配穴：膀胱");
        mList.add(diease15);
        Diease diease16 = new Diease();
        diease16.setTitle("足底痛");
        diease16.setContent("[取穴]  相应部位、耳尖放血、枕小神经点");
        mList.add(diease16);
        Diease diease17 = new Diease();
        diease17.setTitle("肩关节周围炎");
        diease17.setContent("[取穴]  主穴：颈三角(由耳背颈6、颈7，颈3、颈4，耳大神经点组成)、肩三角(由颈椎、锁骨、耳大神经  点组成)  配穴： 椎动脉型：眩晕型，取晕区、枕  神经根型：手指麻木，取耳前肩三角、指、肩等相应部位  交感型：取交感、神经系统皮质下  脊髓型：耳前肩三角、心血管系统皮质下、枕小神经点  颈型：轮4、耳尖放血，肩三角。肝、肾、内分泌");
        mList.add(diease17);
        Diease diease18 = new Diease();
        diease18.setTitle("多发性肌纤维炎");
        diease18.setContent("[取穴]  主穴：相应部位、耳尖放血、脑垂体、肾上腺、轮4放血  配穴：肝、脾");
        mList.add(diease18);
        Diease diease19 = new Diease();
        diease19.setTitle("肱骨外上踝炎、肱骨内上踝炎(网球肘)");
        diease19.setContent("[取穴]  肘、耳背网球肘点、轮1或轮2放血");
        mList.add(diease19);
        Diease diease20 = new Diease();
        diease20.setTitle("肩背肌纤维炎");
        diease20.setContent("[取穴]  主穴：相应部位(肩背穴)、轮4放血、耳大神经点  配穴：肝、脾");
        mList.add(diease20);
        Diease diease21 = new Diease();
        diease21.setTitle("腕管综合征");
        diease21.setContent("[取穴]  相应部位、枕小神经点、轮l放血");
        mList.add(diease21);
        Diease diease22 = new Diease();
        diease22.setTitle("狭窄性腱鞘炎");
        diease22.setContent("[取穴]  相应部位(指、腕)、相对应的耳背部阳性反应点、耳尖放血、枕小神终点");
        mList.add(diease22);
        Diease diease23 = new Diease();
        diease23.setTitle("腱鞘囊肿");
        diease23.setContent("[取穴]  相应部位、耳尖放血或轮1放血  按病变部位取穴：手法予以强刺激，指功发热、通经活络、气至病所  轮1或耳尖放血：祛瘀、消炎、止痛  腱鞘囊肿，亦可用针刺治疗：(1)围刺：同时做艾灸治疗 (2)用粗针20～24号从囊肿最高点刺破肿块，并加以挤  压，有时可见胶状黏液从针孔处挤出，然后加压包扎2～3天");
        mList.add(diease23);
        Diease diease24 = new Diease();
        diease24.setTitle("雷诺病");
        diease24.setContent("[取穴]  交感、心、肺、心血管皮质下、肝、脾、相应部位、热穴");
        mList.add(diease24);
        Diease diease25 = new Diease();
        diease25.setTitle("血栓闭塞性脉管炎");
        diease25.setContent("[取穴]  相应部位、交感、脾、内分泌、心、肺、心血管系统皮质下、热穴");
        mList.add(diease25);
        Diease diease26 = new Diease();
        diease26.setTitle("血栓性静脉炎");
        diease26.setContent("[取穴]  相应部位、耳尖、交感、内分泌、肾上腺、心、肺、肝、心血管系统皮质下、神门");
        mList.add(diease26);
        Diease diease27 = new Diease();
        diease27.setTitle("胆结石、胆道系统感染");
        diease27.setContent("[取穴]  主穴：胆、胆道、十二指肠、肝、三焦、内分泌、消化系统皮质下  配穴：胰、交感、耳中、腹胀区、贲门、耳尖穴放血");
        mList.add(diease27);
        Diease diease28 = new Diease();
        diease28.setTitle("红斑肢痛症");
        diease28.setContent("[取穴]  交感、神门、神经系统皮质下、相应部位");
        mList.add(diease28);
        Diease diease29 = new Diease();
        diease29.setTitle("泌尿系统结石");
        diease29.setContent("[取穴]  主穴：相应部位、交感、神门、下焦  配穴：肝、神经系统皮质下。肾结石取腹外穴");
        mList.add(diease29);
        Diease diease30 = new Diease();
        diease30.setTitle("膀胱炎");
        diease30.setContent("[取穴]  主穴：膀胱、尿道、内分泌、三焦、耳尖  配穴：肾上腺、肾");
        mList.add(diease30);
        Diease diease31 = new Diease();
        diease31.setTitle("前列腺炎");
        diease31.setContent("[取穴]  主穴：前列腺、尿道、肾、肝、内分泌、三焦、耳尖  配穴：  伴有性机能减退：取内生殖器；伴有少腹、会阴部坠痛：取下焦、盆腔；伴有睾丸抽痛：取睾  丸；伴有腰痛：取腰骶椎；伴有神经衰弱：取神门、神经衰弱区、神经衰弱点");
        mList.add(diease31);
        Diease diease32 = new Diease();
        diease32.setTitle("睾丸、附睾丸炎");
        diease32.setContent("[取穴]  主穴：睾丸、盆腔、内、外生殖器、肝、下焦、耳尖放血、内分泌、肾上腺  配穴：腹");
        mList.add(diease32);
        Diease diease33 = new Diease();
        diease33.setTitle("尿道炎");
        diease33.setContent("[取穴]  主穴：尿道、内尿道(男前列腺穴)、耳尖放血、枕  配穴：内分泌、肾上腺、脑垂体");
        mList.add(diease33);
        Diease diease34 = new Diease();
        diease34.setTitle("遗尿症");
        diease34.setContent("[取穴]  主穴：膀胱、尿道、支点、兴奋点、脑垂体  配穴：肝、额");
        mList.add(diease34);
        Diease diease35 = new Diease();
        diease35.setTitle("尿频");
        diease35.setContent("[取穴]  主穴：尿道、膀胱、枕、脑垂体、神经系统皮质下");
        mList.add(diease35);
        Diease diease36 = new Diease();
        diease36.setTitle("遗精");
        diease36.setContent("[取穴]   主穴：肾、心、皮质下、肝、神门、枕及耳尖  配穴：神经衰弱区、神经衰弱点、睡眠深沉点");
        mList.add(diease36);
        Diease diease37 = new Diease();
        diease37.setTitle("阳痿");
        diease37.setContent("[取穴]  外生殖器、睾丸、内生殖器、兴奋点、脑垂体、动情穴、促性腺激素点、肝");
        mList.add(diease37);
        Diease diease38 = new Diease();
        diease38.setTitle("尿潴留");
        diease38.setContent("[取穴]  主穴：膀胱、肾、三焦   配穴：神经系统皮质下、肺、腹、腰骶椎、脾");
        mList.add(diease38);
        Diease diease39 = new Diease();
        diease39.setTitle("尿失禁");
        diease39.setContent("[取穴]  膀胱、尿道、脑垂体、神经系统皮质下、枕、肝");
        mList.add(diease39);
        Diease diease40 = new Diease();
        diease40.setTitle("直肠脱垂");
        diease40.setContent("[取穴]  主穴：直肠、肛门、大肠、阑尾、脾、肺、乙状结肠  配穴：三焦、消化系统皮质下、乙状结肠");
        mList.add(diease40);
        Diease diease41 = new Diease();
        diease41.setTitle("急性阑尾炎");
        diease41.setContent("[取穴]  阑尾穴、耳尖放血、内分泌、肾上腺、腹、交感、下焦");
        mList.add(diease41);
        Diease diease42 = new Diease();
        diease42.setTitle("慢性阑尾炎");
        diease42.setContent("[取穴]  慢性阑尾炎：阑尾穴、下焦、交感");
        mList.add(diease42);
        Diease diease43 = new Diease();
        diease43.setTitle("肋软骨炎");
        diease43.setContent("[取穴]  相应部位、肾上腺");
        mList.add(diease43);
        Diease diease44 = new Diease();
        diease44.setTitle("肋间神经痛");
        diease44.setContent("[取穴]  主穴：相应部位、神经系统皮质下、神门、枕  配穴：肝、胆、肺");
        mList.add(diease44);
        Diease diease45 = new Diease();
        diease45.setTitle("乳腺炎");
        diease45.setContent("[取穴]  主穴：乳腺、内分泌、肾上腺  配穴：肝、耳尖放血");
        mList.add(diease45);
        Diease diease46 = new Diease();
        diease46.setTitle("急性淋巴结炎");
        diease46.setContent("[取穴]  主穴：相应的部位、耳尖放血、肾上腺、内分泌  配穴：神门、枕");
        mList.add(diease46);
        Diease diease47 = new Diease();
        diease47.setTitle("慢性淋巴结炎");
        diease47.setContent("[取穴]  主穴：相应的部位、肾上腺、 内分泌、过敏区、耳尖");
        mList.add(diease47);
        Diease diease48 = new Diease();
        diease48.setTitle("丹毒");
        diease48.setContent("[取穴]  主穴：相应部位、耳尖或轮1～轮6放血、脾、内分泌、肾上腺  配穴：神门、枕");
        mList.add(diease48);
        Diease diease49 = new Diease();
        diease49.setTitle("单纯性甲状腺肿");
        diease49.setContent("[取穴]  主穴：甲状腺、内分泌、脑垂体  配穴：三焦、肾、肝、丘脑");
        mList.add(diease49);


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
