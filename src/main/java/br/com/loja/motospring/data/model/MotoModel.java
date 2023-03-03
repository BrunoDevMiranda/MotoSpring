package br.com.loja.motospring.data.model;

import jakarta.persistence.*;



@Entity
public class MotoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String modelo;
    @Column(nullable = false, length = 50)
    private String marca;
    @Column(nullable = false, length = 50)
    private String tipo;
    @Column(nullable = false, length = 50)
    private int ano;
    @Column(nullable = false, length = 50)
    private double preco;
    @Column(nullable = false, length = 150)
    private String foto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MotoModel() {
    }

    public MotoModel(Long id, String modelo, String marca, String tipo, int ano, double preco, String foto) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.ano = ano;
        this.preco = preco;
        this.foto = foto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
