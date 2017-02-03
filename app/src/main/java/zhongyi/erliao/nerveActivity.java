package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/2/2.神经、精神疾病
 */
public class nerveActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new nerveFragment();
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
