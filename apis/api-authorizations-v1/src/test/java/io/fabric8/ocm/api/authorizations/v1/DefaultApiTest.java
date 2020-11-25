/*
 * authorizations
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.api.authorizations.v1;

import io.fabric8.ocm.api.authorizations.ApiException;
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * 
     *
     * Reviews a user&#x27;s access to a resource 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1AccessReviewPostTest() throws ApiException {
        AccessReviewRequest body = null;
        AccessReviewResponse response = api.apiAuthorizationsV1AccessReviewPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Reviews a user&#x27;s capability to a resource. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1CapabilityReviewPostTest() throws ApiException {
        CapabilityReviewRequest body = null;
        CapabilityReviewResponse response = api.apiAuthorizationsV1CapabilityReviewPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Screens a user by account user name. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1ExportControlReviewPostTest() throws ApiException {
        ExportControlReviewRequest body = null;
        ExportControlReviewResponse response = api.apiAuthorizationsV1ExportControlReviewPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the version metadata. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1GetTest() throws ApiException {
        Metadata response = api.apiAuthorizationsV1Get();

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns the list of identifiers of the resources that an account can perform the specified action upon. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1ResourceReviewPostTest() throws ApiException {
        ResourceReviewRequest body = null;
        ResourceReview response = api.apiAuthorizationsV1ResourceReviewPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Reviews a user&#x27;s access to a resource 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1SelfAccessReviewPostTest() throws ApiException {
        SelfAccessReviewRequest body = null;
        SelfAccessReviewResponse response = api.apiAuthorizationsV1SelfAccessReviewPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Reviews a user&#x27;s capability to a resource. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1SelfCapabilityReviewPostTest() throws ApiException {
        SelfCapabilityReviewRequest body = null;
        SelfCapabilityReviewResponse response = api.apiAuthorizationsV1SelfCapabilityReviewPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Reviews a user&#x27;s status of Terms. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1SelfTermsReviewPostTest() throws ApiException {
        TermsReviewResponse response = api.apiAuthorizationsV1SelfTermsReviewPost();

        // TODO: test validations
    }
    /**
     * 
     *
     * Reviews a user&#x27;s status of Terms. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiAuthorizationsV1TermsReviewPostTest() throws ApiException {
        TermsReviewRequest body = null;
        TermsReviewResponse response = api.apiAuthorizationsV1TermsReviewPost(body);

        // TODO: test validations
    }
}
