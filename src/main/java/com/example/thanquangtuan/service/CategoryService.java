package com.example.thanquangtuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.thanquangtuan.model.Category;
import com.example.thanquangtuan.reponsitory.CategoryReponsitory;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryReponsitory categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
}