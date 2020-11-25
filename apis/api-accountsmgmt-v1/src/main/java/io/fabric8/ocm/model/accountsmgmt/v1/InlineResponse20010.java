/*
 * accounts_mgmt
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.accountsmgmt.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.ocm.model.accountsmgmt.v1.RoleBinding;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20010
 */


public class InlineResponse20010 {
  @JsonProperty("items")
  private List<RoleBinding> items = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("total")
  private Integer total = null;

  public InlineResponse20010 items(List<RoleBinding> items) {
    this.items = items;
    return this;
  }

  public InlineResponse20010 addItemsItem(RoleBinding itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Retrieved list of role bindings. 
   * @return items
  **/
  @Schema(description = "Retrieved list of role bindings. ")
  public List<RoleBinding> getItems() {
    return items;
  }

  public void setItems(List<RoleBinding> items) {
    this.items = items;
  }

  public InlineResponse20010 page(Integer page) {
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

  public InlineResponse20010 size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Maximum number of items that will be contained in the returned page. 
   * @return size
  **/
  @Schema(description = "Maximum number of items that will be contained in the returned page. ")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public InlineResponse20010 total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items of the collection that match the search criteria, regardless of the size of the page. 
   * @return total
  **/
  @Schema(description = "Total number of items of the collection that match the search criteria, regardless of the size of the page. ")
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
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.items, inlineResponse20010.items) &&
        Objects.equals(this.page, inlineResponse20010.page) &&
        Objects.equals(this.size, inlineResponse20010.size) &&
        Objects.equals(this.total, inlineResponse20010.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, page, size, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
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
