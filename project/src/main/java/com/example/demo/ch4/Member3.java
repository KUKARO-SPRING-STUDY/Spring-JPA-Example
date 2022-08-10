package com.example.demo.ch4;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "member4",
        uniqueConstraints = {@UniqueConstraint(
                name = "NAME_AGE_UNIQUE",
                columnNames = {"name", "age"}
        )})
@Data
public class Member3 {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;
}
