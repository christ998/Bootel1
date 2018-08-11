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
public class Cliente extends Persona{
    public String institucion;
    public String nombre;
    public String rut;
    
    public Cliente(String nombre, String rut,String pass,String institucion) {
        super(nombre, rut,pass);
        this.institucion=institucion;
        this.nombre=nombre;
        this.rut=rut;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
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
   
}
