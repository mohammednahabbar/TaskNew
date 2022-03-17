package com.biosteam99.tasknew.view.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.biosteam99.tasknew.R;
import com.biosteam99.tasknew.databinding.FragmentOverviewBinding;
import com.biosteam99.tasknew.view.adapter.OverViewAdapter;
import com.biosteam99.tasknew.view.model.OverviewModel;

import java.util.ArrayList;
import java.util.List;

public class OverviewFragment extends Fragment {

    FragmentOverviewBinding fragmentOverviewBinding;

    RecyclerView rvOverView;
    OverViewAdapter overViewAdapter;
    List<OverviewModel> overviewModelList;

    public OverviewFragment() {
        // Required empty public constructor
    }


    public static OverviewFragment newInstance() {
        return new OverviewFragment();
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentOverviewBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_overview,container,false);



        initOverViewData();

        overViewAdapter=new OverViewAdapter(getActivity());
        overViewAdapter.setOverviewArrayList(overviewModelList);

        rvOverView=fragmentOverviewBinding.rvOverView;
        rvOverView.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvOverView.setAdapter(overViewAdapter);


        // Inflate the layout for this fragment
        return fragmentOverviewBinding.getRoot();

    }

    private void initOverViewData(){
        overviewModelList=new ArrayList<>();

        overviewModelList.add(new OverviewModel("Visiting The Haram",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
                "Day 1"));
        overviewModelList.add(new OverviewModel("Visiting The Haram",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
                "Day 1"));
        overviewModelList.add(new OverviewModel("Visiting The Haram",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
                "Day 1"));
    }
}