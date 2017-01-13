package zhongyi.erliao;

import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/1/13.
 */
public class ViewActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new ViewFragment();
    }
}
