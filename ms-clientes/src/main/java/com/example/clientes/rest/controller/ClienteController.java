package com.example.clientes.rest.controller;

import com.example.clientes.model.entity.Cliente;
import com.example.clientes.rest.dto.ClienteDTO;
import com.example.clientes.service.impl.ClienteServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clientes")
@Slf4j// Acesso aos log
public class ClienteController {

    @Autowired
    private ClienteServiceImpl service;

    @GetMapping("/status")

    public String status() {
        log.info("Obtendo status do Microserviço de clientes.");
        return "Microsserviços de Cliente Rodando!";
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ClienteDTO dto) {
        Cliente cliente = service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("{cpf}")
    public ResponseEntity getByCpf(@RequestParam String cpf) {
        var cliente = service.getByCpf(cpf);
        if (cliente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }


}
