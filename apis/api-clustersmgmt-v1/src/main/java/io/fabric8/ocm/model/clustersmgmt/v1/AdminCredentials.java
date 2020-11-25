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
 * Temporary administrator credentials generated during the installation of the cluster. 
 */
@Schema(description = "Temporary administrator credentials generated during the installation of the cluster. ")

public class AdminCredentials {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("user")
  private String user = null;

  public AdminCredentials password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Cluster administrator password. 
   * @return password
  **/
  @Schema(description = "Cluster administrator password. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AdminCredentials user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Cluster administrator user name. 
   * @return user
  **/
  @Schema(description = "Cluster administrator user name. ")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCredentials adminCredentials = (AdminCredentials) o;
    return Objects.equals(this.password, adminCredentials.password) &&
        Objects.equals(this.user, adminCredentials.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCredentials {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
