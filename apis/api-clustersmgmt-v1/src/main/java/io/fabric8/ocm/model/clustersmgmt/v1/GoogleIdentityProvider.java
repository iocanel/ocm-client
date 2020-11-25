/*
 * clusters_mgmt
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.clustersmgmt.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Details for &#x60;google&#x60; identity providers. 
 */
@Schema(description = "Details for `google` identity providers. ")

public class GoogleIdentityProvider {
  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("client_secret")
  private String clientSecret = null;

  @JsonProperty("hosted_domain")
  private String hostedDomain = null;

  public GoogleIdentityProvider clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client identifier of a registered _Google_ project. 
   * @return clientId
  **/
  @Schema(description = "Client identifier of a registered _Google_ project. ")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public GoogleIdentityProvider clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client secret issued by _Google_. 
   * @return clientSecret
  **/
  @Schema(description = "Client secret issued by _Google_. ")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public GoogleIdentityProvider hostedDomain(String hostedDomain) {
    this.hostedDomain = hostedDomain;
    return this;
  }

   /**
   * Optional hosted domain to restrict sign-in accounts to. 
   * @return hostedDomain
  **/
  @Schema(description = "Optional hosted domain to restrict sign-in accounts to. ")
  public String getHostedDomain() {
    return hostedDomain;
  }

  public void setHostedDomain(String hostedDomain) {
    this.hostedDomain = hostedDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleIdentityProvider googleIdentityProvider = (GoogleIdentityProvider) o;
    return Objects.equals(this.clientId, googleIdentityProvider.clientId) &&
        Objects.equals(this.clientSecret, googleIdentityProvider.clientSecret) &&
        Objects.equals(this.hostedDomain, googleIdentityProvider.hostedDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, hostedDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleIdentityProvider {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    hostedDomain: ").append(toIndentedString(hostedDomain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
