package com.biosteam99.tasknew.view.adapter;


import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.biosteam99.tasknew.view.model.MainTabModel;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerMainAdapter extends FragmentPagerAdapter {

   List<MainTabModel> mainTabModels=new ArrayList<MainTabModel>();

   public ViewPagerMainAdapter(@NonNull FragmentManager fm, int behavior) {
      super(fm, behavior);
   }

   @NonNull
   @Override
   public Fragment getItem(int position) {
      return mainTabModels.get(position).getFragment();
   }

   @Nullable
   @Override
   public CharSequence getPageTitle(int position) {
      return mainTabModels.get(position).getTitle();
   }

   @Override
   public int getCount() {
      return mainTabModels.size();
   }

   public void setTabMMedicalModelArrayList(List<MainTabModel> mainTabModels) {
      this.mainTabModels = mainTabModels;
   }

   @Override
   public void destroyItem(ViewGroup container, int position, Object object) {

   }

}
