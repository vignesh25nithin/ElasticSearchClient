package com.restclient.service;

import com.restclient.model.Merchant;
import com.restclient.response.Response;

public interface MerchantService {

  Response createMerchant(Merchant merchant);

  Response getMerchant(String id);

  Response updateMerchant(String id, Merchant merchant);

  Response deleteMerchant(String id);
}
