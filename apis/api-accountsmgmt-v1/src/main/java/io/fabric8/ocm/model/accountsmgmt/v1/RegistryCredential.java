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
import io.fabric8.ocm.model.accountsmgmt.v1.Account;
import io.fabric8.ocm.model.accountsmgmt.v1.Registry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
/**
 * RegistryCredential
 */


public class RegistryCredential {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("created_at")
  private LocalDateTime createdAt = null;

  @JsonProperty("external_resource_id")
  private String externalResourceId = null;

  @JsonProperty("registry")
  private Registry registry = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("updated_at")
  private LocalDateTime updatedAt = null;

  @JsonProperty("username")
  private String username = null;

  public RegistryCredential kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;RegistryCredential&#x27; if this is a complete object or &#x27;RegistryCredentialLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'RegistryCredential' if this is a complete object or 'RegistryCredentialLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public RegistryCredential id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the object. 
   * @return id
  **/
  @Schema(description = "Unique identifier of the object. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegistryCredential href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Self link. 
   * @return href
  **/
  @Schema(description = "Self link. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RegistryCredential account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public RegistryCredential createdAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RegistryCredential externalResourceId(String externalResourceId) {
    this.externalResourceId = externalResourceId;
    return this;
  }

   /**
   * Get externalResourceId
   * @return externalResourceId
  **/
  @Schema(description = "")
  public String getExternalResourceId() {
    return externalResourceId;
  }

  public void setExternalResourceId(String externalResourceId) {
    this.externalResourceId = externalResourceId;
  }

  public RegistryCredential registry(Registry registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @Schema(description = "")
  public Registry getRegistry() {
    return registry;
  }

  public void setRegistry(Registry registry) {
    this.registry = registry;
  }

  public RegistryCredential token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(description = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public RegistryCredential updatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RegistryCredential username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryCredential registryCredential = (RegistryCredential) o;
    return Objects.equals(this.kind, registryCredential.kind) &&
        Objects.equals(this.id, registryCredential.id) &&
        Objects.equals(this.href, registryCredential.href) &&
        Objects.equals(this.account, registryCredential.account) &&
        Objects.equals(this.createdAt, registryCredential.createdAt) &&
        Objects.equals(this.externalResourceId, registryCredential.externalResourceId) &&
        Objects.equals(this.registry, registryCredential.registry) &&
        Objects.equals(this.token, registryCredential.token) &&
        Objects.equals(this.updatedAt, registryCredential.updatedAt) &&
        Objects.equals(this.username, registryCredential.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, account, createdAt, externalResourceId, registry, token, updatedAt, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryCredential {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    externalResourceId: ").append(toIndentedString(externalResourceId)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
