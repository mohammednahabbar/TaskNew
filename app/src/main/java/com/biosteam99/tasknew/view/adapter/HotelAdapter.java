package com.biosteam99.tasknew.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.biosteam99.tasknew.R;
import com.biosteam99.tasknew.databinding.ItemHotelBinding;
import com.biosteam99.tasknew.databinding.ItemOverviewBinding;
import com.biosteam99.tasknew.view.model.HotelModel;
import com.biosteam99.tasknew.view.model.OverviewModel;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolderHotel> {

    private List<HotelModel> hotelArrayList;

    Context context;




    public HotelAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderHotel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHotelBinding itemHotelBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_hotel,
                parent,false);
        return new ViewHolderHotel(itemHotelBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderHotel holder, int position) {
        final HotelModel hotelModel =hotelArrayList.get(position);

        holder.itemHotelBinding.setHotel(hotelModel);

        holder.itemHotelBinding.imageHotel.setImageResource(hotelModel.getImage());


    }

    @Override
    public int getItemCount() {
        return hotelArrayList.size();
    }

    public void setHotelArrayList(List<HotelModel> hotelArrayList) {
        this.hotelArrayList = hotelArrayList;
        notifyDataSetChanged();
    }

    public class ViewHolderHotel extends RecyclerView.ViewHolder{

        private ItemHotelBinding itemHotelBinding;

        public ViewHolderHotel(@NonNull ItemHotelBinding itemHotelBinding) {
            super(itemHotelBinding.getRoot());
            this.itemHotelBinding=itemHotelBinding;

        }
    }



}
