package com.karthik.ecommerce.repository.mysql;

import com.karthik.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlProductRepo extends JpaRepository<Product,Long> {

}
