package dev.pranay.productservice.services;

import dev.pranay.productservice.dtos.GenericProductDto;
import org.springframework.stereotype.Service;

@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return null;
    }


}
