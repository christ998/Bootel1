/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import archivo.ArchivoDepto;
import archivo.ArchivoLog;

import bootel.Reserva;
import bootel.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Vinett
 */
public class VentanaSegura extends JFrame implements ActionListener {
    
    VentanaReserva  vr = new VentanaReserva();;
    Login log;
    ArchivoDepto ad = new ArchivoDepto();;
    
    JLabel lbl5,lbl6;
    private JTextField num5;
    private JPasswordField num6;
    JButton btnaceptoseguro;    
    public VentanaSegura () {
        this.setLayout(null);
        lbl5 = new JLabel("Usuario");
        lbl5.setBounds(50,50,100,30);
        this.add(lbl5);
        
        this.setLayout(null);
        lbl6 = new JLabel("Password");
        lbl6.setBounds(50,100,100,30);
        this.add(lbl6);
        
        num5 = new JTextField();
        num5.setBounds(100,50,100,30);
        this.add(num5);
        
        num6 = new JPasswordField();
        num6.setBounds(100,100,100,30);
        this.add(num6);
        
        btnaceptoseguro = new JButton("Aceptar");
        btnaceptoseguro.setBounds(100,150,100,30);
        btnaceptoseguro.addActionListener(this);
        this.add(btnaceptoseguro);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        
        ad = new ArchivoDepto();
        
        if(btnaceptoseguro == ae.getSource()){     
            log = new Login(num5.getText(),String.copyValueOf(num6.getPassword()));
            if (log.usuarioClienteExiste()) {
              
                Reserva r = new Reserva(vr.num1.getText(),vr.num2.getText(),vr.num3.getText(),vr.num4.getText());
                ad.reservarDepto(r, vr.num1.getText() , vr.num2.getText());
                JOptionPane.showMessageDialog(this, "La reserva ha sido realizada con exito.");
                dispose();
                }else  {
                    JOptionPane.showMessageDialog(this, "no se ha podido realizar la reserva, por favor\n"
                         + "verifique sus datos, e itentelo nuevamente");
                }
            }            
        }
    }



