package com.example.thanquangtuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.thanquangtuan.model.Product;
import com.example.thanquangtuan.reponsitory.ProductReponsitory;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductReponsitory productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}