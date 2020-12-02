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
import io.fabric8.ocm.dsl.Find;
import io.fabric8.ocm.dsl.FindOrOrderedBy;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSize;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSizeOrPage;
import io.fabric8.ocm.dsl.ReadOnlyOperation;
import io.fabric8.ocm.dsl.ReadOnlyResource;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudProvider;

public class CloudProvidersOperationImpl implements ReadOnlyOperation<CloudProvider, ReadOnlyResource<CloudProvider>>, ReadOnlyResource<CloudProvider> {

  private final DefaultApi api;
  private final String name;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public CloudProvidersOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null);
  }

  public CloudProvidersOperationImpl(DefaultApi api, String name, String clause, String orderBy, Integer page, Integer size) {
    this.api = api;
    this.name = name;
    this.clause = clause;
    this.page = page;
    this.size = size;
    this.orderBy = orderBy;
  }

  @Override
  public ReadOnlyResource<CloudProvider> withName(String name) {
    return new CloudProvidersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<CloudProvider> where(String clause) {
    return new CloudProvidersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<CloudProvider> page(Integer page) {
    return new CloudProvidersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<CloudProvider> size(Integer size) {
    return new CloudProvidersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public Find<CloudProvider> orderedBy(String attribute) {
    return new CloudProvidersOperationImpl(api, name, clause, orderBy, page, size);
  }

  @Override
  public List<CloudProvider> find() {
    try {
      return api.apiClustersMgmtV1CloudProvidersGet(orderBy, page, clause, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public CloudProvider get() {
    try {
      return api.apiClustersMgmtV1CloudProvidersCloudProviderIdGet(name);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
