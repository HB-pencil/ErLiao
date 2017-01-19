package zhongyi.erliao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by dell on 2017/1/13.主页fragment
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    private Button wButton;
    private Button xButton;
    private Button kButton;
    private Button aButton;
    private Button cButton;
    private Button dButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_layout, container,false);


        wButton = (Button)view.findViewById(R.id.what_button);
        xButton = (Button)view.findViewById(R.id.point_button);
        kButton = (Button)view.findViewById(R.id.know_button);
        aButton = (Button)view.findViewById(R.id.good_button);
        cButton = (Button)view.findViewById(R.id.culture_button);
        dButton = (Button)view.findViewById(R.id.develop_button);

        //设置按钮监听器
        wButton.setOnClickListener(this);
        xButton.setOnClickListener(this);
        kButton.setOnClickListener(this);
        aButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        dButton.setOnClickListener(this);

        return view;
    }

    //设置按钮监听处理方法
    @Override
    public void onClick(View v){
        switch( v.getId() ){
            case R.id.what_button:
            {
                Intent intent = WhatActivity.newInstance(getActivity());
                startActivity(intent);
            }
            break;
            case R.id.point_button:
            {
                Intent intent = PointActivity.newInstance(getActivity());
                startActivity(intent);
            }
            break;
            case R.id.know_button:
            {
                Intent intent = KnowActivity.newInstance(getActivity());
                startActivity(intent);
            }
            break;
            case R.id.good_button:
            {
                Intent intent = GoodActivity.newInstance(getActivity());
                startActivity(intent);
            }
            break;
            case R.id.culture_button:
            {
                Intent intent = CultureActivity.newInstance(getActivity());
                startActivity(intent);
            }
            break;
            case R.id.develop_button:
            {
                Intent intent = DevelopActivity.newInstance(getActivity());
                startActivity(intent);
            }
            break;
        }

    }

}