package com.restclient.respository;

import com.restclient.model.Merchant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MerchantRepository extends ElasticsearchRepository<Merchant, String> {}
