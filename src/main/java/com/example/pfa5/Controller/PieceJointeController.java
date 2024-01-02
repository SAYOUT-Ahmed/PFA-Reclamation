package com.example.pfa5.Controller;

import com.example.pfa5.bean.PieceJointe;
import com.example.pfa5.service.PiecejointeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@RestController
@RequestMapping("/piecejointes")
public class PieceJointeController {

    private final PiecejointeService piecejointeService;

    @GetMapping("/all")
    public List<PieceJointe> findAll() {
        return piecejointeService.findAll();
    }

/*    @PostMapping("/save-pj")
    public <S extends PieceJointe> S save(@RequestBody S entity) {
        return piecejointeService.save(entity);
    }*/

    @GetMapping("/pj/{id}")
    public Optional<PieceJointe> findById(@PathVariable Long id) {
        return piecejointeService.findById(id);
    }

    @DeleteMapping("/delete/pj/{id}")
    public void deleteById(@PathVariable Long id) {
        piecejointeService.deleteById(id);
    }

    @PostMapping("/save-pj")
    public void savePJ(@RequestParam("file")MultipartFile file,
                       @RequestParam("name") String name,
                       @RequestParam("type") String type) throws IOException {
         piecejointeService.savePJ(file,name,type);

    }

}
