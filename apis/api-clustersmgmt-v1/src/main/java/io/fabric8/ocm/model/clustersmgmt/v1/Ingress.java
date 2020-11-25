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
import io.fabric8.ocm.model.clustersmgmt.v1.Cluster;
import io.fabric8.ocm.model.clustersmgmt.v1.ListeningMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Representation of an ingress. 
 */
@Schema(description = "Representation of an ingress. ")

public class Ingress {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("dns_name")
  private String dnsName = null;

  @JsonProperty("cluster")
  private Cluster cluster = null;

  @JsonProperty("default")
  private Boolean _default = null;

  @JsonProperty("listening")
  private ListeningMethod listening = null;

  @JsonProperty("route_selectors")
  private Map<String, String> routeSelectors = null;

  public Ingress kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;Ingress&#x27; if this is a complete object or &#x27;IngressLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'Ingress' if this is a complete object or 'IngressLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Ingress id(String id) {
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

  public Ingress href(String href) {
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

  public Ingress dnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

   /**
   * DNS Name of the ingress. 
   * @return dnsName
  **/
  @Schema(description = "DNS Name of the ingress. ")
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }

  public Ingress cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public Ingress _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Indicates if this is the default ingress. 
   * @return _default
  **/
  @Schema(description = "Indicates if this is the default ingress. ")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public Ingress listening(ListeningMethod listening) {
    this.listening = listening;
    return this;
  }

   /**
   * Get listening
   * @return listening
  **/
  @Schema(description = "")
  public ListeningMethod getListening() {
    return listening;
  }

  public void setListening(ListeningMethod listening) {
    this.listening = listening;
  }

  public Ingress routeSelectors(Map<String, String> routeSelectors) {
    this.routeSelectors = routeSelectors;
    return this;
  }

  public Ingress putRouteSelectorsItem(String key, String routeSelectorsItem) {
    if (this.routeSelectors == null) {
      this.routeSelectors = new HashMap<>();
    }
    this.routeSelectors.put(key, routeSelectorsItem);
    return this;
  }

   /**
   * A set of labels for the ingress.  
   * @return routeSelectors
  **/
  @Schema(description = "A set of labels for the ingress.  ")
  public Map<String, String> getRouteSelectors() {
    return routeSelectors;
  }

  public void setRouteSelectors(Map<String, String> routeSelectors) {
    this.routeSelectors = routeSelectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ingress ingress = (Ingress) o;
    return Objects.equals(this.kind, ingress.kind) &&
        Objects.equals(this.id, ingress.id) &&
        Objects.equals(this.href, ingress.href) &&
        Objects.equals(this.dnsName, ingress.dnsName) &&
        Objects.equals(this.cluster, ingress.cluster) &&
        Objects.equals(this._default, ingress._default) &&
        Objects.equals(this.listening, ingress.listening) &&
        Objects.equals(this.routeSelectors, ingress.routeSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, dnsName, cluster, _default, listening, routeSelectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ingress {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    listening: ").append(toIndentedString(listening)).append("\n");
    sb.append("    routeSelectors: ").append(toIndentedString(routeSelectors)).append("\n");
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
