
package clases;

import javax.swing.JOptionPane;

/**
 * Luis Angel Orduña Marquez
 * 08/03/2017
 * Herencia
 */
public class Empleado extends Persona{
    private String puesto, categoria;
    private int NumTrabajador;
    private double sueldo;
    
    //Constructor el cual es heredado de la clase Persona y se le añaden los valores que se requieren en esta clase
    public Empleado(String nombre, String apellidos, String lugarNac, String curp, String rfc, String Direccion,
            String Ciudad, String Email, String NSS, byte edad, char sexo,String puesto,String categoria,int NumTraba, double suel) {
        super(nombre, apellidos, lugarNac, curp, rfc, Direccion, Ciudad, Email, NSS, edad, sexo);
        //Variables de esta clase
        this.puesto = puesto;
        this.categoria = categoria;
        this.NumTrabajador = NumTraba;
        this.sueldo = suel;
    }

    public void DaEmpleado(){
	JOptionPane.showMessageDialog(null, mostrarDatos()+
                                            "Puesto: " +puesto+"\n"+
                                            "Sueldo: " +sueldo+"\n"+
                                            "Numero del Trabajador: " +NumTrabajador);
	}
}
