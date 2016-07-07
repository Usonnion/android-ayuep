package com.ws.apple.ayuep.ui.dashboard;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import com.ws.apple.ayuep.R;
import com.flyco.tablayout.CommonTabLayout;


public class DashboardActivity extends AppCompatActivity {

    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private String[] mTitles = {"首页", "所有店铺", "我的订单", "我的"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        for (String title : mTitles) {
            mFragments.add(MainFragment.getInstance(title));
        }

    }
}
