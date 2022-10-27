package com.restclient.respository;

import com.restclient.model.Merchant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends ElasticsearchRepository<Merchant, String> {
  Merchant findByMerchantKey(String id);
}
