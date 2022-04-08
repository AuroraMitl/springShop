package com.springShop.springShop.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private Double price;


    @Column(name="new_product")
    private Boolean newProduct;

    @Column(name="hot_product")
    private Boolean hotProduct;

    @Column(name="old_product")
    private Double oldPrice;

    private String image;

    @Column(length=65536)
    @Type(type="text")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_type_id")
    private ProductType productType;

    public Product(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Boolean newProduct) {
        this.newProduct = newProduct;
    }

    public Boolean getHotProduct() {
        return hotProduct;
    }

    public void setHotProduct(Boolean hotProduct) {
        this.hotProduct = hotProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }






}
