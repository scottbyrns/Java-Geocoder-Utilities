package com.scottbyrns.geocoder;

/**
 * A physical address.
 */
public class PhysicalAddress {

    private String streetAddress;
    private String subAddress = "";
    private String city;
    private String region;
    private String nation;

    public PhysicalAddress() {
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getSubAddress() {
        return subAddress;
    }

    public String getAddressSecondLine() {
        return getSubAddress();
    }

    public void setSubAddress(String subAddress) {
        this.subAddress = subAddress;
    }

    public void setAddressSecondLine(String secondLine) {
        setSubAddress(secondLine);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * Get the full compiled address for the physical address.
     *
     * {Street Address} {Sub Address}, {City}, {Reigon}
     *
     * @return The full compiled address.
     */
    public String getFullAddress() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getStreetAddress());
        stringBuilder.append(" ");
        stringBuilder.append(getSubAddress());
        stringBuilder.append(", ");
        stringBuilder.append(getCity());
        stringBuilder.append(", ");
        stringBuilder.append(getRegion());

        return stringBuilder.toString().replaceAll(" ", "+");
    }
}
