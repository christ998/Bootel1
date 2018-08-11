/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import archivo.ArchivoRegister;

/**
 *
 * @author Vinett
 */
public class Register {
    private String username;
    private String password;
    private String rut;
    private String institucion;
    
    public Register(String username,String password,String rut,String institucion){
        this.username = username;
        this.password = password;
        this.rut = rut;
        this.institucion = institucion;       
    }
    
    public void registrarUsuario(){
        ArchivoRegister register = new ArchivoRegister();
        Cliente estudiante = new Cliente(this.username,this.password,this.rut,this.institucion);
        register.registrarUsuario(estudiante);
        
    }
}
