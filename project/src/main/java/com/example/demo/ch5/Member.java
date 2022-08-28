package com.example.demo.ch5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "member5")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @Column(name = "member_id")
    private String id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Member(String id, String username) {
        this.id = id;
        this.username = username;
    }
}
