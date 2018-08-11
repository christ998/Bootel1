/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import bootel.Cliente;
import bootel.Departamento;
import bootel.Reserva;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
/**
 *
 * @author Vinett
 */
public class ArchivoDepto {
    
    public void mostrarDeptos() {
       
        try{
            File f = new File("Departamentos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                        
                        
                        String [] cont = linea.split(";");
                        Departamento inv = new Departamento(cont[0],cont[1],cont[2],cont[3],cont[4],cont[5],cont[6],cont[7],cont[8],cont[9]);
                        inv.mostrarDepto();
                        System.out.println("--------------------------");                   
                }
            }else {
                System.out.println("No existen departamentos");
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
    
    public void reservarDepto(Reserva nueva,String nombreEstudiante,String rutEstudiante){
        boolean bandera = false;
         try {
            File f = new File("Registro.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
               // boolean bandera = false;
                while((linea = br.readLine()) != null){
                    String estudiante [] = linea.split(";");
                    if (estudiante[0].equals(nombreEstudiante) && estudiante[1].equals(rutEstudiante)) {
                        bandera = true;
                        Cliente c = new Cliente(estudiante[0],estudiante[1],estudiante[2],estudiante[3]);
                        
                        System.out.println("Estimado :"+c.getNombre());                                                      
                        System.out.println("Su Reserva ha sido realizada con exito!");
                        
                    }
                }
                if (bandera==false){
                    System.out.println("Este cliente no se encuentra resgistrado");
                    System.out.println("No se ha podido realizar la reserva");
                }
                
            }else {
                System.out.println("No hay nada por buscar");
            }
        }catch(Exception e){
           // System.out.println("ERROR");
        }
        if (bandera==true){
            try{
                File f = new File("Reserva.txt");
                FileWriter fw;
                BufferedWriter bw;
               
                if(f.exists()){
                     fw = new FileWriter(f,true);
                     bw = new BufferedWriter(fw);
                     bw.newLine();
                     bw.write(nueva.nombreEstudiante+";"+nueva.rutEstudiante+";"+nueva.numeroDepto+";"+nueva.precio);
                  
                    
                }else {
                     fw = new FileWriter(f);
                     bw = new BufferedWriter(fw);
                     bw.write(nueva.nombreEstudiante+";"+nueva.rutEstudiante+";"+nueva.numeroDepto+";"+nueva.precio);
                    
                }
                
                bw.close();
                fw.close();
            }catch(Exception e){
                System.out.println("ERROR");
            }
        } else {
            System.out.println("");
        }
    }
}
