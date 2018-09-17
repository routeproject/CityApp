package com.example.moham.city;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.moham.city.Model.Coupon;

import java.util.ArrayList;

public class CouponsAdapter extends RecyclerView.Adapter<CouponsAdapter.ViewHolder>{

    OnItemClickListener onSongClickListener;
    OnItemClickListener onItemClickListener;
    ArrayList<Coupon> coupons;

    public CouponsAdapter(ArrayList<Coupon> coupons) {
        this.coupons = coupons;
    }


    public void setOnSongClickListener(OnItemClickListener onSongClickListener) {
        this.onSongClickListener = onSongClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coupons,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Coupon song = coupons.get(position);
        holder.title.setText(song.getTitle().toString());

        if (onSongClickListener != null){
           holder.title.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   onSongClickListener.onClick(position,song);
               }
           });
        }


    }

    @Override
    public int getItemCount() {
        return coupons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.coupon_title);


        }
    }

    public  interface OnItemClickListener{
         void onClick(int position,  Coupon coupon);
    }

}
