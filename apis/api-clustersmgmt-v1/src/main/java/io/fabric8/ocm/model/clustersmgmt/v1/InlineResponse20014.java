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
import io.fabric8.ocm.model.clustersmgmt.v1.Log;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20014
 */


public class InlineResponse20014 {
  @JsonProperty("items")
  private List<Log> items = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("total")
  private Integer total = null;

  public InlineResponse20014 items(List<Log> items) {
    this.items = items;
    return this;
  }

  public InlineResponse20014 addItemsItem(Log itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Retrieved list of log links. 
   * @return items
  **/
  @Schema(description = "Retrieved list of log links. ")
  public List<Log> getItems() {
    return items;
  }

  public void setItems(List<Log> items) {
    this.items = items;
  }

  public InlineResponse20014 page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Index of the requested page, where one corresponds to the first page. 
   * @return page
  **/
  @Schema(description = "Index of the requested page, where one corresponds to the first page. ")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public InlineResponse20014 size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Number of items contained in the returned page. 
   * @return size
  **/
  @Schema(description = "Number of items contained in the returned page. ")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public InlineResponse20014 total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items of the collection. 
   * @return total
  **/
  @Schema(description = "Total number of items of the collection. ")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.items, inlineResponse20014.items) &&
        Objects.equals(this.page, inlineResponse20014.page) &&
        Objects.equals(this.size, inlineResponse20014.size) &&
        Objects.equals(this.total, inlineResponse20014.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, page, size, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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