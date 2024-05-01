package com.projeto.seguradora.Entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_cliente;
    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String telefone_fixo;
    private String telefone_celular;

    public Cliente(){

    }
    public Cliente(Long cod_cliente, String nome, String cpf, String sexo, String endereco, String telefone_fixo, String telefone_celular) {
        this.cod_cliente = cod_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone_fixo = telefone_fixo;
        this.telefone_celular = telefone_celular;
    }

    public Long getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Long cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone_fixo() {
        return telefone_fixo;
    }

    public void setTelefone_fixo(String telefone_fixo) {
        this.telefone_fixo = telefone_fixo;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cod_cliente, cliente.cod_cliente) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && Objects.equals(sexo, cliente.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod_cliente, nome, cpf, sexo);
    }
}
