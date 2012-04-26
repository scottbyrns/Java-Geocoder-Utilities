/**
 *
 * Copyright (C) 2011, 2012 by Scott Byrns
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
