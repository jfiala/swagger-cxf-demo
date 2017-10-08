package io.swagger.model;

import io.swagger.model.HelloModel;
import io.swagger.model.MediaTypes;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ExtendedHelloModel  {
  
  @ApiModelProperty(required = true, value = "name")
  private String name = null;
  @ApiModelProperty(value = "the full greeting")
  private String greeting = null;
  @ApiModelProperty(value = "first name")
  private String firstName = null;
  @ApiModelProperty(required = true, value = "root cause type")
  private MediaTypes rootCause = null;

 /**
   * name
   * @return name
  **/
  @NotNull
 @Pattern(regexp="/[a-z]/") @Size(min=1,max=255)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtendedHelloModel name(String name) {
    this.name = name;
    return this;
  }

 /**
   * the full greeting
   * @return greeting
  **/
  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public ExtendedHelloModel greeting(String greeting) {
    this.greeting = greeting;
    return this;
  }

 /**
   * first name
   * @return firstName
  **/
 @Size(min=1,max=255)  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ExtendedHelloModel firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * root cause type
   * @return rootCause
  **/
  @NotNull
  public MediaTypes getRootCause() {
    return rootCause;
  }

  public void setRootCause(MediaTypes rootCause) {
    this.rootCause = rootCause;
  }

  public ExtendedHelloModel rootCause(MediaTypes rootCause) {
    this.rootCause = rootCause;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedHelloModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

