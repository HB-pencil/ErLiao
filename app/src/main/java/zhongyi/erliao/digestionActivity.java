package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/2/1.know的二级界面之消化系统疾病
 */
public class digestionActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new digestFragment();
    }

    @Override
    public int getLayoutResId(){
        return R.layout.second_activity_layout;
    }

    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,digestionActivity.class);
        return intent;
    }
}
