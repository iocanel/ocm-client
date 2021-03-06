/*
 * authorizations
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.authorizations.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Representation of Red Hat&#x27;s Terms and Conditions for using OpenShift Dedicated and Amazon Red Hat OpenShift [Terms] review requests. 
 */
@Schema(description = "Representation of Red Hat's Terms and Conditions for using OpenShift Dedicated and Amazon Red Hat OpenShift [Terms] review requests. ")

public class TermsReviewRequest {
  @JsonProperty("account_username")
  private String accountUsername = null;

  public TermsReviewRequest accountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
    return this;
  }

   /**
   * Defines the username of the account of which Terms is being reviewed. 
   * @return accountUsername
  **/
  @Schema(description = "Defines the username of the account of which Terms is being reviewed. ")
  public String getAccountUsername() {
    return accountUsername;
  }

  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsReviewRequest termsReviewRequest = (TermsReviewRequest) o;
    return Objects.equals(this.accountUsername, termsReviewRequest.accountUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsReviewRequest {\n");
    
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
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
