package com.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {
    "com.restclient"
})
@EntityScan(basePackages = {"com.restclient.model"})
public class ElasticSearchRestClient {

  public static void main(String[] args) {
    SpringApplication.run(ElasticSearchRestClient.class, args);
  }

}
