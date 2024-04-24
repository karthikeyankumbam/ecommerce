package com.karthik.ecommerce.service;


import com.karthik.ecommerce.dto.FakeProductServiceDto;
import com.karthik.ecommerce.mapper.Mapper;
import com.karthik.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.karthik.ecommerce.mapper.Mapper.convertDtoToProduct;
import static java.util.Objects.nonNull;

@Service
@Qualifier("fakeStoreService")
public class FakeStoreProductServiceImpl implements ProductService {


    private final RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(long id) {
        FakeProductServiceDto fakeProductServiceDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServiceDto.class);
        return convertDtoToProduct(fakeProductServiceDto);
    }

    @Override
    public List<Product> getAllProducts() {
        ParameterizedTypeReference<List<FakeProductServiceDto>> responseType = new ParameterizedTypeReference<List<FakeProductServiceDto>>() {};
        ResponseEntity<List<FakeProductServiceDto>> response = restTemplate.exchange("https://fakestoreapi.com/products", HttpMethod.GET, null, responseType);
        List<Product> products = null;
        if(nonNull(response.getBody())){
            products = response.getBody().stream().map(Mapper::convertDtoToProduct).toList();
        }
        return products;
    }
}
