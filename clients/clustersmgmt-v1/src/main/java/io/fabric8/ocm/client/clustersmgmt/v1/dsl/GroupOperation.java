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

package io.fabric8.ocm.client.clustersmgmt.v1.dsl;

import io.fabric8.ocm.dsl.Operation;
import io.fabric8.ocm.dsl.Resource;

public interface GroupOperation<T,R extends Resource<T>> extends InCluster<InGroup<Operation<T, R>>>,
                                                                 InGroup<Operation<T,R>>,
                                                                 Operation<T, R>  {
}
