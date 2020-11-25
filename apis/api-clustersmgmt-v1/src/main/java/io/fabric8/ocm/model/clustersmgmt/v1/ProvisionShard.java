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
import io.fabric8.ocm.model.clustersmgmt.v1.ServerConfig;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Contains the properties of the provision shard, including AWS and GCP related configurations 
 */
@Schema(description = "Contains the properties of the provision shard, including AWS and GCP related configurations ")

public class ProvisionShard {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("aws_account_operator_config")
  private ServerConfig awsAccountOperatorConfig = null;

  @JsonProperty("aws_base_domain")
  private String awsBaseDomain = null;

  @JsonProperty("gcp_base_domain")
  private String gcpBaseDomain = null;

  @JsonProperty("gcp_project_operator")
  private ServerConfig gcpProjectOperator = null;

  @JsonProperty("hive_config")
  private ServerConfig hiveConfig = null;

  public ProvisionShard kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;ProvisionShard&#x27; if this is a complete object or &#x27;ProvisionShardLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'ProvisionShard' if this is a complete object or 'ProvisionShardLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ProvisionShard id(String id) {
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

  public ProvisionShard href(String href) {
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

  public ProvisionShard awsAccountOperatorConfig(ServerConfig awsAccountOperatorConfig) {
    this.awsAccountOperatorConfig = awsAccountOperatorConfig;
    return this;
  }

   /**
   * Get awsAccountOperatorConfig
   * @return awsAccountOperatorConfig
  **/
  @Schema(description = "")
  public ServerConfig getAwsAccountOperatorConfig() {
    return awsAccountOperatorConfig;
  }

  public void setAwsAccountOperatorConfig(ServerConfig awsAccountOperatorConfig) {
    this.awsAccountOperatorConfig = awsAccountOperatorConfig;
  }

  public ProvisionShard awsBaseDomain(String awsBaseDomain) {
    this.awsBaseDomain = awsBaseDomain;
    return this;
  }

   /**
   * Contains the AWS base domain 
   * @return awsBaseDomain
  **/
  @Schema(description = "Contains the AWS base domain ")
  public String getAwsBaseDomain() {
    return awsBaseDomain;
  }

  public void setAwsBaseDomain(String awsBaseDomain) {
    this.awsBaseDomain = awsBaseDomain;
  }

  public ProvisionShard gcpBaseDomain(String gcpBaseDomain) {
    this.gcpBaseDomain = gcpBaseDomain;
    return this;
  }

   /**
   * Contains the GCP base domain 
   * @return gcpBaseDomain
  **/
  @Schema(description = "Contains the GCP base domain ")
  public String getGcpBaseDomain() {
    return gcpBaseDomain;
  }

  public void setGcpBaseDomain(String gcpBaseDomain) {
    this.gcpBaseDomain = gcpBaseDomain;
  }

  public ProvisionShard gcpProjectOperator(ServerConfig gcpProjectOperator) {
    this.gcpProjectOperator = gcpProjectOperator;
    return this;
  }

   /**
   * Get gcpProjectOperator
   * @return gcpProjectOperator
  **/
  @Schema(description = "")
  public ServerConfig getGcpProjectOperator() {
    return gcpProjectOperator;
  }

  public void setGcpProjectOperator(ServerConfig gcpProjectOperator) {
    this.gcpProjectOperator = gcpProjectOperator;
  }

  public ProvisionShard hiveConfig(ServerConfig hiveConfig) {
    this.hiveConfig = hiveConfig;
    return this;
  }

   /**
   * Get hiveConfig
   * @return hiveConfig
  **/
  @Schema(description = "")
  public ServerConfig getHiveConfig() {
    return hiveConfig;
  }

  public void setHiveConfig(ServerConfig hiveConfig) {
    this.hiveConfig = hiveConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionShard provisionShard = (ProvisionShard) o;
    return Objects.equals(this.kind, provisionShard.kind) &&
        Objects.equals(this.id, provisionShard.id) &&
        Objects.equals(this.href, provisionShard.href) &&
        Objects.equals(this.awsAccountOperatorConfig, provisionShard.awsAccountOperatorConfig) &&
        Objects.equals(this.awsBaseDomain, provisionShard.awsBaseDomain) &&
        Objects.equals(this.gcpBaseDomain, provisionShard.gcpBaseDomain) &&
        Objects.equals(this.gcpProjectOperator, provisionShard.gcpProjectOperator) &&
        Objects.equals(this.hiveConfig, provisionShard.hiveConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, awsAccountOperatorConfig, awsBaseDomain, gcpBaseDomain, gcpProjectOperator, hiveConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionShard {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    awsAccountOperatorConfig: ").append(toIndentedString(awsAccountOperatorConfig)).append("\n");
    sb.append("    awsBaseDomain: ").append(toIndentedString(awsBaseDomain)).append("\n");
    sb.append("    gcpBaseDomain: ").append(toIndentedString(gcpBaseDomain)).append("\n");
    sb.append("    gcpProjectOperator: ").append(toIndentedString(gcpProjectOperator)).append("\n");
    sb.append("    hiveConfig: ").append(toIndentedString(hiveConfig)).append("\n");
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
