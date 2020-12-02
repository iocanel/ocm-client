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
package io.fabric8.ocm.client.clustersmgmt.v1.impl;

import java.util.Arrays;
import java.util.List;

import io.fabric8.ocm.OcmException;
import io.fabric8.ocm.api.clustersmgmt.ApiException;
import io.fabric8.ocm.api.clustersmgmt.v1.DefaultApi;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterOperation;
import io.fabric8.ocm.dsl.Find;
import io.fabric8.ocm.dsl.FindOrOrderedBy;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSize;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSizeOrPage;
import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.ReadWriteResource;
import io.fabric8.ocm.dsl.Resource;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRoleGrant;

public class AWSInfrastructureAccessRoleGrantsOperationImpl implements ClusterOperation<AWSInfrastructureAccessRoleGrant, Resource<AWSInfrastructureAccessRoleGrant>>, ReadWriteResource<AWSInfrastructureAccessRoleGrant> {

  private final DefaultApi api;
  private final String clusterId;
  private final String id;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public AWSInfrastructureAccessRoleGrantsOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null, null);
  }

  public AWSInfrastructureAccessRoleGrantsOperationImpl(DefaultApi api, String clusterId, String id, String clause, String orderBy, Integer page,
      Integer size) {
    this.api = api;
    this.clusterId = clusterId;
    this.id = id;
    this.clause = clause;
    this.page = page;
    this.size = size;
    this.orderBy = orderBy;
  }

  @Override
  public Operation<AWSInfrastructureAccessRoleGrant, Resource<AWSInfrastructureAccessRoleGrant>> inCluster(String clusterId) {
    return new AWSInfrastructureAccessRoleGrantsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Resource<AWSInfrastructureAccessRoleGrant> withName(String id) {
    return new AWSInfrastructureAccessRoleGrantsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<AWSInfrastructureAccessRoleGrant> where(String clause) {
    return new AWSInfrastructureAccessRoleGrantsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<AWSInfrastructureAccessRoleGrant> page(Integer page) {
    return new AWSInfrastructureAccessRoleGrantsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<AWSInfrastructureAccessRoleGrant> size(Integer size) {
    return new AWSInfrastructureAccessRoleGrantsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Find<AWSInfrastructureAccessRoleGrant> orderedBy(String attribute) {
    return new AWSInfrastructureAccessRoleGrantsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public List<AWSInfrastructureAccessRoleGrant> find() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsGet(clusterId, orderBy, page, clause, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public AWSInfrastructureAccessRoleGrant get() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdGet(clusterId, id);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public boolean delete() {
    try {
       api.apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsAwsInfrastructureAccessRoleGrantIdDelete(clusterId, id);
       return true;
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public AWSInfrastructureAccessRoleGrant create(AWSInfrastructureAccessRoleGrant item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdAwsInfrastructureAccessRoleGrantsPost(clusterId, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public AWSInfrastructureAccessRoleGrant replace(AWSInfrastructureAccessRoleGrant item) {
    throw new UnsupportedOperationException("PATCH is not supported for AddOnInstallation by the server!");
  }
}
