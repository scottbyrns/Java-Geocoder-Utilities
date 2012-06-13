/**
 *
 * Copyright (C) 2012 by Scott Byrns
 * http://github.com/scottbyrns
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 */
package com.scottbyrns.geocoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static junit.framework.Assert.*;
import static junit.framework.Assert.assertEquals;

/**
 * Test the geocoder on a Thomas Hammer Coffee in downtown Boise, Idaho.
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
//        1257 Kilauea Avenue Hilo, HI 96720
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

    @Test
    public void reverseGeocode () {
        GeoLocation geoLocation = new GeoLocation(40.714224, -73.961452);
        String address = Geocoder.getInstance().getTheAddressOf(geoLocation);
        address.toString();
    }
}
