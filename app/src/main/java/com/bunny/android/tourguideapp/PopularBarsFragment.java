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

public class PopularBarsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private List<TabInfo> barsInfoList;

    public PopularBarsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.popular_bars, container, false);
        mRecyclerView = view.findViewById(R.id.popular_bars_rv);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), barsInfoList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        barsInfoList = new ArrayList<>();
        barsInfoList.add(new TabInfo(R.drawable.bars, getString(R.string.hard_times_name), getString(R.string.hard_time_address), getString(R.string.hard_time_info)));
        barsInfoList.add(new TabInfo(R.drawable.bars,  getString(R.string.bourbon_room_name),getString(R.string.bourbon_room_address), getString(R.string.bourbon_room_info)));
        barsInfoList.add(new TabInfo(R.drawable.bars, getString(R.string.aladin_name), getString(R.string.aladin_address), getString(R.string.aladin_info)));
        barsInfoList.add(new TabInfo(R.drawable.bars, getString(R.string.cowboys_name), getString(R.string.cowboys_address), getString(R.string.cowboys_info)));
        barsInfoList.add(new TabInfo(R.drawable.bars, getString(R.string.jays_name), getString(R.string.jays_address), getString(R.string.jays_info)));

    }
}
