package spring.web.config;

import spring.web.DAO.CategoryDao;
import spring.web.DAO.ProductDao;
import spring.web.DAO.impl.CategoryDaoImpl;
import spring.web.DAO.impl.ProductDaoImpl;
import spring.web.models.Category;
import spring.web.models.CategoryId;
import spring.web.models.Product;
import spring.web.models.ProductId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcductConfig {

    @Bean
    public CategoryId categoryId(){
        return new CategoryId(0 ,1);
    }


    @Bean
    public Category category(CategoryId categoryId){
        return  new Category(categoryId,null,"Electronics","image");
    }

    @Bean
    public ProductId productId(CategoryId categoryId){
        return new ProductId(categoryId.getId(),categoryId.getCategoriesId(),1);
    }

    @Bean
    public Product product(ProductId productId,Category category){
        return new Product(productId,category,"zz","asdas",12,1000);
    }
    @Bean
    public ProductDao productDao(){
        return new ProductDaoImpl();

    }

    @Bean
    public CategoryDao categoryDao(){
        return new CategoryDaoImpl();
    }
}
