package com.example.thanquangtuan.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.thanquangtuan.model.Category;

@Repository
public interface CategoryReponsitory extends JpaRepository<Category, Integer> {
}
