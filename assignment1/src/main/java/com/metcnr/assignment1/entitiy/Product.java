package com.metcnr.assignment1.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "PRODUCTS")
@Getter
@Setter


public class Product
{

    @Id
    @GeneratedValue(generator = "product")
    @SequenceGenerator(name = "product", sequenceName = "product_id_sequence")
    private Long id;

    @Column(name = "PRODUCT_NAME",length = 100,nullable = false)
    private String name;

    @Column(name = "PRICE",length = 30,nullable = false)
    private Long price;

    @Column(name = "LAST_DATE",nullable = true)
    @Temporal(TemporalType.DATE)
    private Date date;


}
