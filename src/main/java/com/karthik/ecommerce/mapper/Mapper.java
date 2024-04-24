package com.karthik.ecommerce.mapper;

import com.karthik.ecommerce.dto.FakeProductServiceDto;
import com.karthik.ecommerce.model.Category;
import com.karthik.ecommerce.model.Product;

import static java.util.Objects.nonNull;

public class Mapper {
    private Mapper(){}
    public static Product convertDtoToProduct(FakeProductServiceDto dto){
        if(nonNull(dto)){
            return Product.builder().
                    id(dto.getId()).
                    price(dto.getPrice()).
                    title(dto.getTitle()).
                    image(dto.getImage()).
                    description(dto.getDescription()).
                    category(Category.builder().name(dto.getCategory()).build()).
                    build();
        }
        return null;
    }
}
