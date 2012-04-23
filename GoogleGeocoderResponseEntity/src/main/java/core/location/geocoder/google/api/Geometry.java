package core.location.geocoder.google.api;

import java.util.Map;

/**
 *
 */
public class Geometry {

    private Location location;
    private String location_type;
    private Map<String, Location> viewport;
    private String partial_match;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Map<String, Location> getViewport() {
        return viewport;
    }

    public void setViewport(Map<String, Location> viewport) {
        this.viewport = viewport;
    }

    public String getPartial_match() {
        return partial_match;
    }

    public void setPartial_match(String partial_match) {
        this.partial_match = partial_match;
    }
}
