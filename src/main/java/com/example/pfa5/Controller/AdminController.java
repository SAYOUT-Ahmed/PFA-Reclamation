package com.example.pfa5.Controller;

import com.example.pfa5.bean.Admin;
import com.example.pfa5.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/all")
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @PostMapping("/save-admin")
    public <S extends Admin> S save(@RequestBody S entity) {
        return adminService.save(entity);
    }

    @GetMapping("/admin/{id}")
    public Optional<Admin> findById(@PathVariable Long id) {
        return adminService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        adminService.deleteById(id);
    }
}
