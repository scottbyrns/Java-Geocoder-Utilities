package com.scottbyrns.geocoder;

import com.scottbyrns.api.client.APIClient;
import com.scottbyrns.api.client.APIRequest;
import com.scottbyrns.api.client.RequestType;

import core.location.geocoder.google.api.Response;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Geolocate addresses.
 */
public class Geocoder {

    private static Geocoder instance;

    private Geocoder() {
    }

    public static Geocoder getInstance() {
        if (null == instance) {
            instance = new Geocoder();
        }
        return instance;
    }

    /**
     * Defaulting to google maps api v3.
     */
    private GeocoderService defaultGeocoderService = GeocoderService.GOOGLE_MAPS_API_V3;

    public GeoLocation getTheGeoLocationOf(PhysicalAddress physicalAddress) {

        APIRequest geocoderApiRequest = new APIRequest(defaultGeocoderService.getServiceURI());
        geocoderApiRequest.setRequestUrl("json?address={$address}&sensor={$sensor}");
        geocoderApiRequest.setRequestType(RequestType.GET);

        geocoderApiRequest.addRequestParameter("address", physicalAddress.getFullAddress());
        geocoderApiRequest.addRequestParameter("sensor", "false");

        Response response = (Response)APIClient.getInstance().<Response>makeRequest(geocoderApiRequest).getResponseEntity(Response.class);

        return new GeoLocation(
                response.getResults().get(0).getGeometry().getLocation().getLat(),
                response.getResults().get(0).getGeometry().getLocation().getLng()
        );
    }

    public List<GeoLocation> geocodeAddressList (List<PhysicalAddress> physicalAddressList) {
        Geocoder geocoder = new Geocoder();
        Iterator<PhysicalAddress> physicalAddressIterator = physicalAddressList.iterator();
        PhysicalAddress physicalAddress;
        List<GeoLocation> geoLocationList = new ArrayList<GeoLocation>();
        while (physicalAddressIterator.hasNext()) {
            physicalAddress = physicalAddressIterator.next();
            geoLocationList.add(geocoder.getTheGeoLocationOf(physicalAddress));
        }

        return geoLocationList;
    }

}
