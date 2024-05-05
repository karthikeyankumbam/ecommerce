package com.karthik.ecommerce.service.mysql;

import com.karthik.ecommerce.model.Category;
import com.karthik.ecommerce.repository.mysql.MysqlCategoryRepo;
import com.karthik.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MysqlCategoryServiceImpl implements CategoryService {
    //This may helpful for caching
    private final MysqlCategoryRepo mysqlCategoryRepo;
    @Autowired
    public MysqlCategoryServiceImpl(MysqlCategoryRepo mysqlCategoryRepo) {
        this.mysqlCategoryRepo = mysqlCategoryRepo;
    }

    @Override
    public Category createCategory(String categoryName) {
        Category category=new Category();
        category.setName(categoryName);
        /**
         * If id is null insert query will be fired
         * else update query will be fired
         */
        return mysqlCategoryRepo.save(category);
    }
}
