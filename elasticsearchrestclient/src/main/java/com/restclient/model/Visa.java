package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Visa {
    @Field(type = FieldType.Keyword, name = "brandCategory")
    private String brandCategory;
    @Field(type = FieldType.Keyword, name = "brandId")
    private String brandId;
    @Field(type = FieldType.Keyword, name = "brandName")
    private String brandName;
    @Field(type = FieldType.Keyword, name = "businessLegalName")
    private String businessLegalName;
    @Field(type = FieldType.Keyword, name = "dbaname")
    private String dbaName;
    @Field(type = FieldType.Keyword, name = "matchIndicators")
    private String matchIndicators;
    @Field(type = FieldType.Keyword, name = "matchScore")
    private String matchScore;
    @Field(type = FieldType.Keyword, name = "merchantCategoryCode")
    private String merchantCategoryCode;
    @Field(type = FieldType.Keyword, name = "merchantCategoryCodeDesc")
    private String merchantCategoryCodeDesc;
    @Field(type = FieldType.Keyword, name = "merchantCity")
    private String merchantCity;
    @Field(type = FieldType.Keyword, name = "merchantCountryCode")
    private String merchantCountryCode;
    @Field(type = FieldType.Keyword, name = "merchantId")
    private String merchantId;
    @Field(type = FieldType.Keyword, name = "merchantName")
    private String merchantName;
    @Field(type = FieldType.Keyword, name = "merchantPhoneNumber")
    private String merchantPhoneNumber;
    @Field(type = FieldType.Keyword, name = "merchantPostalCode")
    private String merchantPostalCode;
    @Field(type = FieldType.Keyword, name = "merchantState")
    private String merchantState;
    @Field(type = FieldType.Keyword, name = "merchantStreetAddress")
    private String merchantStreetAddress;
    @Field(type = FieldType.Keyword, name = "merchantUrl")
    private String merchantUrl;
    @Field(type = FieldType.Keyword, name = "parentId")
    private String parentId;
    @Field(type = FieldType.Keyword, name = "parentName")
    private String parentName;

}