/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import java.util.Scanner;

/**
 *
 * @author Vinett
 */
public class Menu {
    Scanner scr = new Scanner(System.in);
    MenuAdmin ma = new MenuAdmin();
    MenuCliente mc = new MenuCliente();
    
    public void crearMenu(){
        
        System.out.println("Ingrese una opcion (1. cliente , 2. admin)");
        int opcion = scr.nextInt();
        if (opcion == 1){
            mc.crearMenuCliente();
            
        }else {
            ma.crearMenuAdmin();
        }
        
    }
}
