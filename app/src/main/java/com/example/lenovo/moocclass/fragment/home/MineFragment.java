package com.example.lenovo.moocclass.fragment.home;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.moocclass.R;
import com.example.lenovo.moocclass.adapter.MessageItem;
import com.example.lenovo.moocclass.adapter.MineAdapter;
import com.example.lenovo.moocclass.adapter.MineItem;
import com.example.lenovo.moocclass.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2018/2/3.
 */

public class MineFragment extends BaseFragment{

    private Context mContent;
    private List<MineItem> listitems = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContent = getActivity();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mine_layout,container,false);
        initItem();

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.mine_items_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContent);
        recyclerView.setLayoutManager(linearLayoutManager);
        MineAdapter mineAdapter = new MineAdapter(listitems);
        recyclerView.setAdapter(mineAdapter);
        return view;
    }

    private void initItem() {
        MineItem item1 = new MineItem("视频播放设置");
        listitems.add(item1);
        MineItem item2 = new MineItem("分享imooc给朋友");
        listitems.add(item2);
        MineItem item3 = new MineItem("我的二维码");
        listitems.add(item3);
        MineItem item4 = new MineItem("版本更新");
        listitems.add(item4);


    }
}
