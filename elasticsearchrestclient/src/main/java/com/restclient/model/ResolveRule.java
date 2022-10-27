package com.restclient.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
public class ResolveRule
{
    @Field(type = FieldType.Keyword, name = "MID")
    private String MID;
}