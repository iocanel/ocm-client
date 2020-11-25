/**
 * Copyright 2015 The original authors.
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

package io.fabric8.ocm.client.clustersmgmt.v1;

import io.fabric8.ocm.OcmConfig;
import io.fabric8.ocm.OcmConfigBuilder;
import io.fabric8.ocm.api.clustersmgmt.ApiClient;
import io.fabric8.ocm.api.clustersmgmt.v1.DefaultApi;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.CloudProviderOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterReadOnlyOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterResource;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.GroupOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.CloudProvidersOperationImpl;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.CloudRegionsOperationImpl;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.ClustersOperationImpl;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.GroupsOperationImpl;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.LabelsOperationImpl;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.SyncsetsOperationImpl;
import io.fabric8.ocm.client.clustersmgmt.v1.impl.UsersOperationImpl;
import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.ReadOnlyOperation;
import io.fabric8.ocm.dsl.ReadOnlyResource;
import io.fabric8.ocm.dsl.Resource;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRole;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRoleGrant;
import io.fabric8.ocm.model.clustersmgmt.v1.AddOn;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudProvider;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudRegion;
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;
import io.fabric8.ocm.model.clustersmgmt.v1.Group;
import io.fabric8.ocm.model.clustersmgmt.v1.Ingress;
import io.fabric8.ocm.model.clustersmgmt.v1.Label;
import io.fabric8.ocm.model.clustersmgmt.v1.Log;
import io.fabric8.ocm.model.clustersmgmt.v1.Syncset;
import io.fabric8.ocm.model.clustersmgmt.v1.User;

public class DefaultClustersMgmgtClient implements ClustersMgmtClient {

  private final OcmConfig config;
  private final DefaultApi api;
  private final ApiClient client = new ApiClient();

  public DefaultClustersMgmgtClient(OcmConfig config) {
    this.config = config != null ? config : new OcmConfigBuilder().build();

    client.setAccessToken(config.getAccessToken());

    this.api = new DefaultApi(client);
  }

  @Override
  public <C> boolean isAdaptable(Class<C> type) {
    return false;
  }

  @Override
  public <C> C adapt(Class<C> type) {
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
  public void login() {
  }

  @Override
  public ReadOnlyOperation<CloudProvider, ReadOnlyResource<CloudProvider>> cloudProviders() {
    return new CloudProvidersOperationImpl(api);
  }

  @Override
  public CloudProviderOperation<CloudRegion, ReadOnlyResource<CloudRegion>> cloudRegions() {
    return new CloudRegionsOperationImpl(api);
  }

  @Override
  public Operation<Cluster, ClusterResource> clusters() {
    return new ClustersOperationImpl(api);
  }

  @Override
  public ClusterReadOnlyOperation<Group, ReadOnlyResource<Group>> groups() {
    return new GroupsOperationImpl(api);
  }

  @Override
  public GroupOperation<User, Resource<User>> users() {
    return new UsersOperationImpl(api);
  }

  @Override
  public ClusterOperation<Label, Resource<Label>> labels() {
    return new LabelsOperationImpl(api);
  }

  @Override
  public ClusterOperation<Syncset, Resource<Syncset>> syncsets() {
    return new SyncsetsOperationImpl(api);
  }

  @Override
  public ClusterOperation<AWSInfrastructureAccessRole, Resource<AWSInfrastructureAccessRole>> awsInfraAccessRoles() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ClusterOperation<AWSInfrastructureAccessRoleGrant, Resource<AWSInfrastructureAccessRoleGrant>> awsInfraAccessRoleGrants() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ClusterOperation<AddOn, Resource<AddOn>> addOns() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ClusterOperation<Ingress, Resource<Ingress>> ingresses() {
    // TODO Auto-generated method stub
    return null;
  }
}
