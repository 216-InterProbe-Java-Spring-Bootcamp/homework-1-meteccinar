package com.metcnr.assignment1.controller;

import com.metcnr.assignment1.dao.ProductDao;
import com.metcnr.assignment1.entitiy.Product;
import com.metcnr.assignment1.entitiy.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController
{

    private final ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product)
    {
        return productDao.save(product);
    }

    @GetMapping
    public List<Product> findAll()
    {
        return productDao.findAll();
    }


    @GetMapping("/AfterDateSKT")
    public List<Product> findAllByDateAfter(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date today)
    {
        return productDao.findAllByDateAfter(today);
    }

    @GetMapping("/BeforeDateSKT")
    public List<Product> findAllByDateBefore(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date today)
    {
        return productDao.findAllByDateBefore(today);
    }



}
