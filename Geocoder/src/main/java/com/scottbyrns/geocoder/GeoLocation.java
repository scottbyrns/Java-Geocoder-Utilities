package com.scottbyrns.geocoder;

/**
 * Geo location on earth.
 */
public class GeoLocation {

    private double latitude;
    private double longitude;

    public GeoLocation(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
