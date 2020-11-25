
package io.fabric8.ocm.client.clustersmgmt.v1.impl;

import java.util.List;

import io.fabric8.ocm.OcmException;
import io.fabric8.ocm.api.clustersmgmt.ApiException;
import io.fabric8.ocm.api.clustersmgmt.v1.DefaultApi;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.GroupOperation;
import io.fabric8.ocm.client.clustersmgmt.v1.dsl.InGroup;
import io.fabric8.ocm.dsl.Find;
import io.fabric8.ocm.dsl.FindOrOrderedBy;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSize;
import io.fabric8.ocm.dsl.FindOrOrderedByOrSizeOrPage;
import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.Resource;
import io.fabric8.ocm.model.clustersmgmt.v1.User;

public class UsersOperationImpl implements GroupOperation<User, Resource<User>>, Resource<User> {

  private final DefaultApi api;
  private final String clusterId;
  private final String groupId;
  private final String id;
  private final String clause;
  private final String orderBy;
  private final Integer page;
  private final Integer size;

  public UsersOperationImpl(DefaultApi api) {
    this(api, null, null, null, null, null, null, null);
  }

  public UsersOperationImpl(DefaultApi api, String clusterId, String groupId, String id, String clause, String orderBy, Integer page, Integer size) {
    this.api = api;
    this.clusterId = clusterId;
    this.groupId = groupId;
    this.id = id;
    this.clause = clause;
    this.page = page;
    this.size = size;
    this.orderBy = orderBy;
  }

  @Override
  public InGroup<Operation<User, Resource<User>>> inCluster(String clusterId) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }
  @Override
  public Operation<User, Resource<User>> inGroup(String group) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }

  @Override
  public Resource<User> withName(String name) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSizeOrPage<User> where(String clause) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedByOrSize<User> page(Integer page) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }

  @Override
  public FindOrOrderedBy<User> size(Integer size) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }

  @Override
  public Find<User> orderedBy(String orderBy) {
    return new UsersOperationImpl(api, clusterId, groupId, id, clause, orderBy, page, size);
  }

  @Override
  public List<User> find() {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersGet(clusterId, groupId, page, size).getItems();
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public User create(User item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersPost(clusterId, groupId, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }

  @Override
  public User replace(User item) {
    try {
      return api.apiClustersMgmtV1ClustersClusterIdGroupsGroupIdUsersPost(clusterId, groupId, item);
    } catch (ApiException e) {
      throw OcmException.launderThrowable(e);
    }
  }
}
