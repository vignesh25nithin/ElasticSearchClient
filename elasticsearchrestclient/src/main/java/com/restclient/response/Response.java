package com.restclient.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.restclient.util.ErrorMessage;
import com.restclient.util.ErrorType;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

  private HttpStatus status;
  private int statusCode;
  private String id;
  private Object payload;
  private List<ErrorMessage> errorMessages = new ArrayList<>();

  public void addErrorMessage(ErrorMessage msg) {
    errorMessages.add(msg);
  }

  public void addErrorMessage(String msg) {
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setErrorType(ErrorType.Error);
    errorMessage.setMessage(msg);
    errorMessages.add(errorMessage);
  }

  public boolean hasErrorMessages() {
    return errorMessages != null && !errorMessages.isEmpty();
  }
}
