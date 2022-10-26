package org.wso2.apk.apimgt.rest.api.backoffice.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class APIMaxTpsDTO   {
  
    private Long production = null;
    private Long sandbox = null;

  /**
   **/
  public APIMaxTpsDTO production(Long production) {
    this.production = production;
    return this;
  }

  
  @ApiModelProperty(example = "1000", value = "")
  @JsonProperty("production")
  public Long getProduction() {
    return production;
  }
  public void setProduction(Long production) {
    this.production = production;
  }

  /**
   **/
  public APIMaxTpsDTO sandbox(Long sandbox) {
    this.sandbox = sandbox;
    return this;
  }

  
  @ApiModelProperty(example = "1000", value = "")
  @JsonProperty("sandbox")
  public Long getSandbox() {
    return sandbox;
  }
  public void setSandbox(Long sandbox) {
    this.sandbox = sandbox;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIMaxTpsDTO apIMaxTps = (APIMaxTpsDTO) o;
    return Objects.equals(production, apIMaxTps.production) &&
        Objects.equals(sandbox, apIMaxTps.sandbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(production, sandbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIMaxTpsDTO {\n");
    
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
