package zhongyi.erliao;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Shinelon on 2017/5/22.
 */

public class pointTheory extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_theory);
    }

    public static Intent newInstance(Context context){
        Intent intent = new Intent(context,pointTheory.class);
        return intent;
    }
}
