package com.example.pfa5.service;

import com.example.pfa5.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public List<com.example.pfa5.bean.Service> findAll() {
        return serviceRepository.findAll();
    }

    public <S extends com.example.pfa5.bean.Service> S save(S entity) {
        return serviceRepository.save(entity);
    }

    public Optional<com.example.pfa5.bean.Service> findById(Long aLong) {
        return serviceRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        serviceRepository.deleteById(aLong);
    }
}
