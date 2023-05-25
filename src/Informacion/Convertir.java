/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

import com.google.gson.Gson;

/**
 *
 * @author Brayan Rodriguez
 */


public class Convertir {
    
    public Datos aclase(String cadena){
        Gson gson= new Gson();
        return gson.fromJson(cadena,Datos.class);
        
    }
    
    public String ajson(Datos datos){
        Gson gson = new Gson();
        return gson.toJson(datos);
    }
}
