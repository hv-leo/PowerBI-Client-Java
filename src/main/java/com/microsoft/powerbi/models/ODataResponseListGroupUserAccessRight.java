package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.GroupUserAccessRight;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Odata response wrapper for a Power BI user Access Right for group List
 */
@ApiModel(description = "Odata response wrapper for a Power BI user Access Right for group List")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class ODataResponseListGroupUserAccessRight {
  @SerializedName("odata.context")
  private String odataContext = null;

  @SerializedName("value")
  private List<GroupUserAccessRight> value = null;

  public ODataResponseListGroupUserAccessRight odataContext(String odataContext) {
    this.odataContext = odataContext;
    return this;
  }

   /**
   * Get odataContext
   * @return odataContext
  **/
  @ApiModelProperty(value = "")
  public String getOdataContext() {
    return odataContext;
  }

  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  public ODataResponseListGroupUserAccessRight value(List<GroupUserAccessRight> value) {
    this.value = value;
    return this;
  }

  public ODataResponseListGroupUserAccessRight addValueItem(GroupUserAccessRight valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<GroupUserAccessRight>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * The user Access Right for group List
   * @return value
  **/
  @ApiModelProperty(value = "The user Access Right for group List")
  public List<GroupUserAccessRight> getValue() {
    return value;
  }

  public void setValue(List<GroupUserAccessRight> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ODataResponseListGroupUserAccessRight odataResponseListGroupUserAccessRight = (ODataResponseListGroupUserAccessRight) o;
    return Objects.equals(this.odataContext, odataResponseListGroupUserAccessRight.odataContext) &&
        Objects.equals(this.value, odataResponseListGroupUserAccessRight.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataResponseListGroupUserAccessRight {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

