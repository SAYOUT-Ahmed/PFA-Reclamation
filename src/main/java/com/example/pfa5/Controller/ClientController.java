package com.example.pfa5.Controller;

import com.example.pfa5.bean.Client;
import com.example.pfa5.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/all")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/save-client")
    public <S extends Client> S save(@RequestBody S entity) {
        return clientService.save(entity);
    }

    @GetMapping("/client/{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}
