package io.fabric8.ocm.api.clustersmgmt.v1;

import io.fabric8.ocm.api.clustersmgmt.ApiException;
import io.fabric8.ocm.api.clustersmgmt.ApiClient;
import io.fabric8.ocm.api.clustersmgmt.Configuration;
import io.fabric8.ocm.api.clustersmgmt.Pair;

import javax.ws.rs.core.GenericType;

import io.fabric8.ocm.model.clustersmgmt.v1.AWS;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRole;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRoleGrant;
import io.fabric8.ocm.model.clustersmgmt.v1.AddOn;
import io.fabric8.ocm.model.clustersmgmt.v1.AddOnInstallation;
import io.fabric8.ocm.model.clustersmgmt.v1.AlertsInfo;
import io.fabric8.ocm.model.clustersmgmt.v1.CPUTotalsNodeRoleOSMetricNode;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudProvider;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudRegion;
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterCredentials;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterOperatorsInfo;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterStatus;
import io.fabric8.ocm.model.clustersmgmt.v1.Dashboard;
import io.fabric8.ocm.model.clustersmgmt.v1.Error;
import io.fabric8.ocm.model.clustersmgmt.v1.ExternalConfiguration;
import io.fabric8.ocm.model.clustersmgmt.v1.Flavour;
import io.fabric8.ocm.model.clustersmgmt.v1.Group;
import io.fabric8.ocm.model.clustersmgmt.v1.IdentityProvider;
import io.fabric8.ocm.model.clustersmgmt.v1.Ingress;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse200;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2001;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20010;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20011;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20012;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20013;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20014;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20015;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20016;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20017;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20018;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20019;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2002;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20020;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20021;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse20022;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2003;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2004;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2005;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2006;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2007;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2008;
import io.fabric8.ocm.model.clustersmgmt.v1.InlineResponse2009;
import io.fabric8.ocm.model.clustersmgmt.v1.Label;
import io.fabric8.ocm.model.clustersmgmt.v1.Log;
import io.fabric8.ocm.model.clustersmgmt.v1.MachinePool;
import io.fabric8.ocm.model.clustersmgmt.v1.Metadata;
import io.fabric8.ocm.model.clustersmgmt.v1.NodesInfo;
import io.fabric8.ocm.model.clustersmgmt.v1.Product;
import io.fabric8.ocm.model.clustersmgmt.v1.ProvisionShard;
import io.fabric8.ocm.model.clustersmgmt.v1.SocketTotalsNodeRoleOSMetricNode;
import io.fabric8.ocm.model.clustersmgmt.v1.Syncset;
import io.fabric8.ocm.model.clustersmgmt.v1.UpgradePolicy;
import io.fabric8.ocm.model.clustersmgmt.v1.UpgradePolicyState;
import io.fabric8.ocm.model.clustersmgmt.v1.User;
import io.fabric8.ocm.model.clustersmgmt.v1.Version;

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
   * Deletes the add-on. 
   * @param addonId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1AddonsAddonIdDelete(String addonId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'addonId' is set
    if (addonId == null) {
      throw new ApiException(400, "Missing the required parameter 'addonId' when calling apiClustersMgmtV1AddonsAddonIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/addons/{addon_id}"
      .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()));

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
   * Retrieves the details of the add-on. 
   * @param addonId  (required)
   * @return AddOn
   * @throws ApiException if fails to make API call
   */
  public AddOn apiClustersMgmtV1AddonsAddonIdGet(String addonId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'addonId' is set
    if (addonId == null) {
      throw new ApiException(400, "Missing the required parameter 'addonId' when calling apiClustersMgmtV1AddonsAddonIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/addons/{addon_id}"
      .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()));

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

    GenericType<AddOn> localVarReturnType = new GenericType<AddOn>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the add-on. 
   * @param addonId  (required)
   * @param body  (optional)
   * @return AddOn
   * @throws ApiException if fails to make API call
   */
  public AddOn apiClustersMgmtV1AddonsAddonIdPatch(String addonId, AddOn body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'addonId' is set
    if (addonId == null) {
      throw new ApiException(400, "Missing the required parameter 'addonId' when calling apiClustersMgmtV1AddonsAddonIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/addons/{addon_id}"
      .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()));

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

    GenericType<AddOn> localVarReturnType = new GenericType<AddOn>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of add-ons. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the add-on instead of the names of the columns of a table. For example, in order to sort the add-ons descending by name the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the add-on instead of the names of the columns of a table. For example, in order to retrieve all the add-ons with a name starting with &#x60;my&#x60; the value should be:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the add-ons that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 apiClustersMgmtV1AddonsGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/addons";

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
   * Create a new add-on and add it to the collection of add-ons. 
   * @param body  (optional)
   * @return AddOn
   * @throws ApiException if fails to make API call
   */
  public AddOn apiClustersMgmtV1AddonsPost(AddOn body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/addons";

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

    GenericType<AddOn> localVarReturnType = new GenericType<AddOn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the aws infrastructure access role. 
   * @param awsInfrastructureAccessRoleId  (required)
   * @return AWSInfrastructureAccessRole
   * @throws ApiException if fails to make API call
   */
  public AWSInfrastructureAccessRole apiClustersMgmtV1AwsInfrastructureAccessRolesAwsInfrastructureAccessRoleIdGet(String awsInfrastructureAccessRoleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'awsInfrastructureAccessRoleId' is set
    if (awsInfrastructureAccessRoleId == null) {
      throw new ApiException(400, "Missing the required parameter 'awsInfrastructureAccessRoleId' when calling apiClustersMgmtV1AwsInfrastructureAccessRolesAwsInfrastructureAccessRoleIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/aws_infrastructure_access_roles/{aws_infrastructure_access_role_id}"
      .replaceAll("\\{" + "aws_infrastructure_access_role_id" + "\\}", apiClient.escapeString(awsInfrastructureAccessRoleId.toString()));

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

    GenericType<AWSInfrastructureAccessRole> localVarReturnType = new GenericType<AWSInfrastructureAccessRole>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the role instead of the names of the columns of a table. For example, in order to sort the roles descending by dislay_name the value should be:   &#x60;&#x60;&#x60; display_name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the role instead of the names of the columns of a table. For example, in order to retrieve all the role with a name starting with &#x60;my&#x60;the value should be:   &#x60;&#x60;&#x60; display_name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the roles that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 apiClustersMgmtV1AwsInfrastructureAccessRolesGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/aws_infrastructure_access_roles";

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of available regions of the cloud provider.  IMPORTANT: This collection doesn&#x27;t currently support paging or searching, so the returned &#x60;page&#x60; will always be 1 and &#x60;size&#x60; and &#x60;total&#x60; will always be the total number of available regions of the provider. 
   * @param cloudProviderId  (required)
   * @param body  (optional)
   * @param page Index of the returned page, where one corresponds to the first page. As this collection doesn&#x27;t support paging the result will always be &#x60;1&#x60;.  (optional)
   * @param size Number of items that will be contained in the returned page. As this collection doesn&#x27;t support paging or searching the result will always be the total number of regions of the provider.  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2003 apiClustersMgmtV1CloudProvidersCloudProviderIdAvailableRegionsPost(String cloudProviderId, AWS body, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'cloudProviderId' is set
    if (cloudProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'cloudProviderId' when calling apiClustersMgmtV1CloudProvidersCloudProviderIdAvailableRegionsPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/cloud_providers/{cloud_provider_id}/available_regions"
      .replaceAll("\\{" + "cloud_provider_id" + "\\}", apiClient.escapeString(cloudProviderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse2003> localVarReturnType = new GenericType<InlineResponse2003>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the cloud provider. 
   * @param cloudProviderId  (required)
   * @return CloudProvider
   * @throws ApiException if fails to make API call
   */
  public CloudProvider apiClustersMgmtV1CloudProvidersCloudProviderIdGet(String cloudProviderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cloudProviderId' is set
    if (cloudProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'cloudProviderId' when calling apiClustersMgmtV1CloudProvidersCloudProviderIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/cloud_providers/{cloud_provider_id}"
      .replaceAll("\\{" + "cloud_provider_id" + "\\}", apiClient.escapeString(cloudProviderId.toString()));

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

    GenericType<CloudProvider> localVarReturnType = new GenericType<CloudProvider>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of regions of the cloud provider.  IMPORTANT: This collection doesn&#x27;t currently support paging or searching, so the returned &#x60;page&#x60; will always be 1 and &#x60;size&#x60; and &#x60;total&#x60; will always be the total number of regions of the provider. 
   * @param cloudProviderId  (required)
   * @param page Index of the returned page, where one corresponds to the first page. As this collection doesn&#x27;t support paging the result will always be &#x60;1&#x60;.  (optional)
   * @param size Number of items that will be contained in the returned page. As this collection doesn&#x27;t support paging or searching the result will always be the total number of regions of the provider.  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2004 apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsGet(String cloudProviderId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cloudProviderId' is set
    if (cloudProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'cloudProviderId' when calling apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/cloud_providers/{cloud_provider_id}/regions"
      .replaceAll("\\{" + "cloud_provider_id" + "\\}", apiClient.escapeString(cloudProviderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse2004> localVarReturnType = new GenericType<InlineResponse2004>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the region. 
   * @param cloudProviderId  (required)
   * @param regionId  (required)
   * @return CloudRegion
   * @throws ApiException if fails to make API call
   */
  public CloudRegion apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsRegionIdGet(String cloudProviderId, String regionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cloudProviderId' is set
    if (cloudProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'cloudProviderId' when calling apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsRegionIdGet");
    }
    // verify the required parameter 'regionId' is set
    if (regionId == null) {
      throw new ApiException(400, "Missing the required parameter 'regionId' when calling apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsRegionIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/cloud_providers/{cloud_provider_id}/regions/{region_id}"
      .replaceAll("\\{" + "cloud_provider_id" + "\\}", apiClient.escapeString(cloudProviderId.toString()))
      .replaceAll("\\{" + "region_id" + "\\}", apiClient.escapeString(regionId.toString()));

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

    GenericType<CloudRegion> localVarReturnType = new GenericType<CloudRegion>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of cloud providers. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the cloud provider instead of the names of the columns of a table. For example, in order to sort the clusters descending by name identifier the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the cloud provider instead of the names of the columns of a table. For example, in order to retrieve all the cloud providers with a name starting with &#x60;A&#x60; the value should be:   &#x60;&#x60;&#x60; name like &#x27;A%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the clusters that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2002 apiClustersMgmtV1CloudProvidersGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/cloud_providers";

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

    GenericType<InlineResponse2002> localVarReturnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the add-on installation. 
   * @param clusterId  (required)
   * @param addoninstallationId  (required)
   * @return AddOnInstallation
   * @throws ApiException if fails to make API call
   */
  public AddOnInstallation apiClustersMgmtV1ClustersClusterIdAddonsAddoninstallationIdGet(String clusterId, String addoninstallationId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAddonsAddoninstallationIdGet");
    }
    // verify the required parameter 'addoninstallationId' is set
    if (addoninstallationId == null) {
      throw new ApiException(400, "Missing the required parameter 'addoninstallationId' when calling apiClustersMgmtV1ClustersClusterIdAddonsAddoninstallationIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/addons/{addoninstallation_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "addoninstallation_id" + "\\}", apiClient.escapeString(addoninstallationId.toString()));

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

    GenericType<AddOnInstallation> localVarReturnType = new GenericType<AddOnInstallation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of add-on installations. 
   * @param clusterId  (required)
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the add-on installation instead of the names of the columns of a table. For example, in order to sort the add-on installations descending by name the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the add-on installation instead of the names of the columns of a table. For example, in order to retrieve all the add-on installations with a name starting with &#x60;my&#x60; the value should be:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the add-on installations that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2006 apiClustersMgmtV1ClustersClusterIdAddonsGet(String clusterId, String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAddonsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/addons"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<InlineResponse2006> localVarReturnType = new GenericType<InlineResponse2006>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Create a new add-on installation and add it to the collection of add-on installations on the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return AddOnInstallation
   * @throws ApiException if fails to make API call
   */
  public AddOnInstallation apiClustersMgmtV1ClustersClusterIdAddonsPost(String clusterId, AddOnInstallation body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAddonsPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/addons"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<AddOnInstallation> localVarReturnType = new GenericType<AddOnInstallation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the AWS infrastructure access role grant. 
   * @param clusterId  (required)
   * @param awsInfrastructureAccessRoleGrantId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdDelete(String clusterId, String awsInfrastructureAccessRoleGrantId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdDelete");
    }
    // verify the required parameter 'awsInfrastructureAccessRoleGrantId' is set
    if (awsInfrastructureAccessRoleGrantId == null) {
      throw new ApiException(400, "Missing the required parameter 'awsInfrastructureAccessRoleGrantId' when calling apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/aws_infrastructure_access_role_grants/{aws_infrastructure_access_role_grant_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "aws_infrastructure_access_role_grant_id" + "\\}", apiClient.escapeString(awsInfrastructureAccessRoleGrantId.toString()));

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
   * Retrieves the details of the AWS infrastructure access role grant. 
   * @param clusterId  (required)
   * @param awsInfrastructureAccessRoleGrantId  (required)
   * @return AWSInfrastructureAccessRoleGrant
   * @throws ApiException if fails to make API call
   */
  public AWSInfrastructureAccessRoleGrant apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdGet(String clusterId, String awsInfrastructureAccessRoleGrantId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdGet");
    }
    // verify the required parameter 'awsInfrastructureAccessRoleGrantId' is set
    if (awsInfrastructureAccessRoleGrantId == null) {
      throw new ApiException(400, "Missing the required parameter 'awsInfrastructureAccessRoleGrantId' when calling apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/aws_infrastructure_access_role_grants/{aws_infrastructure_access_role_grant_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "aws_infrastructure_access_role_grant_id" + "\\}", apiClient.escapeString(awsInfrastructureAccessRoleGrantId.toString()));

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

    GenericType<AWSInfrastructureAccessRoleGrant> localVarReturnType = new GenericType<AWSInfrastructureAccessRoleGrant>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of AWS infrastructure access role grants. 
   * @param clusterId  (required)
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the AWS infrastructure access role grant instead of the names of the columns of a table. For example, in order to sort the AWS infrastructure access role grants descending by user ARN the value should be:   &#x60;&#x60;&#x60; user_arn desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the AWS infrastructure access role grant instead of the names of the columns of a table. For example, in order to retrieve all the AWS infrastructure access role grants with a user ARN starting with &#x60;user&#x60; the value should be:   &#x60;&#x60;&#x60; user_arn like &#x27;%user&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the AWS infrastructure access role grants that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2007 apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsGet(String clusterId, String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/aws_infrastructure_access_role_grants"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<InlineResponse2007> localVarReturnType = new GenericType<InlineResponse2007>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Create a new AWS infrastructure access role grant and add it to the collection of AWS infrastructure access role grants on the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return AWSInfrastructureAccessRoleGrant
   * @throws ApiException if fails to make API call
   */
  public AWSInfrastructureAccessRoleGrant apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsPost(String clusterId, AWSInfrastructureAccessRoleGrant body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/aws_infrastructure_access_role_grants"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<AWSInfrastructureAccessRoleGrant> localVarReturnType = new GenericType<AWSInfrastructureAccessRoleGrant>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the credentials of a cluster. 
   * @param clusterId  (required)
   * @return ClusterCredentials
   * @throws ApiException if fails to make API call
   */
  public ClusterCredentials apiClustersMgmtV1ClustersClusterIdCredentialsGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdCredentialsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/credentials"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<ClusterCredentials> localVarReturnType = new GenericType<ClusterCredentials>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the cluster. 
   * @param clusterId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdDelete(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
   * Retrieves the details of the external configuration. 
   * @param clusterId  (required)
   * @return ExternalConfiguration
   * @throws ApiException if fails to make API call
   */
  public ExternalConfiguration apiClustersMgmtV1ClustersClusterIdExternalConfigurationGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<ExternalConfiguration> localVarReturnType = new GenericType<ExternalConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of labels. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2008 apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/labels"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse2008> localVarReturnType = new GenericType<InlineResponse2008>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the label. 
   * @param clusterId  (required)
   * @param labelId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdDelete(String clusterId, String labelId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdDelete");
    }
    // verify the required parameter 'labelId' is set
    if (labelId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/labels/{label_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "label_id" + "\\}", apiClient.escapeString(labelId.toString()));

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
   * Retrieves the details of the label. 
   * @param clusterId  (required)
   * @param labelId  (required)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdGet(String clusterId, String labelId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdGet");
    }
    // verify the required parameter 'labelId' is set
    if (labelId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/labels/{label_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "label_id" + "\\}", apiClient.escapeString(labelId.toString()));

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

    GenericType<Label> localVarReturnType = new GenericType<Label>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Update the label. 
   * @param clusterId  (required)
   * @param labelId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdPatch(String clusterId, String labelId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdPatch");
    }
    // verify the required parameter 'labelId' is set
    if (labelId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/labels/{label_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "label_id" + "\\}", apiClient.escapeString(labelId.toString()));

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

    GenericType<Label> localVarReturnType = new GenericType<Label>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new label to the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsPost(String clusterId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/labels"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<Label> localVarReturnType = new GenericType<Label>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of syncsets. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2009 apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/syncsets"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse2009> localVarReturnType = new GenericType<InlineResponse2009>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new syncset to the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return Syncset
   * @throws ApiException if fails to make API call
   */
  public Syncset apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsPost(String clusterId, Syncset body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/syncsets"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<Syncset> localVarReturnType = new GenericType<Syncset>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the syncset. 
   * @param clusterId  (required)
   * @param syncsetId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdDelete(String clusterId, String syncsetId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdDelete");
    }
    // verify the required parameter 'syncsetId' is set
    if (syncsetId == null) {
      throw new ApiException(400, "Missing the required parameter 'syncsetId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/syncsets/{syncset_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "syncset_id" + "\\}", apiClient.escapeString(syncsetId.toString()));

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
   * Retrieves the details of the syncset. 
   * @param clusterId  (required)
   * @param syncsetId  (required)
   * @return Syncset
   * @throws ApiException if fails to make API call
   */
  public Syncset apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdGet(String clusterId, String syncsetId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdGet");
    }
    // verify the required parameter 'syncsetId' is set
    if (syncsetId == null) {
      throw new ApiException(400, "Missing the required parameter 'syncsetId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/syncsets/{syncset_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "syncset_id" + "\\}", apiClient.escapeString(syncsetId.toString()));

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

    GenericType<Syncset> localVarReturnType = new GenericType<Syncset>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Update the syncset. 
   * @param clusterId  (required)
   * @param syncsetId  (required)
   * @param body  (optional)
   * @return Syncset
   * @throws ApiException if fails to make API call
   */
  public Syncset apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdPatch(String clusterId, String syncsetId, Syncset body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdPatch");
    }
    // verify the required parameter 'syncsetId' is set
    if (syncsetId == null) {
      throw new ApiException(400, "Missing the required parameter 'syncsetId' when calling apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/external_configuration/syncsets/{syncset_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "syncset_id" + "\\}", apiClient.escapeString(syncsetId.toString()));

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

    GenericType<Syncset> localVarReturnType = new GenericType<Syncset>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the cluster. 
   * @param clusterId  (required)
   * @return Cluster
   * @throws ApiException if fails to make API call
   */
  public Cluster apiClustersMgmtV1ClustersClusterIdGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<Cluster> localVarReturnType = new GenericType<Cluster>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of groups. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20010 apiClustersMgmtV1ClustersClusterIdGroupsGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/groups"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20010> localVarReturnType = new GenericType<InlineResponse20010>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the group. 
   * @param clusterId  (required)
   * @param groupId  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group apiClustersMgmtV1ClustersClusterIdGroupsGroupIdGet(String clusterId, String groupId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdGet");
    }
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/groups/{group_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of users. 
   * @param clusterId  (required)
   * @param groupId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20011 apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersGet(String clusterId, String groupId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersGet");
    }
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/groups/{group_id}/users"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20011> localVarReturnType = new GenericType<InlineResponse20011>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new user to the group. 
   * @param clusterId  (required)
   * @param groupId  (required)
   * @param body  (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersPost(String clusterId, String groupId, User body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersPost");
    }
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/groups/{group_id}/users"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the user. 
   * @param clusterId  (required)
   * @param groupId  (required)
   * @param userId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdDelete(String clusterId, String groupId, String userId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdDelete");
    }
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdDelete");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/groups/{group_id}/users/{user_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Retrieves the details of the user. 
   * @param clusterId  (required)
   * @param groupId  (required)
   * @param userId  (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdGet(String clusterId, String groupId, String userId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdGet");
    }
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdGet");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersUserIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/groups/{group_id}/users/{user_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of identity providers. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20012 apiClustersMgmtV1ClustersClusterIdIdentityProvidersGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/identity_providers"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20012> localVarReturnType = new GenericType<InlineResponse20012>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the identity provider. 
   * @param clusterId  (required)
   * @param identityProviderId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdDelete(String clusterId, String identityProviderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdDelete");
    }
    // verify the required parameter 'identityProviderId' is set
    if (identityProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityProviderId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/identity_providers/{identity_provider_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "identity_provider_id" + "\\}", apiClient.escapeString(identityProviderId.toString()));

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
   * Retrieves the details of the identity provider. 
   * @param clusterId  (required)
   * @param identityProviderId  (required)
   * @return IdentityProvider
   * @throws ApiException if fails to make API call
   */
  public IdentityProvider apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdGet(String clusterId, String identityProviderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdGet");
    }
    // verify the required parameter 'identityProviderId' is set
    if (identityProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityProviderId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/identity_providers/{identity_provider_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "identity_provider_id" + "\\}", apiClient.escapeString(identityProviderId.toString()));

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

    GenericType<IdentityProvider> localVarReturnType = new GenericType<IdentityProvider>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Update identity provider in the cluster. 
   * @param clusterId  (required)
   * @param identityProviderId  (required)
   * @param body  (optional)
   * @return IdentityProvider
   * @throws ApiException if fails to make API call
   */
  public IdentityProvider apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdPatch(String clusterId, String identityProviderId, IdentityProvider body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdPatch");
    }
    // verify the required parameter 'identityProviderId' is set
    if (identityProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityProviderId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersIdentityProviderIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/identity_providers/{identity_provider_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "identity_provider_id" + "\\}", apiClient.escapeString(identityProviderId.toString()));

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

    GenericType<IdentityProvider> localVarReturnType = new GenericType<IdentityProvider>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new identity provider to the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return IdentityProvider
   * @throws ApiException if fails to make API call
   */
  public IdentityProvider apiClustersMgmtV1ClustersClusterIdIdentityProvidersPost(String clusterId, IdentityProvider body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIdentityProvidersPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/identity_providers"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<IdentityProvider> localVarReturnType = new GenericType<IdentityProvider>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of ingresses. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20013
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20013 apiClustersMgmtV1ClustersClusterIdIngressesGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIngressesGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/ingresses"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20013> localVarReturnType = new GenericType<InlineResponse20013>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the ingress. 
   * @param clusterId  (required)
   * @param ingressId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdIngressesIngressIdDelete(String clusterId, String ingressId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIngressesIngressIdDelete");
    }
    // verify the required parameter 'ingressId' is set
    if (ingressId == null) {
      throw new ApiException(400, "Missing the required parameter 'ingressId' when calling apiClustersMgmtV1ClustersClusterIdIngressesIngressIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/ingresses/{ingress_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "ingress_id" + "\\}", apiClient.escapeString(ingressId.toString()));

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
   * Retrieves the details of the ingress. 
   * @param clusterId  (required)
   * @param ingressId  (required)
   * @return Ingress
   * @throws ApiException if fails to make API call
   */
  public Ingress apiClustersMgmtV1ClustersClusterIdIngressesIngressIdGet(String clusterId, String ingressId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIngressesIngressIdGet");
    }
    // verify the required parameter 'ingressId' is set
    if (ingressId == null) {
      throw new ApiException(400, "Missing the required parameter 'ingressId' when calling apiClustersMgmtV1ClustersClusterIdIngressesIngressIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/ingresses/{ingress_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "ingress_id" + "\\}", apiClient.escapeString(ingressId.toString()));

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

    GenericType<Ingress> localVarReturnType = new GenericType<Ingress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the ingress. 
   * @param clusterId  (required)
   * @param ingressId  (required)
   * @param body  (optional)
   * @return Ingress
   * @throws ApiException if fails to make API call
   */
  public Ingress apiClustersMgmtV1ClustersClusterIdIngressesIngressIdPatch(String clusterId, String ingressId, Ingress body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIngressesIngressIdPatch");
    }
    // verify the required parameter 'ingressId' is set
    if (ingressId == null) {
      throw new ApiException(400, "Missing the required parameter 'ingressId' when calling apiClustersMgmtV1ClustersClusterIdIngressesIngressIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/ingresses/{ingress_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "ingress_id" + "\\}", apiClient.escapeString(ingressId.toString()));

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

    GenericType<Ingress> localVarReturnType = new GenericType<Ingress>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates all ingresses 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return List&lt;Ingress&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Ingress> apiClustersMgmtV1ClustersClusterIdIngressesPatch(String clusterId, List<Ingress> body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIngressesPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/ingresses"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<List<Ingress>> localVarReturnType = new GenericType<List<Ingress>>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new ingress to the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return Ingress
   * @throws ApiException if fails to make API call
   */
  public Ingress apiClustersMgmtV1ClustersClusterIdIngressesPost(String clusterId, Ingress body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdIngressesPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/ingresses"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<Ingress> localVarReturnType = new GenericType<Ingress>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of log links. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20014
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20014 apiClustersMgmtV1ClustersClusterIdLogsGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdLogsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/logs"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20014> localVarReturnType = new GenericType<InlineResponse20014>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the log. 
   * @param clusterId  (required)
   * @param offset Line offset to start logs from. if 0 retreive entire log. If offset &gt; #lines return an empty log.  (optional)
   * @param tail Returns the number of tail lines from the end of the log. If there are no line breaks or the number of lines &lt; tail return the entire log. Either &#x27;tail&#x27; or &#x27;offset&#x27; can be set. Not both.   (optional)
   * @return Log
   * @throws ApiException if fails to make API call
   */
  public Log apiClustersMgmtV1ClustersClusterIdLogsInstallGet(String clusterId, Integer offset, Integer tail) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdLogsInstallGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/logs/install"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tail", tail));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<Log> localVarReturnType = new GenericType<Log>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the log. 
   * @param clusterId  (required)
   * @param offset Line offset to start logs from. if 0 retreive entire log. If offset &gt; #lines return an empty log.  (optional)
   * @param tail Returns the number of tail lines from the end of the log. If there are no line breaks or the number of lines &lt; tail return the entire log. Either &#x27;tail&#x27; or &#x27;offset&#x27; can be set. Not both.   (optional)
   * @return Log
   * @throws ApiException if fails to make API call
   */
  public Log apiClustersMgmtV1ClustersClusterIdLogsUninstallGet(String clusterId, Integer offset, Integer tail) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdLogsUninstallGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/logs/uninstall"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tail", tail));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<Log> localVarReturnType = new GenericType<Log>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of machine pools. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20015
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20015 apiClustersMgmtV1ClustersClusterIdMachinePoolsGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/machine_pools"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20015> localVarReturnType = new GenericType<InlineResponse20015>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the machine pool. 
   * @param clusterId  (required)
   * @param machinePoolId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdDelete(String clusterId, String machinePoolId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdDelete");
    }
    // verify the required parameter 'machinePoolId' is set
    if (machinePoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'machinePoolId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/machine_pools/{machine_pool_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "machine_pool_id" + "\\}", apiClient.escapeString(machinePoolId.toString()));

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
   * Retrieves the details of the machine pool. 
   * @param clusterId  (required)
   * @param machinePoolId  (required)
   * @return MachinePool
   * @throws ApiException if fails to make API call
   */
  public MachinePool apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdGet(String clusterId, String machinePoolId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdGet");
    }
    // verify the required parameter 'machinePoolId' is set
    if (machinePoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'machinePoolId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/machine_pools/{machine_pool_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "machine_pool_id" + "\\}", apiClient.escapeString(machinePoolId.toString()));

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

    GenericType<MachinePool> localVarReturnType = new GenericType<MachinePool>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the machine pool. 
   * @param clusterId  (required)
   * @param machinePoolId  (required)
   * @param body  (optional)
   * @return MachinePool
   * @throws ApiException if fails to make API call
   */
  public MachinePool apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdPatch(String clusterId, String machinePoolId, MachinePool body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdPatch");
    }
    // verify the required parameter 'machinePoolId' is set
    if (machinePoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'machinePoolId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsMachinePoolIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/machine_pools/{machine_pool_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "machine_pool_id" + "\\}", apiClient.escapeString(machinePoolId.toString()));

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

    GenericType<MachinePool> localVarReturnType = new GenericType<MachinePool>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new machine pool to the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return MachinePool
   * @throws ApiException if fails to make API call
   */
  public MachinePool apiClustersMgmtV1ClustersClusterIdMachinePoolsPost(String clusterId, MachinePool body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMachinePoolsPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/machine_pools"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<MachinePool> localVarReturnType = new GenericType<MachinePool>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param clusterId  (required)
   * @return AlertsInfo
   * @throws ApiException if fails to make API call
   */
  public AlertsInfo apiClustersMgmtV1ClustersClusterIdMetricQueriesAlertsGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMetricQueriesAlertsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/metric_queries/alerts"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<AlertsInfo> localVarReturnType = new GenericType<AlertsInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param clusterId  (required)
   * @return ClusterOperatorsInfo
   * @throws ApiException if fails to make API call
   */
  public ClusterOperatorsInfo apiClustersMgmtV1ClustersClusterIdMetricQueriesClusterOperatorsGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMetricQueriesClusterOperatorsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/metric_queries/cluster_operators"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<ClusterOperatorsInfo> localVarReturnType = new GenericType<ClusterOperatorsInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the metrics. 
   * @param clusterId  (required)
   * @return CPUTotalsNodeRoleOSMetricNode
   * @throws ApiException if fails to make API call
   */
  public CPUTotalsNodeRoleOSMetricNode apiClustersMgmtV1ClustersClusterIdMetricQueriesCpuTotalByNodeRolesOsGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMetricQueriesCpuTotalByNodeRolesOsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/metric_queries/cpu_total_by_node_roles_os"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<CPUTotalsNodeRoleOSMetricNode> localVarReturnType = new GenericType<CPUTotalsNodeRoleOSMetricNode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param clusterId  (required)
   * @return NodesInfo
   * @throws ApiException if fails to make API call
   */
  public NodesInfo apiClustersMgmtV1ClustersClusterIdMetricQueriesNodesGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMetricQueriesNodesGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/metric_queries/nodes"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<NodesInfo> localVarReturnType = new GenericType<NodesInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the metrics. 
   * @param clusterId  (required)
   * @return SocketTotalsNodeRoleOSMetricNode
   * @throws ApiException if fails to make API call
   */
  public SocketTotalsNodeRoleOSMetricNode apiClustersMgmtV1ClustersClusterIdMetricQueriesSocketTotalByNodeRolesOsGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdMetricQueriesSocketTotalByNodeRolesOsGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/metric_queries/socket_total_by_node_roles_os"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<SocketTotalsNodeRoleOSMetricNode> localVarReturnType = new GenericType<SocketTotalsNodeRoleOSMetricNode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return Cluster
   * @throws ApiException if fails to make API call
   */
  public Cluster apiClustersMgmtV1ClustersClusterIdPatch(String clusterId, Cluster body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<Cluster> localVarReturnType = new GenericType<Cluster>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the product. 
   * @param clusterId  (required)
   * @return Product
   * @throws ApiException if fails to make API call
   */
  public Product apiClustersMgmtV1ClustersClusterIdProductGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdProductGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/product"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<Product> localVarReturnType = new GenericType<Product>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the provision shard. 
   * @param clusterId  (required)
   * @return ProvisionShard
   * @throws ApiException if fails to make API call
   */
  public ProvisionShard apiClustersMgmtV1ClustersClusterIdProvisionShardGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdProvisionShardGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/provision_shard"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<ProvisionShard> localVarReturnType = new GenericType<ProvisionShard>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param clusterId  (required)
   * @return ClusterStatus
   * @throws ApiException if fails to make API call
   */
  public ClusterStatus apiClustersMgmtV1ClustersClusterIdStatusGet(String clusterId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdStatusGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/status"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<ClusterStatus> localVarReturnType = new GenericType<ClusterStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of upgrade policies. 
   * @param clusterId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Number of items contained in the returned page.  (optional)
   * @return InlineResponse20016
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20016 apiClustersMgmtV1ClustersClusterIdUpgradePoliciesGet(String clusterId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20016> localVarReturnType = new GenericType<InlineResponse20016>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new upgrade policy to the cluster. 
   * @param clusterId  (required)
   * @param body  (optional)
   * @return UpgradePolicy
   * @throws ApiException if fails to make API call
   */
  public UpgradePolicy apiClustersMgmtV1ClustersClusterIdUpgradePoliciesPost(String clusterId, UpgradePolicy body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesPost");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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

    GenericType<UpgradePolicy> localVarReturnType = new GenericType<UpgradePolicy>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the upgrade policy. 
   * @param clusterId  (required)
   * @param upgradePolicyId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdDelete(String clusterId, String upgradePolicyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdDelete");
    }
    // verify the required parameter 'upgradePolicyId' is set
    if (upgradePolicyId == null) {
      throw new ApiException(400, "Missing the required parameter 'upgradePolicyId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies/{upgrade_policy_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "upgrade_policy_id" + "\\}", apiClient.escapeString(upgradePolicyId.toString()));

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
   * Retrieves the details of the upgrade policy. 
   * @param clusterId  (required)
   * @param upgradePolicyId  (required)
   * @return UpgradePolicy
   * @throws ApiException if fails to make API call
   */
  public UpgradePolicy apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdGet(String clusterId, String upgradePolicyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdGet");
    }
    // verify the required parameter 'upgradePolicyId' is set
    if (upgradePolicyId == null) {
      throw new ApiException(400, "Missing the required parameter 'upgradePolicyId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies/{upgrade_policy_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "upgrade_policy_id" + "\\}", apiClient.escapeString(upgradePolicyId.toString()));

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

    GenericType<UpgradePolicy> localVarReturnType = new GenericType<UpgradePolicy>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Update the upgrade policy. 
   * @param clusterId  (required)
   * @param upgradePolicyId  (required)
   * @param body  (optional)
   * @return UpgradePolicy
   * @throws ApiException if fails to make API call
   */
  public UpgradePolicy apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdPatch(String clusterId, String upgradePolicyId, UpgradePolicy body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdPatch");
    }
    // verify the required parameter 'upgradePolicyId' is set
    if (upgradePolicyId == null) {
      throw new ApiException(400, "Missing the required parameter 'upgradePolicyId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies/{upgrade_policy_id}"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "upgrade_policy_id" + "\\}", apiClient.escapeString(upgradePolicyId.toString()));

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

    GenericType<UpgradePolicy> localVarReturnType = new GenericType<UpgradePolicy>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the upgrade policy state. 
   * @param clusterId  (required)
   * @param upgradePolicyId  (required)
   * @return UpgradePolicyState
   * @throws ApiException if fails to make API call
   */
  public UpgradePolicyState apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdStateGet(String clusterId, String upgradePolicyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdStateGet");
    }
    // verify the required parameter 'upgradePolicyId' is set
    if (upgradePolicyId == null) {
      throw new ApiException(400, "Missing the required parameter 'upgradePolicyId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdStateGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies/{upgrade_policy_id}/state"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "upgrade_policy_id" + "\\}", apiClient.escapeString(upgradePolicyId.toString()));

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

    GenericType<UpgradePolicyState> localVarReturnType = new GenericType<UpgradePolicyState>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Update the upgrade policy state. 
   * @param clusterId  (required)
   * @param upgradePolicyId  (required)
   * @param body  (optional)
   * @return UpgradePolicyState
   * @throws ApiException if fails to make API call
   */
  public UpgradePolicyState apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdStatePatch(String clusterId, String upgradePolicyId, UpgradePolicyState body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdStatePatch");
    }
    // verify the required parameter 'upgradePolicyId' is set
    if (upgradePolicyId == null) {
      throw new ApiException(400, "Missing the required parameter 'upgradePolicyId' when calling apiClustersMgmtV1ClustersClusterIdUpgradePoliciesUpgradePolicyIdStatePatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters/{cluster_id}/upgrade_policies/{upgrade_policy_id}/state"
      .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "upgrade_policy_id" + "\\}", apiClient.escapeString(upgradePolicyId.toString()));

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

    GenericType<UpgradePolicyState> localVarReturnType = new GenericType<UpgradePolicyState>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of clusters. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the cluster instead of the names of the columns of a table. For example, in order to sort the clusters descending by region identifier the value should be:   &#x60;&#x60;&#x60; region.id desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the cluster instead of the names of the columns of a table. For example, in order to retrieve all the clusters with a name starting with &#x60;my&#x60; in the &#x60;us-east-1&#x60; region the value should be:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; and region.id &#x3D; &#x27;us-east-1&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the clusters that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2005 apiClustersMgmtV1ClustersGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters";

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

    GenericType<InlineResponse2005> localVarReturnType = new GenericType<InlineResponse2005>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Provision a new cluster and add it to the collection of clusters.  See the &#x60;register_cluster&#x60; method for adding an existing cluster. 
   * @param body  (optional)
   * @return Cluster
   * @throws ApiException if fails to make API call
   */
  public Cluster apiClustersMgmtV1ClustersPost(Cluster body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/clusters";

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

    GenericType<Cluster> localVarReturnType = new GenericType<Cluster>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the dashboard. 
   * @param dashboardId  (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard apiClustersMgmtV1DashboardsDashboardIdGet(String dashboardId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling apiClustersMgmtV1DashboardsDashboardIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/dashboards/{dashboard_id}"
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of dashboards. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the dashboard instead of the names of the columns of a table. For example, in order to sort the dashboards descending by name the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the dashboard instead of the names of the columns of a table. For example, in order to retrieve all the dashboards with a name starting with &#x60;my&#x60; the value should be:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the dashboards that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20017
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20017 apiClustersMgmtV1DashboardsGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/dashboards";

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

    GenericType<InlineResponse20017> localVarReturnType = new GenericType<InlineResponse20017>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the cluster flavour. 
   * @param flavourId  (required)
   * @return Flavour
   * @throws ApiException if fails to make API call
   */
  public Flavour apiClustersMgmtV1FlavoursFlavourIdGet(String flavourId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'flavourId' is set
    if (flavourId == null) {
      throw new ApiException(400, "Missing the required parameter 'flavourId' when calling apiClustersMgmtV1FlavoursFlavourIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/flavours/{flavour_id}"
      .replaceAll("\\{" + "flavour_id" + "\\}", apiClient.escapeString(flavourId.toString()));

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

    GenericType<Flavour> localVarReturnType = new GenericType<Flavour>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the flavour.  Attributes that can be updated are:  - &#x60;aws.infra_volume&#x60; - &#x60;aws.infra_instance_type&#x60; - &#x60;gcp.infra_instance_type&#x60; 
   * @param flavourId  (required)
   * @param body  (optional)
   * @return Flavour
   * @throws ApiException if fails to make API call
   */
  public Flavour apiClustersMgmtV1FlavoursFlavourIdPatch(String flavourId, Flavour body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'flavourId' is set
    if (flavourId == null) {
      throw new ApiException(400, "Missing the required parameter 'flavourId' when calling apiClustersMgmtV1FlavoursFlavourIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/flavours/{flavour_id}"
      .replaceAll("\\{" + "flavour_id" + "\\}", apiClient.escapeString(flavourId.toString()));

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

    GenericType<Flavour> localVarReturnType = new GenericType<Flavour>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the flavour instead of the names of the columns of a table. For example, in order to sort the flavours descending by name the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the flavour instead of the names of the columns of a table. For example, in order to retrieve all the flavours with a name starting with &#x60;my&#x60;the value should be:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the flavours that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20018
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20018 apiClustersMgmtV1FlavoursGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/flavours";

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

    GenericType<InlineResponse20018> localVarReturnType = new GenericType<InlineResponse20018>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Adds a new cluster flavour. 
   * @param body  (optional)
   * @return Flavour
   * @throws ApiException if fails to make API call
   */
  public Flavour apiClustersMgmtV1FlavoursPost(Flavour body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/flavours";

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

    GenericType<Flavour> localVarReturnType = new GenericType<Flavour>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the version metadata. 
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public Metadata apiClustersMgmtV1Get() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1";

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
  /**
   * 
   * Retrieves the list of machine types. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the machine type instead of the names of the columns of a table. For example, in order to sort the machine types descending by name identifier the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the machine type instead of the names of the columns of a table. For example, in order to retrieve all the machine types with a name starting with &#x60;A&#x60; the value should be:   &#x60;&#x60;&#x60; name like &#x27;A%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the machine types that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20019
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20019 apiClustersMgmtV1MachineTypesGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/machine_types";

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

    GenericType<InlineResponse20019> localVarReturnType = new GenericType<InlineResponse20019>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of products. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the product instead of the names of the columns of a table. For example, in order to sort the products descending by name the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the product instead of the names of the columns of a table. For example, in order to retrieve all the products with a name starting with &#x60;my&#x60; the value should be:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the products that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20020
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20020 apiClustersMgmtV1ProductsGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/products";

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

    GenericType<InlineResponse20020> localVarReturnType = new GenericType<InlineResponse20020>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the product. 
   * @param productId  (required)
   * @return Product
   * @throws ApiException if fails to make API call
   */
  public Product apiClustersMgmtV1ProductsProductIdGet(String productId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling apiClustersMgmtV1ProductsProductIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/products/{product_id}"
      .replaceAll("\\{" + "product_id" + "\\}", apiClient.escapeString(productId.toString()));

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

    GenericType<Product> localVarReturnType = new GenericType<Product>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20021
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20021 apiClustersMgmtV1ProvisionShardsGet(Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/provision_shards";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<InlineResponse20021> localVarReturnType = new GenericType<InlineResponse20021>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the provision shard. 
   * @param provisionShardId  (required)
   * @return ProvisionShard
   * @throws ApiException if fails to make API call
   */
  public ProvisionShard apiClustersMgmtV1ProvisionShardsProvisionShardIdGet(String provisionShardId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'provisionShardId' is set
    if (provisionShardId == null) {
      throw new ApiException(400, "Missing the required parameter 'provisionShardId' when calling apiClustersMgmtV1ProvisionShardsProvisionShardIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/provision_shards/{provision_shard_id}"
      .replaceAll("\\{" + "provision_shard_id" + "\\}", apiClient.escapeString(provisionShardId.toString()));

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

    GenericType<ProvisionShard> localVarReturnType = new GenericType<ProvisionShard>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of versions. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement, but using the names of the attributes of the version instead of the names of the columns of a table. For example, in order to sort the versions descending by identifier the value should be:   &#x60;&#x60;&#x60; id desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the version instead of the names of the columns of a table. For example, in order to retrieve all the versions that are enabled:   &#x60;&#x60;&#x60; enabled &#x3D; &#x27;t&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the versions that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  Default value is &#x60;100&#x60;.  (optional)
   * @return InlineResponse20022
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20022 apiClustersMgmtV1VersionsGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/versions";

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

    GenericType<InlineResponse20022> localVarReturnType = new GenericType<InlineResponse20022>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the version. 
   * @param versionId  (required)
   * @return Version
   * @throws ApiException if fails to make API call
   */
  public Version apiClustersMgmtV1VersionsVersionIdGet(String versionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling apiClustersMgmtV1VersionsVersionIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/clusters_mgmt/v1/versions/{version_id}"
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()));

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

    GenericType<Version> localVarReturnType = new GenericType<Version>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
