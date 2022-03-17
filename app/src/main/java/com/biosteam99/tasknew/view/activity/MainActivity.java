package com.biosteam99.tasknew.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.biosteam99.tasknew.R;
import com.biosteam99.tasknew.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    FrameLayout frameLayoutHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        initView();


    }

    private void initView(){
        frameLayoutHeader=activityMainBinding.frameLayoutHeader;
    }
}