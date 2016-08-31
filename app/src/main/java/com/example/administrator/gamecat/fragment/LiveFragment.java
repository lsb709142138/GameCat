package com.example.administrator.gamecat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.gamecat.R;
import com.example.administrator.gamecat.base.BaseFragment;

/**
 * Created by Administrator on 2016/8/30.
 */
public class LiveFragment extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_live_layout,container,false);
    }
}
