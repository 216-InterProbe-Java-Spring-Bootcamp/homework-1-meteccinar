package com.metcnr.assignment1.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table (name = "PRODUCT_COMMENTS")
@Getter
@Setter



public class ProductComment
{

    @Id
    @GeneratedValue(generator = "productComment")
    @SequenceGenerator(name = "productComment", sequenceName = "productComment_id_sequence")
    private Long id;

    @Column(name = "COMMENT",length = 500,nullable = false)
    private String comment;

    @Column(name = "COMMENT_DATE",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
            (
                    cascade = CascadeType.ALL,
                    fetch   = FetchType.LAZY
            )
    @JoinColumn
            (
                    name = "PRODUCT_ID",
                    foreignKey = @ForeignKey(name = "foreign_product",value = ConstraintMode.CONSTRAINT)
            )
    private Product product;

    @ManyToOne
            (
                    cascade = CascadeType.ALL,
                    fetch   = FetchType.LAZY
            )
    @JoinColumn
            (
                    name = "USER_ID",
                    foreignKey = @ForeignKey(name = "foreign_user",value = ConstraintMode.CONSTRAINT)
            )
    private User user;




}
