package com.metcnr.assignment1.dao;

import com.metcnr.assignment1.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface ProductDao extends JpaRepository<Product,Long>
{

    List<Product> findAllByDateAfter(Date date);
    List<Product> findAllByDateBefore(Date date);


}
