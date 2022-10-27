package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Review {

  @Field(type = FieldType.Keyword, name = "author_name")
  private String authorName;

  @Field(type = FieldType.Keyword, name = "author_url")
  private String authorUrl;

  @Field(type = FieldType.Keyword, name = "language")
  private String language;

  @Field(type = FieldType.Keyword, name = "profile_photo_url")
  private String profilePhotoUrl;

  @Field(type = FieldType.Long, name = "rating")
  private Long rating;

  @Field(type = FieldType.Keyword, name = "relative_time_description")
  private String relativeTimeDescription;

  @Field(type = FieldType.Keyword, name = "text")
  private String text;

  @Field(type = FieldType.Object, name = "time")
  private Time time;
}
