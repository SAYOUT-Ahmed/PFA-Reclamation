package com.example.pfa5.service;

import com.example.pfa5.bean.Client;
import com.example.pfa5.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;


    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public <S extends Client> S save(S entity) {
        return clientRepository.save(entity);
    }

    public Optional<Client> findById(Long aLong) {
        return clientRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        clientRepository.deleteById(aLong);
    }
}
