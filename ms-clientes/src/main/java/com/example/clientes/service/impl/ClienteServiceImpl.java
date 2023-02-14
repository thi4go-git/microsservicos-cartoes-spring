package com.example.clientes.service.impl;

import com.example.clientes.model.entity.Cliente;
import com.example.clientes.model.repository.ClienteRepository;
import com.example.clientes.rest.dto.ClienteDTO;
import com.example.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository repository;


    @Override
    @Transactional
    public Cliente save(ClienteDTO dto) {
        return repository.save(new Cliente(dto));
    }


    @Override
    @Transactional
    public Optional<Cliente> getByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    
}
