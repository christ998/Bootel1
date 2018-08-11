/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import bootel.Departamento;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Vinett
 */
public class ArchivoAdmin {
    
        public void agregarDepto(Departamento nueva){
        try{
            File f = new File("Departamentos.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(nueva.numero+";"+nueva.nHabitacion+";"+nueva.nBaño+";"+nueva.estacionamiento+";"+nueva.capacidad+";"+nueva.distC+";"+nueva.distU+";"+nueva.parteCercana+";"+nueva.valor+";"+nueva.infoDepto);
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(nueva.numero+";"+nueva.nHabitacion+";"+nueva.nBaño+";"+nueva.estacionamiento+";"+nueva.capacidad+";"+nueva.distC+";"+nueva.distU+";"+nueva.parteCercana+";"+nueva.valor+";"+nueva.infoDepto);               
            }
            
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
        
        public void eliminarDepto(String num){
            try {
            File f=new File("Departamentos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                int numLineas = 0;
                while ((linea = br.readLine()) != null){
                    numLineas++;
                }
                System.out.println("Departamentos totales: "+numLineas);
                String cont [] = new String[numLineas]; // arreglo de cadena para almacenar la informacion
                br = new BufferedReader(new FileReader(f)); // inicialisando un nuevo buffer
                int i=0;
                while ((linea = br.readLine())!=null){
                    cont[i] = linea;
                    i++;
                }
                br.close();
                fr.close(); // los cerramos, ya que se termino de leer (ocupar)
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                boolean bandera = false;
                boolean primeraL = true;
                for (int j=0; j < cont.length;j++){
                    String l [] = cont [j].split(";"); 
                    if (l[0].equals(num)){
                        bandera = true;
                        System.out.println("Departamento eliminado con exito");
                        
                    }else {
                        if (primeraL == true){
                        bw.write(cont[j]);
                        primeraL = false;
                        }else {
                            bw.newLine();
                            bw.write(cont[j]);
                        }                        
                    }                   
                }
                
                if ( bandera == false){
                    System.out.println("No se encontro el departamento seleccionado");
                }
                bw.close();
                fw.close();
                if (numLineas == 1 && bandera == true){ // si hay 1 departamento registrado, y lo elinamos se eliminara el archivo que almacena los datos
                    f.delete();                  
                }
                
            }else {
                System.out.println("No hay departamentos por eliminar");
            }
            } catch (Exception e){
                System.out.println(e);
            }
        }

}
