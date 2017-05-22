package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/1/19.耳穴Activity
 */
public class PointActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new PointFragment();
    }
    @Override
    public int getLayoutResId(){
        return R.layout.second_activity_layout;
    }
    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,PointActivity.class);
        return intent;
    }
}
