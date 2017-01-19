package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/1/18.创建“关于我们”的托管Activity
 */
public class AboutActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){

        return new AboutFragment();
    }

    @Override
    protected int getLayoutResId(){
        return R.layout.second_activity_layout;
    }

    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,AboutActivity.class);
        return intent;
    }
}
