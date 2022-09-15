package com.library.service;

import com.library.entity.Category;
import com.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    private List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    private Category findCategoryById(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Could not find category " + id));
        return category;
    }

    private void createCategory(Category category){
        categoryRepository.save(category);
    }

    private void updateCategory(Category category){
        categoryRepository.save(category);
    }

    private void deleteCategory(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Could not find category " + id));
        categoryRepository.deleteById(category.getId());
    }
}
