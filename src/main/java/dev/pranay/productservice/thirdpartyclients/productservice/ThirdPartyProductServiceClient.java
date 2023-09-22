package dev.pranay.productservice.thirdpartyclients.productservice;

import dev.pranay.productservice.dtos.GenericProductDto;
import dev.pranay.productservice.exception.NotFoundException;

import java.util.List;

public interface ThirdPartyProductServiceClient {
    GenericProductDto getProductById(Long id) throws NotFoundException;

    GenericProductDto createProduct(GenericProductDto product);
    List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProduct(Long id);
}
