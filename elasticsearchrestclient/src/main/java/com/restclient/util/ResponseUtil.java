package com.restclient.util;

import com.restclient.response.Response;
import java.util.List;
import org.springframework.http.HttpStatus;

public final class ResponseUtil {

  public static void error(Response response) {
    response.setStatus(HttpStatus.BAD_REQUEST);
    response.setStatusCode(HttpStatus.BAD_REQUEST.value());
  }

  public static void fail(Response response) {
    response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
  }

  public static void success(Response response) {
    response.setStatus(HttpStatus.OK);
    response.setStatusCode(HttpStatus.OK.value());
  }

  public static void error(Response response, String messages) {
    response.setStatus(HttpStatus.BAD_REQUEST);
    response.setStatusCode(HttpStatus.BAD_REQUEST.value());
    response.addErrorMessage(messages);
  }

  public static void fail(Response response, String messages) {
    response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
    response.addErrorMessage(messages);
  }

  private static void addErrorMessages(Response response, List<ErrorMessage> errorMessages) {
    for (ErrorMessage errorMessage : errorMessages) {
      response.addErrorMessage(errorMessage);
    }
  }
}
