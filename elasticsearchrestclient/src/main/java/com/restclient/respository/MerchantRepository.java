package com.restclient.respository;

import com.restclient.model.Merchant;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MerchantRepository extends ElasticsearchRepository<Merchant, String> {
  List<Merchant> findByVisaValueMerchantIdContaining(String id);
}
