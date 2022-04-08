package com.springShop.springShop.repository;

import com.springShop.springShop.entity.Product;
import com.springShop.springShop.entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findByProductType(ProductType productType);

}