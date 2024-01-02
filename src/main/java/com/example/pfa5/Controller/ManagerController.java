package com.example.pfa5.Controller;

import com.example.pfa5.bean.Manager;
import com.example.pfa5.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/managers")
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping("/all")
    public List<Manager> findAll() {
        return managerService.findAll();
    }

    @PostMapping("/save-manager")
    public <S extends Manager> S save(@RequestBody S entity) {
        return managerService.save(entity);
    }

    @GetMapping("/manager/{id}")
    public Optional<Manager> findById(@PathVariable Long id) {
        return managerService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@RequestBody Long id) {
        managerService.deleteById(id);
    }
}
