package com.example.thanquangtuan;

import com.example.thanquangtuan.model.Category;
import com.example.thanquangtuan.reponsitory.CategoryReponsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThanquangtuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThanquangtuanApplication.class, args);
	}

	@Bean
	CommandLineRunner seedCategories(CategoryReponsitory categoryReponsitory) {
		return args -> {
			if (categoryReponsitory.count() == 0) {
				String[] defaultCategories = {
					"Điện thoại",
					"Laptop",
					"Phụ kiện",
					"Đồng hồ",
					"Gia dụng"
				};

				for (String categoryName : defaultCategories) {
					Category category = new Category();
					category.setName(categoryName);
					categoryReponsitory.save(category);
				}
			}
		};
	}

}
