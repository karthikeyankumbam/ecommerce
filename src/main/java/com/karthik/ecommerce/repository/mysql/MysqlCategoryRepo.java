package com.karthik.ecommerce.repository.mysql;

import com.karthik.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlCategoryRepo  extends JpaRepository<Category,Long> {
}
