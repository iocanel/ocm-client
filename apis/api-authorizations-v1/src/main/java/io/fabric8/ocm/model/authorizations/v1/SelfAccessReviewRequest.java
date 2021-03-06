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

package io.fabric8.ocm.model.authorizations.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Representation of an access review performed against oneself 
 */
@Schema(description = "Representation of an access review performed against oneself ")

public class SelfAccessReviewRequest {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("cluster_id")
  private String clusterId = null;

  @JsonProperty("cluster_uuid")
  private String clusterUuid = null;

  @JsonProperty("organization_id")
  private String organizationId = null;

  @JsonProperty("resource_type")
  private String resourceType = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  public SelfAccessReviewRequest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Indicates the action, one of: [get,list,create,delete,update] 
   * @return action
  **/
  @Schema(description = "Indicates the action, one of: [get,list,create,delete,update] ")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public SelfAccessReviewRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Indicates which Cluster (internal id) the resource type belongs to 
   * @return clusterId
  **/
  @Schema(description = "Indicates which Cluster (internal id) the resource type belongs to ")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public SelfAccessReviewRequest clusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

   /**
   * Indicates which Cluster (external id) the resource type belongs to 
   * @return clusterUuid
  **/
  @Schema(description = "Indicates which Cluster (external id) the resource type belongs to ")
  public String getClusterUuid() {
    return clusterUuid;
  }

  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  public SelfAccessReviewRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Indicates which Organization the resource type belongs to 
   * @return organizationId
  **/
  @Schema(description = "Indicates which Organization the resource type belongs to ")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public SelfAccessReviewRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Indicates the type of the resource an action would be taken on. See uhc-account-manager/openapi/openapi.yaml for a list of possible values 
   * @return resourceType
  **/
  @Schema(description = "Indicates the type of the resource an action would be taken on. See uhc-account-manager/openapi/openapi.yaml for a list of possible values ")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public SelfAccessReviewRequest subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Indicates which Subscription the resource type belongs to 
   * @return subscriptionId
  **/
  @Schema(description = "Indicates which Subscription the resource type belongs to ")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfAccessReviewRequest selfAccessReviewRequest = (SelfAccessReviewRequest) o;
    return Objects.equals(this.action, selfAccessReviewRequest.action) &&
        Objects.equals(this.clusterId, selfAccessReviewRequest.clusterId) &&
        Objects.equals(this.clusterUuid, selfAccessReviewRequest.clusterUuid) &&
        Objects.equals(this.organizationId, selfAccessReviewRequest.organizationId) &&
        Objects.equals(this.resourceType, selfAccessReviewRequest.resourceType) &&
        Objects.equals(this.subscriptionId, selfAccessReviewRequest.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, clusterId, clusterUuid, organizationId, resourceType, subscriptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfAccessReviewRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
