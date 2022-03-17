package com.biosteam99.tasknew.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.biosteam99.tasknew.R;
import com.biosteam99.tasknew.databinding.ActivityMainBinding;
import com.biosteam99.tasknew.view.adapter.ViewPagerMainAdapter;
import com.biosteam99.tasknew.view.fragment.HotelsFragment;
import com.biosteam99.tasknew.view.fragment.OverviewFragment;
import com.biosteam99.tasknew.view.fragment.TransportationFragment;
import com.biosteam99.tasknew.view.model.MainTabModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    ViewPager viewPagerMain;
    TabLayout tabLayoutMain;

    ViewPagerMainAdapter viewPagerMainAdapter;

    List<MainTabModel> mainTabModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        initView();

        initTabLayoutMain();

    }

    private void initTabLayoutMain(){

        mainTabModelList=new ArrayList<>();


        viewPagerMainAdapter=new ViewPagerMainAdapter(getSupportFragmentManager(),0);

        mainTabModelList.add(new MainTabModel(OverviewFragment.newInstance(),"OverView"));
        mainTabModelList.add(new MainTabModel(HotelsFragment.newInstance(),"Hotels"));
        mainTabModelList.add(new MainTabModel(TransportationFragment.newInstance(),"Transportation"));

        viewPagerMainAdapter.setTabMMedicalModelArrayList(mainTabModelList);
        viewPagerMain.setAdapter(viewPagerMainAdapter);

        tabLayoutMain.setupWithViewPager(viewPagerMain);

    }


    private void initView(){
        tabLayoutMain=activityMainBinding.tabLayoutMain;
        viewPagerMain=activityMainBinding.viewPagerMain;
    }
}