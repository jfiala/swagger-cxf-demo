package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * different media types
 */
public enum MediaTypes {
  
  PDF("application/pdf"),
  
  JSON("application/json");

  private String value;

  MediaTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MediaTypes fromValue(String text) {
    for (MediaTypes b : MediaTypes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

