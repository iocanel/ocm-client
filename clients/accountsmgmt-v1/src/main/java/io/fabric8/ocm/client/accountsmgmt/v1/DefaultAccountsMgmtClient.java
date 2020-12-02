/**
 * Copyright 2020 The original authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
**/

package io.fabric8.ocm.client.accountsmgmt.v1;

import io.fabric8.ocm.OcmConfig;
import io.fabric8.ocm.OcmConfigBuilder;
import io.fabric8.ocm.OcmException;
import io.fabric8.ocm.api.accountsmgmt.ApiClient;
import io.fabric8.ocm.api.accountsmgmt.ApiException;
import io.fabric8.ocm.api.accountsmgmt.v1.DefaultApi;
import io.fabric8.ocm.client.accountsmgmt.v1.dsl.AccountResource;
import io.fabric8.ocm.client.accountsmgmt.v1.dsl.OrganizationResource;
import io.fabric8.ocm.client.accountsmgmt.v1.dsl.SubscriptionResource;
import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.ReadOnlyOperation;
import io.fabric8.ocm.dsl.ReadOnlyResource;
import io.fabric8.ocm.dsl.Resource;
import io.fabric8.ocm.model.accountsmgmt.v1.AccessToken;
import io.fabric8.ocm.model.accountsmgmt.v1.Account;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterAuthorizationRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterAuthorizationResponse;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterRegistrationRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.ClusterRegistrationResponse;
import io.fabric8.ocm.model.accountsmgmt.v1.FeatureToggle;
import io.fabric8.ocm.model.accountsmgmt.v1.Label;
import io.fabric8.ocm.model.accountsmgmt.v1.Metadata;
import io.fabric8.ocm.model.accountsmgmt.v1.Organization;
import io.fabric8.ocm.model.accountsmgmt.v1.Permission;
import io.fabric8.ocm.model.accountsmgmt.v1.PullSecretsRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.Registry;
import io.fabric8.ocm.model.accountsmgmt.v1.RegistryCredential;
import io.fabric8.ocm.model.accountsmgmt.v1.ResourceQuota;
import io.fabric8.ocm.model.accountsmgmt.v1.Role;
import io.fabric8.ocm.model.accountsmgmt.v1.RoleBinding;
import io.fabric8.ocm.model.accountsmgmt.v1.SKU;
import io.fabric8.ocm.model.accountsmgmt.v1.SkuRule;
import io.fabric8.ocm.model.accountsmgmt.v1.Subscription;
import io.fabric8.ocm.model.accountsmgmt.v1.SubscriptionNotify;
import io.fabric8.ocm.model.accountsmgmt.v1.SupportCaseRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.SupportCaseResponse;
import io.fabric8.ocm.model.accountsmgmt.v1.TokenAuthorizationRequest;
import io.fabric8.ocm.model.accountsmgmt.v1.TokenAuthorizationResponse;

public class DefaultAccountsMgmtClient implements AccountsMgmtClient {

  private final OcmConfig config;
  private final DefaultApi api;
  private final ApiClient client = new ApiClient();

  public DefaultAccountsMgmtClient() {
    this(OcmConfig.getConfig());
  }

  public DefaultAccountsMgmtClient(OcmConfig config) {
    this.config = config != null ? config : OcmConfig.getConfig();
    client.setAccessToken(config.getAccessToken());
    this.api = new DefaultApi(client);
  }

  @Override
  public <C> boolean isAdaptable(Class<C> type) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public <C> C adapt(Class<C> type) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OcmConfig getConfig() {
    return config;
  }

  @Override
  public void close() throws Exception {
  }

  @Override
  public Metadata getMetadata() {
    try {
      return api.apiAccountsMgmtV1Get();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public AccessToken getAccessToken() {
    try {
      return api.apiAccountsMgmtV1AccessTokenPost();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }

  }

  @Override
  public AccessToken getAccessToken(PullSecretsRequest request) {
    try {
      return api.apiAccountsMgmtV1PullSecretsPost(request);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public ClusterAuthorizationResponse authorize(ClusterAuthorizationRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ClusterRegistrationResponse register(ClusterRegistrationRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SupportCaseResponse createSupportCase(SupportCaseRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TokenAuthorizationResponse authorizeToken(TokenAuthorizationRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FeatureToggle getFeatureToggle(String organizationId, String featureToggleId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SubscriptionNotify notify(SubscriptionNotify notify) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<Label, Resource<Label>> labels() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<Account, AccountResource> accounts() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<Organization, OrganizationResource> organizations() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<Permission, Resource<Permission>> permissions() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReadOnlyOperation<Registry, ReadOnlyResource<Registry>> registries() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<RegistryCredential, Resource<RegistryCredential>> registryCredentials() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<ResourceQuota, Resource<ResourceQuota>> resourceQuotas() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<Role, Resource<Role>> roles() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<RoleBinding, Resource<RoleBinding>> roleBindings() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReadOnlyOperation<SkuRule, ReadOnlyResource<SkuRule>> skuRules() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReadOnlyOperation<SKU, ReadOnlyResource<SKU>> skus() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Operation<Subscription, SubscriptionResource> subscriptions() {
    // TODO Auto-generated method stub
    return null;
  }
}
