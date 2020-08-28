package com.mapsa.store.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String username;
    String password;
}
