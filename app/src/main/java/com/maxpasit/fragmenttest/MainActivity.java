package com.maxpasit.fragmenttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.btn_create)
    Button btn_create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn_create.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btn_create)
        {
            FirstFragment frag = new FirstFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentLayout, frag)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
