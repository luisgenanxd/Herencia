/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 * Luis Angel Orduña Marquez
 * 08/03/2017
 * Herencia
 */
public class Persona {
    private String nombre,apellidos,lugarNac,curp,rfc,Direccion,Ciudad,Email,NSS;
    private byte edad;
    private char sexo;
    
    public String mostrarDatos(){
        return( "Nombre: " +nombre+"\n"+
                "Apellidos: " +apellidos+"\n"+
                "Edad: " +edad+"\n"+
                "Sexo: " +sexo+"\n"+
                "Lugar de Nacimiento: " +lugarNac+"\n"+
                "Direccion: " +Direccion+"\n"+
                "Ciudad: " +Ciudad+"\n"+
                "Email: " +Email+"\n"+
                "Curp: " +curp+"\n"+
                "RFC: " +rfc+"\n"+
                "Numero del Seguro Social: " +NSS+"\n");
    }

    public Persona(String nombre, String apellidos, String lugarNac, String curp, String rfc, String Direccion, String Ciudad, String Email, String NSS, byte edad, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.lugarNac = lugarNac;
        this.curp = curp;
        this.rfc = rfc;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Email = Email;
        this.NSS = NSS;
        this.edad = edad;
        this.sexo = sexo;
    }

    
}
