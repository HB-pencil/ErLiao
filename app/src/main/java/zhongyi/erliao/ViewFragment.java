package zhongyi.erliao;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/13.视图Fragment使用ViewPager
 */
public class ViewFragment extends Fragment{

    private ViewPager mViewPager;
    private List<View> views;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_layout, container,false);
        mViewPager = (ViewPager) view.findViewById(R.id.pager);

        //添加View视图数组
        LayoutInflater layout = LayoutInflater.from(getActivity());
        View view1 = layout.inflate(R.layout.earview,null);
        View view2 = layout.inflate(R.layout.earviewc,null);
        View view3 = layout.inflate(R.layout.earperspective,null);
        views = new ArrayList<>();
        views.add(view1);
        views.add(view2);
        views.add(view3);

        //适配适配器
        PagerAdapter adapter = new PagerAdapter() {

            @Override
            public int getCount() {
                return views.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup viewGroup, int position, Object object) {
                viewGroup.removeView(views.get(position));
            }

            @Override
            public int getItemPosition(Object object) {
                return super.getItemPosition(object);
            }

            @Override
            public Object instantiateItem(ViewGroup viewGroup, int position) {
                viewGroup.addView(views.get(position));

                return views.get(position);
            }

        };

        mViewPager.setAdapter(adapter);


        return view;
    }

}
