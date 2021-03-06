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
import io.fabric8.ocm.model.clustersmgmt.v1.Label;

public class LabelsOperationImpl implements ClusterOperation<Label, Resource<Label>>, ReadWriteResource<Label> {

  private final DefaultApi api;
  private final String clusterId;
  private final String id;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public LabelsOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null, null);
  }

  public LabelsOperationImpl(DefaultApi api, String clusterId, String id, String clause, String orderBy, Integer page,
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
  public Operation<Label, Resource<Label>> inCluster(String clusterId) {
    return new LabelsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Resource<Label> withName(String id) {
    return new LabelsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<Label> where(String clause) {
    return new LabelsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<Label> page(Integer page) {
    return new LabelsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<Label> size(Integer size) {
    return new LabelsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public Find<Label> orderedBy(String attribute) {
    return new LabelsOperationImpl(api, clusterId, id, clause, orderBy, page, size);
  }

  @Override
  public List<Label> find() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsGet(clusterId, page, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Label get() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdGet(clusterId, id);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public boolean delete() {
    try {
       api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdDelete(clusterId, id);
       return true;
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Label create(Label item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsPost(clusterId, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Label replace(Label item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationLabelsLabelIdPatch(clusterId, id, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
