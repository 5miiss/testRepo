package spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.web.DAO.UserDao;
import spring.web.models.User;

@RestController
public class UsersController {
    
    @Autowired
    private UserDao userDao;

    @GetMapping("/users")
    public String test(){
        return "Hello World ! ";
    }

    @PostMapping("/users")
    public void add(@RequestBody User u){
        // System.out.println(u.getUsername());
        userDao.save(u);
    }
    
}
