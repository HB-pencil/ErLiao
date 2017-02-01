package zhongyi.erliao;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/12.创建第三个fragment界面，即设置界面
 */
public class SettingFragment extends Fragment {


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        /**
         * I had the same problem when I used
         View res = inflater.inflate(R.layout.fragment_guide_search, container);

         inside Fragment.onCreateView(...

         You must call
         View res = inflater.inflate(R.layout.fragment_guide_search, container, false);

         or
         View res = inflater.inflate(R.layout.fragment_guide_search, null);

         *
         **/
        View view = inflater.inflate(R.layout.setting_layoutt,container,false);


       //使用RecyclerView创建循环列表
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_recycler);
       //指定列表的布局
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       //实例化列表模型层Model的List集合存储的模型对象
        List<SettingItem> items = new ArrayList<>();
       //循环
        for(int i=0;i< 6;i++)
        {
            SettingItem item = new SettingItem();
            setInformation(item,i);        //设置列表icon和文字
            items.add(item);           //添加到集合
        }
        //配置适配器
        TextAdapter mAdapter = new TextAdapter(items);
        recyclerView.setAdapter(mAdapter);

        return view;
    }


    public void setInformation(SettingItem item,int i){
        if(i == 0){
            item.setmyDrawable(R.drawable.day);
            item.setMyText("夜间模式");
        }
        else if(i == 1){
            item.setmyDrawable(R.drawable.change);
            item.setMyText("更换背景");
        }else if(i == 2){
            item.setmyDrawable(R.drawable.size);
            item.setMyText("字体大小");
        }else if(i == 3){
            item.setmyDrawable(R.drawable.edition);
            item.setMyText("版本信息");
        }else if(i == 4){
            item.setmyDrawable(R.drawable.about);
            item.setMyText("关于我们");
        }else if(i == 5){
            item.setmyDrawable(R.drawable.mail);
            item.setMyText("联系我们");
        }
    }

    private class TextHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
         ImageView mImageView;
         TextView mTextView;
         Boolean change = false;
         Boolean mode = false;

        public TextHolder(View itemview){
            super(itemview);
            itemview.setOnClickListener(this);
            /**View强制转为子类，前提是可转，否则报错，父类强制转为子类不安全，视情况而定。
             * view.findViewById成员方法。Activity.findViewById也一样
             */
            mImageView = (ImageView) itemview.findViewById(R.id.image_icon);
            mTextView = (TextView) itemview.findViewById(R.id.setting_text);
        }

        //点击ItemView事件
        @Override
        public void onClick(View v){
            if(mTextView.getText().toString().equals("夜间模式")){
                LinearLayout layouto = (LinearLayout) getActivity().findViewById(R.id.top);
                layouto.setBackgroundColor(getResources().getColor(R.color.black));
                LinearLayout layoutt = (LinearLayout) getActivity().findViewById(R.id.bottom);
                layoutt.setBackgroundColor(getResources().getColor(R.color.black));
                mode = true;
                mImageView.setImageResource(R.drawable.night);
                mTextView.setText("日间模式");

            }else if (mTextView.getText().toString().equals("日间模式")){
                LinearLayout layouto = (LinearLayout) getActivity().findViewById(R.id.top);
                layouto.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                LinearLayout layoutt = (LinearLayout) getActivity().findViewById(R.id.bottom);
                layoutt.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                mode = false;
                mTextView.setText("夜间模式");
                mImageView.setImageResource(R.drawable.day);


            }else if(mTextView.getText().toString().equals("更换背景")){

                   if(!change){
                       Drawable drawable = ContextCompat.getDrawable(getActivity(), R.drawable.backo);
                       LinearLayout layout = (LinearLayout) getActivity().findViewById(R.id.back);
                       layout.setBackground(drawable);
                       change = true;
                   }else{
                       Drawable drawable = ContextCompat.getDrawable(getActivity(), R.drawable.back);
                       LinearLayout layout = (LinearLayout) getActivity().findViewById(R.id.back);
                       layout.setBackground(drawable);
                   }


            }else if(mTextView.getText().toString().equals("字体大小")){

            }else if(mTextView.getText().toString().equals("版本信息")){
                Intent intent= EditionActivity.newInstance(getActivity());
                startActivity(intent);
            }else if(mTextView.getText().toString().equals("关于我们")){
                Intent intent= AboutActivity.newInstance(getActivity());
                startActivity(intent);

            }else if(mTextView.getText().toString().equals("联系我们")){

                Intent intent = new Intent(Intent.ACTION_SENDTO);

                intent.setData(Uri.parse("mailto:HardBlack@126.com"));

                /**
                 * intent.setType("message/rfc822") ; // use from live device
                 * intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"HardBlack@126.com"});
                 * 这两种方法效果一样，不知道为什么没有弹出选择器
                 **/
                startActivity(Intent.createChooser(intent,"Select a Application"));
            }
        }
    }
    private class TextAdapter extends RecyclerView.Adapter<TextHolder>{
        private List<SettingItem>  mItems;
        public TextAdapter(List<SettingItem>  items){
            mItems = items;
        }

        @Override
        public TextHolder onCreateViewHolder(ViewGroup viewGroup,int viewType){
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View v = inflater.inflate(R.layout.list_item,viewGroup,false);

            return new TextHolder(v);
        }
        @Override
        public void onBindViewHolder(TextHolder holder,int  position){
            SettingItem item = mItems.get(position);
            holder.mImageView.setImageResource(item.getmyDrawable());
            holder.mTextView.setText(item.getMyText());
        }
        @Override
        public int getItemCount(){
            return mItems.size();
        }
    }

}
