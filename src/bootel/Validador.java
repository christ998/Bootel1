package bootel;

/**
 *
 * @author V. Vinett, C. Herrera, J. llanos.
 */

public class Validador {

//Metodo para validar rut
    
public   boolean validarRut (String rut ) {
        boolean validacion = false;
        
        try {
            if(rut.matches("^[0-9]{1,2}.[0-9]{3}.[0-9]{3}-(k|[0-9]{1})$")){ // exprecion regular para validar el rut 
                validacion = true;
            }
        }catch(java.lang.NumberFormatException e){            
        }catch (Exception e){            
        }    
       return validacion; 
}

public boolean validarNombre(String nombre){
   
    boolean validacion = false;
    try {      
        if (nombre.matches("^[A-Z]{1}[a-z]*$")){   // exprecion regular para validar nombre         
            validacion = true;
        }                   
    }catch(java.lang.NumberFormatException e) {        
    }catch (Exception e){       
    }
   return validacion; 
}

public boolean validarTexto(String text){
    boolean validacion = false;    
    try {
        if(text.matches("^[A-zZ-a]*$")){ // exprecion regular para validar textos 
            validacion = true;
        }       
    }catch (java.lang.NumberFormatException e){       
    }catch (Exception e){       
    }    
    return validacion;
}

public boolean validarPass (String pass) {
    boolean validacion = false;
    try {      
        if (pass.matches("[a-z]{6,}[1-9]{1,}")) {
            validacion = true;
        }
    }catch (java.lang.NumberFormatException e){       
    }catch (Exception e){
    }
    return validacion;
}
}
