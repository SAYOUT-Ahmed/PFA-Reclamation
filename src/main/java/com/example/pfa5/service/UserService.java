package com.example.pfa5.service;

import com.example.pfa5.bean.User;
import com.example.pfa5.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }

    public Optional<User> findById(Long aLong) {
        return userRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        userRepository.deleteById(aLong);
    }
}
