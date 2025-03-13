/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Estudiante {
    private int cedular;
    private String nombre;
    private String apellidos;

    public Estudiante(int cedular, String nombre, String apellidos) {
        this.cedular = cedular;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
        
    

    public int getCedular() {
        return cedular;
    }

    @Override
    public String toString() {
        return "Estudiante" + "Cedular:" + cedular + ". Nombre: " + nombre + ". Apellidos: " + apellidos ;
    }

    public void setCedular(int cedular) {
        this.cedular = cedular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
     
    
     public Estudiante(){
}
}