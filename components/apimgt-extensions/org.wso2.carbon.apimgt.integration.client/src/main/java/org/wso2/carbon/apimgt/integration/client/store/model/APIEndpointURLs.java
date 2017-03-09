/**
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: 0.10.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.carbon.apimgt.integration.client.store.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * APIEndpointURLs
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T00:03:54.991+05:30")
public class APIEndpointURLs   {
  @JsonProperty("environmentName")
  private String environmentName = null;

  @JsonProperty("environmentType")
  private String environmentType = null;

  @JsonProperty("environmentURLs")
  private APIEnvironmentURLs environmentURLs = null;

  public APIEndpointURLs environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

   /**
   * Get environmentName
   * @return environmentName
  **/
  @ApiModelProperty(example = "Production and Sandbox", value = "")
  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public APIEndpointURLs environmentType(String environmentType) {
    this.environmentType = environmentType;
    return this;
  }

   /**
   * Get environmentType
   * @return environmentType
  **/
  @ApiModelProperty(example = "hybrid", value = "")
  public String getEnvironmentType() {
    return environmentType;
  }

  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  public APIEndpointURLs environmentURLs(APIEnvironmentURLs environmentURLs) {
    this.environmentURLs = environmentURLs;
    return this;
  }

   /**
   * Get environmentURLs
   * @return environmentURLs
  **/
  @ApiModelProperty(example = "null", value = "")
  public APIEnvironmentURLs getEnvironmentURLs() {
    return environmentURLs;
  }

  public void setEnvironmentURLs(APIEnvironmentURLs environmentURLs) {
    this.environmentURLs = environmentURLs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIEndpointURLs aPIEndpointURLs = (APIEndpointURLs) o;
    return Objects.equals(this.environmentName, aPIEndpointURLs.environmentName) &&
        Objects.equals(this.environmentType, aPIEndpointURLs.environmentType) &&
        Objects.equals(this.environmentURLs, aPIEndpointURLs.environmentURLs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, environmentType, environmentURLs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEndpointURLs {\n");

    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentType: ").append(toIndentedString(environmentType)).append("\n");
    sb.append("    environmentURLs: ").append(toIndentedString(environmentURLs)).append("\n");
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
