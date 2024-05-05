package com.karthik.ecommerce.service;


import com.karthik.ecommerce.dto.FakeProductServiceDto;
import com.karthik.ecommerce.mapper.Mapper;
import com.karthik.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.List;

@Service
@Qualifier("fakeStoreWithWebClient")
public class FakeStoreProductServiceWebClientImpl implements ProductService {


    private final WebClient webClient;

    @Autowired
    public FakeStoreProductServiceWebClientImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://fakestoreapi.com").build();
    }

    @Override
    public Product getProductById(long id) {
        return webClient.get()
                .uri("/products/{id}", id)
                .retrieve()
                .bodyToMono(FakeProductServiceDto.class)
                .map(Mapper::convertDtoToProduct).block();
    }

    @Override
    public List<Product> getAllProducts() {
        return webClient.get()
                .uri("/products")
                .retrieve()
                .bodyToFlux(FakeProductServiceDto.class)
                .map(Mapper::convertDtoToProduct).collectList().block();
    }

    @Override
    public Product createProduct(String title, String description, String image, double price, String categoryName) {
        return null;
    }

    @Override
    public Product updatePrice(long productId, double updatedPrice) {
        return null;
    }

    @Override
    public Product updateImage(long productId, String updatedImage) {
        return null;
    }


    @Override
    public boolean deleteProduct() {
        return false;
    }
}
