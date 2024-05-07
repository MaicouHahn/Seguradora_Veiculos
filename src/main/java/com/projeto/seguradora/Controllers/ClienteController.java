package com.projeto.seguradora.Controllers;

import com.projeto.seguradora.Entities.Cliente;
import com.projeto.seguradora.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>>findAll(){
        List<Cliente>list= clienteService.findAll();
         return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente>findById(@PathVariable Long id){
        Cliente cli = clienteService.findById(id);
        return ResponseEntity.ok().body(cli);
    }
    @PostMapping
    public ResponseEntity<Cliente>insert(@RequestBody Cliente cliente){
        Cliente cli = clienteService.insert(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cod_cliente}").buildAndExpand(cli.getCod_cliente()).toUri();
        return ResponseEntity.created(uri).body(cli);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente>update(@PathVariable Long id,@RequestBody Cliente cli){
        Cliente obj = clienteService.update(id,cli);
        return ResponseEntity.ok().body(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
