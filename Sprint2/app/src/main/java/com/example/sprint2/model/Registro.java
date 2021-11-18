package com.example.sprint2.model;

public class Registro{
    private String nombre;
    private double estatura;
    private double peso;
    private double imc;

    public Registro() {
    }

    public Registro(String nombre, double estatura, double peso, double imc) {
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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
