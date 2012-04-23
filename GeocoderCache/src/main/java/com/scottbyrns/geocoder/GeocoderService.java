package com.scottbyrns.geocoder;

/**
 * Created by IntelliJ IDEA.
 * User: scott
 * Date: 4/20/12
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public enum GeocoderService {

    GOOGLE_MAPS_API_V2(""),
    GOOGLE_MAPS_API_V3("http://maps.googleapis.com/maps/api/geocode/"),

    OPEN_STREET_MAPS_API("");

    private String text;

    GeocoderService(String text) {
        this.text = text;
    }

    public String getServiceURI() {
        return this.text;
    }

    public static GeocoderService fromString(String text) {
        if (text != null) {
            for (GeocoderService b : GeocoderService.values()) {
                if (text.equalsIgnoreCase(b.text)) {
                    return b;
                }
            }
        }
        return null;
    }


}
