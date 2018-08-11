/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;


import bootel.Admin;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import bootel.Cliente;
/**
 *
 * @author Vinett
 */
public class ArchivoRegister {
    
    // Se escribira un archivo en la carpeta del proyecto llamado Reserva.txt
    //Registo de Usuario
     public void registrarUsuario(Cliente nueva){
        try{
            File f = new File("Registro.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.pass+";"+nueva.institucion);
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.pass+";"+nueva.institucion);               
            }
            
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
        
    //Registro de Admin
    //Se guarda en un archivo Admins.txt
    }
          public void registrarAdmin(Admin nueva){
        try{
            File f = new File("Admins.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.pass+";"+nueva.codIdentificador);
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.pass+";"+nueva.codIdentificador);               
            }
            
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    
    }
}
