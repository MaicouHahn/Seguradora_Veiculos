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

    public Cliente update(Long id,Cliente cli){
        Cliente clienteDTO = clienteRepository.getReferenceById(id);
        updateCliente(clienteDTO,cli);
        return clienteRepository.save(clienteDTO);
    }

    private void updateCliente(Cliente clienteDTO,Cliente cliente){
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setcpf(cliente.getcpf());
        clienteDTO.setSexo(cliente.getSexo());
        clienteDTO.setEndereco(cliente.getEndereco());
        clienteDTO.setTelefone_fixo(cliente.getTelefone_fixo());
        clienteDTO.setTelefone_celular(cliente.getTelefone_celular());
    }
}
