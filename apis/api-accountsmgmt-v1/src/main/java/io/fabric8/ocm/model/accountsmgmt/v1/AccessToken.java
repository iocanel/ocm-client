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
import io.fabric8.ocm.model.accountsmgmt.v1.AccessTokenAuth;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AccessToken
 */


public class AccessToken {
  @JsonProperty("auths")
  private Map<String, AccessTokenAuth> auths = null;

  public AccessToken auths(Map<String, AccessTokenAuth> auths) {
    this.auths = auths;
    return this;
  }

  public AccessToken putAuthsItem(String key, AccessTokenAuth authsItem) {
    if (this.auths == null) {
      this.auths = new HashMap<>();
    }
    this.auths.put(key, authsItem);
    return this;
  }

   /**
   * Get auths
   * @return auths
  **/
  @Schema(description = "")
  public Map<String, AccessTokenAuth> getAuths() {
    return auths;
  }

  public void setAuths(Map<String, AccessTokenAuth> auths) {
    this.auths = auths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.auths, accessToken.auths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
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
