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
public class Administrador extends Persona{
    public int codIdentificador;
    public Administrador(String nombre, String rut,String pass,int codIdentificador) {
        super(nombre, rut, pass);
        this.codIdentificador=codIdentificador;
    }

    public int getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(int codIdentificador) {
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
    
}
