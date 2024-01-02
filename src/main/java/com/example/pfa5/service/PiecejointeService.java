package com.example.pfa5.service;

import com.example.pfa5.bean.PieceJointe;
import com.example.pfa5.repository.PiecejointeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PiecejointeService {

    private final PiecejointeRepository piecejointeRepository;

    public List<PieceJointe> findAll() {
        return piecejointeRepository.findAll();
    }

    public <S extends PieceJointe> S save(S entity) {
        return piecejointeRepository.save(entity);
    }

    public Optional<PieceJointe> findById(Long aLong) {
        return piecejointeRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        piecejointeRepository.deleteById(aLong);
    }

    public void savePJ(MultipartFile file, String name , String type) throws IOException {
        PieceJointe pieceJointe  = new PieceJointe();
        pieceJointe.setPhoto(file.getBytes());
        pieceJointe.setName(name);
        pieceJointe.setType(type);
         piecejointeRepository.save(pieceJointe);
    }


    /*public PieceJointe savePieceJointe(MultipartFile file, String name, String type) throws IOException, SQLException {
        PieceJointe pieceJointe = new PieceJointe();
        pieceJointe.setName(name);
        pieceJointe.setType(type);

        if (!file.isEmpty()) {
            byte[] photoBytes = file.getBytes();
            byte[] photoBlob = new byte[0];
            pieceJointe.setPhoto(Arrays.toString(photoBlob));
        }

        return piecejointeRepository.save(pieceJointe);
    }

    public PieceJointe savePieceJointe(byte[] photoBytes, String name, String type) {
        PieceJointe pieceJointe = new PieceJointe(photoBytes, name, type);
        return piecejointeRepository.save(pieceJointe);
    }*/



}



