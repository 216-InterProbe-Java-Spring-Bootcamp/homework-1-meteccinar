package com.metcnr.assignment1.entitiy;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "USERS")
@Getter
@Setter

public class User
{
    @Id
    @GeneratedValue(generator = "user")
    @SequenceGenerator(name = "user", sequenceName = "user_id_sequence")
    private Long id;

    @Column(name = "NAME",length = 100,nullable = false)
    private String name;

    @Column(name = "SURNAME",length = 100,nullable = false)
    private String surname;

    @Column(name = "EMAIL",length = 256,nullable = false)
    private String email;

    @Column(name = "PHONE",length = 256,nullable = false)
    private String phoneNumber;

    @OneToMany
            (
                    cascade = CascadeType.ALL,
                    fetch = FetchType.LAZY,
                    mappedBy = "user"
            )
    private List<ProductComment> productComment;


}
