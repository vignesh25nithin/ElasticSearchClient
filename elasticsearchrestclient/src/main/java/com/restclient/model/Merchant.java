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

  @Id private String id;

  @Field(type = FieldType.Object, name = "address_components")
  private AddressComponents addressComponents;

  @Field(type = FieldType.Text, name = "authId")
  private String authId;

  @Field(type = FieldType.Float, name = "confidenceScore")
  private Float confidenceScore;

  @Field(type = FieldType.Text, name = "formatted_phone_number")
  private String formattedPhoneNumber;

  @Field(type = FieldType.Text, name = "international_phone_number")
  private String internationalPhoneNumber;

  @Field(type = FieldType.Object, name = "key")
  private Key key;

  @Field(type = FieldType.Text, name = "matched_queries")
  private String matchedQueries;

  @Field(type = FieldType.Object, name = "merchantKey")
  private MerchantKey merchantKey;

  @Field(type = FieldType.Text, name = "opening_hours")
  private String openingHours;

  @Field(type = FieldType.Boolean, name = "permanently_closed")
  private Boolean permanentlyClosed;

  @Field(type = FieldType.Object, name = "placeDetails")
  private PlaceDetails placeDetails;

  @Field(type = FieldType.Object, name = "placeQuery")
  private PlaceQuery placeQuery;

  @Field(type = FieldType.Object, name = "placeQueryStatus")
  private PlaceQueryStatus placeQueryStatus;

  @Field(type = FieldType.Date, name = "placeQueryUpdated")
  private Date placeQueryUpdated;

  @Field(type = FieldType.Text, name = "postedId")
  private String postedId;

  @Field(type = FieldType.Float, name = "postedToAuthScore")
  private Float postedToAuthScore;

  @Field(type = FieldType.Object, name = "resolvableKey")
  private ResolvableKey resolvableKey;

  @Field(type = FieldType.Object, name = "visaValue")
  private VisaValue visaValue;

  @Field(type = FieldType.Object, name = "review")
  private Review review;

  @Field(type = FieldType.Text, name = "types")
  private String types;

  @Field(type = FieldType.Float, name = "user_ratings_total")
  private Float userRatingsTotal;

  @Field(type = FieldType.Float, name = "utc_offset")
  private Float utcOffset;
}
