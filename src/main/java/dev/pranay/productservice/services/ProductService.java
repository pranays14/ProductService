package dev.pranay.productservice.services;

import dev.pranay.productservice.dtos.GenericProductDto;

import java.util.List;

public interface ProductService {

    GenericProductDto getProductById(Long id) ;

    GenericProductDto createProduct(GenericProductDto product);
    List<GenericProductDto> getAllProducts();
}
