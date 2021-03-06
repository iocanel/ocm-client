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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Representation of an add-on parameter. 
 */
@Schema(description = "Representation of an add-on parameter. ")

public class AddOnParameter {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("addon")
  private AddOn addon = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("validation")
  private String validation = null;

  @JsonProperty("value_type")
  private String valueType = null;

  public AddOnParameter kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;AddOnParameter&#x27; if this is a complete object or &#x27;AddOnParameterLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'AddOnParameter' if this is a complete object or 'AddOnParameterLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AddOnParameter id(String id) {
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

  public AddOnParameter href(String href) {
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

  public AddOnParameter addon(AddOn addon) {
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

  public AddOnParameter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the add-on parameter. 
   * @return description
  **/
  @Schema(description = "Description of the add-on parameter. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AddOnParameter editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Indicates if this parameter can be edited after creation. 
   * @return editable
  **/
  @Schema(description = "Indicates if this parameter can be edited after creation. ")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public AddOnParameter enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates if this parameter is enabled for the add-on. 
   * @return enabled
  **/
  @Schema(description = "Indicates if this parameter is enabled for the add-on. ")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AddOnParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the add-on parameter. 
   * @return name
  **/
  @Schema(description = "Name of the add-on parameter. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddOnParameter required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Indicates if this parameter is required by the add-on. 
   * @return required
  **/
  @Schema(description = "Indicates if this parameter is required by the add-on. ")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public AddOnParameter validation(String validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Validation rule for the add-on parameter. 
   * @return validation
  **/
  @Schema(description = "Validation rule for the add-on parameter. ")
  public String getValidation() {
    return validation;
  }

  public void setValidation(String validation) {
    this.validation = validation;
  }

  public AddOnParameter valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Type of value of the add-on parameter. 
   * @return valueType
  **/
  @Schema(description = "Type of value of the add-on parameter. ")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOnParameter addOnParameter = (AddOnParameter) o;
    return Objects.equals(this.kind, addOnParameter.kind) &&
        Objects.equals(this.id, addOnParameter.id) &&
        Objects.equals(this.href, addOnParameter.href) &&
        Objects.equals(this.addon, addOnParameter.addon) &&
        Objects.equals(this.description, addOnParameter.description) &&
        Objects.equals(this.editable, addOnParameter.editable) &&
        Objects.equals(this.enabled, addOnParameter.enabled) &&
        Objects.equals(this.name, addOnParameter.name) &&
        Objects.equals(this.required, addOnParameter.required) &&
        Objects.equals(this.validation, addOnParameter.validation) &&
        Objects.equals(this.valueType, addOnParameter.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, addon, description, editable, enabled, name, required, validation, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOnParameter {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
