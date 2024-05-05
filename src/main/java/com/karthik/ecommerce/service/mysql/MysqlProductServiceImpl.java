package com.karthik.ecommerce.service.mysql;

import com.karthik.ecommerce.model.Category;
import com.karthik.ecommerce.model.Product;
import com.karthik.ecommerce.repository.mysql.MysqlCategoryRepo;
import com.karthik.ecommerce.repository.mysql.MysqlProductRepo;
import com.karthik.ecommerce.service.CategoryService;
import com.karthik.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mysqlProductService")
public class MysqlProductServiceImpl implements ProductService {

    private final MysqlProductRepo mysqlProductRepo;
    private final CategoryService mysqlCategoryService;
    @Autowired
    public MysqlProductServiceImpl(MysqlProductRepo mysqlProductRepo, CategoryService mysqlCategoryService) {
        this.mysqlProductRepo = mysqlProductRepo;
        this.mysqlCategoryService =mysqlCategoryService;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(String title, String description, String image, double price, String categoryName) {
        Category category = mysqlCategoryService.createCategory(categoryName);
        Product product=new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImage(image);
        product.setCategory(category);
        return mysqlProductRepo.save(product);
    }

    @Override
    public Product updatePrice(long productId, double updatedPrice) {
        //fetch
        //set
        //save
        return null;
    }

    @Override
    public Product updateImage(long productId, String updatedImage) {
        return null;
    }

    @Override
    public boolean deleteProduct() {
        return false;
    }
}
