package com.example.lenovo.moocclass.activity;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.lenovo.moocclass.R;
import com.example.lenovo.moocclass.activity.base.BaseActivity;;
import com.example.lenovo.moocclass.fragment.home.HomeFragment;
import com.example.lenovo.moocclass.fragment.home.MessageFragment;
import com.example.lenovo.moocclass.fragment.home.MineFragment;
import com.isanwenyu.tabview.TabView;

public class HomeActivity extends BaseActivity implements View.OnClickListener {

    private LinearLayout homeBottomLayout;
    private LinearLayout messageBottomLayout;
    private LinearLayout mineBottomLayout;

    private ImageView homeImage;
    private ImageView messageImage;
    private ImageView mineImage;

    private HomeFragment homeFragment;
    private MessageFragment messageFragment;
    private MineFragment mineFragment;


    private FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        initView();

        //默认显示的Fragment
        fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.viewpager_layout,homeFragment);
        fragmentTransaction.show(homeFragment);
        fragmentTransaction.commit();

        homeImage.setBackgroundResource(R.mipmap.comui_tab_home_selected);
        messageImage.setBackgroundResource(R.mipmap.comui_tab_message);
        mineImage.setBackgroundResource(R.mipmap.comui_tab_person);





    }

    public void initView(){


        homeFragment = new HomeFragment();

        homeBottomLayout = (LinearLayout)findViewById(R.id.home_buttom_layout);
        messageBottomLayout = (LinearLayout)findViewById(R.id.message_buttom_layout);
        mineBottomLayout = (LinearLayout)findViewById(R.id.mine_buttom_layout);

        homeImage =(ImageView)findViewById(R.id.home_buttom_imageView);
        messageImage = (ImageView)findViewById(R.id.message_buttom_imageView);
        mineImage = (ImageView)findViewById(R.id.mine_buttom_imageView);

        homeBottomLayout.setOnClickListener(this);
        messageBottomLayout.setOnClickListener(this);
        mineBottomLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        switch (view.getId()){
            case R.id.home_buttom_layout:
                homeImage.setBackgroundResource(R.mipmap.comui_tab_home_selected);
                messageImage.setBackgroundResource(R.mipmap.comui_tab_message);
                mineImage.setBackgroundResource(R.mipmap.comui_tab_person);
                hideFragment(messageFragment,fragmentTransaction);
                hideFragment(mineFragment,fragmentTransaction);
                if(homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.viewpager_layout, homeFragment);
                }else{
                    fragmentTransaction.show(homeFragment);
                }


                break;
            case R.id.message_buttom_layout:
                homeImage.setBackgroundResource(R.mipmap.comui_tab_home);
                messageImage.setBackgroundResource(R.mipmap.comui_tab_message_selected);
                mineImage.setBackgroundResource(R.mipmap.comui_tab_person);
                if(messageFragment == null) {
                    messageFragment = new MessageFragment();
                    fragmentTransaction.add(R.id.viewpager_layout, messageFragment);
                }else{

                    fragmentTransaction.show(messageFragment);
                }
                hideFragment(homeFragment,fragmentTransaction);
                hideFragment(mineFragment,fragmentTransaction);
                break;
            case R.id.mine_buttom_layout:
                homeImage.setBackgroundResource(R.mipmap.comui_tab_home);
                messageImage.setBackgroundResource(R.mipmap.comui_tab_message);
                mineImage.setBackgroundResource(R.mipmap.comui_tab_person_selected);
                if(mineFragment == null) {
                    mineFragment = new MineFragment();
                    fragmentTransaction.add(R.id.viewpager_layout, mineFragment);
                }else{
                    fragmentTransaction.show(mineFragment);
                }
                hideFragment(messageFragment,fragmentTransaction);
                hideFragment(homeFragment,fragmentTransaction);
                break;
        }
        fragmentTransaction.commit();

    }

    private void hideFragment(Fragment fragment,FragmentTransaction ft) {
        if(fragment != null){
            ft.hide(fragment);
        }
    }
}
