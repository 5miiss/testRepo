package spring.web.DAO.impl;

import spring.web.DAO.ProductDao;
import spring.web.models.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public void save(Product p) {
        entityManager.persist(p);
    }
}
