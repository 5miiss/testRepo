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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderDetails generated by hbm2java
 */
@Entity
@Table(name="order_details"
    ,catalog="flamingoo"
)
public class OrderDetails  implements java.io.Serializable {


     private OrderDetailsId id;
     private User user;
     private Timestamp deleverDate;
     private Timestamp orderDate;
     private String status;
     private String paymentMethod;
     private String totalPrice;
     private Set<OrderItems> orderItemses = new HashSet<OrderItems>(0);

    public OrderDetails() {
    }

	
    public OrderDetails(OrderDetailsId id, User user, Timestamp deleverDate, Timestamp orderDate, String status) {
        this.id = id;
        this.user = user;
        this.deleverDate = deleverDate;
        this.orderDate = orderDate;
        this.status = status;
    }
    public OrderDetails(OrderDetailsId id, User user, Timestamp deleverDate, Timestamp orderDate, String status, String paymentMethod, String totalPrice, Set<OrderItems> orderItemses) {
       this.id = id;
       this.user = user;
       this.deleverDate = deleverDate;
       this.orderDate = orderDate;
       this.status = status;
       this.paymentMethod = paymentMethod;
       this.totalPrice = totalPrice;
       this.orderItemses = orderItemses;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="id", nullable=false) ), 
        @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ) } )
    public OrderDetailsId getId() {
        return this.id;
    }
    
    public void setId(OrderDetailsId id) {
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="delever_date", nullable=false, length=19)
    public Timestamp getDeleverDate() {
        return this.deleverDate;
    }
    
    public void setDeleverDate(Timestamp deleverDate) {
        this.deleverDate = deleverDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="order_date", nullable=false, length=19)
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    
    @Column(name="status", nullable=false, length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="payment_method", length=45)
    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    
    @Column(name="total_price", length=45)
    public String getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="orderDetails")
    public Set<OrderItems> getOrderItemses() {
        return this.orderItemses;
    }
    
    public void setOrderItemses(Set<OrderItems> orderItemses) {
        this.orderItemses = orderItemses;
    }




}

