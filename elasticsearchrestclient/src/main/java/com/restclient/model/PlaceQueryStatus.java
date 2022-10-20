package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class PlaceQueryStatus {
  @Field(type = FieldType.Text, name = "code")
  private String code;

  @Field(type = FieldType.Text, name = "message")
  private String message;
}
