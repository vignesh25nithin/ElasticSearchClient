package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Google {

    @Field(type = FieldType.Keyword, name = "place_id")
    private String placeId;
    @Field(type = FieldType.Keyword, name = "types")
    private String types;
    @Field(type = FieldType.Float, name = "user_ratings_total")
    private Float userRatingsTotal;
    @Field(type = FieldType.Float, name = "utc_offset")
    private Float utcOffset;
    @Field(type = FieldType.Keyword, name = "opening_hours")
    private String openingHours;
    @Field(type = FieldType.Keyword, name = "formatted_phone_number")
    private String formattedPhoneNumber;
    @Field(type = FieldType.Keyword, name = "international_phone_number")
    private String internationalPhoneNumber;
    @Field(type = FieldType.Boolean, name = "permanently_closed")
    private Boolean permanentlyClosed;
    @Field(type = FieldType.Keyword, name = "placeDetails_business_status")
    private String placeDetailsBusinessStatus;
    @Field(type = FieldType.Keyword, name = "placeDetails_formatted_address")
    private String placeDetailsFormattedAddress;
    @Field(type = FieldType.Float, name = "placeDetails_location_lat")
    private Float placeDetailsLocationLat;
    @Field(type = FieldType.Float, name = "placeDetails_location_lon")
    private Float placeDetailsLocationLon;
    @Field(type = FieldType.Float, name = "placeDetails_northeast_lat")
    private Float placeDetailsNortheastLat;
    @Field(type = FieldType.Float, name = "placeDetails_northeast_lon")
    private Float placeDetailsNortheastLon;
    @Field(type = FieldType.Float, name = "placeDetails_southwest_lat")
    private Float placeDetailsSouthwestLat;
    @Field(type = FieldType.Float, name = "placeDetails_southwest_lon")
    private Float placeDetailsSouthwestLon;
    @Field(type = FieldType.Keyword, name = "placeDetails_icon")
    private String placeDetailsIcon;
    @Field(type = FieldType.Keyword, name = "placeDetails_name")
    private String placeDetailsName;
    @Field(type = FieldType.Keyword, name = "placeDetails_price_level")
    private String placeDetailsPriceLevel;
    @Field(type = FieldType.Float, name = "placeDetails_rating")
    private Float placeDetailsRating;
    @Field(type = FieldType.Keyword, name = "placeDetails_url")
    private String placeDetailsUrl;
    @Field(type = FieldType.Keyword, name = "placeDetails_vicinity")
    private String placeDetailsVicinity;
    @Field(type = FieldType.Keyword, name = "placeDetails_website")
    private String placeDetailsWebsite;
    @Field(type = FieldType.Object, name = "review")
    private Review review;

}