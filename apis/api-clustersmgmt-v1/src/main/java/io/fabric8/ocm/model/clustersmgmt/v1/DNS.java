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
 * DNS settings of the cluster. 
 */
@Schema(description = "DNS settings of the cluster. ")

public class DNS {
  @JsonProperty("base_domain")
  private String baseDomain = null;

  public DNS baseDomain(String baseDomain) {
    this.baseDomain = baseDomain;
    return this;
  }

   /**
   * Base DNS domain of the cluster.  During the installation of the cluster it is necessary to create multiple DNS records. They will be created as sub-domains of this domain. For example, if the name of the cluster is &#x60;mycluster&#x60; and the base domain is &#x60;example.com&#x60; then the following DNS records will be created:  &#x60;&#x60;&#x60; mycluster-api.example.com mycluster-etcd-0.example.com mycluster-etcd-1.example.com mycluster-etcd-3.example.com &#x60;&#x60;&#x60;  The exact number, type and names of the created DNS record depends on the characteristics of the cluster, and may be different for different versions of _OpenShift_. Please don&#x27;t rely on them. For example, to find what is the URL of the Kubernetes API server of the cluster don&#x27;t assume that it will be &#x60;mycluster-api.example.com&#x60;. Instead of that use this API to retrieve the description of the cluster, and get it from the &#x60;api.url&#x60; attribute. For example, if the identifier of the cluster is &#x60;123&#x60; send a request like this:   &#x60;&#x60;&#x60; GET /api/clusters_mgmt/v1/clusters/123 HTTP/1.1 &#x60;&#x60;&#x60;  That will return a response like this, including the &#x60;api.url&#x60; attribute:   &#x60;&#x60;&#x60; {     \&quot;kind\&quot;: \&quot;Cluster\&quot;,     \&quot;id\&quot;: \&quot;123\&quot;,     \&quot;href\&quot;: \&quot;/api/clusters_mgmt/v1/clusters/123\&quot;,         \&quot;api\&quot;: {         \&quot;url\&quot;: \&quot;https://mycluster-api.example.com:6443\&quot;     },     ... } &#x60;&#x60;&#x60;  When the cluster is created in Amazon Web Services it is necessary to create this base DNS domain in advance, using AWS Route53 (https://console.aws.amazon.com/route53). 
   * @return baseDomain
  **/
  @Schema(description = "Base DNS domain of the cluster.  During the installation of the cluster it is necessary to create multiple DNS records. They will be created as sub-domains of this domain. For example, if the name of the cluster is `mycluster` and the base domain is `example.com` then the following DNS records will be created:  ``` mycluster-api.example.com mycluster-etcd-0.example.com mycluster-etcd-1.example.com mycluster-etcd-3.example.com ```  The exact number, type and names of the created DNS record depends on the characteristics of the cluster, and may be different for different versions of _OpenShift_. Please don't rely on them. For example, to find what is the URL of the Kubernetes API server of the cluster don't assume that it will be `mycluster-api.example.com`. Instead of that use this API to retrieve the description of the cluster, and get it from the `api.url` attribute. For example, if the identifier of the cluster is `123` send a request like this:   ``` GET /api/clusters_mgmt/v1/clusters/123 HTTP/1.1 ```  That will return a response like this, including the `api.url` attribute:   ``` {     \"kind\": \"Cluster\",     \"id\": \"123\",     \"href\": \"/api/clusters_mgmt/v1/clusters/123\",         \"api\": {         \"url\": \"https://mycluster-api.example.com:6443\"     },     ... } ```  When the cluster is created in Amazon Web Services it is necessary to create this base DNS domain in advance, using AWS Route53 (https://console.aws.amazon.com/route53). ")
  public String getBaseDomain() {
    return baseDomain;
  }

  public void setBaseDomain(String baseDomain) {
    this.baseDomain = baseDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNS DNS = (DNS) o;
    return Objects.equals(this.baseDomain, DNS.baseDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNS {\n");
    
    sb.append("    baseDomain: ").append(toIndentedString(baseDomain)).append("\n");
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
