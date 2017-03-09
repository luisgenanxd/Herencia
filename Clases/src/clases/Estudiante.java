
package clases;

import javax.swing.JOptionPane;

/**
 * Luis Angel Orduña Marquez
 * 08/03/2017
 * Herencia
 */
public class Estudiante extends Persona{
    private String carrera;
    private int NoControl,semestre;
    private short Nip;
    private double Promedio;

    public void DaEstudiantes(){
	JOptionPane.showMessageDialog(null, mostrarDatos()+
                                            "Numero de Control: " +NoControl+"\n"+
                                            "Nip: " +Nip+"\n"+
                                            "Carrera: " +carrera+"\n"+
                                            "Semestre: " +semestre+"\n"+
                                            "Promedio: " +Promedio+"\n");
	}
    //Constructor el cual es heredado de la clase Persona y se le añaden los valores que se requieren en esta clase
    public Estudiante(String nombre, String apellidos, String lugarNac, String curp, String rfc, String Direccion,
            String Ciudad, String Email, String NSS, byte edad, char sexo, String carrera, int NoControl, int Semestre, short Nip,
            double Promedio) {
        super(nombre, apellidos, lugarNac, curp, rfc, Direccion, Ciudad, Email, NSS, edad, sexo);
        //Variables de esta clase
        this.carrera = carrera;
        this.semestre = Semestre;
        this.Nip = Nip;
        this.Promedio = Promedio;
        this.NoControl = NoControl;
             
    }

}
