package zhongyi.erliao;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by dell on 2017/2/20.启动界面
 */
public class SplashActivity extends AppCompatActivity {
    private final int TIME = 2000;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.TYPE_STATUS_BAR,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.splash_layout);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME);
    }
}
