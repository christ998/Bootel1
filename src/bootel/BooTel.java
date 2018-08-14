
package bootel;

import gui.InterfaceBorrarUsuario;
import gui.VentanaInicio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Vinett, C. Herrera , J. LLanos
 */

   public class BooTel {   // Clase principal
    public static void main(String[] args) throws FileNotFoundException, IOException {       
        VentanaInicio ventana = new VentanaInicio();
        ventana.setVisible(true);
        /*InterfaceBorrarUsuario b = new InterfaceBorrarUsuario();
        b.eliminaLineasBlancas();
        FileReader fr = new FileReader("Registro.txt");
		BufferedReader lr = new BufferedReader(fr);
		String lee;
		String texto="";
		while((lee=lr.readLine())!=null) {
			texto+=lee;
		}
		System.out.println(texto);*/
        /*File f = new File("Registro.txt");
        if(f.delete()){
            System.out.println("Eliminado");*/
        }
        
        }
    

