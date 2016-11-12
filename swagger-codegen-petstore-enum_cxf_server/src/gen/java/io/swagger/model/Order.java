package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.StatusExt;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="An order for a pets from the pet store")
public class Order  {
  
  @ApiModelProperty(example = "null", value = "")
  private Long id = null;
  @ApiModelProperty(example = "null", value = "")
  private Long petId = null;
  @ApiModelProperty(example = "null", value = "")
  private Integer quantity = null;
  @ApiModelProperty(example = "null", value = "")
  private javax.xml.datatype.XMLGregorianCalendar shipDate = null;
  @ApiModelProperty(example = "null", value = "Order Status")
  private StatusExt status = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean complete = false;

 /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
 /**
   * Get petId
   * @return petId
  **/
  public Long getPetId() {
    return petId;
  }
  public void setPetId(Long petId) {
    this.petId = petId;
  }
 /**
   * Get quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
 /**
   * Get shipDate
   * @return shipDate
  **/
  public javax.xml.datatype.XMLGregorianCalendar getShipDate() {
    return shipDate;
  }
  public void setShipDate(javax.xml.datatype.XMLGregorianCalendar shipDate) {
    this.shipDate = shipDate;
  }
 /**
   * Order Status
   * @return status
  **/
  public StatusExt getStatus() {
    return status;
  }
  public void setStatus(StatusExt status) {
    this.status = status;
  }
 /**
   * Get complete
   * @return complete
  **/
  public Boolean getComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

