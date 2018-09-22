package com.example.moham.city;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.moham.city.Model.Coupon;
import com.example.moham.city.Model.ItemOffer;

import java.util.ArrayList;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder>{

    ArrayList<ItemOffer> offers;

    public OfferAdapter(ArrayList<ItemOffer> offers) {
        this.offers = offers;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offers,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final ItemOffer offer = offers.get(position);
        holder.title.setText(offer.getTitle().toString());
        holder.FirstPrice.setText(offer.getFirstPrice().toString());
        holder.SecondPrice.setText(offer.getSecondPrice().toString());
    }

    @Override
    public int getItemCount() {
        return offers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView FirstPrice;
        TextView SecondPrice;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.offer_title);
            FirstPrice = itemView.findViewById(R.id.first_price);
            SecondPrice = itemView.findViewById(R.id.Second_price);

        }
    }
}
