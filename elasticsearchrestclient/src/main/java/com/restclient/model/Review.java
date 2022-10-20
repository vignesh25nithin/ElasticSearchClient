package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Review {

  @Field(type = FieldType.Text, name = "author_name")
  private String authorName;

  @Field(type = FieldType.Text, name = "author_url")
  private String authorUrl;

  @Field(type = FieldType.Text, name = "language")
  private String language;

  @Field(type = FieldType.Text, name = "profile_photo_url")
  private String profilePhotoUrl;

  @Field(type = FieldType.Long, name = "rating")
  private Long rating;

  @Field(type = FieldType.Text, name = "relative_time_description")
  private String relativeTimeDescription;

  @Field(type = FieldType.Text, name = "text")
  private String text;

  @Field(type = FieldType.Object, name = "time")
  private Time time;
}
