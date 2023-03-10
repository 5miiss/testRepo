package spring.web.models;
// default package
// Generated Mar 1, 2023, 9:16:41 AM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name="address"
    ,catalog="flamingoo"
)
public class Address  implements java.io.Serializable {


     private AddressId id;
     private User user;
     private String street;
     private String city;
     private String country;
     private String postCode;

    public Address() {
    }

    public Address(AddressId id, User user, String street, String city, String country, String postCode) {
       this.id = id;
       this.user = user;
       this.street = street;
       this.city = city;
       this.country = country;
       this.postCode = postCode;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="id", nullable=false) ), 
        @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ) } )
    public AddressId getId() {
        return this.id;
    }
    
    public void setId(AddressId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="street", nullable=false, length=45)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="city", nullable=false, length=45)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="country", nullable=false, length=45)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="post_code", nullable=false, length=45)
    public String getPostCode() {
        return this.postCode;
    }
    
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }




}


