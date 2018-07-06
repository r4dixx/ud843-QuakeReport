package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mUnixTime;
    private String mUrl;

    public Earthquake(double magnitude, String location, long unixTime, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mUnixTime = unixTime;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getUnixTime() {
        return mUnixTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
