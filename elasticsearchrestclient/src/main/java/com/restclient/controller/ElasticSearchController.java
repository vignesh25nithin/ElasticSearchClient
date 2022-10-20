package com.restclient.controller;

import com.restclient.model.Merchant;
import com.restclient.response.Response;
import com.restclient.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/elastic-search")
public class ElasticSearchController {

  @Autowired MerchantService merchantService;

  @PostMapping("/merchant")
  public ResponseEntity<Response> createMerchant(@RequestBody Merchant merchant) {
    Response response = merchantService.createMerchant(merchant);
    return new ResponseEntity<>(response, response.getStatus());
  }

  @GetMapping("/merchant/{id}")
  public ResponseEntity<Response> getMerchant(@PathVariable(name = "id") String id) {
    Response response = merchantService.getMerchant(id);
    return new ResponseEntity<>(response, response.getStatus());
  }

  @DeleteMapping("/merchant/{id}")
  public ResponseEntity<Response> deleteMerchant(@PathVariable(name = "id") String id) {
    Response response = merchantService.deleteMerchant(id);
    return new ResponseEntity<>(response, response.getStatus());
  }
}
