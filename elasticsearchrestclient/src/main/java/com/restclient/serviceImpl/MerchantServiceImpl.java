package com.restclient.serviceImpl;

import com.restclient.model.Merchant;
import com.restclient.response.Response;
import com.restclient.respository.MerchantRepository;
import com.restclient.service.MerchantService;
import com.restclient.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MerchantServiceImpl implements MerchantService {

  @Autowired private MerchantRepository merchantRepository;

  @Override
  public Response createMerchant(Merchant merchant) {
    Response response = new Response();
    try {
      merchantRepository.save(merchant);
      response.setId(merchant.getMerchantKey());
      ResponseUtil.success(response);
    } catch (Exception e) {
      e.printStackTrace();
      ResponseUtil.error(response, e.getMessage());
    }
    return response;
  }

  @Override
  public Response getMerchant(String id) {
    Response response = new Response();
    try {
      Merchant merchant = merchantRepository.findByMerchantKey(id);
      if (merchant != null) {
        response.setPayload(merchant);
        ResponseUtil.success(response);
      } else {
        ResponseUtil.error(response, "NOT FOUND");
      }
    } catch (Exception e) {
      ResponseUtil.fail(response, e.getMessage());
    }
    return response;
  }

  @Override
  public Response deleteMerchant(String id) {
    Response response = new Response();
    try {
      merchantRepository.deleteById(id);
      ResponseUtil.success(response);
    } catch (Exception e) {
      ResponseUtil.error(response, e.getMessage());
    }
    return response;
  }
}
