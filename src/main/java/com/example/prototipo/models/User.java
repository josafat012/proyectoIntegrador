package com.example.prototipo.models;

public class User {
    private String nombre;
    private String username;
    private String password;
    private String sexo;
    private String correo;

    public  User(){

    }

    public  User(String username, String sexo){
        this.username = username;
        this.sexo = sexo;

    }

    public User(String nombre, String correo, String sexo, String username, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.sexo = sexo;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario= " + username + "\nGenero: " + sexo;
    }
}
