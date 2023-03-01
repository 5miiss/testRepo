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
import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name="category"
    ,catalog="flamingoo"
)
public class Category  implements java.io.Serializable {


     private CategoryId id;
     private Category category;
     private String categoryName;
     private String image;
     private Set<Category> categories = new HashSet<Category>(0);
     private Set<Product> products = new HashSet<Product>(0);

    public Category() {
    }

	
    public Category(CategoryId id, Category category, String categoryName, String image) {
        this.id = id;
        this.category = category;
        this.categoryName = categoryName;
        this.image = image;
    }
    public Category(CategoryId id, Category category, String categoryName, String image, Set<Category> categories, Set<Product> products) {
       this.id = id;
       this.category = category;
       this.categoryName = categoryName;
       this.image = image;
       this.categories = categories;
       this.products = products;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="categoriesId", column=@Column(name="categories_id", nullable=false) ), 
        @AttributeOverride(name="id", column=@Column(name="id", nullable=false) ) } )
    public CategoryId getId() {
        return this.id;
    }
    
    public void setId(CategoryId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categories_id", nullable=false, insertable=false, updatable=false)
    @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)

    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

    
    @Column(name="category_name", nullable=false, length=45)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
    @Column(name="image", nullable=false, length=45)
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="category")
    public Set<Category> getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="category")
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}


