package com.karthik.ecommerce.service;


import com.karthik.ecommerce.dto.FakeProductServiceDto;
import com.karthik.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.karthik.ecommerce.mapper.Mapper.convertDtoToProduct;

@Service
@Qualifier("fakeStoreService")
public class FakeStoreProductServiceImpl implements ProductService{

    @Override
    public Product getProductById(long id) {
        RestTemplate restTemplate=new RestTemplate();
        FakeProductServiceDto fakeProductServiceDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServiceDto.class);
        return convertDtoToProduct(fakeProductServiceDto);
    }
}
