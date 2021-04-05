package com.example.gymapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class trainerAdapter extends RecyclerView.Adapter<trainerAdapter.trainerViewHolder> {

    private ArrayList<trainer> mtrainerlist;

    public class trainerViewHolder extends RecyclerView.ViewHolder{
        int profile_pic;
        String trainer_name,trainer_descrip,trainer_speciality;

        public trainerViewHolder(View itemView){
            super(itemView);
            // TODO: 5/04/21 Recyclerview Item
        }

    }

    public trainerAdapter(ArrayList<trainer> trainer_list){
        mtrainerlist = trainer_list;
    }

    @NonNull
    @Override
    public trainerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull trainerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mtrainerlist.size();
    }

}


