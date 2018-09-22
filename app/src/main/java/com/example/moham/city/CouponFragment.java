package com.example.moham.city;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moham.city.Model.Coupon;
import com.example.moham.city.Model.ItemOffer;
import com.example.moham.city.Model.Place;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CouponFragment extends Fragment {


    RecyclerView offersRecyclerView;
    OfferAdapter OfferAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<ItemOffer> offers;


    public CouponFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_coupon, container, false);
        offersRecyclerView = v.findViewById(R.id.recyclerview_offers);
        offers = new ArrayList<>();
        for(int i=0 ; i<7;i++){
            offers.add(new ItemOffer("offer"+(i+1)+" to get new car", (i+200)+"" , (i+100)+"" ));
        }
        OfferAdapter = new OfferAdapter(offers);
        offersRecyclerView.setAdapter(OfferAdapter);
        return v;
    }

}
