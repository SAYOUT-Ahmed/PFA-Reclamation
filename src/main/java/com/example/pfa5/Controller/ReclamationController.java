package com.example.pfa5.Controller;


import com.example.pfa5.bean.Reclamation;
import com.example.pfa5.service.ReclamationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reclamations")
public class ReclamationController {

    private final ReclamationService reclamationService;



    @GetMapping("/all")
    public List<Reclamation> findAll() {
        return reclamationService.findAll();
    }

    @PostMapping("/save-reclamation")
    public <S extends Reclamation> S save(@RequestBody S entity) {
        return reclamationService.save(entity);
    }

    @GetMapping("/reclamation/{id}")
    public Optional<Reclamation> findById(@PathVariable Long id) {
        return reclamationService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        reclamationService.deleteById(id);
    }
}
