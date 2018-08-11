/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Vinett
 */
public class InterfaceMenu extends JFrame implements ActionListener {
    
    InterfaceMenuCliente  imc;
    
    private JLabel lblimg1,lblimg2,lblimg3,lblimg4,lblimg5,lblimg6,lbl1,lbl2,lblcama1,lblbaño1,lblcama2,lblbaño2,lblprecio1,lblprecio2,etiqueta ;
    private JTextField num ;
    private ImageIcon img1,img2,img3,img4,img5,img6;
    private JButton btnver1,btnver2;
    public InterfaceMenu () {
        
        setLayout(null);
        img1 = new ImageIcon("z_imagenes/depto1/depa1.png");
        lblimg1 = new JLabel (img1);
        lblimg1.setBounds(100,50,130,112);
        this.add(lblimg1);
        
        img2 = new ImageIcon("z_imagenes/depto2/depa2.png");
        lblimg2 = new JLabel(img2);
        lblimg2.setBounds(100,200,130,112);
        this.add(lblimg2);
        
        img3 = new ImageIcon("z_imagenes/iconImage/iconcama.png");
        lblimg3 = new JLabel(img3);
        lblimg3.setBounds(250,150,22,13);
        this.add(lblimg3);
        
        img4 = new ImageIcon("z_imagenes/iconImage/iconbaño.png");
        lblimg4 = new JLabel(img4);
        lblimg4.setBounds(300,150,22,13);
        this.add(lblimg4);
        
        img5 = new ImageIcon("z_imagenes/iconImage/iconcama.png");
        lblimg5 = new JLabel(img5);
        lblimg5.setBounds(250,300,22,13);
        this.add(lblimg5);
        
        img6 = new ImageIcon("z_imagenes/iconImage/iconbaño.png");
        lblimg6 = new JLabel(img6);
        lblimg6.setBounds(300,300,22,13);
        this.add(lblimg6);
        
        
        lbl1 = new JLabel("Arriendo centro");
        lbl1.setBounds(245,50,100,20);
        this.add(lbl1);
        
        lbl2 = new JLabel("Arriendo cerca de UFRO");
        lbl2.setBounds(245,200,200,20);
        this.add(lbl2);
        
        lblcama1 = new JLabel("1");
        lblcama1.setBounds(280,148,35,20);
        this.add(lblcama1);
        
        lblbaño1 = new JLabel("1");
        lblbaño1.setBounds(330,148,35,20);
        this.add(lblbaño1);
        
        lblcama2 = new JLabel("2");
        lblcama2.setBounds(280,295,35,20);
        this.add(lblcama2);
        
        lblbaño2 = new JLabel("1");
        lblbaño2.setBounds(330,295,35,20);
        this.add(lblbaño2);
        
        lblprecio1 = new JLabel("$ 80.000 CLP");
        lblprecio1.setBounds(245,80,100,20);
        this.add(lblprecio1);
        
        lblprecio2 = new JLabel("$150.000");
        lblprecio2.setBounds(245,230,100,20);
        this.add(lblprecio2);
        
        btnver1 = new JButton("Ver");
        btnver1.setBounds(400, 80, 55, 20);
        btnver1.addActionListener(this);
        this.add(btnver1);
        
        btnver2 = new JButton("Ver");
        btnver2.setBounds(400, 230, 55, 20);
        btnver2.addActionListener(this);
        this.add(btnver2);
        
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        imc = new InterfaceMenuCliente();
       if (btnver1 == ae.getSource()) {
           imc.setDefaultCloseOperation(3);
           imc.setSize(1024,720); // 1024 , 720 clienteMenu
           imc.setLocationRelativeTo(null);
           //imc.setResizable(false);
           imc.setTitle(" Menu  BooTel ");
           imc.setVisible(true);   
           dispose();  
           
       }
    }
    
}
