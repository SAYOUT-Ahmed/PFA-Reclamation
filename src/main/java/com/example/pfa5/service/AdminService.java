package com.example.pfa5.service;

import com.example.pfa5.bean.Admin;
import com.example.pfa5.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {


    private final AdminRepository adminRepository;


    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public <S extends Admin> S save(S entity) {
        return adminRepository.save(entity);
    }

    public Optional<Admin> findById(Long aLong) {
        return adminRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        adminRepository.deleteById(aLong);
    }
}
