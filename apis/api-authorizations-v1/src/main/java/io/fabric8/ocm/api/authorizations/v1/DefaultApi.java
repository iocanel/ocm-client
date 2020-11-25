package io.fabric8.ocm.api.authorizations.v1;

import io.fabric8.ocm.api.authorizations.ApiException;
import io.fabric8.ocm.api.authorizations.ApiClient;
import io.fabric8.ocm.api.authorizations.Configuration;
import io.fabric8.ocm.api.authorizations.Pair;

import javax.ws.rs.core.GenericType;

import io.fabric8.ocm.model.authorizations.v1.AccessReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.AccessReviewResponse;
import io.fabric8.ocm.model.authorizations.v1.CapabilityReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.CapabilityReviewResponse;
import io.fabric8.ocm.model.authorizations.v1.Error;
import io.fabric8.ocm.model.authorizations.v1.ExportControlReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.ExportControlReviewResponse;
import io.fabric8.ocm.model.authorizations.v1.Metadata;
import io.fabric8.ocm.model.authorizations.v1.ResourceReview;
import io.fabric8.ocm.model.authorizations.v1.ResourceReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.SelfAccessReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.SelfAccessReviewResponse;
import io.fabric8.ocm.model.authorizations.v1.SelfCapabilityReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.SelfCapabilityReviewResponse;
import io.fabric8.ocm.model.authorizations.v1.TermsReviewRequest;
import io.fabric8.ocm.model.authorizations.v1.TermsReviewResponse;

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
   * Reviews a user&#x27;s access to a resource 
   * @param body  (optional)
   * @return AccessReviewResponse
   * @throws ApiException if fails to make API call
   */
  public AccessReviewResponse apiAuthorizationsV1AccessReviewPost(AccessReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/access_review";

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

    GenericType<AccessReviewResponse> localVarReturnType = new GenericType<AccessReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Reviews a user&#x27;s capability to a resource. 
   * @param body  (optional)
   * @return CapabilityReviewResponse
   * @throws ApiException if fails to make API call
   */
  public CapabilityReviewResponse apiAuthorizationsV1CapabilityReviewPost(CapabilityReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/capability_review";

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

    GenericType<CapabilityReviewResponse> localVarReturnType = new GenericType<CapabilityReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Screens a user by account user name. 
   * @param body  (optional)
   * @return ExportControlReviewResponse
   * @throws ApiException if fails to make API call
   */
  public ExportControlReviewResponse apiAuthorizationsV1ExportControlReviewPost(ExportControlReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/export_control_review";

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

    GenericType<ExportControlReviewResponse> localVarReturnType = new GenericType<ExportControlReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Retrieves the version metadata. 
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public Metadata apiAuthorizationsV1Get() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1";

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
   * Returns the list of identifiers of the resources that an account can perform the specified action upon. 
   * @param body  (optional)
   * @return ResourceReview
   * @throws ApiException if fails to make API call
   */
  public ResourceReview apiAuthorizationsV1ResourceReviewPost(ResourceReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/resource_review";

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

    GenericType<ResourceReview> localVarReturnType = new GenericType<ResourceReview>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Reviews a user&#x27;s access to a resource 
   * @param body  (optional)
   * @return SelfAccessReviewResponse
   * @throws ApiException if fails to make API call
   */
  public SelfAccessReviewResponse apiAuthorizationsV1SelfAccessReviewPost(SelfAccessReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/self_access_review";

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

    GenericType<SelfAccessReviewResponse> localVarReturnType = new GenericType<SelfAccessReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Reviews a user&#x27;s capability to a resource. 
   * @param body  (optional)
   * @return SelfCapabilityReviewResponse
   * @throws ApiException if fails to make API call
   */
  public SelfCapabilityReviewResponse apiAuthorizationsV1SelfCapabilityReviewPost(SelfCapabilityReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/self_capability_review";

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

    GenericType<SelfCapabilityReviewResponse> localVarReturnType = new GenericType<SelfCapabilityReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Reviews a user&#x27;s status of Terms. 
   * @return TermsReviewResponse
   * @throws ApiException if fails to make API call
   */
  public TermsReviewResponse apiAuthorizationsV1SelfTermsReviewPost() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/self_terms_review";

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

    GenericType<TermsReviewResponse> localVarReturnType = new GenericType<TermsReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Reviews a user&#x27;s status of Terms. 
   * @param body  (optional)
   * @return TermsReviewResponse
   * @throws ApiException if fails to make API call
   */
  public TermsReviewResponse apiAuthorizationsV1TermsReviewPost(TermsReviewRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/authorizations/v1/terms_review";

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

    GenericType<TermsReviewResponse> localVarReturnType = new GenericType<TermsReviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
