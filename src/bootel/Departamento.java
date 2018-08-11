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
public class Departamento {
    public String numero;
    public String nHabitacion;
    public String nBaño;
    public String estacionamiento;
    public String capacidad;
    public String distC;
    public String distU;
    public String valor;
    public String parteCercana;
    public String infoDepto;
  
    
  
    public Departamento(String numero, String nHabitacion,String nBaño,String estacionamiento, String capacidad,String distC,String distU,String parteCercana,String valor,String infoDepto){
        this.numero=numero;
        this.nHabitacion=nHabitacion;
        this.nBaño=nBaño;
        this.estacionamiento=estacionamiento;
        this.capacidad=capacidad;
        this.distC=distC;
        this.distU=distU;
        this.parteCercana=parteCercana;
        this.valor=valor;
        this.infoDepto=infoDepto;
        
    }


    
    
    
    public void mostrarDepto(){
        String msj="";
        msj =  "\t"+this.numero;
        msj += "\t\t"+this.capacidad;
        msj += "\t\t"+this.nHabitacion;
        msj += "\t\t"+this.nBaño;
        msj += "\t\t"+this.estacionamiento;
        msj += "\t\t\t"+this.distC;
        msj += "\t\t\t\t"+this.distU;
        msj += "\t\t\t"+this.parteCercana;        
        msj += "\t\t\t"+this.valor;
        msj += "\t\t"+this.infoDepto;
        System.out.println(msj);
    }
    
    
}
