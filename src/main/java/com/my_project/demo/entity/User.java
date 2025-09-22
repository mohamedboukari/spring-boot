package com.my_project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    Long idUser;
    String nom;
    String prenom;
    @Column(length = 8)
    Long cin;

}
