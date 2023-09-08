package dev.pranay.productservice.controller;

import dev.pranay.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    }




    @GetMapping
    public void getAllProducts() {

    }
    //API
    // localhost:8080/products/{id}
    // localhost:8080/products/123
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);

    }

    @DeleteMapping("{id}")
    public void deleteProductById(@PathVariable("id") Long id) {

    }

//    @PostMapping
//    public void createProduct(@RequestBody GenericProductDto product) {
////        System.out.println(product.name);
//
//    }

    @PutMapping("{id}")
    public void updateProductById() {

    }
}
