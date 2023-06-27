/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Ciudad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class CiudadService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearCiudades(){
        Ciudad cid = new Ciudad();//instanciamos ciudad y hashmap
        HashMap<Integer,String> listadociudades = new HashMap();
        
        //ingresamos datos
        int cont = 0;
        do{
            System.out.print("Por favor ingrese el nombre de la ciudad: ");
            cid.setNombre(read.next());
            System.out.print("Por favor ingrese el código postal sin Letra: ");
            cid.setCodigopostal(read.nextInt());
            cont += 1;
            listadociudades.put(cid.getCodigopostal(), cid.getNombre());
            
        }while(cont<=9);
        
        //mostrar datos introducidos
        System.out.println("Los datos introducidos fueron:");
        for (Map.Entry<Integer, String> entry : listadociudades.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + "  --- Nombre de la ciudad: " + entry.getValue());
            
        }
        //Desarrollo menú y llamo a los métodos
        int op;
        do{
            System.out.println("---- MENÚ DE CÓDIGOS POSTALES ----");
            System.out.println("1. Buscar código postal");
            System.out.println("2. Agregar código postal");
            System.out.println("3. Eliminar 3 ciudades");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Exit");
            
            System.out.println("Elija una opción: ");
            op = read.nextInt();
            switch (op) {
                case 1:
                    buscar(listadociudades);
                    break;
                case 2:
                    listadociudades = agregar(listadociudades);
                    break;
                case 3:
                    listadociudades = eliminar(listadociudades);
                    break;
                case 4:
                    System.out.println("Datos del listado: ");
                    for (Map.Entry<Integer, String> entry : listadociudades.entrySet()) {
                        System.out.println("Código Postal: " + entry.getKey() + "  --- Nombre de la ciudad: " + entry.getValue());
                       
                    }
                    break;
                case 5:
                    System.out.println("Exit - Gracias");
                    break;
                default:
                    System.out.println("!!!! Opción no válida !!!!");
            }
            
        }while(op != 5);
        
    }
    
    public void buscar(HashMap<Integer,String> listadociudades){
        System.out.println("Por favor ingrese un código postal a buscar: ");
        Integer busc = read.nextInt();
        boolean encontrado;
        encontrado = listadociudades.containsKey(busc);

        if(encontrado){
            for (Map.Entry<Integer, String> entry : listadociudades.entrySet()) {
                if(busc.equals(entry.getKey())){
                    System.out.println(" " + entry.getValue() + " --- es la ciudad "
                            + "a la que corresponde este código postal");
                }
                
            }
        }else{
            System.out.println("¡¡¡¡ Código Postal NO ENCONTRADO !!!!");
        }
    }
    
    public HashMap<Integer,String> agregar(HashMap<Integer,String> lisciudades){
        System.out.println("Ingrese el nombre de la ciudad que desea agregar: ");
        String cnueva = read.next();
        System.out.println("Ingrese el código postal de la nueva ciudad: ");
        Integer cpnuevo = read.nextInt();
        lisciudades.put(cpnuevo, cnueva);
        
        return lisciudades;
    }
    
    public HashMap<Integer,String> eliminar(HashMap<Integer,String> lisciudades){
        int cont1= 0, cont2 = 0, cont3 = 0;
        Integer codeliminar1 = 0, codeliminar2 = 0, codeliminar3 = 0;
        System.out.println("Ciudad -1- a eliminar: ");
        String c1 = read.next();
        System.out.println("Ciudad -2- a eliminar: ");
        String c2 = read.next();
        System.out.println("Ciudad -3- a eliminar: ");
        String c3 = read.next();
        
        for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
            if(entry.getValue().equalsIgnoreCase(c1)){
                cont1 += 1;
            }
            if(entry.getValue().equalsIgnoreCase(c2)){
                cont2 += 1;
                
            }
            if(entry.getValue().equalsIgnoreCase(c3)){
                cont3 += 1;
            }
            
        }
        if(cont1 > 1){
            for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
                if(entry.getValue().equalsIgnoreCase(c1)){
                  System.out.println("Código Postal: " + entry.getKey() + "  --- Nombre de la ciudad: " + entry.getValue());  
                }
                
            }
            System.out.println("Del listado anterior, por favor introduzca el código postal que desea eliminar: ");
            codeliminar1 = read.nextInt();
            lisciudades.remove(codeliminar1);
        }else{
            if(cont1 == 1){
                
                for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
                    if(entry.getValue().equalsIgnoreCase(c1)){
                        codeliminar1 = entry.getKey();
                    }
                }
                lisciudades.remove(codeliminar1);
            }else{
                System.out.println("Ciudad: " + c1 +" no encontrada en la lista");
            }    
        }    
        if(cont2 > 1){
            for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
                if(entry.getValue().equalsIgnoreCase(c2)){
                  System.out.println("Código Postal: " + entry.getKey() + "  --- Nombre de la ciudad: " + entry.getValue());  
                }
                
            }
            System.out.println("Del listado anterior, por favor introduzca el código postal que desea eliminar: ");
            codeliminar2 = read.nextInt();
            lisciudades.remove(codeliminar2);
        }else{
            if(cont2 == 1){
                for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
                    if(entry.getValue().equalsIgnoreCase(c2)){
                        codeliminar2 = entry.getKey();
                    }
                }  
                lisciudades.remove(codeliminar2);
            }else{
                System.out.println("Ciudad: " + c2 +" no encontrada en la lista");
            }    
        }
        if(cont3 > 1){
            for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
                if(entry.getValue().equalsIgnoreCase(c3)){
                  System.out.println("Código Postal: " + entry.getKey() + "  --- Nombre de la ciudad: " + entry.getValue());  
                }
                
            }
            System.out.println("Del listado anterior, por favor introduzca el código postal que desea eliminar: ");
            codeliminar3 = read.nextInt();
            lisciudades.remove(codeliminar3);
        }else{
            if(cont3 == 1){
                for (Map.Entry<Integer, String> entry : lisciudades.entrySet()) {
                    if(entry.getValue().equalsIgnoreCase(c3)){
                        codeliminar3 = entry.getKey();
                    }
                }
                lisciudades.remove(codeliminar3);
            }else{
                System.out.println("Ciudad: " + c3 +" no encontrada en la lista");
            }    
        }    
        
        System.out.println("Ciudades eliminadas!!!");
        return lisciudades;
    }
}
