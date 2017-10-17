package com.example.android.quakereport;

import java.text.DecimalFormat;
/**
 * Created by karenulmer on 6/25/2017.
 */

public class Earthquake {

    //Magnitude of the Earthquake
    private double mMagnitude;

    //Location of the Earthquake
    private String mLocation;

    // date of the Earthquake
    private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;


    /**
     * Constructor for {@link Earthquake}
     * @param magnitude is the intensity of the Earthquake
     * @param location is where the Earthquake occured
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */

    public Earthquake (double magnitude, String location, long timeInMilliseconds, String url) {

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

     

    /**
     * Get the string resource ID for the magnitude.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the string resource ID for the Location of Earthquake
     */
    public String getLocation() {
        return mLocation;
    }

     /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
