package com.scottbyrns.geocoder;

import com.scottbyrns.geocoder.cache.CacheUtility;
import com.scottbyrns.utilities.JSONObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static junit.framework.Assert.*;
import static junit.framework.Assert.assertEquals;

/**
 * Test the geocoder on a Dawson Taylor Coffee in downtown Boise, Idaho.
 */
public class TestGeocoder {

    @Test
    public void testGettingTheGeoLocationOfAnAddress() {
        Geocoder testGeocoder = Geocoder.getInstance();

        PhysicalAddress physicalAddress = new PhysicalAddress();
        physicalAddress.setStreetAddress("280 N. 8th St.");
        physicalAddress.setCity("Boise");
        physicalAddress.setRegion("Idaho");
        physicalAddress.setNation("United States");

        GeoLocation location = testGeocoder.getTheGeoLocationOf(physicalAddress);

        assertEquals(
                location.getLatitude(),
                43.6170937
        );

        assertEquals(
                location.getLongitude(),
                -116.2020142
        );

    }

    private List<PhysicalAddress> physicalAddressList = new ArrayList<PhysicalAddress>();

    public void setUp() {
        PhysicalAddress physicalAddress = new PhysicalAddress();
        physicalAddress.setStreetAddress("280 N. 8th St.");
        physicalAddress.setCity("Boise");
        physicalAddress.setRegion("Idaho");
        physicalAddress.setNation("United States");
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
        physicalAddressList.add(physicalAddress);
    }

    @Test
    public void testGeocodeAddressList() {
        setUp();
        List<GeoLocation> geoLocations = Geocoder.getInstance().geocodeAddressList(physicalAddressList);
        Iterator<GeoLocation> geoLocationIterator = geoLocations.iterator();
        GeoLocation location;
        while (geoLocationIterator.hasNext()) {
            location = geoLocationIterator.next();
            assertEquals(
                    location.getLatitude(),
                    43.6170937
            );

            assertEquals(
                    location.getLongitude(),
                    -116.2020142
            );
        }



    }
}
