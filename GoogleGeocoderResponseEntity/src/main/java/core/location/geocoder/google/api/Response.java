package core.location.geocoder.google.api;

import java.io.Serializable;

/**
 * The Google Geocoding API Response Entity
 * This object is designed to be mappable using any JSON Object Mapper to an API response from The Google Geocoding API.
 *
 * <ul>
 *     <li>
 *         <a href="https://developers.google.com/maps/documentation/geocoding/">
 *             The Google Geocoding API
 *         </a>
 *     </li>
 * </ul>
 *
 * <p/>
 *
 * This particular entity will encompass the results and status portion of a JSON response.
 * The results list and its components will be delegated to other entities.
 *
 * <p/>
 *
 * <code>
 * {
 *  "results" : [
 *      {
 *      ...
 *      }
 *   ],
 *  "status" : "OK"
 * }
 * </code>
 *
 * @version 1.0
 */
public class Response implements Serializable {

    private String status;
    private ResultList results;

    /**
     * The "status" field within the Geocoding response object contains the status of the request, and may contain
     * debugging information to help you track down why Geocoding is not working. The "status" field may contain the
     * following values:
     *
     * <p/>
     * <ul>
     *     <li>
     *         <span style="color:green;">"OK"</span> indicates that no errors occurred; the address was successfully parsed and at least one geocode was returned.
     *     </li>
     *     <li>
     *         <span style="color:green;">"ZERO_RESULTS"</span> indicates that the geocode was successful but returned no results. This may occur if the geocode was passed a non-existent address or a latlng in a remote location.
     *     </li>
     *     <li>
     *         <span style="color:green;">"OVER_QUERY_LIMIT"</span> indicates that you are over your quota.
     *     </li>
     *     <li>
     *         <span style="color:green;">"REQUEST_DENIED"</span> indicates that your request was denied, generally because of lack of a sensor parameter.
     *     </li>
     *     <li>
     *         <span style="color:green;">"INVALID_REQUEST"</span> generally indicates that the query (address or latlng) is missing.
     *     </li>
     * </ul>
     *
     * @return The response status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the response status.
     *
     * @param status The response status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * When the geocoder returns results, it places them within a (JSON) results array.
     * Even if the geocoder returns no results (such as if the address doesn't exist) it
     * still returns an empty results array.
     *
     * @return The geocoder api request results.
     */
    public ResultList getResults() {
        return results;
    }

    /**
     * Set the results list.
     *
     * @param results The results list.
     */
    public void setResults(ResultList results) {
        this.results = results;
    }

}
