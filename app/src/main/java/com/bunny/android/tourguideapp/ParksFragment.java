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

public class ParksFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private List<TabInfo> parkInfoList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.parks_layout, container, false);
        mRecyclerView = view.findViewById(R.id.parks_rv);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), parkInfoList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        parkInfoList = new ArrayList<>();
        parkInfoList.add(new TabInfo(R.drawable.alum_spring, getString(R.string.alum_park_name), getString(R.string.alum_park_address), getString(R.string.alum_park_info)));
        parkInfoList.add(new TabInfo(R.drawable.old_mill, getString(R.string.old_mill_name), getString(R.string.old_mill_address), getString(R.string.old_mill_info)));
        parkInfoList.add(new TabInfo(R.drawable.john_pratt, getString(R.string.john_pratt_name), getString(R.string.john_pratt_address), getString(R.string.old_mill_info)));
        parkInfoList.add(new TabInfo(R.drawable.kenmore_park, getString(R.string.kenmore_name), getString(R.string.kenmore_address), getString(R.string.kenmore_info)));

    }
}
