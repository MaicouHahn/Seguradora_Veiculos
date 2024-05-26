package com.projeto.seguradora.Controllers;

import com.projeto.seguradora.Entities.Carro;
import com.projeto.seguradora.Services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public ResponseEntity<List<Carro>>findAll(){
        List<Carro>carros = carroService.findAll();
        return  ResponseEntity.ok().body(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro>findById(@PathVariable Long id){
        Carro carro = carroService.findById(id);
        return ResponseEntity.ok().body(carro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro>insert(@PathVariable Long id, @RequestBody Carro carro){
        Carro carroAtualiza = carroService.update(id,carro);
        return ResponseEntity.ok().body(carroAtualiza);
    }

    @PostMapping
    public ResponseEntity<Carro>insert(@RequestBody Carro carro){
        Carro carroInsert = carroService.insert(carro);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(carroInsert.getId()).toUri();
        return ResponseEntity.created(uri).body(carroInsert);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Carro>deleteById(@PathVariable Long id){
        carroService.delete(id);
        return  ResponseEntity.noContent().build();
    }

}
