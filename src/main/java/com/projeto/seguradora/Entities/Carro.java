package com.projeto.seguradora.Entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private String chassi;
    private String marca;
    private Integer ano;
    private String cor;

    public Carro(){

    }
    public Carro(Long id, String placa, String modelo, String chassi, String marca, Integer ano, String cor) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.chassi = chassi;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(id, carro.id) && Objects.equals(placa, carro.placa) && Objects.equals(modelo, carro.modelo) && Objects.equals(chassi, carro.chassi) && Objects.equals(marca, carro.marca) && Objects.equals(ano, carro.ano) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placa, modelo, chassi, marca, ano, cor);
    }
}
