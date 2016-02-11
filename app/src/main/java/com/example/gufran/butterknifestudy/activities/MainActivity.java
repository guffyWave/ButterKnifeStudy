package com.example.gufran.butterknifestudy.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.gufran.butterknifestudy.R;
import com.example.gufran.butterknifestudy.fragments.MyFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.container)
    FrameLayout container;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        fragmentManager = getSupportFragmentManager();
        myFragment = new MyFragment();

    }

    public void onClick(View v) {
        textView.setText("Button Clicked");

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, myFragment);
        fragmentTransaction.commit();
    }
}
