package dev.pranay.productservice.services;

import dev.pranay.productservice.dtos.ProductDto;
import dev.pranay.productservice.models.Category;

import java.util.List;

public interface CategoryServiceDB {
    Category getCategoryById(String uuid);

    List<String> getAllCategories();
}
