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
import io.fabric8.ocm.model.clustersmgmt.v1.CloudProvider;
import io.fabric8.ocm.model.clustersmgmt.v1.MachineTypeCategory;
import io.fabric8.ocm.model.clustersmgmt.v1.MachineTypeSize;
import io.fabric8.ocm.model.clustersmgmt.v1.Value;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Machine type. 
 */
@Schema(description = "Machine type. ")

public class MachineType {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cpu")
  private Value cpu = null;

  @JsonProperty("category")
  private MachineTypeCategory category = null;

  @JsonProperty("cloud_provider")
  private CloudProvider cloudProvider = null;

  @JsonProperty("memory")
  private Value memory = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private MachineTypeSize size = null;

  public MachineType kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;MachineType&#x27; if this is a complete object or &#x27;MachineTypeLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'MachineType' if this is a complete object or 'MachineTypeLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public MachineType id(String id) {
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

  public MachineType href(String href) {
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

  public MachineType cpu(Value cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @Schema(description = "")
  public Value getCpu() {
    return cpu;
  }

  public void setCpu(Value cpu) {
    this.cpu = cpu;
  }

  public MachineType category(MachineTypeCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public MachineTypeCategory getCategory() {
    return category;
  }

  public void setCategory(MachineTypeCategory category) {
    this.category = category;
  }

  public MachineType cloudProvider(CloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @Schema(description = "")
  public CloudProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public MachineType memory(Value memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public Value getMemory() {
    return memory;
  }

  public void setMemory(Value memory) {
    this.memory = memory;
  }

  public MachineType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human friendly identifier of the machine type, for example &#x60;r5.xlarge - Memory Optimized&#x60;. 
   * @return name
  **/
  @Schema(description = "Human friendly identifier of the machine type, for example `r5.xlarge - Memory Optimized`. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MachineType size(MachineTypeSize size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public MachineTypeSize getSize() {
    return size;
  }

  public void setSize(MachineTypeSize size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineType machineType = (MachineType) o;
    return Objects.equals(this.kind, machineType.kind) &&
        Objects.equals(this.id, machineType.id) &&
        Objects.equals(this.href, machineType.href) &&
        Objects.equals(this.cpu, machineType.cpu) &&
        Objects.equals(this.category, machineType.category) &&
        Objects.equals(this.cloudProvider, machineType.cloudProvider) &&
        Objects.equals(this.memory, machineType.memory) &&
        Objects.equals(this.name, machineType.name) &&
        Objects.equals(this.size, machineType.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, cpu, category, cloudProvider, memory, name, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineType {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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