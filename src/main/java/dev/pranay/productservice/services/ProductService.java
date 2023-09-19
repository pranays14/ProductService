package dev.pranay.productservice.services;

import dev.pranay.productservice.dtos.GenericProductDto;

public interface ProductService {

    GenericProductDto getProductById(Long id) ;

    GenericProductDto createProduct(GenericProductDto product);
}
