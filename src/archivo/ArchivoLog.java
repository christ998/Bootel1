/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import bootel.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;




/**
 *
 * @author Vinett
 */
public class ArchivoLog {
    
        public boolean existeCliente(String nombre, String pass){
            try {
            File f = new File("Registro.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
               // boolean bandera = false;
                while((linea = br.readLine()) != null){
                    String estudiante [] = linea.split(";");
                    if (estudiante[0].equals(nombre) && estudiante[1].equals(pass)) {
                        
                        Cliente c = new Cliente(estudiante[0],estudiante[1],estudiante[2],estudiante[3]);
                        
                        System.out.println("Estimado :"+c.getNombre());                                                      
                        System.out.println("Ha iniciado session exitosamente");
                        
                        return true;
                    }
                }
            }  
        }catch(Exception e){
         System.out.println("ERROR");
        }  
            return false;
   }
        
            public boolean existeAdmin(String nombre, String pass, String cod){
            try {
            File f = new File("Admins.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
               // boolean bandera = false;
                while((linea = br.readLine()) != null){
                    String[] admin = linea.split(";");
                    if (admin[0].equals(nombre) && admin[2].equals(pass) && admin[3].equals(cod)) {
                        
                        Cliente c = new Cliente(admin[0],admin[1],admin[2],admin[3]);
                        return true;
                    }
                }
            }    
        }catch(Exception e){
        System.out.println("ERROR");
        }  
            return false;
   }
}
