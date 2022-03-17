package com.biosteam99.tasknew.view.model;

import androidx.fragment.app.Fragment;

public class MainTabModel {

    private Fragment fragment;
    private String title;

    public MainTabModel(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
