package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mUnixTime;

    public Earthquake(double magnitude, String location, long unixTime) {
        mMagnitude = magnitude;
        mLocation = location;
        mUnixTime = unixTime;
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

}
