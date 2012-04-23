package com.scottbyrns.geocoder.cache;

import com.scottbyrns.geocoder.GeoLocation;
import com.scottbyrns.geocoder.Geocoder;
import com.scottbyrns.geocoder.GeocoderService;
import com.scottbyrns.geocoder.PhysicalAddress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A utility to cache geocoder information from geocoding services like Google Maps API or Open Street Maps.
 */
public class CacheUtility {

    private GeocoderService activeGeocoderService = GeocoderService.GOOGLE_MAPS_API_V3;

    private static CacheUtility instance;

    /**
     * Get the shared instance of the CacheUtility
     *
     * @return The shared instance of the CacheUtility
     */
    public static CacheUtility getInstance() {
        if (null == instance) {
            setInstance(
                    new CacheUtility()
            );
        }
        return instance;
    }

    /**
     * Set the instance of the cache utility.
     *
     * @param instance The CacheUtility instance.
     */
    private static void setInstance(CacheUtility instance) {
        CacheUtility.instance = instance;
    }

    /**
     * Set the active instance to null. Instance references held by other parts of the application will not
     * be effected when this method is called. Calls to {@link com.scottbyrns.geocoder.cache.CacheUtility#getInstance()}
     * will not return the instance held by this singleton prior to calling the method.
     */
    private static void destroy() {
        instance = null;
    }

    private CacheUtility() {
    }


    /**
     * Return the active geocoder service.
     *
     * @return The active geocoder service.
     */
    public GeocoderService getActiveGeocoderService() {
        return activeGeocoderService;
    }

    /**
     * Set the active geocoder service.
     *
     * @param activeGeocoderService The active gecoder service to set.
     */
    public void setTheActiveGeocoderServiceTo(GeocoderService activeGeocoderService) {
        this.activeGeocoderService = activeGeocoderService;
    }



}
