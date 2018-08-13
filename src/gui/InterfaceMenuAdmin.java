package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Vinett
 */
public class InterfaceMenuAdmin extends javax.swing.JFrame {
    
    JButton btnagregar, btneliminar, btnmod;
    private InterfaceBorrarUsuario delete;
    
    public InterfaceMenuAdmin() {        
        
        setLayout(null);
        btnagregar = new JButton("Agregar Departamento");
        btnagregar.setBounds(50, 100, 200, 35);
        this.add(btnagregar);
        
        btneliminar = new JButton("Modificar Departamento");
        btneliminar.setBounds(50, 200, 200, 35);
        this.add(btneliminar);
        
        btnmod = new JButton("BAN");
        btnmod.setBounds(50, 300, 200, 35);
        this.add(btnmod);
        
        ActionListener ban = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    delete = new InterfaceBorrarUsuario();
                    delete.setVisible(true);
                    dispose();
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceMenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        btnmod.addActionListener(ban);
        
    }
    
}
