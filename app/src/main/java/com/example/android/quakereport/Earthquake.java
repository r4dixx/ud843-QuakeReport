package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mUnixTime;

    public Earthquake(String magnitude, String location, long unixTime) {
        mMagnitude = magnitude;
        mLocation = location;
        mUnixTime = unixTime;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getUnixTime() {
        return mUnixTime;
    }

}
