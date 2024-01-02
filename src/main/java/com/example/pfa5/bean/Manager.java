package com.example.pfa5.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager extends User {
    private String matricule;
}
