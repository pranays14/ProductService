package dev.pranay.productservice;

import dev.pranay.productservice.models.Category;
import dev.pranay.productservice.models.Price;
import dev.pranay.productservice.models.Product;
import dev.pranay.productservice.repositories.CategoryRepository;
import dev.pranay.productservice.repositories.PriceRepository;
import dev.pranay.productservice.repositories.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductserviceApplication {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final PriceRepository priceRepository;

    public ProductserviceApplication(ProductRepository productRepository, CategoryRepository categoryRepository, PriceRepository priceRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.priceRepository = priceRepository;
    }


    public static void main(String[] args) {

        SpringApplication.run(ProductserviceApplication.class, args);

    }
    public void run(String... args) throws Exception{
        Category category = new Category();
        category.setName("Apple Devices");
        Category savedCategory = categoryRepository.save(category);

        Price price = new Price("Rupee", 50);
        Price savedPrice = priceRepository.save(price);

        Product product = new Product();
        product.setTitle("iPhone 15 Pro");
        product.setDescription("The best iPhone Ever");
        product.setCategory(category);
        product.setPrice(price);

        productRepository.save(product);
    }




}
