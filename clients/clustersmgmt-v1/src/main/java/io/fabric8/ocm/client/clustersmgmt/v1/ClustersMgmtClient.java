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

import io.fabric8.ocm.Client;
import io.fabric8.ocm.OcmConfig;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.CloudProviderOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterReadOnlyOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterResource;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.GroupOperation;
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

public interface ClustersMgmtClient extends Client<OcmConfig> {
  
    void login();


    ReadOnlyOperation<CloudProvider, ReadOnlyResource<CloudProvider>> cloudProviders();
    CloudProviderOperation<CloudRegion, ReadOnlyResource<CloudRegion>> cloudRegions();

    Operation<Cluster, ClusterResource> clusters();

    ClusterReadOnlyOperation<Group, ReadOnlyResource<Group>> groups();
    GroupOperation<User, Resource<User>> users();
    ClusterOperation<AddOn, Resource<AddOn>> addOns();
    ClusterOperation<Ingress, Resource<Ingress>> ingresses();


    ClusterOperation<Label, Resource<Label>> labels();
    ClusterOperation<Syncset, Resource<Syncset>> syncsets();
    ClusterOperation<AWSInfrastructureAccessRole, Resource<AWSInfrastructureAccessRole>> awsInfraAccessRoles();
    ClusterOperation<AWSInfrastructureAccessRoleGrant, Resource<AWSInfrastructureAccessRoleGrant>> awsInfraAccessRoleGrants();

}
