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
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.CloudProviderOperation;
import io.fabric8.ocm.dsl.Find;
import io.fabric8.ocm.dsl.FindOrOrderedBy;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSize;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSizeOrPage;
import io.fabric8.ocm.dsl.ReadOnlyOperation;
import io.fabric8.ocm.dsl.ReadOnlyResource;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudRegion;

public class CloudRegionsOperationImpl implements CloudProviderOperation<CloudRegion, ReadOnlyResource<CloudRegion>>, ReadOnlyResource<CloudRegion> {

  private final DefaultApi api;
  private final String cloudProviderId;
  private final String name;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public CloudRegionsOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null, null);
  }

  public CloudRegionsOperationImpl(DefaultApi api, String cloudProviderId, String name, String clause, String orderBy, Integer page, Integer size) {
    this.api = api;
    this.cloudProviderId = cloudProviderId;
    this.name = name;
    this.clause = clause;
    this.page = page;
    this.size = size;
    this.orderBy = orderBy;
  }
  @Override
  public ReadOnlyOperation<CloudRegion, ReadOnlyResource<CloudRegion>> ofCloudProvider(String cloudProviderId) {
    return new CloudRegionsOperationImpl(api, cloudProviderId, name, clause, orderBy, page, size);
  }

  @Override
  public ReadOnlyResource<CloudRegion> withName(String name) {
    return new CloudRegionsOperationImpl(api, cloudProviderId, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<CloudRegion> where(String clause) {
    return new CloudRegionsOperationImpl(api, cloudProviderId, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<CloudRegion> page(Integer page) {
    return new CloudRegionsOperationImpl(api, cloudProviderId, name, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<CloudRegion> size(Integer size) {
    return new CloudRegionsOperationImpl(api, cloudProviderId, name, clause, orderBy, page, size);
  }

  @Override
  public Find<CloudRegion> orderedBy(String attribute) {
    return new CloudRegionsOperationImpl(api, cloudProviderId, name, clause, orderBy, page, size);
  }

  @Override
  public List<CloudRegion> find() {
    try {
      return api.apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsGet(orderBy, page, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public CloudRegion get() {
    try {
      return api.apiClustersMgmtV1CloudProvidersCloudProviderIdRegionsRegionIdGet(cloudProviderId, name);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
