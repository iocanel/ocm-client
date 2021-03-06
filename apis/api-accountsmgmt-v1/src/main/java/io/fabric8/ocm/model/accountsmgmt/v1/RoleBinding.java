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
import io.fabric8.ocm.model.accountsmgmt.v1.Organization;
import io.fabric8.ocm.model.accountsmgmt.v1.Role;
import io.fabric8.ocm.model.accountsmgmt.v1.Subscription;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
/**
 * RoleBinding
 */


public class RoleBinding {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("config_managed")
  private Boolean configManaged = null;

  @JsonProperty("created_at")
  private LocalDateTime createdAt = null;

  @JsonProperty("organization")
  private Organization organization = null;

  @JsonProperty("organization_id")
  private String organizationId = null;

  @JsonProperty("role")
  private Role role = null;

  @JsonProperty("role_id")
  private String roleId = null;

  @JsonProperty("subscription")
  private Subscription subscription = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("updated_at")
  private LocalDateTime updatedAt = null;

  public RoleBinding kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;RoleBinding&#x27; if this is a complete object or &#x27;RoleBindingLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'RoleBinding' if this is a complete object or 'RoleBindingLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public RoleBinding id(String id) {
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

  public RoleBinding href(String href) {
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

  public RoleBinding account(Account account) {
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

  public RoleBinding accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public RoleBinding configManaged(Boolean configManaged) {
    this.configManaged = configManaged;
    return this;
  }

   /**
   * Get configManaged
   * @return configManaged
  **/
  @Schema(description = "")
  public Boolean isConfigManaged() {
    return configManaged;
  }

  public void setConfigManaged(Boolean configManaged) {
    this.configManaged = configManaged;
  }

  public RoleBinding createdAt(LocalDateTime createdAt) {
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

  public RoleBinding organization(Organization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @Schema(description = "")
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public RoleBinding organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @Schema(description = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public RoleBinding role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public RoleBinding roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @Schema(description = "")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public RoleBinding subscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @Schema(description = "")
  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public RoleBinding subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @Schema(description = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public RoleBinding type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RoleBinding updatedAt(LocalDateTime updatedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleBinding roleBinding = (RoleBinding) o;
    return Objects.equals(this.kind, roleBinding.kind) &&
        Objects.equals(this.id, roleBinding.id) &&
        Objects.equals(this.href, roleBinding.href) &&
        Objects.equals(this.account, roleBinding.account) &&
        Objects.equals(this.accountId, roleBinding.accountId) &&
        Objects.equals(this.configManaged, roleBinding.configManaged) &&
        Objects.equals(this.createdAt, roleBinding.createdAt) &&
        Objects.equals(this.organization, roleBinding.organization) &&
        Objects.equals(this.organizationId, roleBinding.organizationId) &&
        Objects.equals(this.role, roleBinding.role) &&
        Objects.equals(this.roleId, roleBinding.roleId) &&
        Objects.equals(this.subscription, roleBinding.subscription) &&
        Objects.equals(this.subscriptionId, roleBinding.subscriptionId) &&
        Objects.equals(this.type, roleBinding.type) &&
        Objects.equals(this.updatedAt, roleBinding.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, account, accountId, configManaged, createdAt, organization, organizationId, role, roleId, subscription, subscriptionId, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleBinding {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    configManaged: ").append(toIndentedString(configManaged)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
