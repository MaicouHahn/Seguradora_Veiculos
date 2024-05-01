package com.projeto.seguradora.Repositories;

import com.projeto.seguradora.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
