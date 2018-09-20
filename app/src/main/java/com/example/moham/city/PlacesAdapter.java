package com.example.moham.city;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.moham.city.Model.Coupon;
import com.example.moham.city.Model.Place;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder>{

    OnItemClickListener onSongClickListener;
    OnItemClickListener onItemClickListener;
    ArrayList<Place> places;

    public PlacesAdapter(ArrayList<Place> places) {
        this.places = places;
    }


    public void setOnSongClickListener(OnItemClickListener onSongClickListener) {
        this.onSongClickListener = onSongClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_places,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Place place = places.get(position);
        holder.title.setText(place.getTitle().toString());

        if (onSongClickListener != null){
           holder.title.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   onSongClickListener.onClick(position,place);
               }
           });
        }


    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.place_name);


        }
    }

    public  interface OnItemClickListener{
         void onClick(int position, Place place);
         //test22
    }

}
