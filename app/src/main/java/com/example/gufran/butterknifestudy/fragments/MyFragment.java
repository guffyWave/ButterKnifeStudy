package com.example.gufran.butterknifestudy.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gufran.butterknifestudy.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by gufran on 2/11/16.
 */
public class MyFragment extends Fragment {

    View mainView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragement_my, container, false);
        ButterKnife.bind(this, mainView);
        return mainView;
    }

    @OnClick(R.id.buttonCool)
    public void doCoolWork(View v) {
        Toast.makeText(getActivity(), "Cool Work Method called", Toast.LENGTH_SHORT).show();
    }


}
