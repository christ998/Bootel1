/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

/**
 *
 * @author V. Vinett, C. Herrera, J. llanos.
 */
public class Admin extends Persona{
    public String codIdentificador;
    
    public Admin(String nombre, String rut,String pass,String codIdentificador) {
        super(nombre, rut,pass);
        this.nombre=nombre;
        this.codIdentificador=codIdentificador;
        this.rut=rut;
    }
    
       

    public String getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(String codIdentificador) {
        this.codIdentificador = codIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
