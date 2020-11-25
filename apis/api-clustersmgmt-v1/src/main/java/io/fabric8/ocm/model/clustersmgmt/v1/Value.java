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
 * Numeric value and the unit used to measure it.  Units are not mandatory, and they&#x27;re not specified for some resources. For resources that use bytes, the accepted units are:  - 1 B &#x3D; 1 byte - 1 KB &#x3D; 10^3 bytes - 1 MB &#x3D; 10^6 bytes - 1 GB &#x3D; 10^9 bytes - 1 TB &#x3D; 10^12 bytes - 1 PB &#x3D; 10^15 bytes  - 1 B &#x3D; 1 byte - 1 KiB &#x3D; 2^10 bytes - 1 MiB &#x3D; 2^20 bytes - 1 GiB &#x3D; 2^30 bytes - 1 TiB &#x3D; 2^40 bytes - 1 PiB &#x3D; 2^50 bytes 
 */
@Schema(description = "Numeric value and the unit used to measure it.  Units are not mandatory, and they're not specified for some resources. For resources that use bytes, the accepted units are:  - 1 B = 1 byte - 1 KB = 10^3 bytes - 1 MB = 10^6 bytes - 1 GB = 10^9 bytes - 1 TB = 10^12 bytes - 1 PB = 10^15 bytes  - 1 B = 1 byte - 1 KiB = 2^10 bytes - 1 MiB = 2^20 bytes - 1 GiB = 2^30 bytes - 1 TiB = 2^40 bytes - 1 PiB = 2^50 bytes ")

public class Value {
  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("value")
  private Float value = null;

  public Value unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Name of the unit used to measure the value. 
   * @return unit
  **/
  @Schema(description = "Name of the unit used to measure the value. ")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Value value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * Numeric value. 
   * @return value
  **/
  @Schema(description = "Numeric value. ")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
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
    Value value = (Value) o;
    return Objects.equals(this.unit, value.unit) &&
        Objects.equals(this.value, value.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
