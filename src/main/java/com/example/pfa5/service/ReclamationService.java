package com.example.pfa5.service;

import com.example.pfa5.bean.Reclamation;
import com.example.pfa5.repository.ReclamationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReclamationService {

    private final ReclamationRepository reclamationRepository;


    public List<Reclamation> findAll() {
        return reclamationRepository.findAll();
    }

    public <S extends Reclamation> S save(S entity) {
        return reclamationRepository.save(entity);
    }

    public Optional<Reclamation> findById(Long aLong) {
        return reclamationRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        reclamationRepository.deleteById(aLong);
    }
}
