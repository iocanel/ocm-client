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

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;
import static io.fabric8.ocm.Serializer.Kind.JSON;

public final class OpenID {

  public static final String ACCESS_TOKEN = "access_token";
  public static final String REFRESH_TOKEN = "refresh_token";
  public static final String GRANT_TYPE = "grant_type";
  public static final String CLIENT_ID = "client_id";
  public static final String CLIENT_SECRET = "client_secret";

  public static final String GRANT_TYPE_REFRESH_TOKEN = "refresh_token";

    
    private OpenID() {
        //Utility class
    }

  /**
   * Refresh the token from the OpenID Connect provider.
   * @param tokenUrl OpenID Connection provider's token refresh url
   * @param clientId client id
   * @param clientSecret client secret
   * @param refreshToken refresh token
   * @return that response data as a map
   */
    public static Map<String, Object> refreshToken(String tokenUrl, String clientId, String clientSecret, String refreshToken) {
        final Serializer serializer = Serializers.getSerializer(JSON).orElseThrow(() -> Serializers.noSerializerFound(JSON));

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
        .POST(formData(refreshTokenData(clientId, clientSecret, refreshToken)))
        .uri(URI.create(tokenUrl))
        .timeout(Duration.ofMinutes(2))
        .header("Content-Type", "application/x-www-form-urlencoded")
        .build();

         HttpResponse<String> response;
         try {
             response = client.send(request, BodyHandlers.ofString());
             return serializer.fromString(response.body(), Map.class);
         } catch (IOException | InterruptedException e) {
             throw OcmException.launderThrowable(e);
         }
  }

    public static Map<String, String> refreshTokenData(String clientId, String clientSecret, String refreshToken) {
        return new HashMap<String, String>(){{
            put(GRANT_TYPE, GRANT_TYPE_REFRESH_TOKEN);
            put(CLIENT_ID, clientId);
            put(CLIENT_SECRET, clientSecret);
            put(REFRESH_TOKEN, refreshToken);
        }};
    }

    public static HttpRequest.BodyPublisher formData(Map<String, String> data) {
        return BodyPublishers.ofString(data.entrySet().stream()
                                       .filter(e -> e.getValue() != null)
                                       .map(e -> URLEncoder.encode(e.getKey(), UTF_8) + "=" + URLEncoder.encode(e.getValue(), UTF_8)).collect(Collectors.joining("&")));
    }
}
