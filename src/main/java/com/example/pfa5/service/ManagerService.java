package com.example.pfa5.service;

import com.example.pfa5.bean.Manager;
import com.example.pfa5.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManagerService {

    private final ManagerRepository managerRepository;

    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    public <S extends Manager> S save(S entity) {
        return managerRepository.save(entity);
    }

    public Optional<Manager> findById(Long aLong) {
        return managerRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        managerRepository.deleteById(aLong);
    }
}
