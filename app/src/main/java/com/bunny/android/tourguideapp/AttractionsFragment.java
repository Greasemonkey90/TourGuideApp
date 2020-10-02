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

public class AttractionsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private List<TabInfo> attractionsInfoList;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attractions_layout, container, false);
        mRecyclerView = view.findViewById(R.id.attractions_rv);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), attractionsInfoList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        attractionsInfoList = new ArrayList<>();
        attractionsInfoList.add(new TabInfo(R.drawable.attraction, getString(R.string.sky_zone_name), getString(R.string.sky_zone_address), getString(R.string.sky_zone_info)));
        attractionsInfoList.add(new TabInfo(R.drawable.attraction, getString(R.string.spotsy_mall_name), getString(R.string.spotsy_mall_address), getString(R.string.spotsy_mall_info)));
        attractionsInfoList.add(new TabInfo(R.drawable.attraction, getString(R.string.funland_name), getString(R.string.funland_address), getString(R.string.funland_info)));
        attractionsInfoList.add(new TabInfo(R.drawable.attraction, getString(R.string.duck_pond_name), getString(R.string.duck_pond_address), getString(R.string.duck_pond_info)));
        attractionsInfoList.add(new TabInfo(R.drawable.attraction, getString(R.string.splitsville_name), getString(R.string.splitsville_address), getString(R.string.splitsville_info)));

    }


}
