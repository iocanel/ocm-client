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
import java.time.LocalDateTime;
/**
 * ReservedResource
 */


public class ReservedResource {
  @JsonProperty("byoc")
  private Boolean byoc = null;

  @JsonProperty("availability_zone_type")
  private String availabilityZoneType = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("created_at")
  private LocalDateTime createdAt = null;

  @JsonProperty("resource_name")
  private String resourceName = null;

  @JsonProperty("resource_type")
  private String resourceType = null;

  @JsonProperty("updated_at")
  private LocalDateTime updatedAt = null;

  public ReservedResource byoc(Boolean byoc) {
    this.byoc = byoc;
    return this;
  }

   /**
   * Get byoc
   * @return byoc
  **/
  @Schema(description = "")
  public Boolean isByoc() {
    return byoc;
  }

  public void setByoc(Boolean byoc) {
    this.byoc = byoc;
  }

  public ReservedResource availabilityZoneType(String availabilityZoneType) {
    this.availabilityZoneType = availabilityZoneType;
    return this;
  }

   /**
   * Get availabilityZoneType
   * @return availabilityZoneType
  **/
  @Schema(description = "")
  public String getAvailabilityZoneType() {
    return availabilityZoneType;
  }

  public void setAvailabilityZoneType(String availabilityZoneType) {
    this.availabilityZoneType = availabilityZoneType;
  }

  public ReservedResource count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ReservedResource createdAt(LocalDateTime createdAt) {
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

  public ReservedResource resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @Schema(description = "")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public ReservedResource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public ReservedResource updatedAt(LocalDateTime updatedAt) {
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
    ReservedResource reservedResource = (ReservedResource) o;
    return Objects.equals(this.byoc, reservedResource.byoc) &&
        Objects.equals(this.availabilityZoneType, reservedResource.availabilityZoneType) &&
        Objects.equals(this.count, reservedResource.count) &&
        Objects.equals(this.createdAt, reservedResource.createdAt) &&
        Objects.equals(this.resourceName, reservedResource.resourceName) &&
        Objects.equals(this.resourceType, reservedResource.resourceType) &&
        Objects.equals(this.updatedAt, reservedResource.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byoc, availabilityZoneType, count, createdAt, resourceName, resourceType, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedResource {\n");
    
    sb.append("    byoc: ").append(toIndentedString(byoc)).append("\n");
    sb.append("    availabilityZoneType: ").append(toIndentedString(availabilityZoneType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
