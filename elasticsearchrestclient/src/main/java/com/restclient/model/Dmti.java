package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Dmti {
    @Field(type = FieldType.Keyword, name = "formattedaddress")
    private String formattedAddress;
    @Field(type = FieldType.Keyword, name = "uaid")
    private String uaId;
    @Field(type = FieldType.Keyword, name = "streetnumber")
    private String streetNumber;
    @Field(type = FieldType.Keyword, name = "streetnumbersuffix")
    private String streetNumberSuffix;
    @Field(type = FieldType.Keyword, name = "streetpredirection")
    private String streetPreDirection;
    @Field(type = FieldType.Keyword, name = "streetname")
    private String streetName;
    @Field(type = FieldType.Keyword, name = "streettype")
    private String streetType;
    @Field(type = FieldType.Keyword, name = "streetdirection")
    private String streetDirection;
    @Field(type = FieldType.Keyword, name = "subaddressnumber")
    private String subAddressNumber;
    @Field(type = FieldType.Keyword, name = "subaddresstype")
    private String subAddressType;
    @Field(type = FieldType.Float, name = "subaddressci")
    private Float subAddressci;
    @Field(type = FieldType.Keyword, name = "uuaid")
    private String uuaId;
    @Field(type = FieldType.Keyword, name = "municipality")
    private String municipality;
    @Field(type = FieldType.Keyword, name = "stateprovince")
    private String stateProvince;
    @Field(type = FieldType.Keyword, name = "postalcode")
    private String postalCode;
    @Field(type = FieldType.Float, name = "score")
    private Float score;
    @Field(type = FieldType.Float, name = "ci")
    private Float ci;
    @Field(type = FieldType.Boolean, name = "mduflag")
    private Boolean mduFlag;
    @Field(type = FieldType.Keyword, name = "residentialflag")
    private String residentialFlag;
    @Field(type = FieldType.Float, name = "lat")
    private Float lat;
    @Field(type = FieldType.Float, name = "lon")
    private Float lon;
    @Field(type = FieldType.Keyword, name = "coordinatetype")
    private String coordinateType;
    @Field(type = FieldType.Keyword, name = "pdc")
    private String pdc;
    @Field(type = FieldType.Keyword, name = "addresspointtype")
    private String addressPointType;
    @Field(type = FieldType.Keyword, name = "country")
    private String country;
    @Field(type = FieldType.Keyword, name = "relatedaddressline")
    private String relatedAddressLine;
    @Field(type = FieldType.Keyword, name = "relatedaddressmunicipality")
    private String relatedAddressMunicipality;
    @Field(type = FieldType.Keyword, name = "relatedaddressprovince")
    private String relatedAddressProvince;
    @Field(type = FieldType.Keyword, name = "relatedaddresspostalcode")
    private String relatedAddressPostalcode;
    @Field(type = FieldType.Keyword, name = "relatedaddresscountry")
    private String relatedAddressCountry;
    @Field(type = FieldType.Keyword, name = "relatedaddressuaid")
    private String relatedAddressuaId;
    @Field(type = FieldType.Keyword, name = "relatedaddressscore")
    private String relatedAddressScore;
    @Field(type = FieldType.Float, name = "relatedaddresslat")
    private Float relatedAddressLat;
    @Field(type = FieldType.Float, name = "relatedaddresslon")
    private Float relatedAddressLon;
    @Field(type = FieldType.Keyword, name = "usedmunicipalityalias")
    private String usedMunicipalityAlias;
    @Field(type = FieldType.Keyword, name = "postalmunicipality")
    private String postalMunicipality;
    @Field(type = FieldType.Keyword, name = "da")
    private String da;


}