package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class Time {
  @Field(type = FieldType.Long, name = "nanos")
  private Long nanos;

  @Field(type = FieldType.Long, name = "seconds")
  private Long seconds;
}
