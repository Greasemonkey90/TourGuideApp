package com.bunny.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlacesToEatFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private List<TabInfo> tabInfoList;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.places_to_eat, container, false);
        mRecyclerView = view.findViewById(R.id.places_to_eat_rv);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), tabInfoList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return view;


    }


    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tabInfoList = new ArrayList<>();
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.red_lobster_name), getString(R.string.red_lobster_address), getString(R.string.red_lobster_info)));
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.joes_crabs_name), getString(R.string.joes_crabs_address), getString(R.string.joes_crabs_info)));
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.noodles_name), getString(R.string.noodles_address), getString(R.string.noodles_info)));
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.olive_garden_info), getString(R.string.olive_garden_address), getString(R.string.olive_garden_info)));
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.umi_name), getString(R.string.umi_address), getString(R.string.umi_info)));
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.hibachi_name), getString(R.string.hibachi_address), getString(R.string.hibachi_info)));
        tabInfoList.add(new TabInfo(R.drawable.placeseat, getString(R.string.qdoba_name), getString(R.string.qdoba_address), getString(R.string.qdoba_info)));


    }

}
