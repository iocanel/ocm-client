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

package io.fabric8.ocm;

import java.util.HashSet;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.stream.Collectors;

import io.fabric8.ocm.Serializer.Kind;

public class Serializers {

    private static final Set<Serializer> registry = new HashSet<>();

    static {
        ServiceLoader.load(Serializer.class, Serializers.class.getClassLoader()).forEach(b -> registry.add(b));
    }

    public static Optional<Serializer> getSerializer() {
        return  registry.stream().findFirst();
    }
    
    public static Set<Serializer> getSerializers() {
        return new HashSet<>(registry);
    }

    public static Set<Serializer> getSerializers(Kind kind) {
        return registry.stream().filter(s -> s.getKind() == kind).collect(Collectors.toSet());
    }

    public static Optional<Serializer> getSerializer(Serializer.Kind kind) {
        return registry.stream().filter(s -> s.getKind() == kind).findFirst();
    }

    public static synchronized void register(Serializer serializer) {
        registry.add(serializer);
    }

    public static synchronized void unregister(Serializer serializer) {
        registry.remove(serializer);
    }

    public static synchronized void unregister(String fqcn) {
        Set<Serializer> updated = registry.stream().filter(s -> !s.getClass().getName().equals(fqcn))
                .collect(Collectors.toSet());
        registry.clear();
        registry.addAll(updated);
    }


    public static RuntimeException noSerializerFound(Kind kind)  {
       return new IllegalStateException(String.format("No serializer found for:%s!", kind));
    }
}
