package com.karthik.ecommerce.mapper;

import com.karthik.ecommerce.dto.FakeProductServiceDto;
import com.karthik.ecommerce.model.Category;
import com.karthik.ecommerce.model.Product;

import static java.util.Objects.nonNull;

public class Mapper {
    private Mapper(){}
    public static Product convertDtoToProduct(FakeProductServiceDto dto){
        if(nonNull(dto)){
            Product product=new Product();
            product.setId(dto.getId());
            product.setTitle(dto.getTitle());
            product.setPrice(dto.getPrice());
            product.setImage(dto.getImage());
            product.setCategory(new Category());
            product.getCategory().setName(dto.getCategory());
            product.setDescription(dto.getDescription());
            return product;
        }
        return null;
    }
}
