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
 * SupportCaseRequest
 */


public class SupportCaseRequest {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cluster_id")
  private String clusterId = null;

  @JsonProperty("cluster_uuid")
  private String clusterUuid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("event_stream_id")
  private String eventStreamId = null;

  @JsonProperty("severity")
  private String severity = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("summary")
  private String summary = null;

  public SupportCaseRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;SupportCaseRequest&#x27; if this is a complete object or &#x27;SupportCaseRequestLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'SupportCaseRequest' if this is a complete object or 'SupportCaseRequestLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public SupportCaseRequest id(String id) {
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

  public SupportCaseRequest href(String href) {
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

  public SupportCaseRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * (optional) cluster id of the cluster on which we create the support case for. 
   * @return clusterId
  **/
  @Schema(description = "(optional) cluster id of the cluster on which we create the support case for. ")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public SupportCaseRequest clusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

   /**
   * (optional) cluster uuid of the cluster on which we create the support case for. 
   * @return clusterUuid
  **/
  @Schema(description = "(optional) cluster uuid of the cluster on which we create the support case for. ")
  public String getClusterUuid() {
    return clusterUuid;
  }

  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  public SupportCaseRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Support case desciption. 
   * @return description
  **/
  @Schema(description = "Support case desciption. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SupportCaseRequest eventStreamId(String eventStreamId) {
    this.eventStreamId = eventStreamId;
    return this;
  }

   /**
   * (optional) event stream id for the support case so we could track it. 
   * @return eventStreamId
  **/
  @Schema(description = "(optional) event stream id for the support case so we could track it. ")
  public String getEventStreamId() {
    return eventStreamId;
  }

  public void setEventStreamId(String eventStreamId) {
    this.eventStreamId = eventStreamId;
  }

  public SupportCaseRequest severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Support case severity. 
   * @return severity
  **/
  @Schema(description = "Support case severity. ")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public SupportCaseRequest subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * (optional) subscription id of the subscription on which we create the support case for. 
   * @return subscriptionId
  **/
  @Schema(description = "(optional) subscription id of the subscription on which we create the support case for. ")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SupportCaseRequest summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Support case title. 
   * @return summary
  **/
  @Schema(description = "Support case title. ")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCaseRequest supportCaseRequest = (SupportCaseRequest) o;
    return Objects.equals(this.kind, supportCaseRequest.kind) &&
        Objects.equals(this.id, supportCaseRequest.id) &&
        Objects.equals(this.href, supportCaseRequest.href) &&
        Objects.equals(this.clusterId, supportCaseRequest.clusterId) &&
        Objects.equals(this.clusterUuid, supportCaseRequest.clusterUuid) &&
        Objects.equals(this.description, supportCaseRequest.description) &&
        Objects.equals(this.eventStreamId, supportCaseRequest.eventStreamId) &&
        Objects.equals(this.severity, supportCaseRequest.severity) &&
        Objects.equals(this.subscriptionId, supportCaseRequest.subscriptionId) &&
        Objects.equals(this.summary, supportCaseRequest.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, clusterId, clusterUuid, description, eventStreamId, severity, subscriptionId, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCaseRequest {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventStreamId: ").append(toIndentedString(eventStreamId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
