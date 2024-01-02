package com.example.pfa5.bean;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.tomcat.util.codec.binary.Base64;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "piece jointe")
@Data
@AllArgsConstructor
public class PieceJointe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    @Column(name = "photo", columnDefinition = "BLOB")
    private byte[] photo;
    private String type;
    // @JsonIgnore
    @OneToMany
    private List<Reclamation> reclamation;

    public PieceJointe() {

    }


    //Ghadi ncreeryiw wst l constructeur wa7d l arraylist bach ntfko mn NULL POINTER EXCEPTION wink wink ;)
    /*public PieceJointe() {
        this.reclamation = new ArrayList<>();
    }*/


  /*  public PieceJointe(byte[] photoBytes,String name, String type) {
        this.name = name;
        this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes) : null;
        this.type = type;
    }*/
}