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
import io.fabric8.ocm.model.clustersmgmt.v1.AWSVolume;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Specification for different classes of nodes inside a flavour. 
 */
@Schema(description = "Specification for different classes of nodes inside a flavour. ")

public class AWSFlavour {
  @JsonProperty("compute_instance_type")
  private String computeInstanceType = null;

  @JsonProperty("infra_instance_type")
  private String infraInstanceType = null;

  @JsonProperty("infra_volume")
  private AWSVolume infraVolume = null;

  @JsonProperty("master_instance_type")
  private String masterInstanceType = null;

  @JsonProperty("master_volume")
  private AWSVolume masterVolume = null;

  @JsonProperty("worker_volume")
  private AWSVolume workerVolume = null;

  public AWSFlavour computeInstanceType(String computeInstanceType) {
    this.computeInstanceType = computeInstanceType;
    return this;
  }

   /**
   * AWS default instance type for the worker volume.  User can be overridden specifying in the cluster itself a type for compute node. 
   * @return computeInstanceType
  **/
  @Schema(description = "AWS default instance type for the worker volume.  User can be overridden specifying in the cluster itself a type for compute node. ")
  public String getComputeInstanceType() {
    return computeInstanceType;
  }

  public void setComputeInstanceType(String computeInstanceType) {
    this.computeInstanceType = computeInstanceType;
  }

  public AWSFlavour infraInstanceType(String infraInstanceType) {
    this.infraInstanceType = infraInstanceType;
    return this;
  }

   /**
   * AWS default instance type for the infra volume. 
   * @return infraInstanceType
  **/
  @Schema(description = "AWS default instance type for the infra volume. ")
  public String getInfraInstanceType() {
    return infraInstanceType;
  }

  public void setInfraInstanceType(String infraInstanceType) {
    this.infraInstanceType = infraInstanceType;
  }

  public AWSFlavour infraVolume(AWSVolume infraVolume) {
    this.infraVolume = infraVolume;
    return this;
  }

   /**
   * Get infraVolume
   * @return infraVolume
  **/
  @Schema(description = "")
  public AWSVolume getInfraVolume() {
    return infraVolume;
  }

  public void setInfraVolume(AWSVolume infraVolume) {
    this.infraVolume = infraVolume;
  }

  public AWSFlavour masterInstanceType(String masterInstanceType) {
    this.masterInstanceType = masterInstanceType;
    return this;
  }

   /**
   * AWS default instance type for the master volume. 
   * @return masterInstanceType
  **/
  @Schema(description = "AWS default instance type for the master volume. ")
  public String getMasterInstanceType() {
    return masterInstanceType;
  }

  public void setMasterInstanceType(String masterInstanceType) {
    this.masterInstanceType = masterInstanceType;
  }

  public AWSFlavour masterVolume(AWSVolume masterVolume) {
    this.masterVolume = masterVolume;
    return this;
  }

   /**
   * Get masterVolume
   * @return masterVolume
  **/
  @Schema(description = "")
  public AWSVolume getMasterVolume() {
    return masterVolume;
  }

  public void setMasterVolume(AWSVolume masterVolume) {
    this.masterVolume = masterVolume;
  }

  public AWSFlavour workerVolume(AWSVolume workerVolume) {
    this.workerVolume = workerVolume;
    return this;
  }

   /**
   * Get workerVolume
   * @return workerVolume
  **/
  @Schema(description = "")
  public AWSVolume getWorkerVolume() {
    return workerVolume;
  }

  public void setWorkerVolume(AWSVolume workerVolume) {
    this.workerVolume = workerVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSFlavour awSFlavour = (AWSFlavour) o;
    return Objects.equals(this.computeInstanceType, awSFlavour.computeInstanceType) &&
        Objects.equals(this.infraInstanceType, awSFlavour.infraInstanceType) &&
        Objects.equals(this.infraVolume, awSFlavour.infraVolume) &&
        Objects.equals(this.masterInstanceType, awSFlavour.masterInstanceType) &&
        Objects.equals(this.masterVolume, awSFlavour.masterVolume) &&
        Objects.equals(this.workerVolume, awSFlavour.workerVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeInstanceType, infraInstanceType, infraVolume, masterInstanceType, masterVolume, workerVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSFlavour {\n");
    
    sb.append("    computeInstanceType: ").append(toIndentedString(computeInstanceType)).append("\n");
    sb.append("    infraInstanceType: ").append(toIndentedString(infraInstanceType)).append("\n");
    sb.append("    infraVolume: ").append(toIndentedString(infraVolume)).append("\n");
    sb.append("    masterInstanceType: ").append(toIndentedString(masterInstanceType)).append("\n");
    sb.append("    masterVolume: ").append(toIndentedString(masterVolume)).append("\n");
    sb.append("    workerVolume: ").append(toIndentedString(workerVolume)).append("\n");
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
