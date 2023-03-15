package com.example.db_security.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
    @ManyToMany
    @JoinTable(name = "role_authority",joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private List<Authority> authorities;

}
