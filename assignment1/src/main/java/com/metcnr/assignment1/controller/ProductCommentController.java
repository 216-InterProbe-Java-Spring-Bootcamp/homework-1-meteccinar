package com.metcnr.assignment1.controller;

import com.metcnr.assignment1.dao.ProductCommentDao;
import com.metcnr.assignment1.entitiy.ProductComment;
import com.metcnr.assignment1.entitiy.User;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productComment")
public class ProductCommentController
{

    private final ProductCommentDao productCommentDao;

    @PostMapping
    public ProductComment save(@RequestBody ProductComment productComment)
    {
        return productCommentDao.save(productComment);
    }

    @GetMapping
    public List<ProductComment> findAll()
    {
        return productCommentDao.findAll();
    }

    @GetMapping("/listComments")
    public List<ProductComment> findAllByProduct_id(@RequestParam Long id)
    {
        return productCommentDao.findAllByProduct_id(id);
    }

    @GetMapping("/listBetweenDate")
    public List<ProductComment> findAllByProduct_idAndDateBetween(
                                                                    @RequestParam Long id,
                                                                    @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
                                                                    @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate
                                                                    )
    {
        return productCommentDao.findAllByProduct_idAndDateBetween(id,startDate,endDate);
    }


    @GetMapping("/userCommentlistBetweenDate")
    public List<ProductComment> findAllByUser_IdAndDateBetween(
            @RequestParam Long id,
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate
    )
    {
        return productCommentDao.findAllByUser_IdAndDateBetween(id,startDate,endDate);
    }




}
