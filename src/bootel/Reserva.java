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
public class Reserva {
    
    public String nombreEstudiante;
    public String numeroDepto,precio;
    public String rutEstudiante;
   
    
    public Reserva(String nombreEstudiante,String rutEstudiante,String numeroDepto,String precio){
        this.nombreEstudiante=nombreEstudiante;
        this.rutEstudiante=rutEstudiante;
        this.numeroDepto=numeroDepto;
        this.precio = precio;

    }
    
    public void mostrarReserva(){
        String msj ="";
        msj = "\t"+this.nombreEstudiante;
        msj +="\t\t"+this.rutEstudiante;
        msj +="\t\t"+this.numeroDepto;
        msj +="\t\t"+this.precio;
    }

}
