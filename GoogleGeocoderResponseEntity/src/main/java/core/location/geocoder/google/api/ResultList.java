package core.location.geocoder.google.api;

import java.util.ArrayList;

/**
 * When the geocoder returns results, it places them within a (JSON) results array.
 * Even if the geocoder returns no results (such as if the address doesn't exist)
 * it still returns an empty results array. (XML responses consist of zero or more <result> elements.)
 */
public class ResultList extends ArrayList<Result> {



}
