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
