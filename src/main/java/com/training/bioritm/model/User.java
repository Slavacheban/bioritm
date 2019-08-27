package com.training.bioritm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "user-bio")
public class User extends BaseEntity {
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "role")
    private Role role;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "bioritm")
    private List<Bioritm> bioritmList;
}
