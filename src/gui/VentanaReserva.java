/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import archivo.ArchivoDepto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vinett
 */
public class VentanaReserva extends javax.swing.JFrame implements ActionListener {
    VentanaSegura vs;
    ArchivoDepto ad;
    
    private JLabel lbl1,lbl2,lbl3,lbl4;
    public JTextField num1,num2,num3,num4;
    private JButton btnaceptar;
    private JComboBox operacion;
   
    
    
    
    public VentanaReserva() {
        
        this.setLayout(null);
        lbl1 = new JLabel("Nombre");
        lbl1.setBounds(50,50,110,20);
        this.add(lbl1);
        
        this.setLayout(null);
        lbl2 = new JLabel("Rut");
        lbl2.setBounds(50,150,110,20);
        this.add(lbl2);
        
        this.setLayout(null);
        lbl3 = new JLabel("numero");
        lbl3.setBounds(50,250,110,20);
        this.add(lbl3);
        
        this.setLayout(null);
        lbl4 = new JLabel("precio");
        lbl4.setBounds(50,350,110,20);
        this.add(lbl4);
        

        
        num1 = new JTextField();
        num1.setBounds(200, 50, 100, 20);
        this.add(num1);
        
        num2 = new JTextField();
        num2.setBounds(200, 150, 100, 20);
        this.add(num2);
      
        num3 = new JTextField();
        num3.setBounds(200, 250, 100, 20);
        num3.setEditable(false);
        this.add(num3);
      
        num4 = new JTextField();
        num4.setBounds(200, 350, 100, 20);
        num4.setEditable(false);
        this.add(num4);
        
        
       /*
        operacion = new JComboBox();
        operacion.setBounds(200, 250, 100, 20);
        this.add(operacion);
        operacion.addItem("1");
        operacion.addItem("2");
        operacion.addItem("3");
         */
        
        
        btnaceptar = new JButton("Aceptar");
        btnaceptar.setBounds(200, 450, 100, 20);
        btnaceptar.addActionListener(this);
        this.add(btnaceptar);
    }
 
    

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {  
        vs = new VentanaSegura();
        ad = new ArchivoDepto();
      
       if (btnaceptar == ae.getSource() ) {   
           System.out.println(num1.getText()+" - "+num2.getText());
       
           
           if (num1.getText().isEmpty() && num2.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Por favor, asegurece de ingresar datos en los campos que se le pide");
              
           }else if (num1.getText().isEmpty() || num2.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Asegurece de que en ambos campos tengan datos ");
               
           }else  {
          
            JOptionPane.showMessageDialog(this, "Por favor, vuelva a ingresar sus datos para así realizar una reserva segura");
            
            vs.setDefaultCloseOperation(3);
            vs.setSize(320,300);
            vs.setLocationRelativeTo(null);
            vs.setResizable(false);
            vs.setTitle("Seguridad");
            vs.setVisible(true);
            dispose();
           } 
           
            
       }
    }
    
}
