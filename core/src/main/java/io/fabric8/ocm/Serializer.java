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

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public interface Serializer {

    public enum Kind {
        JSON,
        YAML,
        XML,
        CUSTOM;
    }

    /**
     * The {@link Serializer.Kind} of the serializer.
     * @return the kind.
     */
    Kind getKind();
        
    /**
     * Coverts an object to string.
     * @param object the input object
     * @return the string representation of the object
     */
    <T> String toString(T object);

    /**
     * Converts a string to an object.
     * @param str the input string
     * @param type the deserialization target
     * @return the object
     */
    <T> T fromString(String str, Class<T> type);

    /**
     * Read/deserialize an object of the specified type from the specified file
     * @param file the file to read
     * @param type the deserialization target
     * @return the deserialized object
     */ 
    <T> T read(File file, Class<T> type);

    /**
     * Read/deserialize an object of the specified type from the specified stream
     * @param is the {@link InputStream} to read
     * @param type the deserialization target
     * @return the deserialized object
     */ 
    <T> T read(InputStream is, Class<T> type);

    /**
     * Serialize/write the specified object to specified file
     * @param file the file to write
     * @param object the object to serialize
     */ 
    <T> void write(File file, T object);

    /**
     * Serialize/write the specified object to specified file
     * @param file the file to write
     * @param object the object to serialize
     */ 
    <T> void write(OutputStream out, T object);
}
