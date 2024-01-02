package com.example.pfa5.Controller;

import com.example.pfa5.bean.Service;
import com.example.pfa5.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/services")
public class ServiceController {

    private final ServiceService serviceService;


    @GetMapping("/all")
    public List<Service> findAll() {
        return serviceService.findAll();
    }

    @PostMapping("/save-service")
    public <S extends Service> S save(@RequestBody S entity) {
        return serviceService.save(entity);
    }

    @GetMapping("/service/{id}")
    public Optional<Service> findById(@PathVariable Long id) {
        return serviceService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        serviceService.deleteById(id);
    }
}
