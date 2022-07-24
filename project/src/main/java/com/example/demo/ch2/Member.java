package com.example.demo.ch2;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
@Data
public class Member {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private Integer age;
}
