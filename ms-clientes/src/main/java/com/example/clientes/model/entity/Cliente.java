package com.example.clientes.model.entity;

import com.example.clientes.rest.dto.ClienteDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cpf;

    @Column
    private String nome;

    @Column
    private Integer idade;

    public Cliente(ClienteDTO dto) {
        this.cpf = dto.getCpf();
        this.nome = dto.getNome();
        this.idade = dto.getIdade();
    }


}
