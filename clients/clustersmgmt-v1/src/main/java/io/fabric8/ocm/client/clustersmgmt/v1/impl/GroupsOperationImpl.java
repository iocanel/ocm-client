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
package io.fabric8.ocm.client.clustersmgmt.v1.impl;

import java.util.List;

import io.fabric8.ocm.OcmException;
import io.fabric8.ocm.api.clustersmgmt.ApiException;
import io.fabric8.ocm.api.clustersmgmt.v1.DefaultApi;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterReadOnlyOperation;
import io.fabric8.ocm.dsl.Find;
import io.fabric8.ocm.dsl.FindOrOrderedBy;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSize;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSizeOrPage;
import io.fabric8.ocm.dsl.ReadOnlyOperation;
import io.fabric8.ocm.dsl.ReadOnlyResource;
import io.fabric8.ocm.model.clustersmgmt.v1.Group;

public class GroupsOperationImpl implements ClusterReadOnlyOperation<Group, ReadOnlyResource<Group>>, ReadOnlyResource<Group> {

  private final DefaultApi api;
  private final String clusterId;
  private final String id;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public GroupsOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null, null);
  }

  public GroupsOperationImpl(DefaultApi api, String clusterId, String id, String clause, String orderBy, Integer page, Integer size) {
    this.api = api;
    this.clusterId = clusterId;
    this.id = id;
    this.clause = clause;
    this.page = page;
    this.size = size;
    this.orderBy = orderBy;
  }

  @Override
  public ReadOnlyOperation<Group, ReadOnlyResource<Group>> inCluster(String clusterId) {
    return new GroupsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public ReadOnlyResource<Group> withName(String id) {
    return new GroupsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<Group> where(String clause) {
    return new GroupsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<Group> page(Integer page) {
    return new GroupsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<Group> size(Integer size) {
    return new GroupsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Find<Group> orderedBy(String attribute) {
    return new GroupsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public List<Group> find() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdGroupsGet(clusterId, page, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Group get() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdGroupsGroupIdGet(clusterId, id);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
