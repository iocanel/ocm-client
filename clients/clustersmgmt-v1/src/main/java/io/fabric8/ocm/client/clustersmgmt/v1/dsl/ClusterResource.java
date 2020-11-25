
package io.fabric8.ocm.client.clustersmgmt.v1.dsl;

import java.util.List;

import io.fabric8.ocm.dsl.ReadWriteResource;
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterCredentials;
import io.fabric8.ocm.model.clustersmgmt.v1.ExternalConfiguration;
import io.fabric8.ocm.model.clustersmgmt.v1.Log;

public interface ClusterResource extends ReadWriteResource<Cluster> {

  ClusterCredentials clusterCredentials();
  ExternalConfiguration externalConfiguration();

  List<Log> logs();

  Log installLog();
  Log installLog(Integer offset, Integer tail);

  Log uninstallLog();
  Log uninstallLog(Integer offset, Integer tail);

}
