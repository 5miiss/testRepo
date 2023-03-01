package spring.web.models;
// default package
// Generated Mar 1, 2023, 9:16:41 AM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * User generated by hbm2java
 */

 @Component
 @XmlRootElement
@Entity
@Table(name="user"
    ,catalog="flamingoo"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class User  implements java.io.Serializable {


     private int id;
     private String username;
     private String password;
     private String firstName;
     private String lastName;
     private String gender;
     private String email;
     private String phone;
     private String isAdmin;
     private Set<Product> products = new HashSet<Product>(0);
     private Set<CreditCards> creditCardses = new HashSet<CreditCards>(0);
     private Set<Address> addresses = new HashSet<Address>(0);
     private Set<OrderDetails> orderDetailses = new HashSet<OrderDetails>(0);

    public User() {
    }

	
    public User( String username, String password, String firstName, String lastName, String gender, String email, String phone, String isAdmin) {
        
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.isAdmin = isAdmin;
    }
    public User(String username, String password, String firstName, String lastName, String gender, String email, String phone, String isAdmin, Set<Product> products, Set<CreditCards> creditCardses, Set<Address> addresses, Set<OrderDetails> orderDetailses) {
       
       this.username = username;
       this.password = password;
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.email = email;
       this.phone = phone;
       this.isAdmin = isAdmin;
       this.products = products;
       this.creditCardses = creditCardses;
       this.addresses = addresses;
       this.orderDetailses = orderDetailses;
    }
   
     @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="username", unique=true, nullable=false, length=45)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false, length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="gender", nullable=false, length=45)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="phone", nullable=false, length=45)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="isAdmin", nullable=false, length=45)
    public String getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_review_product", catalog="flamingoo", joinColumns = { 
        @JoinColumn(name="user_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false), 
        @JoinColumn(name="product_category_id", nullable=false, updatable=false), 
        @JoinColumn(name="product_category_categories_id", nullable=false, updatable=false) })
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<CreditCards> getCreditCardses() {
        return this.creditCardses;
    }
    
    public void setCreditCardses(Set<CreditCards> creditCardses) {
        this.creditCardses = creditCardses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Address> getAddresses() {
        return this.addresses;
    }
    
    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<OrderDetails> getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set<OrderDetails> orderDetailses) {
        this.orderDetailses = orderDetailses;
    }




}

