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
import io.fabric8.ocm.model.clustersmgmt.v1.AddOn;
import io.fabric8.ocm.model.clustersmgmt.v1.AddOnInstallationParameter;
import io.fabric8.ocm.model.clustersmgmt.v1.AddOnInstallationState;
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Representation of an add-on installation in a cluster. 
 */
@Schema(description = "Representation of an add-on installation in a cluster. ")

public class AddOnInstallation {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("addon")
  private AddOn addon = null;

  @JsonProperty("cluster")
  private Cluster cluster = null;

  @JsonProperty("creation_timestamp")
  private LocalDateTime creationTimestamp = null;

  @JsonProperty("operator_version")
  private String operatorVersion = null;

  @JsonProperty("parameters")
  private List<AddOnInstallationParameter> parameters = null;

  @JsonProperty("state")
  private AddOnInstallationState state = null;

  @JsonProperty("state_description")
  private String stateDescription = null;

  @JsonProperty("updated_timestamp")
  private LocalDateTime updatedTimestamp = null;

  public AddOnInstallation kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;AddOnInstallation&#x27; if this is a complete object or &#x27;AddOnInstallationLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'AddOnInstallation' if this is a complete object or 'AddOnInstallationLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AddOnInstallation id(String id) {
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

  public AddOnInstallation href(String href) {
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

  public AddOnInstallation addon(AddOn addon) {
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @Schema(description = "")
  public AddOn getAddon() {
    return addon;
  }

  public void setAddon(AddOn addon) {
    this.addon = addon;
  }

  public AddOnInstallation cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public AddOnInstallation creationTimestamp(LocalDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Date and time when the add-on was initially installed in the cluster. 
   * @return creationTimestamp
  **/
  @Schema(description = "Date and time when the add-on was initially installed in the cluster. ")
  public LocalDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(LocalDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public AddOnInstallation operatorVersion(String operatorVersion) {
    this.operatorVersion = operatorVersion;
    return this;
  }

   /**
   * Version of the operator installed by the add-on. 
   * @return operatorVersion
  **/
  @Schema(description = "Version of the operator installed by the add-on. ")
  public String getOperatorVersion() {
    return operatorVersion;
  }

  public void setOperatorVersion(String operatorVersion) {
    this.operatorVersion = operatorVersion;
  }

  public AddOnInstallation parameters(List<AddOnInstallationParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AddOnInstallation addParametersItem(AddOnInstallationParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * List of add-on parameters for this add-on installation. 
   * @return parameters
  **/
  @Schema(description = "List of add-on parameters for this add-on installation. ")
  public List<AddOnInstallationParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<AddOnInstallationParameter> parameters) {
    this.parameters = parameters;
  }

  public AddOnInstallation state(AddOnInstallationState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public AddOnInstallationState getState() {
    return state;
  }

  public void setState(AddOnInstallationState state) {
    this.state = state;
  }

  public AddOnInstallation stateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

   /**
   * Reason for the current State. 
   * @return stateDescription
  **/
  @Schema(description = "Reason for the current State. ")
  public String getStateDescription() {
    return stateDescription;
  }

  public void setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
  }

  public AddOnInstallation updatedTimestamp(LocalDateTime updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * Date and time when the add-on installation information was last updated. 
   * @return updatedTimestamp
  **/
  @Schema(description = "Date and time when the add-on installation information was last updated. ")
  public LocalDateTime getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOnInstallation addOnInstallation = (AddOnInstallation) o;
    return Objects.equals(this.kind, addOnInstallation.kind) &&
        Objects.equals(this.id, addOnInstallation.id) &&
        Objects.equals(this.href, addOnInstallation.href) &&
        Objects.equals(this.addon, addOnInstallation.addon) &&
        Objects.equals(this.cluster, addOnInstallation.cluster) &&
        Objects.equals(this.creationTimestamp, addOnInstallation.creationTimestamp) &&
        Objects.equals(this.operatorVersion, addOnInstallation.operatorVersion) &&
        Objects.equals(this.parameters, addOnInstallation.parameters) &&
        Objects.equals(this.state, addOnInstallation.state) &&
        Objects.equals(this.stateDescription, addOnInstallation.stateDescription) &&
        Objects.equals(this.updatedTimestamp, addOnInstallation.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, addon, cluster, creationTimestamp, operatorVersion, parameters, state, stateDescription, updatedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOnInstallation {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    operatorVersion: ").append(toIndentedString(operatorVersion)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDescription: ").append(toIndentedString(stateDescription)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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