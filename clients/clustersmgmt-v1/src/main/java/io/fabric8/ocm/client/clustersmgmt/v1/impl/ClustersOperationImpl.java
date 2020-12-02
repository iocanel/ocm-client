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
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.ClusterResource;
import io.fabric8.ocm.dsl.Find;
import io.fabric8.ocm.dsl.FindOrOrderedBy;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSize;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSizeOrPage;
import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.ReadWriteResource;
import io.fabric8.ocm.dsl.Resource;
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterCredentials;
import io.fabric8.ocm.model.clustersmgmt.v1.ExternalConfiguration;
import io.fabric8.ocm.model.clustersmgmt.v1.Log;

public class ClustersOperationImpl implements Operation<Cluster, ClusterResource>, ClusterResource {

  private final DefaultApi api;
  private final String name;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public ClustersOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null);
  }

  public ClustersOperationImpl(DefaultApi api, String name, String clause, String orderBy, Integer page, Integer size) {
    this.api = api;
    this.name = name;
    this.clause = clause;
    this.page = page;
    this.size = size;
    this.orderBy = orderBy;
  }

  @Override
  public ClusterResource withName(String name) {
    return new ClustersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<Cluster> where(String clause) {
    return new ClustersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<Cluster> page(Integer page) {
    return new ClustersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<Cluster> size(Integer size) {
    return new ClustersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public Find<Cluster> orderedBy(String attribute) {
    return new ClustersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public List<Cluster> find() {
    try {
      return api.apiClustersMgmtV1ClustersGet(orderBy, page, clause, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Cluster create(Cluster item) {
    try {
      return api.apiClustersMgmtV1ClustersPost(item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Cluster replace(Cluster item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdPatch(item.getId(), item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Cluster get() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdGet(name);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public boolean delete() {
    try {
      api.apiClustersMgmtV1ClustersClusterIdDelete(name);
      return true;
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public ClusterCredentials clusterCredentials() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdCredentialsGet(name);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public ExternalConfiguration externalConfiguration() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdExternalConfigurationGet(name);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public List<Log> logs() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdLogsGet(name, page, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
  @Override
  public Log installLog() {
    return installLog(null, null);
  }

  @Override
  public Log installLog(Integer offset, Integer tail) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdLogsInstallGet(name, offset, tail);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public Log uninstallLog() {
    return uninstallLog(null, null);
  }
  
  @Override
  public Log uninstallLog(Integer offset, Integer tail) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdLogsUninstallGet(name, offset, tail);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
