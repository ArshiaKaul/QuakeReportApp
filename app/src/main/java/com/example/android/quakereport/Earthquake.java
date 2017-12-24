package com.example.android.quakereport;

/**
 * Created by arshi on 22-12-2017.
 */

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliSeconds;
    private String mURL;

    public Earthquake(Double mMagnitude, String mLocation, Long mTimeInMilliSeconds, String mURL){
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliSeconds = mTimeInMilliSeconds;
        this.mURL = mURL;
    }

    public Double getMagnitude() { return mMagnitude; }
    public String getLocation() { return mLocation; }
    public Long getTimeInMilliSeconds() { return mTimeInMilliSeconds; }
    public String getURL() { return mURL; }
}
