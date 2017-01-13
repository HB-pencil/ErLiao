package zhongyi.erliao;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/12.创建第三个fragment界面，即设置界面
 */
public class SettingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.setting_fragment,container);
       //使用RecyclerView创建循环列表
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_recycler);
       //指定列表的布局
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
       //实例化列表模型层Model的List集合存储的模型对象
        List<SettingItem> items = new ArrayList<>();
       //循环
        for(int i=0;i<items.size();i++)
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
            item.setmyDrawable(R.drawable.change);
            item.setMyText("切换主题");
        }else if(i == 1){
            item.setmyDrawable(R.drawable.size);
            item.setMyText("字体大小");
        }else if(i == 2){
            item.setmyDrawable(R.drawable.edition);
            item.setMyText("版本信息");
        }else if(i == 3){
            item.setmyDrawable(R.drawable.about);
            item.setMyText("关于我们");
        }else if(i == 4){
            item.setmyDrawable(R.drawable.mail);
            item.setMyText("联系我们");
        }
    }

    private class TextHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView mImageView;
        private TextView mTextView;
        public TextHolder(View view){
            super(view);
            view.setOnClickListener(this);
            /**View强制转为子类，前提是可转，否则报错，父类强制转为子类不安全，视情况而定。
             * view.findViewById成员方法。Activity.findViewById也一样
             */
            mImageView = (ImageView) view.findViewById(R.id.image_icon);
            mTextView = (TextView) view.findViewById(R.id.setting_text);
        }
        @Override
        public void onClick(View v){
            Toast.makeText(getActivity(),"点击事件",Toast.LENGTH_SHORT).show();
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
