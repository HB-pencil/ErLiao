package zhongyi.erliao;

import android.support.v4.app.Fragment;

public class HomeActivity extends SingleActivity {
    @Override
    public Fragment createFragment(){
       return new HomeFragment();
    }

}
