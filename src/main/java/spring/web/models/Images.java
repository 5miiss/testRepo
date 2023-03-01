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
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Images generated by hbm2java
 */
@Entity
@Table(name="images"
    ,catalog="flamingoo"
)
public class Images  implements java.io.Serializable {


     private ImagesId id;
     private Product product;
     private String imageUrl;

    public Images() {
    }

    public Images(ImagesId id, Product product, String imageUrl) {
       this.id = id;
       this.product = product;
       this.imageUrl = imageUrl;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="productCategoryCategoriesId", column=@Column(name="product_category_categories_id", nullable=false) ), 
        @AttributeOverride(name="productCategoryId", column=@Column(name="product_category_id", nullable=false) ), 
        @AttributeOverride(name="productCategoryId1", column=@Column(name="product_category_id1", nullable=false) ), 
        @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )
    public ImagesId getId() {
        return this.id;
    }
    
    public void setId(ImagesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="product_id", referencedColumnName="category_categories_id", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="product_category_id1", referencedColumnName="category_id", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="product_category_categories_id", referencedColumnName="id", nullable=false, insertable=false, updatable=false) } )
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="image_url", nullable=false, length=45)
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }




}


