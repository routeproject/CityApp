package com.example.moham.city;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moham.city.Model.Coupon;
import com.example.moham.city.Model.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView couponsRecyclerView;
    RecyclerView placesRecyclerView;
    CouponsAdapter couponsAdapter;
    PlacesAdapter placesAdapter;
    LinearLayoutManager linearLayoutManager;
    LinearLayoutManager linearLayoutManager2;
    ArrayList<Coupon> coupons;
    ArrayList<Place> places;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        couponsRecyclerView = v.findViewById(R.id.recyclerview_coupons);
        coupons = new ArrayList<>();
        places = new ArrayList<>();
        for(int i=0 ; i<7;i++){
            coupons.add(new Coupon("Hot Summer Night"+(i+1)));
        }
        couponsAdapter = new CouponsAdapter(coupons);
        couponsRecyclerView.setAdapter(couponsAdapter);
        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        couponsRecyclerView.setLayoutManager(linearLayoutManager);

        placesRecyclerView = v.findViewById(R.id.places_recyclerview);
        for(int i=0 ; i<7;i++){
            places.add(new Place("Place number"+(i+1)));
        }
        placesAdapter = new PlacesAdapter(places);
        placesRecyclerView.setAdapter(placesAdapter);
        placesRecyclerView.setLayoutManager(linearLayoutManager2);


        return v;
    }

}
