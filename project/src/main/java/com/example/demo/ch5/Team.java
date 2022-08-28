package com.example.demo.ch5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team5")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @Column(name = "team_id")
    private String id;

    private String name;
}