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
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String userName;
    private int age;
}
