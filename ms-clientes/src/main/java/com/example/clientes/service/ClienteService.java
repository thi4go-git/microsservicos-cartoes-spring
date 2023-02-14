package com.example.clientes.service;

import com.example.clientes.model.entity.Cliente;
import com.example.clientes.rest.dto.ClienteDTO;

import java.util.Optional;

public interface ClienteService {
    Cliente save(ClienteDTO dto);

    Optional<Cliente> getByCpf(String cpf);
}
