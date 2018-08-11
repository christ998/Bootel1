package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author Vinett
 */
public class InterfaceMenuAdmin extends javax.swing.JFrame implements ActionListener{
    
    JButton btnagregar,btneliminar,btnmod;
    
    public InterfaceMenuAdmin(){    
         
        setLayout(null);
        btnagregar = new JButton("Agregar Departamento");
        btnagregar.setBounds(50, 100, 200, 35);
        this.add(btnagregar);
        
        btneliminar = new JButton("Modificar Departamento");
        btneliminar.setBounds(50, 200, 200, 35);
        this.add(btneliminar);
        
        btnmod = new JButton("Eliminar Departamento");
        btnmod.setBounds(50, 300, 200, 35);
        this.add(btnmod);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }             
}
