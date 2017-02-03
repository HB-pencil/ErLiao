package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/2/2.内分泌Activity。
 */
public class incretionActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new incretionFragment();
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
