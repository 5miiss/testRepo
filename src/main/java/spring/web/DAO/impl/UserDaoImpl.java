package spring.web.DAO.impl;


import spring.web.DAO.UserDao;
import spring.web.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User u ){
        System.out.println(entityManager);
        entityManager.persist(u);
        System.out.println(entityManager.contains(u));

    }
}
