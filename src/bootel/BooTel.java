
package bootel;

import gui.VentanaInicio;
import java.io.BufferedReader;
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
        /*FileReader fr = new FileReader("InfoDepto.txt");
        BufferedReader lr = new BufferedReader(fr);
        String leer;
        while(!lr.readLine().contains("Final")){
            leer = lr.readLine();
            System.out.println(leer);*/
        }
    }

