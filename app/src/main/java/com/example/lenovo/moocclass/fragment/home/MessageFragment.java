package com.example.lenovo.moocclass.fragment.home;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.moocclass.R;
import com.example.lenovo.moocclass.adapter.MessageAdapter;
import com.example.lenovo.moocclass.adapter.MessageItem;
import com.example.lenovo.moocclass.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2018/2/3.
 */

public class MessageFragment extends BaseFragment {

    private List<MessageItem> listItems = new ArrayList<>();
    private Context mContent;

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
        View view = inflater.inflate(R.layout.fragment_message_layout,container,false);
        Log.d("2", "onCreateView: ");
        initItem();
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.items_message_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContent);
        recyclerView.setLayoutManager(linearLayoutManager);
        MessageAdapter adapter = new MessageAdapter(listItems);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initItem() {
        MessageItem item1 = new MessageItem(R.color.colorBlue,R.mipmap.icon_chats,"留言","还没有收到留言");
        listItems.add(item1);
        MessageItem item2 = new MessageItem(R.color.colorGreen,R.mipmap.love_red,"收到的赞","还没有收到的赞");
        listItems.add(item2);
        MessageItem item3 = new MessageItem(R.color.colorBackground,R.mipmap.icon_imooc,"慕课网","再不学习慕女神不喜欢你了");
        listItems.add(item3);
    }
}
