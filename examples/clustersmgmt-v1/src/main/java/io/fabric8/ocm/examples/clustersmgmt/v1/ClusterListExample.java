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

package io.fabric8.ocm.examples.clustersmgmt.v1;

import java.util.List;

import io.fabric8.ocm.OcmConfig;
import io.fabric8.ocm.client.clustersmgmt.v1.DefaultClustersMgmgtClient;
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;

public class ClusterListExample {

  public static void main(String[] args) {

    DefaultClustersMgmgtClient client = new DefaultClustersMgmgtClient(OcmConfig.getConfig());
    List<Cluster> clusters = client.clusters().find();
    client.clusters().where("name like my-%").
    if (clusters.isEmpty()) {
      System.out.println("No clusters found!");
    } else {
      clusters.forEach(c -> System.out.println(c.getName()));
    }
  }
}
