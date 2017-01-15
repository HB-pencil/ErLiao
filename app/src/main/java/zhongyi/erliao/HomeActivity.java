package zhongyi.erliao;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 *主页托管Activity，设置按钮触发事件
 */
public class HomeActivity extends SingleActivity implements View.OnClickListener{

    private ImageButton vButton;
    private ImageButton hButton;
    private ImageButton sButton;

    public void handleClick(){
    vButton = (ImageButton) findViewById(R.id.view_button);
    hButton = (ImageButton) findViewById(R.id.home_button);
    sButton = (ImageButton) findViewById(R.id.setting_button);
    }

    @Override
    public Fragment createFragment(){

        handleClick();//获取按钮对象并监听
        vButton.setOnClickListener(this);
        hButton.setOnClickListener(this);
        sButton.setOnClickListener(this);

       return new HomeFragment();
    }

    @Override
    public void onClick(View view){

        //根据不同对象切换不同fragment
        switch (view.getId()){
            case R.id.view_button:
            {
                if(getSupportFragmentManager().findFragmentById(R.id.activity_container).equals(new ViewFragment()))
                    {}else{
                        Fragment fragment = new ViewFragment();
                        getSupportFragmentManager().beginTransaction()
                                                   .replace(R.id.activity_container,fragment)
                                                    .commit();
                    }

            }break;
            case R.id.home_button:
            {
                if(getSupportFragmentManager().findFragmentById(R.id.activity_container).equals(new HomeFragment()))
                {}else{
                    Fragment fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.activity_container,fragment)
                            .commit();
                }
            }break;
            case R.id.setting_button:
            {
                if(getSupportFragmentManager().findFragmentById(R.id.activity_container).equals(new SettingFragment()))
                {}else{
                    Fragment fragment = new SettingFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.activity_container,fragment)
                            .commit();
                }
            }break;
        }


    }

}
