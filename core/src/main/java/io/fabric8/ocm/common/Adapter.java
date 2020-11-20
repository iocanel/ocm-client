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

package io.fabric8.ocm.common;

public interface Adapter<C> {

    /**
       Gets the target type of the adapter.
     * @return The concrete class of the {@link Client}.
     */
    Class<C> getType();

    /**
     * Checks if it is possible to adapt. It checks that the requirements of the
     * target client are meet. 
     * 
     * @param client The instance of {@link Client} to adapt.
     * @return boolean value indicating whether client is adaptable or not.
     */
    Boolean isAdaptable(Client client);

    /**
     * The adapt function.
     *
     * @param client The instance of {@link Client} to adapt.
     * @return The instance of the {@link Client}.
     */
    C adapt(Client client);
}
