package com.app.fixy.fragments;

import android.annotation.SuppressLint;
import android.content.Context;

import com.app.fixy.R;

/**
 * Created by Shubham verma on 16-08-2018.
 */

public class CoinsFragment extends BaseFragment {

    @SuppressLint("StaticFieldLeak")
    static CoinsFragment fragment;

    public static CoinsFragment newInstance(Context mContext) {
        fragment = new CoinsFragment();
        return fragment;
    }


    @Override
    protected int getContentView() {
        return R.layout.fragment_coins;
    }

    @Override
    protected void onCreateStuff() {

    }

    @Override
    protected void initListeners() {

    }
}
