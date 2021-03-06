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
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRole;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRoleGrantState;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Representation of an AWS infrastructure access role grant. 
 */
@Schema(description = "Representation of an AWS infrastructure access role grant. ")

public class AWSInfrastructureAccessRoleGrant {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("console_url")
  private String consoleUrl = null;

  @JsonProperty("role")
  private AWSInfrastructureAccessRole role = null;

  @JsonProperty("state")
  private AWSInfrastructureAccessRoleGrantState state = null;

  @JsonProperty("state_description")
  private String stateDescription = null;

  @JsonProperty("user_arn")
  private String userArn = null;

  public AWSInfrastructureAccessRoleGrant kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;AWSInfrastructureAccessRoleGrant&#x27; if this is a complete object or &#x27;AWSInfrastructureAccessRoleGrantLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'AWSInfrastructureAccessRoleGrant' if this is a complete object or 'AWSInfrastructureAccessRoleGrantLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AWSInfrastructureAccessRoleGrant id(String id) {
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

  public AWSInfrastructureAccessRoleGrant href(String href) {
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

  public AWSInfrastructureAccessRoleGrant consoleUrl(String consoleUrl) {
    this.consoleUrl = consoleUrl;
    return this;
  }

   /**
   * URL to switch to the role in AWS console. 
   * @return consoleUrl
  **/
  @Schema(description = "URL to switch to the role in AWS console. ")
  public String getConsoleUrl() {
    return consoleUrl;
  }

  public void setConsoleUrl(String consoleUrl) {
    this.consoleUrl = consoleUrl;
  }

  public AWSInfrastructureAccessRoleGrant role(AWSInfrastructureAccessRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public AWSInfrastructureAccessRole getRole() {
    return role;
  }

  public void setRole(AWSInfrastructureAccessRole role) {
    this.role = role;
  }

  public AWSInfrastructureAccessRoleGrant state(AWSInfrastructureAccessRoleGrantState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public AWSInfrastructureAccessRoleGrantState getState() {
    return state;
  }

  public void setState(AWSInfrastructureAccessRoleGrantState state) {
    this.state = state;
  }

  public AWSInfrastructureAccessRoleGrant stateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

   /**
   * Description of the state. Will be empty unless state is &#x27;Failed&#x27;. 
   * @return stateDescription
  **/
  @Schema(description = "Description of the state. Will be empty unless state is 'Failed'. ")
  public String getStateDescription() {
    return stateDescription;
  }

  public void setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
  }

  public AWSInfrastructureAccessRoleGrant userArn(String userArn) {
    this.userArn = userArn;
    return this;
  }

   /**
   * The user AWS IAM ARN we want to grant the role. 
   * @return userArn
  **/
  @Schema(description = "The user AWS IAM ARN we want to grant the role. ")
  public String getUserArn() {
    return userArn;
  }

  public void setUserArn(String userArn) {
    this.userArn = userArn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSInfrastructureAccessRoleGrant awSInfrastructureAccessRoleGrant = (AWSInfrastructureAccessRoleGrant) o;
    return Objects.equals(this.kind, awSInfrastructureAccessRoleGrant.kind) &&
        Objects.equals(this.id, awSInfrastructureAccessRoleGrant.id) &&
        Objects.equals(this.href, awSInfrastructureAccessRoleGrant.href) &&
        Objects.equals(this.consoleUrl, awSInfrastructureAccessRoleGrant.consoleUrl) &&
        Objects.equals(this.role, awSInfrastructureAccessRoleGrant.role) &&
        Objects.equals(this.state, awSInfrastructureAccessRoleGrant.state) &&
        Objects.equals(this.stateDescription, awSInfrastructureAccessRoleGrant.stateDescription) &&
        Objects.equals(this.userArn, awSInfrastructureAccessRoleGrant.userArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, consoleUrl, role, state, stateDescription, userArn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSInfrastructureAccessRoleGrant {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    consoleUrl: ").append(toIndentedString(consoleUrl)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDescription: ").append(toIndentedString(stateDescription)).append("\n");
    sb.append("    userArn: ").append(toIndentedString(userArn)).append("\n");
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
