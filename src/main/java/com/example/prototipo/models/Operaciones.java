package com.example.prototipo.models;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Operaciones {
    Almanaque usuarios = new Almanaque();
    private String datos;

    public String imprimir(){
        for (int i = 0; i<usuarios.userAdmin.size(); i++){
            datos += usuarios.userAdmin.get(i).toString() + "\n";
        }
        return datos;
    }
    public void redireccionar(String link){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI(link);
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }
        }
    }
}
