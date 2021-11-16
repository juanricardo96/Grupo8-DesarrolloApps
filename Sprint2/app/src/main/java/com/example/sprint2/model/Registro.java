package com.example.sprint2.model;

public class Registro {
    private String nombre;
    private Float estatura;
    private Float peso;
    private Float imc;

    public Registro() {
    }

    public Registro(String nombre, Float estatura, Float peso, Float imc) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.imc = imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }
}
