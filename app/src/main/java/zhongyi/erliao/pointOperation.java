package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Shinelon on 2017/5/22.
 */

public class pointOperation extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_operation);
    }

    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,pointOperation.class);
        return intent;
    }
}
