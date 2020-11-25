package io.fabric8.ocm.api.servicelogs.v1;

import io.fabric8.ocm.api.servicelogs.ApiException;
import io.fabric8.ocm.api.servicelogs.ApiClient;
import io.fabric8.ocm.api.servicelogs.Configuration;
import io.fabric8.ocm.api.servicelogs.Pair;

import javax.ws.rs.core.GenericType;

import io.fabric8.ocm.model.servicelogs.v1.Error;
import io.fabric8.ocm.model.servicelogs.v1.InlineResponse200;
import io.fabric8.ocm.model.servicelogs.v1.LogEntry;
import io.fabric8.ocm.model.servicelogs.v1.Metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Retrieves the list of cluster logs. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement. For example, in order to sort the cluster logs descending by name identifier the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the cluster logs instead of the names of the columns of a table. For example, in order to retrieve cluster logs with service_name starting with my:   &#x60;&#x60;&#x60; service_name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 apiServiceLogsV1ClusterLogsGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/service_logs/v1/cluster_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the log entry. 
   * @param logEntryId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiServiceLogsV1ClusterLogsLogEntryIdDelete(String logEntryId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'logEntryId' is set
    if (logEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'logEntryId' when calling apiServiceLogsV1ClusterLogsLogEntryIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/service_logs/v1/cluster_logs/{log_entry_id}"
      .replaceAll("\\{" + "log_entry_id" + "\\}", apiClient.escapeString(logEntryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Retrieves the details of the log entry. 
   * @param logEntryId  (required)
   * @return LogEntry
   * @throws ApiException if fails to make API call
   */
  public LogEntry apiServiceLogsV1ClusterLogsLogEntryIdGet(String logEntryId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'logEntryId' is set
    if (logEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'logEntryId' when calling apiServiceLogsV1ClusterLogsLogEntryIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/service_logs/v1/cluster_logs/{log_entry_id}"
      .replaceAll("\\{" + "log_entry_id" + "\\}", apiClient.escapeString(logEntryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<LogEntry> localVarReturnType = new GenericType<LogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Creates a new log entry. 
   * @param body  (optional)
   * @return LogEntry
   * @throws ApiException if fails to make API call
   */
  public LogEntry apiServiceLogsV1ClusterLogsPost(LogEntry body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/service_logs/v1/cluster_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<LogEntry> localVarReturnType = new GenericType<LogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the version metadata. 
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public Metadata apiServiceLogsV1Get() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/service_logs/v1";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<Metadata> localVarReturnType = new GenericType<Metadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
