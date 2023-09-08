package dev.pranay.productservice.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private RestTemplateBuilder restTemplateBuilder;
    private String specificProductRequestUrl = "https://fakestoreapi.com/products/{id}";
    //private String productRequestsBaseUrl = "https://fakestoreapi.com/products";

    public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public String getProductById(Long id){

        RestTemplate restTemplate = restTemplateBuilder.build();

        return "Here is product id " + id;
    }

}
