package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Key extends BaseKey {
  @Field(type = FieldType.Long, name = "transactionID")
  private Long transactionID;
}
