/*
 * service_logs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.servicelogs.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.ocm.model.servicelogs.v1.Severity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
/**
 * LogEntry
 */


public class LogEntry {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cluster_uuid")
  private String clusterUuid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("internal_only")
  private Boolean internalOnly = null;

  @JsonProperty("service_name")
  private String serviceName = null;

  @JsonProperty("severity")
  private Severity severity = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("timestamp")
  private LocalDateTime timestamp = null;

  public LogEntry kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;LogEntry&#x27; if this is a complete object or &#x27;LogEntryLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'LogEntry' if this is a complete object or 'LogEntryLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public LogEntry id(String id) {
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

  public LogEntry href(String href) {
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

  public LogEntry clusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

   /**
   * External cluster ID. 
   * @return clusterUuid
  **/
  @Schema(description = "External cluster ID. ")
  public String getClusterUuid() {
    return clusterUuid;
  }

  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  public LogEntry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Full description of the log entry content (supports Markdown format as well). 
   * @return description
  **/
  @Schema(description = "Full description of the log entry content (supports Markdown format as well). ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LogEntry internalOnly(Boolean internalOnly) {
    this.internalOnly = internalOnly;
    return this;
  }

   /**
   * A flag that indicates whether the log entry should be internal/private only. 
   * @return internalOnly
  **/
  @Schema(description = "A flag that indicates whether the log entry should be internal/private only. ")
  public Boolean isInternalOnly() {
    return internalOnly;
  }

  public void setInternalOnly(Boolean internalOnly) {
    this.internalOnly = internalOnly;
  }

  public LogEntry serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * The name of the service who created the log. 
   * @return serviceName
  **/
  @Schema(description = "The name of the service who created the log. ")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public LogEntry severity(Severity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @Schema(description = "")
  public Severity getSeverity() {
    return severity;
  }

  public void setSeverity(Severity severity) {
    this.severity = severity;
  }

  public LogEntry summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Title of the log entry. 
   * @return summary
  **/
  @Schema(description = "Title of the log entry. ")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public LogEntry timestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogEntry logEntry = (LogEntry) o;
    return Objects.equals(this.kind, logEntry.kind) &&
        Objects.equals(this.id, logEntry.id) &&
        Objects.equals(this.href, logEntry.href) &&
        Objects.equals(this.clusterUuid, logEntry.clusterUuid) &&
        Objects.equals(this.description, logEntry.description) &&
        Objects.equals(this.internalOnly, logEntry.internalOnly) &&
        Objects.equals(this.serviceName, logEntry.serviceName) &&
        Objects.equals(this.severity, logEntry.severity) &&
        Objects.equals(this.summary, logEntry.summary) &&
        Objects.equals(this.timestamp, logEntry.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, clusterUuid, description, internalOnly, serviceName, severity, summary, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogEntry {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    internalOnly: ").append(toIndentedString(internalOnly)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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