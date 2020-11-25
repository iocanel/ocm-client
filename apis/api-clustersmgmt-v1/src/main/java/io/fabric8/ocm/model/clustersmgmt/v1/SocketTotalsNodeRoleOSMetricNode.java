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
import io.fabric8.ocm.model.clustersmgmt.v1.SocketTotalNodeRoleOSMetricNode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Representation of information from telemetry about the socket capacity by node role and OS of a cluster. 
 */
@Schema(description = "Representation of information from telemetry about the socket capacity by node role and OS of a cluster. ")

public class SocketTotalsNodeRoleOSMetricNode {
  @JsonProperty("socket_totals")
  private List<SocketTotalNodeRoleOSMetricNode> socketTotals = null;

  public SocketTotalsNodeRoleOSMetricNode socketTotals(List<SocketTotalNodeRoleOSMetricNode> socketTotals) {
    this.socketTotals = socketTotals;
    return this;
  }

  public SocketTotalsNodeRoleOSMetricNode addSocketTotalsItem(SocketTotalNodeRoleOSMetricNode socketTotalsItem) {
    if (this.socketTotals == null) {
      this.socketTotals = new ArrayList<>();
    }
    this.socketTotals.add(socketTotalsItem);
    return this;
  }

   /**
   * Get socketTotals
   * @return socketTotals
  **/
  @Schema(description = "")
  public List<SocketTotalNodeRoleOSMetricNode> getSocketTotals() {
    return socketTotals;
  }

  public void setSocketTotals(List<SocketTotalNodeRoleOSMetricNode> socketTotals) {
    this.socketTotals = socketTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocketTotalsNodeRoleOSMetricNode socketTotalsNodeRoleOSMetricNode = (SocketTotalsNodeRoleOSMetricNode) o;
    return Objects.equals(this.socketTotals, socketTotalsNodeRoleOSMetricNode.socketTotals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socketTotals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocketTotalsNodeRoleOSMetricNode {\n");
    
    sb.append("    socketTotals: ").append(toIndentedString(socketTotals)).append("\n");
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
