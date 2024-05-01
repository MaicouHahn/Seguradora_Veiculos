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
    @PostMapping
    public ResponseEntity<Cliente>insert(@RequestBody Cliente cliente){
        Cliente cli = clienteService.insert(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cod_cliente}").buildAndExpand(cli.getCod_cliente()).toUri();
        return ResponseEntity.created(uri).body(cli);
    }
}
