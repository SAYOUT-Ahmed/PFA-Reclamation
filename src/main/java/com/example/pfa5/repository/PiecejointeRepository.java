package com.example.pfa5.repository;

import com.example.pfa5.bean.PieceJointe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiecejointeRepository extends JpaRepository<PieceJointe, Long> {
}
