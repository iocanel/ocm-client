/*
 * accounts_mgmt
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.accountsmgmt.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * TokenAuthorizationRequest
 */


public class TokenAuthorizationRequest {
  @JsonProperty("authorization_token")
  private String authorizationToken = null;

  public TokenAuthorizationRequest authorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
    return this;
  }

   /**
   * The pull secret of a given account 
   * @return authorizationToken
  **/
  @Schema(description = "The pull secret of a given account ")
  public String getAuthorizationToken() {
    return authorizationToken;
  }

  public void setAuthorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenAuthorizationRequest tokenAuthorizationRequest = (TokenAuthorizationRequest) o;
    return Objects.equals(this.authorizationToken, tokenAuthorizationRequest.authorizationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenAuthorizationRequest {\n");
    
    sb.append("    authorizationToken: ").append(toIndentedString(authorizationToken)).append("\n");
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
