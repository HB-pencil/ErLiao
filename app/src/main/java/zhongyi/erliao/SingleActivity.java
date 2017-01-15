package zhongyi.erliao;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by dell on 2017/1/12.抽象托管Activity。通过点击底部菜单栏来切换不同Fragment。
 */
public abstract class SingleActivity extends FragmentActivity {

    public abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);


        //托管Fragment
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.activity_container);

        if(fragment == null){
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.activity_container,fragment)
                    .commit();
        }

    }


}
