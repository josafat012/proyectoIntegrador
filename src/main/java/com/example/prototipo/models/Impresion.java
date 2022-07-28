package com.example.prototipo.models;

public class Impresion extends User {

    public Impresion(){

    }

    public Impresion(String usuario, String genero) {
        super(usuario, genero);
    }

    @Override
    public String toString() {
        return "Datos:\n" + super.toString();
    }
}
