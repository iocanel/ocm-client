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

import io.fabric8.ocm.Client;
import io.fabric8.ocm.OcmConfig;
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

public interface AccountsMgmtClient extends Client<OcmConfig> {
  
  Metadata getMetadata();
  AccessToken getAccessToken();
  AccessToken getAccessToken(PullSecretsRequest request);

  ClusterAuthorizationResponse authorize(ClusterAuthorizationRequest request);
  ClusterRegistrationResponse register(ClusterRegistrationRequest request);
  SupportCaseResponse createSupportCase(SupportCaseRequest request);
  TokenAuthorizationResponse authorizeToken(TokenAuthorizationRequest request);
  
  FeatureToggle getFeatureToggle(String organizationId, String featureToggleId);
  SubscriptionNotify notify(SubscriptionNotify notify);

  Operation<Label, Resource<Label>> labels();

  Operation<Account, AccountResource> accounts();

  Operation<Organization, OrganizationResource> organizations();
  
  Operation<Permission, Resource<Permission>> permissions();

  ReadOnlyOperation<Registry, ReadOnlyResource<Registry>> registries();
  Operation<RegistryCredential, Resource<RegistryCredential>> registryCredentials();
  
  Operation<ResourceQuota, Resource<ResourceQuota>> resourceQuotas();

  Operation<Role, Resource<Role>> roles();
  Operation<RoleBinding, Resource<RoleBinding>> roleBindings();
  
  ReadOnlyOperation<SkuRule, ReadOnlyResource<SkuRule>> skuRules();
  ReadOnlyOperation<SKU, ReadOnlyResource<SKU>> skus();

  Operation<Subscription, SubscriptionResource> subscriptions();
}
