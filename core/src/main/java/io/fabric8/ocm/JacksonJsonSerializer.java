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

package io.fabric8.ocm;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonSerializer implements Serializer {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Kind getKind() {
        return Kind.JSON;
    }

    @Override
    public <T> String toString(T object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw OcmException.launderThrowable(e);
        }
    }

    @Override
    public <T> T fromString(String str, Class<T> type) {
        try {
            return mapper.readValue(str, type);
        } catch (IOException e) {
            throw OcmException.launderThrowable(e);
        }
    }

    @Override
    public <T> T read(File file, Class<T> type) {
        try {
            return mapper.readValue(file, type);
        } catch (IOException e) {
            throw OcmException.launderThrowable(e);
        }
    }

    @Override
    public <T> T read(InputStream is, Class<T> type) {
        try {
            return mapper.readValue(is, type);
        } catch (IOException e) {
            throw OcmException.launderThrowable(e);
        }
    }

    @Override
    public <T> void write(File file, T object) {
        try {
            mapper.writeValue(file, object);
        } catch (IOException e) {
            throw OcmException.launderThrowable(e);
        }
    }

    @Override
    public <T> void write(OutputStream out, T object) {
        try {
            mapper.writeValue(out, object);
        } catch (IOException e) {
            throw OcmException.launderThrowable(e);
        }
    }
}
