/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import archivo.ArchivoLog;
/**
 *
 * @author Vinett
 */
public class Login {
     private String username;
     private String password;
     private String cod;
     private ArchivoLog log ;
    
    public Login (String username, String password){ // constructor para el usuario
        this.username=username;
        this.password=password;
    }
    
    public Login (String username,String password,String cod){ // constructor para el admin
        this.cod = cod;
        this.username = username;
        this.password=password;
    }


     public boolean usuarioClienteExiste(){
        log = new ArchivoLog();        
         if (log.existeCliente(username, password)){
             return true;          
         }else {
             return false;
         }   
     }
     
    public boolean usuarioAdminExiste(){
        log = new ArchivoLog();        
         if (log.existeAdmin(username, password,cod)){
             return true;          
         }else {
             return false;
         }   
     }
     
     
     
}
