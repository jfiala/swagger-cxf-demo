package io.swagger.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class HelloModel  {
  
  @ApiModelProperty(example = "null", value = "")
  private String name = null;
  @ApiModelProperty(example = "null", value = "")
  private String greeting = null;
  @ApiModelProperty(example = "null", value = "")
  private String firstName = null;

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get greeting
   * @return greeting
  **/
  public String getGreeting() {
    return greeting;
  }
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
 /**
   * Get firstName
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelloModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

