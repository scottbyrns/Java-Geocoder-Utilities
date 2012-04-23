package com.scottbyrns.geocoder.cache;

import com.scottbyrns.geocoder.GeoLocation;
import com.scottbyrns.geocoder.PhysicalAddress;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: scott
 * Date: 4/22/12
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCacheUtility {

    @Test
    public void testGettingTheActiveGeocoderService () {
        CacheUtility.getInstance().getActiveGeocoderService();
    }

}
