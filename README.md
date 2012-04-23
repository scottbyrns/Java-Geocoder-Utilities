Java Geocoder Utilities
====================
So we don't have to build a geocoder wrapper around every new API. Here is a generic interface to geocoding services.

Usage
-----
Simply create a <code>Geocoder</code> and ask it to <code>getTheGeoLocationOf</code> a <code>PhysicalAddress</code>.

```java
GeoLocation location = Geocoder.getTheLocationOf(new PhysicalAddress());
```

This will return the location of the provided <code>PhysicalAddress</code>.

```java
location.getLatitude();
location.getLongitude();
```

and to look up a location use
NOT YET IMPLEMENTED

```java
Geocoder.getTheAddressOf(new GeoLocation());
```
