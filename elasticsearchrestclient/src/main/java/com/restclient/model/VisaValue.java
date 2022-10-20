package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class VisaValue {

  @Field(type = FieldType.Text, name = "brandCategory")
  private String brandCategory;

  @Field(type = FieldType.Text, name = "brandId")
  private String brandId;

  @Field(type = FieldType.Text, name = "brandName")
  private String brandName;

  @Field(type = FieldType.Text, name = "businessLegalName")
  private String businessLegalName;

  @Field(type = FieldType.Text, name = "dbaname")
  private String dbaName;

  @Field(type = FieldType.Text, name = "matchIndicators")
  private String matchIndicators;

  @Field(type = FieldType.Text, name = "matchScore")
  private String matchScore;

  @Field(type = FieldType.Text, name = "merchantCategoryCode")
  private String merchantCategoryCode;

  @Field(type = FieldType.Text, name = "merchantCategoryCodeDesc")
  private String merchantCategoryCodeDesc;

  @Field(type = FieldType.Text, name = "merchantCountryCode")
  private String merchantCountryCode;

  @Field(type = FieldType.Text, name = "merchantId")
  private String merchantId;

  @Field(type = FieldType.Text, name = "merchantName")
  private String merchantName;

  @Field(type = FieldType.Text, name = "merchantPhoneNumber")
  private String merchantPhoneNumber;

  @Field(type = FieldType.Text, name = "merchantPostalCode")
  private String merchantPostalCode;

  @Field(type = FieldType.Text, name = "merchantState")
  private String merchantState;

  @Field(type = FieldType.Text, name = "merchantStreetAddress")
  private String merchantStreetAddress;

  @Field(type = FieldType.Text, name = "merchantUrl")
  private String merchantUrl;

  @Field(type = FieldType.Text, name = "parentId")
  private String parentId;

  @Field(type = FieldType.Text, name = "parentName")
  private String parentName;
}
