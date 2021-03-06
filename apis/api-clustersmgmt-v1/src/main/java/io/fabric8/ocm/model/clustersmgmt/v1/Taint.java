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
 * Representation of a Taint set on a MachinePool in a cluster. 
 */
@Schema(description = "Representation of a Taint set on a MachinePool in a cluster. ")

public class Taint {
  @JsonProperty("effect")
  private String effect = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public Taint effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * The effect on the node for the pods matching the taint, i.e: NoSchedule, NoExecute, PreferNoSchedule. 
   * @return effect
  **/
  @Schema(description = "The effect on the node for the pods matching the taint, i.e: NoSchedule, NoExecute, PreferNoSchedule. ")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public Taint key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key for the taint 
   * @return key
  **/
  @Schema(description = "The key for the taint ")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Taint value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value for the taint. 
   * @return value
  **/
  @Schema(description = "The value for the taint. ")
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
    Taint taint = (Taint) o;
    return Objects.equals(this.effect, taint.effect) &&
        Objects.equals(this.key, taint.key) &&
        Objects.equals(this.value, taint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taint {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
