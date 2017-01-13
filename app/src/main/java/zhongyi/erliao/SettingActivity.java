package zhongyi.erliao;

import android.support.v4.app.Fragment;

/**
 * Created by dell on 2017/1/13.
 */
public class SettingActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
        return new SettingFragment();
    }
}
