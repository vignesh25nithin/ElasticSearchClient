package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class AddressComponents {
  @Field(type = FieldType.Text, name = "long_name")
  private String longName;

  @Field(type = FieldType.Text, name = "short_name")
  private String shortName;

  @Field(type = FieldType.Text, name = "types")
  private String types;
}
