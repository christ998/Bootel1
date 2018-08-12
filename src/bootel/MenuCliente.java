/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import archivo.ArchivoRegister;
import archivo.ArchivoAdmin;
import archivo.ArchivoDepto;
import java.util.Scanner;
/**
 *
 * @author V. Vinett, C. Herrera, J. llanos.
 */
public class MenuCliente {
    Scanner sc = new Scanner(System.in);
    ArchivoRegister registra = new ArchivoRegister();
    ArchivoDepto muestra = new ArchivoDepto();
    ArchivoAdmin ad = new ArchivoAdmin();
    String nombreEstudiante,institucion,rutEstudiante,pass;
    int nDepto;
    int precio=0;
    int estado;
   
    private int opcion;
    private boolean op = true;
    
    public void crearMenuCliente(){
        while(op){
            
            System.out.println("Menu");
            System.out.println("1. Mostrar departamentos disponibles");
            System.out.println("2. Registrate");
            System.out.println("3. Hacer una reserva");
            System.out.println("4. Salir");
            
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            
            if (opcion == 4){
                
                System.out.println("Usted ha salido del programa");
                break;
                
            }else {
                
                switch(opcion){
                    
                    case 1:
                        muestra.mostrarDeptos();
                        break;
                        
                    case 2:
                        Validador valida = new Validador();
                        System.out.println("Bienvenido");
                        do {
                        System.out.println("Por favor ingrese su nombre ");
                        nombreEstudiante = sc.next();
                        if (!valida.validarNombre(nombreEstudiante)){
                            System.out.println("Asegurese de estar ingresando un nombre correcto(La primera letra tiene que ser Mayuscula)");                            
                        }
                        }while(!(valida.validarNombre(nombreEstudiante)));
                        
                        do {     
                        System.out.println("Por favor ingrese su rut (Con puntos y guion)");
                        rutEstudiante  = sc.next();
                        if(!valida.validarRut(rutEstudiante)){
                            System.out.println("Asegurese de ingresar un rut correcto");                         
                        }
                        }while((!valida.validarRut(rutEstudiante))) ;
                        
                        do {
                        System.out.println("Por favor ingrese su universidad a la que pertenece");
                        institucion = sc.next();
                        if(!valida.validarTexto(institucion)){
                            System.out.println("Asegurate de ingresar una institucion correcta");
                        }
                        }while(!valida.validarTexto(institucion));  
                        System.out.println("Ingrese una contraseña que desee");
                        pass = sc.next();
                        Cliente estudiante = new Cliente(nombreEstudiante,rutEstudiante,pass,institucion);
                        registra.registrarUsuario(estudiante);
                        break;
                    case 3 :
                        
                       
                        System.out.println("Para realizar una reserva asegurese de estar registrado");
                        System.out.println("Ingrese su nombre");
                        nombreEstudiante = sc.next();
                        System.out.println("Ingrese su rut");
                        rutEstudiante = sc.next();
                        System.out.println("Ingrese el numero de departamento que desea");
                        nDepto = sc.nextInt();
                        

                        
                        Reserva reserva = new Reserva(nombreEstudiante,rutEstudiante,String.valueOf(nDepto),String.valueOf(precio));  
                        
                        muestra.reservarDepto(reserva);
                        
                        
                        break;
                        
                    default: 
                        
                        System.out.println("La opcion que ha marcado no es valida. por favor intente nuevamente");
                    
                        }
                        
            }
        }
    }
}
