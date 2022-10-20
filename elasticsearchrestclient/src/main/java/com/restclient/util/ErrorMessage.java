package com.restclient.util;

import lombok.Data;

@Data
public class ErrorMessage {

  private ErrorType errorType;
  private String message;
}
