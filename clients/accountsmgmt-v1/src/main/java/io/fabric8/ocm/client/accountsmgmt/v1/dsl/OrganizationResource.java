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

package io.fabric8.ocm.client.accountsmgmt.v1.dsl;

import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.ReadWriteResource;
import io.fabric8.ocm.dsl.Resource;
import io.fabric8.ocm.model.accountsmgmt.v1.Label;
import io.fabric8.ocm.model.accountsmgmt.v1.Organization;
import io.fabric8.ocm.model.accountsmgmt.v1.QuotaSummary;
import io.fabric8.ocm.model.accountsmgmt.v1.ResourceQuota;
import io.fabric8.ocm.model.accountsmgmt.v1.SummaryDashboard;

public interface OrganizationResource extends ReadWriteResource<Organization> {

  
  Operation<Label, Resource<Label>> labels();
  Operation<ResourceQuota, Resource<ResourceQuota>> resourceQuotas();
 
  QuotaSummary quotaSummary();
  SummaryDashboard summaryDashboard();
}
