package com.karthik.ecommerce.mapper;

import com.karthik.ecommerce.dto.FakeProductServiceDto;
import com.karthik.ecommerce.model.Category;
import com.karthik.ecommerce.model.Product;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Mapper {
    public static Product convertDtoToProduct(FakeProductServiceDto dto){
        return Product.builder().
                id(dto.getId()).
                price(dto.getPrice()).
                title(dto.getTitle()).
                image(dto.getImage()).
                description(dto.getDescription()).
                category(Category.builder().name(dto.getDescription()).build()).
                build();
    }
}
