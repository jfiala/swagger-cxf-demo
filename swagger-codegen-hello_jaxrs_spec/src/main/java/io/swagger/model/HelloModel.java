package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class HelloModel   {
  
  private String name = null;
  private String greeting = null;
  private String firstName = null;

  /**
   **/
  public HelloModel name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public HelloModel greeting(String greeting) {
    this.greeting = greeting;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getGreeting() {
    return greeting;
  }
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  /**
   **/
  public HelloModel firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelloModel helloModel = (HelloModel) o;
    return Objects.equals(name, helloModel.name) &&
        Objects.equals(greeting, helloModel.greeting) &&
        Objects.equals(firstName, helloModel.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, greeting, firstName);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
