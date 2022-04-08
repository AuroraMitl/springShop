package com.springShop.springShop.repository;

import com.springShop.springShop.entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {

}