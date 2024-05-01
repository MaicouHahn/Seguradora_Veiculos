package com.projeto.seguradora.Services;

import com.projeto.seguradora.Entities.Cliente;
import com.projeto.seguradora.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente>findAll(){
        return clienteRepository.findAll();
    }

    public Cliente insert(Cliente obj){
        obj.setCod_cliente(null);
        return clienteRepository.save(obj);
    }

}
