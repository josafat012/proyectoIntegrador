package com.example.prototipo.models;

import java.util.ArrayList;

public class AdminDefault {
    ArrayList<User> administrador = new ArrayList<>();

    public AdminDefault(){
        administrador.add(new User("Administrador", "admin1234@com", "Hombre", "admin", "12345"));
    }
    public boolean autenticarUser(String username, String password){
        boolean status = false;
        User user = findUser(username);
        if ( user != null && user.getPassword().equals(password))
            status = true;
        return status;

    }

    private User findUser(String username){
        User user = null;
        boolean status = false;
        int index = 0;
        while (!status && index< administrador.size()){
            if (administrador.get(index).getUsername().equals(username)){
                user = administrador.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }

}
