package core.location.geocoder.google.api;

import java.io.Serializable;
import java.util.List;

/**
 * Geocoder result.
 *
 * <p/>
 *
 * <iframe src="https://developers.google.com/maps/documentation/geocoding/#Results" style="height:450px; width:1200px;">
 *      <p>
 *          See google documentation at: https://developers.google.com/maps/documentation/geocoding/#Results
 *      </p>
 * </iframe>
 */
public class Result implements Serializable {
    private String formatted_address;
    private List<String> types;
    private List<AddressComponent> address_components;
    private Geometry geometry;

    /**
     * Get the Human readable address.
     *
     * <p/>
     *
     * The formatted_address is a string containing the human-readable address of this location.
     * Often this address is equivalent to the "postal address," which sometimes differs from
     * country to country. (Note that some countries, such as the United Kingdom, do not allow
     * distribution of true postal addresses due to licensing restrictions.) This address is
     * generally composed of one or more address components. For example, the address "111 8th
     * Avenue, New York, NY" contains separate address components for "111" (the street number,
     * "8th Avenue" (the route), "New York" (the city) and "NY" (the US state). These address
     * components contain additional information as noted below.
     *
     * @return Human readable address.
     */
    public String getFormatted_address() {
        return formatted_address;
    }

    /**
     * Set the human readable formatted address.
     *
     * @param formatted_address The human readable formatted address.
     */
    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    /**
     * The types of the returned results.
     *
     * <p/>
     *
     * The types[] array indicates the type of the returned result.
     * This array contains a set of one or more tags identifying the type of
     * feature returned in the result. For example, a geocode of "Chicago"
     * returns "locality" which indicates that "Chicago" is a city, and also
     * returns "political" which indicates it is a political entity.
     *
     * @return The types of the returned results.
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * Set the types of returned results.
     *
     * @param types The types of the returned results.
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * List of the Address components.
     *
     * <p/>
     *
     * For example, the address "111 8th Avenue, New York, NY" contains separate
     * address components for "111" (the street number, "8th Avenue" (the route),
     * "New York" (the city) and "NY" (the US state).
     *
     * @return The list of the address componenets.
     */
    public List<AddressComponent> getAddress_components() {
        return address_components;
    }

    /**
     * Set the list of address components.
     *
     * @param address_components The list of address componenets.
     */
    public void setAddress_components(List<AddressComponent> address_components) {
        this.address_components = address_components;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
