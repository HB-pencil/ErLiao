package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/1/18.
 */
public class EditionActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new EditionFragment();
    }
    @Override
    protected int getLayoutResId(){
        return R.layout.second_activity_layout;
    }

    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,EditionActivity.class);
        return intent;
    }
}
