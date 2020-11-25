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
import java.util.ArrayList;
import java.util.List;
/**
 * _Amazon Web Services_ specific settings of a cluster. 
 */
@Schema(description = "_Amazon Web Services_ specific settings of a cluster. ")

public class AWS {
  @JsonProperty("access_key_id")
  private String accessKeyId = null;

  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("secret_access_key")
  private String secretAccessKey = null;

  @JsonProperty("subnet_ids")
  private List<String> subnetIds = null;

  public AWS accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * AWS access key identifier. 
   * @return accessKeyId
  **/
  @Schema(description = "AWS access key identifier. ")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AWS accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * AWS account identifier. 
   * @return accountId
  **/
  @Schema(description = "AWS account identifier. ")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWS secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * AWS secret access key. 
   * @return secretAccessKey
  **/
  @Schema(description = "AWS secret access key. ")
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  public AWS subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public AWS addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * SubnetIDs are the subnet ids to be used when installing the cluster. 
   * @return subnetIds
  **/
  @Schema(description = "SubnetIDs are the subnet ids to be used when installing the cluster. ")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWS AWS = (AWS) o;
    return Objects.equals(this.accessKeyId, AWS.accessKeyId) &&
        Objects.equals(this.accountId, AWS.accountId) &&
        Objects.equals(this.secretAccessKey, AWS.secretAccessKey) &&
        Objects.equals(this.subnetIds, AWS.subnetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accountId, secretAccessKey, subnetIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWS {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
