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

package io.fabric8.ocm.main;

import java.util.Map;

import io.fabric8.ocm.OcmConfig;
import io.fabric8.ocm.OpenID;

public class RefreshTokenMain {

  public static void main(String[] args) {
      OcmConfig config = OcmConfig.getConfig();
      //System.setProperty("jdk.httpclient.HttpClient.log", "all");
      System.out.printf("Refreshing token. Token URL: %s. Client ID:%s Client Secret:%s Refresh token:%s\n", config.getTokenUrl(), config.getClientId(), config.getClientSecret(), config.getRefreshToken());
      Map<String, Object> data = OpenID.refreshToken(config.getTokenUrl(), config.getClientId(), config.getClientSecret(), config.getRefreshToken()); 
      data.forEach((k,v) -> System.out.printf("%s=%s\n", k, v));
  }
}
