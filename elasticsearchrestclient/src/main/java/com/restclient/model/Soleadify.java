package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Soleadify {
    @Field(type = FieldType.Keyword, name = "company_name")
    private String companyName;
    @Field(type = FieldType.Keyword, name = "legal_name")
    private String legalName;
    @Field(type = FieldType.Keyword, name = "domain")
    private String domain;
    @Field(type = FieldType.Keyword, name = "domains")
    private String domains;
    @Field(type = FieldType.Keyword, name = "company_names")
    private String companyNames;
    @Field(type = FieldType.Keyword, name = "country")
    private String country;
    @Field(type = FieldType.Keyword, name = "region")
    private String region;
    @Field(type = FieldType.Keyword, name = "city")
    private String city;
    @Field(type = FieldType.Keyword, name = "zipcode")
    private String zipcode;
    @Field(type = FieldType.Keyword, name = "locations")
    private String locations;
    @Field(type = FieldType.Keyword, name = "facebook")
    private String facebook;
    @Field(type = FieldType.Keyword, name = "linkedin")
    private String linkedin;
    @Field(type = FieldType.Keyword, name = "instagram")
    private String instagram;
    @Field(type = FieldType.Keyword, name = "twitter")
    private String twitter;
    @Field(type = FieldType.Keyword, name = "category")
    private String category;
    @Field(type = FieldType.Keyword, name = "industry")
    private String industry;
    @Field(type = FieldType.Keyword, name = "categories")
    private String categories;
    @Field(type = FieldType.Keyword, name = "sector")
    private String sector;
    @Field(type = FieldType.Keyword, name = "phone")
    private String phone;
    @Field(type = FieldType.Keyword, name = "phones")
    private String phones;
    @Field(type = FieldType.Keyword, name = "short_description")
    private String shortDescription;
    @Field(type = FieldType.Keyword, name = "cms")
    private String cms;
    @Field(type = FieldType.Keyword, name = "employee_count")
    private String employeeCount;
    @Field(type = FieldType.Keyword, name = "revenue")
    private String revenue;
    @Field(type = FieldType.Keyword, name = "keywords")
    private String keywords;
    @Field(type = FieldType.Keyword, name = "food_platform")
    private String foodPlatform;
    @Field(type = FieldType.Keyword, name = "cuisine")
    private String cuisine;
    @Field(type = FieldType.Keyword, name = "brick_and_mortar")
    private String brickAndMortar;
    @Field(type = FieldType.Keyword, name = "online")
    private String online;
    @Field(type = FieldType.Keyword, name = "nm_id")
    private String nmId;
    @Field(type = FieldType.Keyword, name = "ios_app")
    private String iosApp;
    @Field(type = FieldType.Keyword, name = "android_app")
    private String androidApp;
    @Field(type = FieldType.Float, name = "confidence_score")
    private Float confidenceScore;

}