package dev.pranay.productservice;

import dev.pranay.productservice.models.Category;
import dev.pranay.productservice.models.Price;
import dev.pranay.productservice.models.Product;
import dev.pranay.productservice.repositories.CategoryRepository;
import dev.pranay.productservice.repositories.PriceRepository;
import dev.pranay.productservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final PriceRepository priceRepository;

    public ProductserviceApplication(ProductRepository productRepository, CategoryRepository categoryRepository, PriceRepository priceRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.priceRepository = priceRepository;
    }




//    private final MentorRepository mentorRepository;
//
//    private final UserRepository userRepository;
//
//    public ProductserviceApplication(@Qualifier("jt_mr")MentorRepository mentorRepository, @Qualifier("jt_ur") UserRepository userRepository){
//        this.mentorRepository = mentorRepository;
//        this.userRepository = userRepository;
//    }

    public static void main(String[] args) {

        SpringApplication.run(ProductserviceApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception{
//        Mentor mentor = new Mentor();
//        mentor.setName("Pranay");
//        mentor.setEmail("pranaysahu@gmail.com");
//        mentor.setAverageRating(4.65);
//        mentorRepository.save(mentor);
//
//        User user = new User();
//        user.setName("Sarath");
//        user.setEmail("sarathcool@yopmail.com");
//        userRepository.save(user);
//        List<User> users = userRepository.findAll();
//        for (User user1: users) {
//            System.out.println(user1);
//        }


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
//        Category category1 = categoryRepository.findById(UUID.fromString("9060a681-0598-4a98-8706-bf2a9f86ce59")).get();
//        System.out.println("Category name is: " + category1.getName());
//        System.out.println("Printing all products in the category");
////        Thread.sleep(1000);
//        for (Product product1: category1.getProducts()) {
//            try {
//                System.out.println(product1.getTitle());
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }

    }




}
