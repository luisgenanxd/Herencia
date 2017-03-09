package clases;

import javax.swing.JOptionPane;

/**
 * Luis Angel Orduña Marquez
 * 08/03/2017
 * Herencia
 */
public class PruebaPersona {

    /**
     * --------Notas sobre la clase------
     * Una cadena es un objeto de la clase String.
     * Los datos tipo Char son muy parecidos a los arrays
     */
    public static void main(String[] args) {
        
	//Inicia el proceso de pedir los datos
	String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos: ");
	String edad = JOptionPane.showInputDialog("Ingrese el edad: ");
        String LuNa = JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento: ");
        String sexo = JOptionPane.showInputDialog("Ingrese el Sexo:(H/M) ");
        String curp = JOptionPane.showInputDialog("Ingrese el Curp: ");
        String rfc = JOptionPane.showInputDialog("Ingrese el RFC: ");
        String direccion = JOptionPane.showInputDialog("Ingrese la Direccion: ");
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad: ");
        String email = JOptionPane.showInputDialog("Ingrese el email: ");
        String nss = JOptionPane.showInputDialog("Ingrese el NSS: ");
	String carrera = JOptionPane.showInputDialog("Ingrese la carrera: ");
        String NuCon = JOptionPane.showInputDialog("Ingrese el Numero de Control: ");
        String nip = JOptionPane.showInputDialog("Ingrese el Nip(4 digitos): ");
	String semestre = JOptionPane.showInputDialog("Ingrese el semestre: ");
	String CalifFinal = JOptionPane.showInputDialog("Ingrese el Promedio: ");
        //Convierte los datos necesarios a su respectivo tipo de dato
	byte eda = Byte.parseByte(edad);
        char Sexo = sexo.charAt(0);
        int noControl = Integer.parseInt(NuCon);
        short NIP = Short.parseShort(nip);
	int Semestre = Integer.parseInt(semestre);
	double promedio = Double.parseDouble(CalifFinal);
        
        //Constructor de la clase estudiante
        Estudiante Estudiante = new Estudiante(nombre,apellidos,LuNa,curp,rfc,direccion,ciudad,email,nss,
                eda,Sexo,carrera,noControl,Semestre,NIP,promedio);
        //Muestro los datos
        Estudiante.DaEstudiantes();

	String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String apellidos1 = JOptionPane.showInputDialog("Ingrese los apellidos: ");
	String edad1 = JOptionPane.showInputDialog("Ingrese la edad: ");
        String LuNa1 = JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento: ");
        String sexo1 = JOptionPane.showInputDialog("Ingrese el Sexo(H/M): ");
        String curp1 = JOptionPane.showInputDialog("Ingrese la CURP: ");
        String rfc1 = JOptionPane.showInputDialog("Ingrese el RFC: ");
        String direccion1 = JOptionPane.showInputDialog("Ingrese la Direccion: ");
        String ciudad1 = JOptionPane.showInputDialog("Ingrese la Ciudad: ");
        String email1 = JOptionPane.showInputDialog("Ingrese el email: ");
        String nss1 = JOptionPane.showInputDialog("Ingrese el Numero de Seguro Social: ");
	String sueldo = JOptionPane.showInputDialog("Ingrese el Sueldo: ");
        String categoria = JOptionPane.showInputDialog("Ingrese la Categoria: ");
        String puesto = JOptionPane.showInputDialog("Ingrese el puesto: ");
	String noTrabaj = JOptionPane.showInputDialog("Ingrese el Numero de Trabajador: ");
        
	
	byte edadT = Byte.parseByte(edad1);
        char sexoT = sexo1.charAt(0);
        double sueldoT = Double.parseDouble(sueldo);
        int NumTrabajador = Integer.parseInt(noTrabaj);
        
        Empleado Empleado = new Empleado(nombre1,apellidos1,LuNa1,curp1,rfc1,direccion1,ciudad1,email1,nss1,
                edadT,sexoT,puesto,categoria,NumTrabajador,sueldoT);

        Empleado.DaEmpleado();
        
    }

   
    
}
