package com.cg.daos;
import com.cg.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO  extends JpaRepository<Product, Integer>{
   
}