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
import io.fabric8.ocm.model.clustersmgmt.v1.Syncset;

public class SyncsetsOperationImpl implements ClusterOperation<Syncset, Resource<Syncset>>, ReadWriteResource<Syncset> {

  private final DefaultApi api;
  private final String clusterId;
  private final String id;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public SyncsetsOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null, null);
  }

  public SyncsetsOperationImpl(DefaultApi api, String clusterId, String id, String clause, String orderBy, Integer page,
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
  public Operation<Syncset, Resource<Syncset>> inCluster(String clusterId) {
    return new SyncsetsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Resource<Syncset> withName(String id) {
    return new SyncsetsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<Syncset> where(String clause) {
    return new SyncsetsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<Syncset> page(Integer page) {
    return new SyncsetsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<Syncset> size(Integer size) {
    return new SyncsetsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Find<Syncset> orderedBy(String attribute) {
    return new SyncsetsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public List<Syncset> find() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsGet(clusterId, page, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Syncset get() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdGet(clusterId, id);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public boolean delete() {
    try {
       api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdDelete(clusterId, id);
       return true;
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Syncset create(Syncset item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsPost(clusterId, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Syncset replace(Syncset item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationSyncsetsSyncsetIdPatch(clusterId, id, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
