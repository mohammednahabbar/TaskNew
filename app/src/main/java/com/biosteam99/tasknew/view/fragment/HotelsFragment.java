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
import com.biosteam99.tasknew.databinding.FragmentHotelsBinding;
import com.biosteam99.tasknew.databinding.FragmentOverviewBinding;
import com.biosteam99.tasknew.view.adapter.HotelAdapter;
import com.biosteam99.tasknew.view.adapter.OverViewAdapter;
import com.biosteam99.tasknew.view.model.HotelModel;
import com.biosteam99.tasknew.view.model.OverviewModel;

import java.util.ArrayList;
import java.util.List;



public class HotelsFragment extends Fragment {

    FragmentHotelsBinding fragmentHotelsBinding;

    RecyclerView rvHotel;
    HotelAdapter hotelAdapter;
    List<HotelModel> hotelModelList;

    public HotelsFragment() {
        // Required empty public constructor
    }


    public static HotelsFragment newInstance() {
        return new HotelsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentHotelsBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_hotels,container,false);

        initHotelData();

        hotelAdapter=new HotelAdapter(getActivity());
        hotelAdapter.setHotelArrayList(hotelModelList);

        rvHotel=fragmentHotelsBinding.rvHotel;
        rvHotel.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvHotel.setAdapter(hotelAdapter);

        // Inflate the layout for this fragment
        return fragmentHotelsBinding.getRoot();
    }


    private void initHotelData(){
        hotelModelList=new ArrayList<>();

        hotelModelList.add(new HotelModel("Meridien Hotel 1",R.drawable.img_hotel));
        hotelModelList.add(new HotelModel("Meridien Hotel 2",R.drawable.img_hotel));
        hotelModelList.add(new HotelModel("Meridien Hotel 3",R.drawable.img_hotel));
        hotelModelList.add(new HotelModel("Meridien Hotel 4",R.drawable.img_hotel));

    }

}