/*
 * authorizations
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.generator.authorizations.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Representation of a capability review. 
 */
@Schema(description = "Representation of a capability review. ")

public class CapabilityReviewRequest {
  @JsonProperty("account_username")
  private String accountUsername = null;

  @JsonProperty("capability")
  private String capability = null;

  @JsonProperty("cluster_id")
  private String clusterId = null;

  @JsonProperty("organization_id")
  private String organizationId = null;

  @JsonProperty("resource_type")
  private String resourceType = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("type")
  private String type = null;

  public CapabilityReviewRequest accountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
    return this;
  }

   /**
   * Defines the username of the account of which capability is being reviewed. 
   * @return accountUsername
  **/
  @Schema(description = "Defines the username of the account of which capability is being reviewed. ")
  public String getAccountUsername() {
    return accountUsername;
  }

  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }

  public CapabilityReviewRequest capability(String capability) {
    this.capability = capability;
    return this;
  }

   /**
   * Capability to review [manage_cluster_admin]. 
   * @return capability
  **/
  @Schema(description = "Capability to review [manage_cluster_admin]. ")
  public String getCapability() {
    return capability;
  }

  public void setCapability(String capability) {
    this.capability = capability;
  }

  public CapabilityReviewRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Indicates which Cluster (internal id) the resource type belongs to. 
   * @return clusterId
  **/
  @Schema(description = "Indicates which Cluster (internal id) the resource type belongs to. ")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public CapabilityReviewRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Indicates which Organization the resource type belongs to. 
   * @return organizationId
  **/
  @Schema(description = "Indicates which Organization the resource type belongs to. ")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public CapabilityReviewRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Indicates the type of the resource. See uhc-account-manager/openapi/openapi.yaml for a list of possible values. 
   * @return resourceType
  **/
  @Schema(description = "Indicates the type of the resource. See uhc-account-manager/openapi/openapi.yaml for a list of possible values. ")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public CapabilityReviewRequest subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Indicates which Subscription the resource type belongs to. 
   * @return subscriptionId
  **/
  @Schema(description = "Indicates which Subscription the resource type belongs to. ")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public CapabilityReviewRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of capability [Cluster]. 
   * @return type
  **/
  @Schema(description = "Type of capability [Cluster]. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilityReviewRequest capabilityReviewRequest = (CapabilityReviewRequest) o;
    return Objects.equals(this.accountUsername, capabilityReviewRequest.accountUsername) &&
        Objects.equals(this.capability, capabilityReviewRequest.capability) &&
        Objects.equals(this.clusterId, capabilityReviewRequest.clusterId) &&
        Objects.equals(this.organizationId, capabilityReviewRequest.organizationId) &&
        Objects.equals(this.resourceType, capabilityReviewRequest.resourceType) &&
        Objects.equals(this.subscriptionId, capabilityReviewRequest.subscriptionId) &&
        Objects.equals(this.type, capabilityReviewRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUsername, capability, clusterId, organizationId, resourceType, subscriptionId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilityReviewRequest {\n");
    
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
