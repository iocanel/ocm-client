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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Representation of an add-on installation parameter. 
 */
@Schema(description = "Representation of an add-on installation parameter. ")

public class AddOnInstallationParameter {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("value")
  private String value = null;

  public AddOnInstallationParameter kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;AddOnInstallationParameter&#x27; if this is a complete object or &#x27;AddOnInstallationParameterLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'AddOnInstallationParameter' if this is a complete object or 'AddOnInstallationParameterLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AddOnInstallationParameter id(String id) {
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

  public AddOnInstallationParameter href(String href) {
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

  public AddOnInstallationParameter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the parameter. 
   * @return value
  **/
  @Schema(description = "Value of the parameter. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOnInstallationParameter addOnInstallationParameter = (AddOnInstallationParameter) o;
    return Objects.equals(this.kind, addOnInstallationParameter.kind) &&
        Objects.equals(this.id, addOnInstallationParameter.id) &&
        Objects.equals(this.href, addOnInstallationParameter.href) &&
        Objects.equals(this.value, addOnInstallationParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOnInstallationParameter {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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