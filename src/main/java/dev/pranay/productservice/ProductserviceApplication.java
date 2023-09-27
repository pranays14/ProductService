package dev.pranay.productservice;

import dev.pranay.productservice.inheritencedemo.tableperclass.Mentor;
import dev.pranay.productservice.inheritencedemo.tableperclass.MentorRepository;
import dev.pranay.productservice.inheritencedemo.tableperclass.User;
import dev.pranay.productservice.inheritencedemo.tableperclass.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {

//    private final ProductRepository productRepository;
//    private final CategoryRepository categoryRepository;
//    private final PriceRepository priceRepository;
//
//    public ProductserviceApplication(ProductRepository productRepository, CategoryRepository categoryRepository, PriceRepository priceRepository) {
//        this.productRepository = productRepository;
//        this.categoryRepository = categoryRepository;
//        this.priceRepository = priceRepository;
//    }

    private final MentorRepository mentorRepository;

    private final UserRepository userRepository;

    public ProductserviceApplication(@Qualifier("tbc_mr")MentorRepository mentorRepository, @Qualifier("tbc_ur") UserRepository userRepository){
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(ProductserviceApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception{
        Mentor mentor = new Mentor();
        mentor.setName("Pranay");
        mentor.setEmail("pranaysahu@gmail.com");
        mentor.setAverageRating(4.65);
        mentorRepository.save(mentor);

        User user = new User();
        user.setName("Sarath");
        user.setEmail("sarathcool@yopmail.com");
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        for (User user1: users) {
            System.out.println(user1);
        }


//        Category category = new Category();
//        category.setName("Apple Devices");
//        Category savedCategory = categoryRepository.save(category);
//
//        Price price = new Price("Rupee", 50);
//        Price savedPrice = priceRepository.save(price);
//
//        Product product = new Product();
//        product.setTitle("iPhone 15 Pro");
//        product.setDescription("The best iPhone Ever");
//        product.setCategory(category);
//        product.setPrice(price);
//
//        productRepository.save(product);
    }




}
