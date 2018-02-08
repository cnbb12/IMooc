package com.example.lenovo.moocclass.fragment.home;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.lenovo.moocclass.R;
import com.example.lenovo.moocclass.adapter.MessageItem;
import com.example.lenovo.moocclass.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2018/2/3.
 */

public class HomeFragment extends BaseFragment {

    private View mContentView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_home_layout,container,false);

        return mContentView;
    }


}
