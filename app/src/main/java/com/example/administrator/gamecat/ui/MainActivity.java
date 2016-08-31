package com.example.administrator.gamecat.ui;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.gamecat.R;
import com.example.administrator.gamecat.fragment.CatHomeFragment;
import com.example.administrator.gamecat.fragment.LiveFragment;
import com.example.administrator.gamecat.fragment.MessageFragment;
import com.example.administrator.gamecat.fragment.UnionFragment;
import com.facebook.drawee.backends.pipeline.Fresco;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private MessageFragment messageFragment;
    private LiveFragment liveFragment;
    private UnionFragment unionFragment;
    private CatHomeFragment catHomeFragment;

    private FragmentManager manager;
    private LinearLayout message, union, live, cathome;
    private ImageView ivMessage, ivUnion, ivLive, ivCatHome;
    private TextView tvMessage, tvUnion, tvLive, tvCatHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Fresco.initialize(this);

        //初始化布局
        initView();
        //初始化数据
        initData();
    }

    private void initData() {
        //初始化首页
        selection(0);
    }

    //处理选择的fragment位置
    private void selection(int i) {
        FragmentTransaction transaction = manager.beginTransaction();
        //隐藏fragment
        hideFragment(transaction);
        //
        normalBackground();
        switch (i) {
            case 0:
                //选择图片背景及文字颜色
                pressedBackground(ivMessage, tvMessage, R.drawable.widget_bar_home_over2, Color.parseColor("#FF5616"));
                //判断fragment是否存在
                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
                    transaction.add(R.id.main_activity_framelayout, messageFragment);
                } else {
                    transaction.show(messageFragment);
                }

                break;
            case 1:
                //选择图片背景及文字颜色
                pressedBackground(ivUnion, tvUnion, R.drawable.widget_bar_miaocircle_over2, Color.parseColor("#FF5616"));
                //判断fragment是否存在
                if (unionFragment == null) {
                    unionFragment = new UnionFragment();
                    transaction.add(R.id.main_activity_framelayout, unionFragment);
                } else {
                    transaction.show(unionFragment);
                }
                break;
            case 2:
                //选择图片背景及文字颜色
                pressedBackground(ivLive, tvLive, R.drawable.widget_bar_found_over2, Color.parseColor("#FF5616"));
                //判断fragment是否存在
                if (liveFragment == null) {
                    liveFragment = new LiveFragment();
                    transaction.add(R.id.main_activity_framelayout, liveFragment);
                } else {
                    transaction.show(liveFragment);
                }
                break;
            case 3:
                //选择图片背景及文字颜色
                pressedBackground(ivCatHome, tvCatHome, R.drawable.widget_bar_my_over2, Color.parseColor("#FF5616"));
                //判断fragment是否存在
                if (catHomeFragment == null) {
                    catHomeFragment = new CatHomeFragment();
                    transaction.add(R.id.main_activity_framelayout, catHomeFragment);
                } else {
                    transaction.show(catHomeFragment);
                }
                break;
        }
        //提交事务
        transaction.commit();
    }

    //选中的背景及文字颜色
    private void pressedBackground(ImageView ivLogo, TextView tvTitle, int resId, int color) {
        //设置图片背景
        ivLogo.setImageResource(resId);
        //设置文字颜色
        tvTitle.setTextColor(color);
    }

    //默认的背景及文字颜色
    private void normalBackground() {
//        ivHome.setImageResource(R.drawable.home);
//        tvHome.setTextColor(Color.parseColor("#000000"));
        pressedBackground(ivMessage,tvMessage,R.drawable.widget_bar_home_nor2,Color.parseColor("#000000"));
        pressedBackground(ivUnion,tvUnion,R.drawable.widget_bar_miaocircle_nor2,Color.parseColor("#000000"));
        pressedBackground(ivLive,tvLive,R.drawable.widget_bar_found_on2,Color.parseColor("#000000"));
        pressedBackground(ivCatHome,tvCatHome,R.drawable.widget_bar_my_nor2,Color.parseColor("#000000"));

//        ivLive.setImageResource(R.drawable.live);
//        tvLive.setTextColor(Color.parseColor("#000000"));
//
//        ivFollow.setImageResource(R.drawable.follow);
//        tvFollow.setTextColor(Color.parseColor("#000000"));
//
//        ivUser.setImageResource(R.drawable.user);
//        tvUser.setTextColor(Color.parseColor("#000000"));
    }

    //隐藏fragment
    private void hideFragment(FragmentTransaction transaction) {
        if (messageFragment != null) {
            transaction.hide(messageFragment);
        }
        if (unionFragment != null) {
            transaction.hide(unionFragment);
        }
        if (liveFragment != null) {
            transaction.hide(liveFragment);
        }
        if (catHomeFragment != null) {
            transaction.hide(catHomeFragment);
        }
    }

    //初始化布局
    private void initView() {
        manager = getSupportFragmentManager();

        //初始化布局
        message = (LinearLayout) findViewById(R.id.main_activity_message);
        union = (LinearLayout) findViewById(R.id.main_activity_union);
        live = (LinearLayout) findViewById(R.id.main_activity_live);
        cathome = (LinearLayout) findViewById(R.id.main_activity_cathome);
        //
        ivMessage = (ImageView) findViewById(R.id.main_activity_message_image);
        ivUnion = (ImageView) findViewById(R.id.main_activity_union_image);
        ivLive = (ImageView) findViewById(R.id.main_activity_live_image);
        ivCatHome = (ImageView) findViewById(R.id.main_activity_cathome_image);

        tvMessage = (TextView) findViewById(R.id.main_activity_message_title);
        tvUnion = (TextView) findViewById(R.id.main_activity_union_title);
        tvLive = (TextView) findViewById(R.id.main_activity_live_title);
        tvCatHome = (TextView) findViewById(R.id.main_activity_cathome_title);

        //设置点击事件
        message.setOnClickListener(this);
        union.setOnClickListener(this);
        live.setOnClickListener(this);
        cathome.setOnClickListener(this);

    }

    //点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_activity_message:
                //点击时图片背景及文字颜色发送改变
                selection(0);
                break;
            case R.id.main_activity_union:
                selection(1);
                break;
            case R.id.main_activity_live:
                selection(2);
                break;
            case R.id.main_activity_cathome:
                selection(3);
                break;
        }
    }
}
