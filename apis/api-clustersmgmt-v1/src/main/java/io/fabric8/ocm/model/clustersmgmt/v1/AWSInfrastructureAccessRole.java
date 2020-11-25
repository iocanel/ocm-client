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
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRoleState;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * A set of acces permissions for AWS resources 
 */
@Schema(description = "A set of acces permissions for AWS resources ")

public class AWSInfrastructureAccessRole {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("state")
  private AWSInfrastructureAccessRoleState state = null;

  public AWSInfrastructureAccessRole kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;AWSInfrastructureAccessRole&#x27; if this is a complete object or &#x27;AWSInfrastructureAccessRoleLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'AWSInfrastructureAccessRole' if this is a complete object or 'AWSInfrastructureAccessRoleLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AWSInfrastructureAccessRole id(String id) {
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

  public AWSInfrastructureAccessRole href(String href) {
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

  public AWSInfrastructureAccessRole description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the role. 
   * @return description
  **/
  @Schema(description = "Description of the role. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AWSInfrastructureAccessRole displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Human friendly identifier of the role, for example &#x60;Read only&#x60;. 
   * @return displayName
  **/
  @Schema(description = "Human friendly identifier of the role, for example `Read only`. ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AWSInfrastructureAccessRole state(AWSInfrastructureAccessRoleState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public AWSInfrastructureAccessRoleState getState() {
    return state;
  }

  public void setState(AWSInfrastructureAccessRoleState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSInfrastructureAccessRole awSInfrastructureAccessRole = (AWSInfrastructureAccessRole) o;
    return Objects.equals(this.kind, awSInfrastructureAccessRole.kind) &&
        Objects.equals(this.id, awSInfrastructureAccessRole.id) &&
        Objects.equals(this.href, awSInfrastructureAccessRole.href) &&
        Objects.equals(this.description, awSInfrastructureAccessRole.description) &&
        Objects.equals(this.displayName, awSInfrastructureAccessRole.displayName) &&
        Objects.equals(this.state, awSInfrastructureAccessRole.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, description, displayName, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSInfrastructureAccessRole {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
