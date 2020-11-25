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
import java.util.ArrayList;
import java.util.List;
/**
 * LDAP attributes used to configure the LDAP identity provider. 
 */
@Schema(description = "LDAP attributes used to configure the LDAP identity provider. ")

public class LDAPAttributes {
  @JsonProperty("id")
  private List<String> id = null;

  @JsonProperty("email")
  private List<String> email = null;

  @JsonProperty("name")
  private List<String> name = null;

  @JsonProperty("preferred_username")
  private List<String> preferredUsername = null;

  public LDAPAttributes id(List<String> id) {
    this.id = id;
    return this;
  }

  public LDAPAttributes addIdItem(String idItem) {
    if (this.id == null) {
      this.id = new ArrayList<>();
    }
    this.id.add(idItem);
    return this;
  }

   /**
   * List of attributes to use as the identity. 
   * @return id
  **/
  @Schema(description = "List of attributes to use as the identity. ")
  public List<String> getId() {
    return id;
  }

  public void setId(List<String> id) {
    this.id = id;
  }

  public LDAPAttributes email(List<String> email) {
    this.email = email;
    return this;
  }

  public LDAPAttributes addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * List of attributes to use as the mail address. 
   * @return email
  **/
  @Schema(description = "List of attributes to use as the mail address. ")
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }

  public LDAPAttributes name(List<String> name) {
    this.name = name;
    return this;
  }

  public LDAPAttributes addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of attributes to use as the display name. 
   * @return name
  **/
  @Schema(description = "List of attributes to use as the display name. ")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public LDAPAttributes preferredUsername(List<String> preferredUsername) {
    this.preferredUsername = preferredUsername;
    return this;
  }

  public LDAPAttributes addPreferredUsernameItem(String preferredUsernameItem) {
    if (this.preferredUsername == null) {
      this.preferredUsername = new ArrayList<>();
    }
    this.preferredUsername.add(preferredUsernameItem);
    return this;
  }

   /**
   * List of attributes to use as the preferred user name when provisioning a user. 
   * @return preferredUsername
  **/
  @Schema(description = "List of attributes to use as the preferred user name when provisioning a user. ")
  public List<String> getPreferredUsername() {
    return preferredUsername;
  }

  public void setPreferredUsername(List<String> preferredUsername) {
    this.preferredUsername = preferredUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LDAPAttributes ldAPAttributes = (LDAPAttributes) o;
    return Objects.equals(this.id, ldAPAttributes.id) &&
        Objects.equals(this.email, ldAPAttributes.email) &&
        Objects.equals(this.name, ldAPAttributes.name) &&
        Objects.equals(this.preferredUsername, ldAPAttributes.preferredUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, name, preferredUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredUsername: ").append(toIndentedString(preferredUsername)).append("\n");
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
