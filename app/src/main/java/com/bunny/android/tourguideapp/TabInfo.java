package com.bunny.android.tourguideapp;

import androidx.fragment.app.Fragment;

public class TabInfo extends Fragment {

    private int mImage;
    private String mPlaceName;
    private String mAddress;
    private String mPlaceInfo;

    public TabInfo(int image, String placeName, String address, String placeInfo) {
        mImage = image;
        mPlaceName = placeName;
        mAddress = address;
        mPlaceInfo = placeInfo;

    }

    public int getImage() {
        return mImage;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getInfo() {
        return mPlaceInfo;
    }
}



