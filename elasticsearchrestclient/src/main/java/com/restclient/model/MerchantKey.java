package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class MerchantKey extends BaseKey {

  @Field(type = FieldType.Text, name = "address")
  private String address;

  @Field(type = FieldType.Text, name = "source")
  private String source;

  @Field(type = FieldType.Text, name = "terminalId")
  private String terminalId;

  @Field(type = FieldType.Text, name = "postalCode")
  private String postalCode;
}
