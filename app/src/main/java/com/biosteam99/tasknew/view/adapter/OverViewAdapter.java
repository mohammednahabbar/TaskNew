package com.biosteam99.tasknew.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.biosteam99.tasknew.R;
import com.biosteam99.tasknew.databinding.ItemOverviewBinding;
import com.biosteam99.tasknew.view.model.OverviewModel;

import java.util.List;

public class OverViewAdapter extends RecyclerView.Adapter<OverViewAdapter.ViewHolderOverView> {

    private List<OverviewModel> overviewModelList;

    Context context;


    public OverViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderOverView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOverviewBinding itemOverviewBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_overview,
                parent,false);
        return new ViewHolderOverView(itemOverviewBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderOverView holder, int position) {
        final OverviewModel overviewModel =overviewModelList.get(position);

        holder.itemOverviewBinding.setOverView(overviewModel);



    }

    @Override
    public int getItemCount() {
        return overviewModelList.size();
    }

    public void setOverviewArrayList(List<OverviewModel> overviewModelList) {
        this.overviewModelList = overviewModelList;
        notifyDataSetChanged();
    }

    public class ViewHolderOverView extends RecyclerView.ViewHolder{

        private ItemOverviewBinding itemOverviewBinding;

        public ViewHolderOverView(@NonNull ItemOverviewBinding itemOverviewBinding) {
            super(itemOverviewBinding.getRoot());
            this.itemOverviewBinding=itemOverviewBinding;

        }
    }



}
