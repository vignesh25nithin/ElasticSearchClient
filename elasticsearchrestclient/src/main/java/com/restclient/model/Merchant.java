package com.restclient.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "merchant_index", createIndex = true)
@Getter
@Setter
public class Merchant {
  @Id
  @Field(type = FieldType.Keyword, name = "merchant_key")
  private String merchantKey;

  @Field(type = FieldType.Date, name = "updated_timestamp")
  private Date updatedTimestamp;

  @Field(type = FieldType.Object, name = "google")
  private Google google;

  @Field(type = FieldType.Object, name = "dmti")
  private Dmti dmti;

  @Field(type = FieldType.Object, name = "address_components")
  private AddressComponents addressComponents;

  @Field(type = FieldType.Object, name = "soleadify")
  private Soleadify soleadify;

  @Field(type = FieldType.Object, name = "visa")
  private Visa visa;

  @Field(type = FieldType.Object, name = "resolveRule")
  private ResolveRule resolveRule;

  @Field(type = FieldType.Keyword, name = "previous_keys")
  private String previousKeys;
}
