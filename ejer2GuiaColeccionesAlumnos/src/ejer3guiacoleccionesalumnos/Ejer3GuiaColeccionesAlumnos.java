/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3guiacoleccionesalumnos;

import Entidad.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer3GuiaColeccionesAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        AlumnoService as = new AlumnoService();//instancio objeto tipo servicio
        ArrayList<Alumno> listadoAlumnos = new ArrayList();//instancio arraylist tipo objeto
        String op;
        String nombreE;
        double pro;
        boolean cont = false;
        
        do{
            Alumno al = as.crearAlumno();//creo el alumno con sus atributos
            listadoAlumnos.add(al);//añado cada alumno creado en el listado
            System.out.println("Desea ingresar otro Alumno?: " + "(Y/N)");
            op = read.next();
        }while(op.equalsIgnoreCase("Y"));
        
        System.out.println("Por favor ingrese el nombre completo "
                + "del estudiante del cual desea ver el promedio de notas: ");
        nombreE = read.next();
        for (Alumno listadoAlumno : listadoAlumnos) {
            if(nombreE.equalsIgnoreCase(listadoAlumno.getNombrecompleto())){
                pro = as.notaFinal(listadoAlumno.getNotas());
                System.out.println("El promedio es: " + pro);
                cont = true;
            }
        }
        if(cont){
            
        }else{
            System.out.println("El estudiante NO se encuentra en el listado de Alumnos");
        }
    }
    
}
