/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import Informacion.Convertir;
import Informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan Rodriguez
 */
public class Archivos {
    List<Datos> contenido = new ArrayList<>();
    
    public List<Datos> Leer(){
        String linea;
        Datos datos;
        try {
            FileReader archivo =new FileReader("Datos.txt");
            BufferedReader br = new BufferedReader(archivo);
            
            try {
                while ((linea = br.readLine()) != null){
                    datos= new Datos();
                    Convertir convertir = new Convertir();
                    datos = convertir.aclase(linea);
                    contenido.add(datos);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            } catch (IOException ex) {
                ex.printStackTrace();
        }
        return contenido;
    }
    
    public boolean Grabar(Datos cadena){
        Convertir convertir = new Convertir();
        boolean estado = true;
        try {
            FileWriter archivo = new FileWriter("Datos.txt",true);
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write(convertir.ajson(cadena)+"\n");
            bw.close();
            archivo.close();
            
        } catch (IOException ex) {
           ex.printStackTrace();
           estado = false;
        } 
        return estado;
        
    }
    
}
