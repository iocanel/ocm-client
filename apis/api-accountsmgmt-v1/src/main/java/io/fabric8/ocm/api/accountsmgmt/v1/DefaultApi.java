package io.fabric8.ocm.api.accountsmgmt.v1;

import io.fabric8.ocm.api.accountsmgmt.ApiException;
import io.fabric8.ocm.api.accountsmgmt.ApiClient;
import io.fabric8.ocm.api.accountsmgmt.Configuration;
import io.fabric8.ocm.api.accountsmgmt.Pair;

import javax.ws.rs.core.GenericType;

import io.fabric8.ocm.model.accountsmgmt.v1.AccessToken;
import io.fabric8.ocm.model.accountsmgmt.v1.Account;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterAuthorizationRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterAuthorizationResponse;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterRegistrationRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterRegistrationResponse;
import io.fabric8.ocm.model.accountsmgmt.v1.Error;
import io.fabric8.ocm.model.accountsmgmt.v1.FeatureToggle;
import io.fabric8.ocm.model.accountsmgmt.v1.FeatureToggleQueryRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse200;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2001;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse20010;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse20011;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse20012;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse20013;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse20014;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2002;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2003;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2004;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2005;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2006;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2007;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2008;
import io.fabric8.ocm.model.accountsmgmt.v1.InlineResponse2009;
import io.fabric8.ocm.model.accountsmgmt.v1.Label;
import io.fabric8.ocm.model.accountsmgmt.v1.Metadata;
import io.fabric8.ocm.model.accountsmgmt.v1.Organization;
import io.fabric8.ocm.model.accountsmgmt.v1.Permission;
import io.fabric8.ocm.model.accountsmgmt.v1.PullSecretsRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.Registry;
import io.fabric8.ocm.model.accountsmgmt.v1.RegistryCredential;
import io.fabric8.ocm.model.accountsmgmt.v1.ReservedResource;
import io.fabric8.ocm.model.accountsmgmt.v1.ResourceQuota;
import io.fabric8.ocm.model.accountsmgmt.v1.Role;
import io.fabric8.ocm.model.accountsmgmt.v1.RoleBinding;
import io.fabric8.ocm.model.accountsmgmt.v1.SKU;
import io.fabric8.ocm.model.accountsmgmt.v1.SkuRule;
import io.fabric8.ocm.model.accountsmgmt.v1.Subscription;
import io.fabric8.ocm.model.accountsmgmt.v1.SubscriptionNotify;
import io.fabric8.ocm.model.accountsmgmt.v1.SubscriptionRegistration;
import io.fabric8.ocm.model.accountsmgmt.v1.SummaryDashboard;
import io.fabric8.ocm.model.accountsmgmt.v1.SupportCaseRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.SupportCaseResponse;
import io.fabric8.ocm.model.accountsmgmt.v1.TokenAuthorizationRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.TokenAuthorizationResponse;

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
   * Returns access token generated from registries in docker format. 
   * @return AccessToken
   * @throws ApiException if fails to make API call
   */
  public AccessToken apiAccountsMgmtV1AccessTokenPost() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/access_token";

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

    GenericType<AccessToken> localVarReturnType = new GenericType<AccessToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the account. 
   * @param accountId  (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account apiAccountsMgmtV1AccountsAccountIdGet(String accountId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of labels of the account/organization/subscription.  IMPORTANT: This collection doesn&#x27;t currently support paging or searching, so the returned &#x60;page&#x60; will always be 1 and &#x60;size&#x60; and &#x60;total&#x60; will always be the total number of labels of the account/organization/subscription. 
   * @param accountId  (required)
   * @param page Index of the returned page, where one corresponds to the first page. As this collection doesn&#x27;t support paging the result will always be &#x60;1&#x60;.  (optional)
   * @param size Number of items that will be contained in the returned page. As this collection doesn&#x27;t support paging or searching the result will always be the total number of labels of the account/organization/subscription.  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 apiAccountsMgmtV1AccountsAccountIdLabelsGet(String accountId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}/labels"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the account label. 
   * @param accountId  (required)
   * @param labelsId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdDelete(String accountId, String labelsId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdDelete");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}/labels/{labels_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * @param accountId  (required)
   * @param labelsId  (required)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdGet(String accountId, String labelsId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdGet");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}/labels/{labels_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * Updates the account label. 
   * @param accountId  (required)
   * @param labelsId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdPatch(String accountId, String labelsId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdPatch");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsLabelsIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}/labels/{labels_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * Create a new account/organization/subscription label. 
   * @param accountId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1AccountsAccountIdLabelsPost(String accountId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdLabelsPost");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}/labels"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

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
   * Updates the account. 
   * @param accountId  (required)
   * @param body  (optional)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account apiAccountsMgmtV1AccountsAccountIdPatch(String accountId, Account body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling apiAccountsMgmtV1AccountsAccountIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of accounts. 
   * @param fetchlabelsLabels If true, includes the labels on an account in the output. Could slow request response time.  (optional)
   * @param fields Projection This field contains a comma-separated list of fields you&#x27;d like to get in a result. No new fields can be added, only existing ones can be filtered. To specify a field &#x27;id&#x27; of a structure &#x27;plan&#x27; use &#x27;plan.id&#x27;. To specify all fields of a structure &#x27;labels&#x27; use &#x27;labels.*&#x27;.   (optional)
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement. For example, in order to sort the accounts descending by name identifier the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the account instead of the names of the columns of a table. For example, in order to retrieve accounts with username starting with my:   &#x60;&#x60;&#x60; username like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 apiAccountsMgmtV1AccountsGet(Boolean fetchlabelsLabels, String fields, String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fetchlabels_labels", fetchlabelsLabels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
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
   * Creates a new account. 
   * @param body  (optional)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account apiAccountsMgmtV1AccountsPost(Account body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/accounts";

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Authorizes new cluster creation against an existing subscription. 
   * @param body  (optional)
   * @return ClusterAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public ClusterAuthorizationResponse apiAccountsMgmtV1ClusterAuthorizationsPost(ClusterAuthorizationRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/cluster_authorizations";

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

    GenericType<ClusterAuthorizationResponse> localVarReturnType = new GenericType<ClusterAuthorizationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Finds or creates a cluster registration with a registry credential token and cluster identifier. 
   * @param body  (optional)
   * @return ClusterRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public ClusterRegistrationResponse apiAccountsMgmtV1ClusterRegistrationsPost(ClusterRegistrationRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/cluster_registrations";

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

    GenericType<ClusterRegistrationResponse> localVarReturnType = new GenericType<ClusterRegistrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of roles. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the role instead of the names of the columns of a table. For example, in order to retrieve roles named starting with &#x60;Organization&#x60;:   &#x60;&#x60;&#x60; name like &#x27;Organization%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2002 apiAccountsMgmtV1CurrentAccessGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/current_access";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Creates a new role. 
   * @param body  (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role apiAccountsMgmtV1CurrentAccessPost(Role body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/current_access";

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the role. 
   * @param roleId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1CurrentAccessRoleIdDelete(String roleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling apiAccountsMgmtV1CurrentAccessRoleIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/current_access/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

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
   * Retrieves the details of the role. 
   * @param roleId  (required)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role apiAccountsMgmtV1CurrentAccessRoleIdGet(String roleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling apiAccountsMgmtV1CurrentAccessRoleIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/current_access/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the role. 
   * @param roleId  (required)
   * @param body  (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role apiAccountsMgmtV1CurrentAccessRoleIdPatch(String roleId, Role body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling apiAccountsMgmtV1CurrentAccessRoleIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/current_access/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the account. 
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account apiAccountsMgmtV1CurrentAccountGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/current_account";

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the feature toggle by providing query context 
   * @param featureToggleId  (required)
   * @param body  (optional)
   * @return FeatureToggle
   * @throws ApiException if fails to make API call
   */
  public FeatureToggle apiAccountsMgmtV1FeatureTogglesFeatureToggleIdQueryPost(String featureToggleId, FeatureToggleQueryRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'featureToggleId' is set
    if (featureToggleId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureToggleId' when calling apiAccountsMgmtV1FeatureTogglesFeatureToggleIdQueryPost");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/feature_toggles/{feature_toggle_id}/query"
      .replaceAll("\\{" + "feature_toggle_id" + "\\}", apiClient.escapeString(featureToggleId.toString()));

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

    GenericType<FeatureToggle> localVarReturnType = new GenericType<FeatureToggle>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the version metadata. 
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public Metadata apiAccountsMgmtV1Get() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1";

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
   * Retrieves a list of labels. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the organization instead of the names of the columns of a table. For example, in order to retrieve labels with name starting with my:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2003 apiAccountsMgmtV1LabelsGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/labels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<InlineResponse2003> localVarReturnType = new GenericType<InlineResponse2003>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Notify user related to subscription/cluster via email 
   * @param body  (optional)
   * @return SubscriptionNotify
   * @throws ApiException if fails to make API call
   */
  public SubscriptionNotify apiAccountsMgmtV1NotifyPost(SubscriptionNotify body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/notify";

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

    GenericType<SubscriptionNotify> localVarReturnType = new GenericType<SubscriptionNotify>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of organizations. 
   * @param fetchlabelsLabels If true, includes the labels on an organization in the output. Could slow request response time.  (optional)
   * @param fields Projection This field contains a comma-separated list of fields you&#x27;d like to get in a result. No new fields can be added, only existing ones can be filtered. To specify a field &#x27;id&#x27; of a structure &#x27;plan&#x27; use &#x27;plan.id&#x27;. To specify all fields of a structure &#x27;labels&#x27; use &#x27;labels.*&#x27;.   (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the organization instead of the names of the columns of a table. For example, in order to retrieve organizations with name starting with my:   &#x60;&#x60;&#x60; name like &#x27;my%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2004 apiAccountsMgmtV1OrganizationsGet(Boolean fetchlabelsLabels, String fields, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fetchlabels_labels", fetchlabelsLabels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
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

    GenericType<InlineResponse2004> localVarReturnType = new GenericType<InlineResponse2004>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the organization. 
   * @param organizationId  (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization apiAccountsMgmtV1OrganizationsOrganizationIdGet(String organizationId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

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

    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of labels of the account/organization/subscription.  IMPORTANT: This collection doesn&#x27;t currently support paging or searching, so the returned &#x60;page&#x60; will always be 1 and &#x60;size&#x60; and &#x60;total&#x60; will always be the total number of labels of the account/organization/subscription. 
   * @param organizationId  (required)
   * @param page Index of the returned page, where one corresponds to the first page. As this collection doesn&#x27;t support paging the result will always be &#x60;1&#x60;.  (optional)
   * @param size Number of items that will be contained in the returned page. As this collection doesn&#x27;t support paging or searching the result will always be the total number of labels of the account/organization/subscription.  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 apiAccountsMgmtV1OrganizationsOrganizationIdLabelsGet(String organizationId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/labels"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the account label. 
   * @param organizationId  (required)
   * @param labelsId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdDelete(String organizationId, String labelsId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdDelete");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/labels/{labels_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * @param organizationId  (required)
   * @param labelsId  (required)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdGet(String organizationId, String labelsId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdGet");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/labels/{labels_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * Updates the account label. 
   * @param organizationId  (required)
   * @param labelsId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdPatch(String organizationId, String labelsId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdPatch");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsLabelsIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/labels/{labels_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * Create a new account/organization/subscription label. 
   * @param organizationId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1OrganizationsOrganizationIdLabelsPost(String organizationId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdLabelsPost");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/labels"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

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
   * Updates the organization. 
   * @param organizationId  (required)
   * @param body  (optional)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization apiAccountsMgmtV1OrganizationsOrganizationIdPatch(String organizationId, Organization body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

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

    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the Quota summary. 
   * @param organizationId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the quota summary instead of the names of the columns of a table. For example, in order to retrieve the quota summary for clusters that run in multiple availability zones:   &#x60;&#x60;&#x60; availability_zone_type &#x3D; &#x27;multi&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2005 apiAccountsMgmtV1OrganizationsOrganizationIdQuotaSummaryGet(String organizationId, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdQuotaSummaryGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/quota_summary"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Retrieves the list of resource quotas. 
   * @param organizationId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the account instead of the names of the columns of a table. For example, in order to retrieve resource quota with resource_type cluster.aws:   &#x60;&#x60;&#x60; resource_type &#x3D; &#x27;cluster.aws&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2006 apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaGet(String organizationId, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/resource_quota"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Creates a new resource quota. 
   * @param organizationId  (required)
   * @param body  (optional)
   * @return ResourceQuota
   * @throws ApiException if fails to make API call
   */
  public ResourceQuota apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaPost(String organizationId, ResourceQuota body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaPost");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/resource_quota"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

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

    GenericType<ResourceQuota> localVarReturnType = new GenericType<ResourceQuota>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the resource quota. 
   * @param organizationId  (required)
   * @param resourceQuotaId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdDelete(String organizationId, String resourceQuotaId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdDelete");
    }
    // verify the required parameter 'resourceQuotaId' is set
    if (resourceQuotaId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceQuotaId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/resource_quota/{resource_quota_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "resource_quota_id" + "\\}", apiClient.escapeString(resourceQuotaId.toString()));

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
   * Retrieves the details of the resource quota. 
   * @param organizationId  (required)
   * @param resourceQuotaId  (required)
   * @return ResourceQuota
   * @throws ApiException if fails to make API call
   */
  public ResourceQuota apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdGet(String organizationId, String resourceQuotaId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdGet");
    }
    // verify the required parameter 'resourceQuotaId' is set
    if (resourceQuotaId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceQuotaId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/resource_quota/{resource_quota_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "resource_quota_id" + "\\}", apiClient.escapeString(resourceQuotaId.toString()));

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

    GenericType<ResourceQuota> localVarReturnType = new GenericType<ResourceQuota>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the resource quota. 
   * @param organizationId  (required)
   * @param resourceQuotaId  (required)
   * @param body  (optional)
   * @return ResourceQuota
   * @throws ApiException if fails to make API call
   */
  public ResourceQuota apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdPatch(String organizationId, String resourceQuotaId, ResourceQuota body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdPatch");
    }
    // verify the required parameter 'resourceQuotaId' is set
    if (resourceQuotaId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceQuotaId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdResourceQuotaResourceQuotaIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/resource_quota/{resource_quota_id}"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "resource_quota_id" + "\\}", apiClient.escapeString(resourceQuotaId.toString()));

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

    GenericType<ResourceQuota> localVarReturnType = new GenericType<ResourceQuota>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the organization&#x27;s summary dashboard. 
   * @param organizationId  (required)
   * @return SummaryDashboard
   * @throws ApiException if fails to make API call
   */
  public SummaryDashboard apiAccountsMgmtV1OrganizationsOrganizationIdSummaryDashboardGet(String organizationId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling apiAccountsMgmtV1OrganizationsOrganizationIdSummaryDashboardGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations/{organization_id}/summary_dashboard"
      .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

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

    GenericType<SummaryDashboard> localVarReturnType = new GenericType<SummaryDashboard>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Creates a new organization. 
   * @param body  (optional)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization apiAccountsMgmtV1OrganizationsPost(Organization body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/organizations";

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

    GenericType<Organization> localVarReturnType = new GenericType<Organization>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of permissions. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2007 apiAccountsMgmtV1PermissionsGet(Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/permissions";

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

    GenericType<InlineResponse2007> localVarReturnType = new GenericType<InlineResponse2007>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the permission. 
   * @param permissionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1PermissionsPermissionIdDelete(String permissionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'permissionId' is set
    if (permissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionId' when calling apiAccountsMgmtV1PermissionsPermissionIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/permissions/{permission_id}"
      .replaceAll("\\{" + "permission_id" + "\\}", apiClient.escapeString(permissionId.toString()));

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
   * Retrieves the details of the permission. 
   * @param permissionId  (required)
   * @return Permission
   * @throws ApiException if fails to make API call
   */
  public Permission apiAccountsMgmtV1PermissionsPermissionIdGet(String permissionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'permissionId' is set
    if (permissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionId' when calling apiAccountsMgmtV1PermissionsPermissionIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/permissions/{permission_id}"
      .replaceAll("\\{" + "permission_id" + "\\}", apiClient.escapeString(permissionId.toString()));

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

    GenericType<Permission> localVarReturnType = new GenericType<Permission>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Creates a new permission. 
   * @param body  (optional)
   * @return Permission
   * @throws ApiException if fails to make API call
   */
  public Permission apiAccountsMgmtV1PermissionsPost(Permission body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/permissions";

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

    GenericType<Permission> localVarReturnType = new GenericType<Permission>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Returns access token generated from registries in docker format. 
   * @param body  (optional)
   * @return AccessToken
   * @throws ApiException if fails to make API call
   */
  public AccessToken apiAccountsMgmtV1PullSecretsPost(PullSecretsRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/pull_secrets";

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

    GenericType<AccessToken> localVarReturnType = new GenericType<AccessToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the pull secret. 
   * @param pullSecretId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1PullSecretsPullSecretIdDelete(String pullSecretId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'pullSecretId' is set
    if (pullSecretId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullSecretId' when calling apiAccountsMgmtV1PullSecretsPullSecretIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/pull_secrets/{pull_secret_id}"
      .replaceAll("\\{" + "pull_secret_id" + "\\}", apiClient.escapeString(pullSecretId.toString()));

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
   * Retrieves a list of registries. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2008 apiAccountsMgmtV1RegistriesGet(Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/registries";

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
   * Retrieves the details of the registry. 
   * @param registryId  (required)
   * @return Registry
   * @throws ApiException if fails to make API call
   */
  public Registry apiAccountsMgmtV1RegistriesRegistryIdGet(String registryId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'registryId' is set
    if (registryId == null) {
      throw new ApiException(400, "Missing the required parameter 'registryId' when calling apiAccountsMgmtV1RegistriesRegistryIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/registries/{registry_id}"
      .replaceAll("\\{" + "registry_id" + "\\}", apiClient.escapeString(registryId.toString()));

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

    GenericType<Registry> localVarReturnType = new GenericType<Registry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of accounts. 
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement. For example, in order to sort the RegistryCredentials descending by username the value should be:   &#x60;&#x60;&#x60; username desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the RegistryCredentials instead of the names of the columns of a table. For example, in order to retrieve all the RegistryCredentials for a user the value should be:   &#x60;&#x60;&#x60; username &#x3D; &#x27;abcxyz...&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the RegistryCredentials that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2009 apiAccountsMgmtV1RegistryCredentialsGet(String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/registry_credentials";

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

    GenericType<InlineResponse2009> localVarReturnType = new GenericType<InlineResponse2009>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Creates a new registry credential. 
   * @param body  (optional)
   * @return RegistryCredential
   * @throws ApiException if fails to make API call
   */
  public RegistryCredential apiAccountsMgmtV1RegistryCredentialsPost(RegistryCredential body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/registry_credentials";

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

    GenericType<RegistryCredential> localVarReturnType = new GenericType<RegistryCredential>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the registry credential. 
   * @param registryCredentialId  (required)
   * @return RegistryCredential
   * @throws ApiException if fails to make API call
   */
  public RegistryCredential apiAccountsMgmtV1RegistryCredentialsRegistryCredentialIdGet(String registryCredentialId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'registryCredentialId' is set
    if (registryCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'registryCredentialId' when calling apiAccountsMgmtV1RegistryCredentialsRegistryCredentialIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/registry_credentials/{registry_credential_id}"
      .replaceAll("\\{" + "registry_credential_id" + "\\}", apiClient.escapeString(registryCredentialId.toString()));

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

    GenericType<RegistryCredential> localVarReturnType = new GenericType<RegistryCredential>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of resource quotas. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the account instead of the names of the columns of a table. For example, in order to retrieve resource quota with resource_type cluster.aws:   &#x60;&#x60;&#x60; resource_type &#x3D; &#x27;cluster.aws&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2006 apiAccountsMgmtV1ResourceQuotaGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/resource_quota";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Creates a new resource quota. 
   * @param body  (optional)
   * @return ResourceQuota
   * @throws ApiException if fails to make API call
   */
  public ResourceQuota apiAccountsMgmtV1ResourceQuotaPost(ResourceQuota body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/resource_quota";

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

    GenericType<ResourceQuota> localVarReturnType = new GenericType<ResourceQuota>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the resource quota. 
   * @param resourceQuotaId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1ResourceQuotaResourceQuotaIdDelete(String resourceQuotaId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceQuotaId' is set
    if (resourceQuotaId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceQuotaId' when calling apiAccountsMgmtV1ResourceQuotaResourceQuotaIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/resource_quota/{resource_quota_id}"
      .replaceAll("\\{" + "resource_quota_id" + "\\}", apiClient.escapeString(resourceQuotaId.toString()));

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
   * Retrieves the details of the resource quota. 
   * @param resourceQuotaId  (required)
   * @return ResourceQuota
   * @throws ApiException if fails to make API call
   */
  public ResourceQuota apiAccountsMgmtV1ResourceQuotaResourceQuotaIdGet(String resourceQuotaId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceQuotaId' is set
    if (resourceQuotaId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceQuotaId' when calling apiAccountsMgmtV1ResourceQuotaResourceQuotaIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/resource_quota/{resource_quota_id}"
      .replaceAll("\\{" + "resource_quota_id" + "\\}", apiClient.escapeString(resourceQuotaId.toString()));

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

    GenericType<ResourceQuota> localVarReturnType = new GenericType<ResourceQuota>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the resource quota. 
   * @param resourceQuotaId  (required)
   * @param body  (optional)
   * @return ResourceQuota
   * @throws ApiException if fails to make API call
   */
  public ResourceQuota apiAccountsMgmtV1ResourceQuotaResourceQuotaIdPatch(String resourceQuotaId, ResourceQuota body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceQuotaId' is set
    if (resourceQuotaId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceQuotaId' when calling apiAccountsMgmtV1ResourceQuotaResourceQuotaIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/resource_quota/{resource_quota_id}"
      .replaceAll("\\{" + "resource_quota_id" + "\\}", apiClient.escapeString(resourceQuotaId.toString()));

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

    GenericType<ResourceQuota> localVarReturnType = new GenericType<ResourceQuota>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of role bindings. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the role binding instead of the names of the columns of a table. For example, in order to retrieve role bindings with role_id AuthenticatedUser:   &#x60;&#x60;&#x60; role_id &#x3D; &#x27;AuthenticatedUser&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20010 apiAccountsMgmtV1RoleBindingsGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/role_bindings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<InlineResponse20010> localVarReturnType = new GenericType<InlineResponse20010>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Creates a new role binding. 
   * @param body  (optional)
   * @return RoleBinding
   * @throws ApiException if fails to make API call
   */
  public RoleBinding apiAccountsMgmtV1RoleBindingsPost(RoleBinding body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/role_bindings";

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

    GenericType<RoleBinding> localVarReturnType = new GenericType<RoleBinding>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the role binding. 
   * @param roleBindingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1RoleBindingsRoleBindingIdDelete(String roleBindingId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'roleBindingId' is set
    if (roleBindingId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleBindingId' when calling apiAccountsMgmtV1RoleBindingsRoleBindingIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/role_bindings/{role_binding_id}"
      .replaceAll("\\{" + "role_binding_id" + "\\}", apiClient.escapeString(roleBindingId.toString()));

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
   * Retrieves the details of the role binding. 
   * @param roleBindingId  (required)
   * @return RoleBinding
   * @throws ApiException if fails to make API call
   */
  public RoleBinding apiAccountsMgmtV1RoleBindingsRoleBindingIdGet(String roleBindingId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'roleBindingId' is set
    if (roleBindingId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleBindingId' when calling apiAccountsMgmtV1RoleBindingsRoleBindingIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/role_bindings/{role_binding_id}"
      .replaceAll("\\{" + "role_binding_id" + "\\}", apiClient.escapeString(roleBindingId.toString()));

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

    GenericType<RoleBinding> localVarReturnType = new GenericType<RoleBinding>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the account. 
   * @param roleBindingId  (required)
   * @param body  (optional)
   * @return RoleBinding
   * @throws ApiException if fails to make API call
   */
  public RoleBinding apiAccountsMgmtV1RoleBindingsRoleBindingIdPatch(String roleBindingId, RoleBinding body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'roleBindingId' is set
    if (roleBindingId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleBindingId' when calling apiAccountsMgmtV1RoleBindingsRoleBindingIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/role_bindings/{role_binding_id}"
      .replaceAll("\\{" + "role_binding_id" + "\\}", apiClient.escapeString(roleBindingId.toString()));

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

    GenericType<RoleBinding> localVarReturnType = new GenericType<RoleBinding>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of roles. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the role instead of the names of the columns of a table. For example, in order to retrieve roles named starting with &#x60;Organization&#x60;:   &#x60;&#x60;&#x60; name like &#x27;Organization%&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2002 apiAccountsMgmtV1RolesGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/roles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Creates a new role. 
   * @param body  (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role apiAccountsMgmtV1RolesPost(Role body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/roles";

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the role. 
   * @param roleId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1RolesRoleIdDelete(String roleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling apiAccountsMgmtV1RolesRoleIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/roles/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

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
   * Retrieves the details of the role. 
   * @param roleId  (required)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role apiAccountsMgmtV1RolesRoleIdGet(String roleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling apiAccountsMgmtV1RolesRoleIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/roles/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Updates the role. 
   * @param roleId  (required)
   * @param body  (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role apiAccountsMgmtV1RolesRoleIdPatch(String roleId, Role body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling apiAccountsMgmtV1RolesRoleIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/roles/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of Sku Rules. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the SKU instead of the names of the columns of a table. For example, in order to retrieve SKUS large sized resources:   &#x60;&#x60;&#x60; resource_name like &#x27;%large&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20011 apiAccountsMgmtV1SkuRulesGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/sku_rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<InlineResponse20011> localVarReturnType = new GenericType<InlineResponse20011>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the Sku Rule. 
   * @param skuRuleId  (required)
   * @return SkuRule
   * @throws ApiException if fails to make API call
   */
  public SkuRule apiAccountsMgmtV1SkuRulesSkuRuleIdGet(String skuRuleId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'skuRuleId' is set
    if (skuRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'skuRuleId' when calling apiAccountsMgmtV1SkuRulesSkuRuleIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/sku_rules/{sku_rule_id}"
      .replaceAll("\\{" + "sku_rule_id" + "\\}", apiClient.escapeString(skuRuleId.toString()));

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

    GenericType<SkuRule> localVarReturnType = new GenericType<SkuRule>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of SKUS. 
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement, but using the names of the attributes of the SKU instead of the names of the columns of a table. For example, in order to retrieve SKUS large sized resources:   &#x60;&#x60;&#x60; resource_name like &#x27;%large&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the items that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20012 apiAccountsMgmtV1SkusGet(Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/skus";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<InlineResponse20012> localVarReturnType = new GenericType<InlineResponse20012>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the details of the SKU. 
   * @param skuId  (required)
   * @return SKU
   * @throws ApiException if fails to make API call
   */
  public SKU apiAccountsMgmtV1SkusSkuIdGet(String skuId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'skuId' is set
    if (skuId == null) {
      throw new ApiException(400, "Missing the required parameter 'skuId' when calling apiAccountsMgmtV1SkusSkuIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/skus/{sku_id}"
      .replaceAll("\\{" + "sku_id" + "\\}", apiClient.escapeString(skuId.toString()));

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

    GenericType<SKU> localVarReturnType = new GenericType<SKU>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves a list of subscriptions. 
   * @param fetchaccountsAccounts If true, includes the account reference information in the output. Could slow request response time.  (optional)
   * @param fetchlabelsLabels If true, includes the labels on a subscription in the output. Could slow request response time.  (optional)
   * @param fields Projection This field contains a comma-separated list of fields you&#x27;d like to get in a result. No new fields can be added, only existing ones can be filtered. To specify a field &#x27;id&#x27; of a structure &#x27;plan&#x27; use &#x27;plan.id&#x27;. To specify all fields of a structure &#x27;labels&#x27; use &#x27;labels.*&#x27;.   (optional)
   * @param labels Filter subscriptions by a comma separated list of labels:  [source] &#x60;&#x60;&#x60; env&#x3D;staging,department&#x3D;sales &#x60;&#x60;&#x60;   (optional)
   * @param order Order criteria.  The syntax of this parameter is similar to the syntax of the _order by_ clause of a SQL statement. For example, in order to sort the subscriptions descending by name identifier the value should be:   &#x60;&#x60;&#x60; name desc &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then the order of the results is undefined.  (optional)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of a SQL statement, but using the names of the attributes of the subscription instead of the names of the columns of a table. For example, in order to retrieve all the subscriptions for managed clusters the value should be:   &#x60;&#x60;&#x60; managed &#x3D; &#x27;t&#x27; &#x60;&#x60;&#x60;  If the parameter isn&#x27;t provided, or if the value is empty, then all the clusters that the user has permission to see will be returned.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20013
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20013 apiAccountsMgmtV1SubscriptionsGet(Boolean fetchaccountsAccounts, Boolean fetchlabelsLabels, String fields, String labels, String order, Integer page, String search, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fetchaccounts_accounts", fetchaccountsAccounts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fetchlabels_labels", fetchlabelsLabels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "labels", labels));
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

    GenericType<InlineResponse20013> localVarReturnType = new GenericType<InlineResponse20013>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Create a new subscription and register a cluster for it. 
   * @param body  (optional)
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription apiAccountsMgmtV1SubscriptionsPost(SubscriptionRegistration body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions";

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

    GenericType<Subscription> localVarReturnType = new GenericType<Subscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the subscription by ID. 
   * @param subscriptionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1SubscriptionsSubscriptionIdDelete(String subscriptionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
   * Retrieves the details of the subscription by ID. 
   * @param subscriptionId  (required)
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription apiAccountsMgmtV1SubscriptionsSubscriptionIdGet(String subscriptionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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

    GenericType<Subscription> localVarReturnType = new GenericType<Subscription>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the list of labels of the account/organization/subscription.  IMPORTANT: This collection doesn&#x27;t currently support paging or searching, so the returned &#x60;page&#x60; will always be 1 and &#x60;size&#x60; and &#x60;total&#x60; will always be the total number of labels of the account/organization/subscription. 
   * @param subscriptionId  (required)
   * @param page Index of the returned page, where one corresponds to the first page. As this collection doesn&#x27;t support paging the result will always be &#x60;1&#x60;.  (optional)
   * @param size Number of items that will be contained in the returned page. As this collection doesn&#x27;t support paging or searching the result will always be the total number of labels of the account/organization/subscription.  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsGet(String subscriptionId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/labels"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the account label. 
   * @param subscriptionId  (required)
   * @param labelsId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdDelete(String subscriptionId, String labelsId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdDelete");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/labels/{labels_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * @param subscriptionId  (required)
   * @param labelsId  (required)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdGet(String subscriptionId, String labelsId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdGet");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/labels/{labels_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * Updates the account label. 
   * @param subscriptionId  (required)
   * @param labelsId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdPatch(String subscriptionId, String labelsId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdPatch");
    }
    // verify the required parameter 'labelsId' is set
    if (labelsId == null) {
      throw new ApiException(400, "Missing the required parameter 'labelsId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsLabelsIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/labels/{labels_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()))
      .replaceAll("\\{" + "labels_id" + "\\}", apiClient.escapeString(labelsId.toString()));

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
   * Create a new account/organization/subscription label. 
   * @param subscriptionId  (required)
   * @param body  (optional)
   * @return Label
   * @throws ApiException if fails to make API call
   */
  public Label apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsPost(String subscriptionId, Label body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdLabelsPost");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/labels"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
   * Notify user related to subscription via email 
   * @param subscriptionId  (required)
   * @param body  (optional)
   * @return SubscriptionNotify
   * @throws ApiException if fails to make API call
   */
  public SubscriptionNotify apiAccountsMgmtV1SubscriptionsSubscriptionIdNotifyPost(String subscriptionId, SubscriptionNotify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdNotifyPost");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/notify"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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

    GenericType<SubscriptionNotify> localVarReturnType = new GenericType<SubscriptionNotify>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Update a subscription 
   * @param subscriptionId  (required)
   * @param body  (optional)
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription apiAccountsMgmtV1SubscriptionsSubscriptionIdPatch(String subscriptionId, Subscription body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdPatch");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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

    GenericType<Subscription> localVarReturnType = new GenericType<Subscription>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves items of the collection of reserved resources by the subscription. 
   * @param subscriptionId  (required)
   * @param page Index of the requested page, where one corresponds to the first page.  (optional)
   * @param size Maximum number of items that will be contained in the returned page.  (optional)
   * @return InlineResponse20014
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20014 apiAccountsMgmtV1SubscriptionsSubscriptionIdReservedResourcesGet(String subscriptionId, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdReservedResourcesGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/reserved_resources"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
   * Retrieves the reserved resource. 
   * @param subscriptionId  (required)
   * @param reservedResourceId  (required)
   * @return ReservedResource
   * @throws ApiException if fails to make API call
   */
  public ReservedResource apiAccountsMgmtV1SubscriptionsSubscriptionIdReservedResourcesReservedResourceIdGet(String subscriptionId, String reservedResourceId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdReservedResourcesReservedResourceIdGet");
    }
    // verify the required parameter 'reservedResourceId' is set
    if (reservedResourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reservedResourceId' when calling apiAccountsMgmtV1SubscriptionsSubscriptionIdReservedResourcesReservedResourceIdGet");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/subscriptions/{subscription_id}/reserved_resources/{reserved_resource_id}"
      .replaceAll("\\{" + "subscription_id" + "\\}", apiClient.escapeString(subscriptionId.toString()))
      .replaceAll("\\{" + "reserved_resource_id" + "\\}", apiClient.escapeString(reservedResourceId.toString()));

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

    GenericType<ReservedResource> localVarReturnType = new GenericType<ReservedResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Create a support case related to Hydra 
   * @param body  (optional)
   * @return SupportCaseResponse
   * @throws ApiException if fails to make API call
   */
  public SupportCaseResponse apiAccountsMgmtV1SupportCasesPost(SupportCaseRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/support_cases";

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

    GenericType<SupportCaseResponse> localVarReturnType = new GenericType<SupportCaseResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Deletes the support case by Case ID. 
   * @param supportCaseId  (required)
   * @throws ApiException if fails to make API call
   */
  public void apiAccountsMgmtV1SupportCasesSupportCaseIdDelete(String supportCaseId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'supportCaseId' is set
    if (supportCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'supportCaseId' when calling apiAccountsMgmtV1SupportCasesSupportCaseIdDelete");
    }
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/support_cases/{support_case_id}"
      .replaceAll("\\{" + "support_case_id" + "\\}", apiClient.escapeString(supportCaseId.toString()));

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
   * Returns a specific account based on the given pull secret 
   * @param body  (optional)
   * @return TokenAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public TokenAuthorizationResponse apiAccountsMgmtV1TokenAuthorizationPost(TokenAuthorizationRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/accounts_mgmt/v1/token_authorization";

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

    GenericType<TokenAuthorizationResponse> localVarReturnType = new GenericType<TokenAuthorizationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
