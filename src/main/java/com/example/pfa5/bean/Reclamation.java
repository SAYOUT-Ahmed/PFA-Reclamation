package com.example.pfa5.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "reclamation")
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motif;
    private boolean criticite;
    private String commentaire;
    @ManyToOne
    private PieceJointe pieceJointe;
    @OneToOne
    private Service service;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public boolean isCriticite() {
        return criticite;
    }

    public void setCriticite(boolean criticite) {
        this.criticite = criticite;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public PieceJointe getPieceJointe() {
        return pieceJointe;
    }

    public void setPieceJointe(PieceJointe pieceJointe) {
        this.pieceJointe = pieceJointe;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
