package zhongyi.erliao;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dell on 2017/1/18.
 */
public class EditionFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.edition_fragment,viewGroup,false);

        return v;

    }
}
