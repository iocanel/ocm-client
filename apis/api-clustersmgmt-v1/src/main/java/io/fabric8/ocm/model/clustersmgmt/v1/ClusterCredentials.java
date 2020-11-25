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
import io.fabric8.ocm.model.clustersmgmt.v1.AdminCredentials;
import io.fabric8.ocm.model.clustersmgmt.v1.SSHCredentials;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Credentials of the a cluster. 
 */
@Schema(description = "Credentials of the a cluster. ")

public class ClusterCredentials {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("ssh")
  private SSHCredentials ssh = null;

  @JsonProperty("admin")
  private AdminCredentials admin = null;

  @JsonProperty("kubeconfig")
  private String kubeconfig = null;

  public ClusterCredentials kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;ClusterCredentials&#x27; if this is a complete object or &#x27;ClusterCredentialsLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'ClusterCredentials' if this is a complete object or 'ClusterCredentialsLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ClusterCredentials id(String id) {
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

  public ClusterCredentials href(String href) {
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

  public ClusterCredentials ssh(SSHCredentials ssh) {
    this.ssh = ssh;
    return this;
  }

   /**
   * Get ssh
   * @return ssh
  **/
  @Schema(description = "")
  public SSHCredentials getSsh() {
    return ssh;
  }

  public void setSsh(SSHCredentials ssh) {
    this.ssh = ssh;
  }

  public ClusterCredentials admin(AdminCredentials admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @Schema(description = "")
  public AdminCredentials getAdmin() {
    return admin;
  }

  public void setAdmin(AdminCredentials admin) {
    this.admin = admin;
  }

  public ClusterCredentials kubeconfig(String kubeconfig) {
    this.kubeconfig = kubeconfig;
    return this;
  }

   /**
   * Administrator _kubeconfig_ file for the cluster. 
   * @return kubeconfig
  **/
  @Schema(description = "Administrator _kubeconfig_ file for the cluster. ")
  public String getKubeconfig() {
    return kubeconfig;
  }

  public void setKubeconfig(String kubeconfig) {
    this.kubeconfig = kubeconfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCredentials clusterCredentials = (ClusterCredentials) o;
    return Objects.equals(this.kind, clusterCredentials.kind) &&
        Objects.equals(this.id, clusterCredentials.id) &&
        Objects.equals(this.href, clusterCredentials.href) &&
        Objects.equals(this.ssh, clusterCredentials.ssh) &&
        Objects.equals(this.admin, clusterCredentials.admin) &&
        Objects.equals(this.kubeconfig, clusterCredentials.kubeconfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, ssh, admin, kubeconfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCredentials {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    ssh: ").append(toIndentedString(ssh)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    kubeconfig: ").append(toIndentedString(kubeconfig)).append("\n");
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