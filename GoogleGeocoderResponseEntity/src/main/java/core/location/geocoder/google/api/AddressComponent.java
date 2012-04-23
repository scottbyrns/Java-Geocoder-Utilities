package core.location.geocoder.google.api;

import java.util.List;

/**
 *
 */
public class AddressComponent {

    private String long_name;
    private String short_name;
    private List<String> types;

    /**
     * long_name is the full text description or name of the address component as returned by the Geocoder.
     *
     * @return The long name of the address component.
     */
    public String getLong_name() {
        return long_name;
    }

    /**
     * Set the long name of the address component.
     *
     * @param long_name The long name of the address component.
     */
    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    /**
     * short_name is an abbreviated textual name for the address component, if available.
     * For example, an address component for the state of Alaska may have a long_name of
     * "Alaska" and a short_name of "AK" using the 2-letter postal abbreviation.
     *
     * @return The short name of the address component.
     */
    public String getShort_name() {
        return short_name;
    }

    /**
     * Set the short name for the address component.
     *
     * @param short_name The short name for the address component.
     */
    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    /**
     *  which indicates the type of the address component.
     *
     * @return
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * Set the types list of the address component.
     *
     * @param types The types of the address component.
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }
}
