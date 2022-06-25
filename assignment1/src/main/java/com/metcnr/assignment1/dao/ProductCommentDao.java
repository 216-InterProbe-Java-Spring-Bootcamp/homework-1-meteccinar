package com.metcnr.assignment1.dao;

import com.metcnr.assignment1.entitiy.Product;
import com.metcnr.assignment1.entitiy.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface ProductCommentDao extends JpaRepository<ProductComment,Long>
{

    List<ProductComment> findAllByProduct_id(Long id);
    List<ProductComment> findAllByUser_IdAndDateBetween(Long id,Date start, Date end);
    List<ProductComment> findAllByProduct_idAndDateBetween(Long id,Date start, Date end);


}
