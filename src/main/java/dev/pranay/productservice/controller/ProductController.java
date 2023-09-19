package dev.pranay.productservice.controller;

import dev.pranay.productservice.dtos.GenericProductDto;
import dev.pranay.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    }




    @GetMapping
    public void getAllProducts() {

    }

    // localhost:8080/products/{id}
    // localhost:8080/products/123
    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);

    }

    @DeleteMapping("{id}")
    public void deleteProductById(@PathVariable("id") Long id) {

    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product) {
        return productService.createProduct(product);

    }

    @PutMapping("{id}")
    public void updateProductById() {

    }
}
