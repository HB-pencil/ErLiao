package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/2/2.呼吸系统疾病Activity
 */
public class breathActivity extends SingleActivity{
    @Override
    public Fragment createFragment(){
        return new breathFragment();
    }

    @Override
    public int getLayoutResId(){
        return R.layout.second_activity_layout;
    }

    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,breathActivity.class);
        return intent;
    }
}
