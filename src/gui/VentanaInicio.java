/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author V.Vinett, C. Herrera, J. LLanos
 */
public class VentanaInicio extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton btnLogin;
    private JButton btnRegister;
    private JButton btnLoginAd;
    private ImageIcon img;
    private JLabel etiqueta;
    
    public VentanaInicio(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,0, 1024, 720);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(250, 204, 0));
        contentPane.setForeground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        this.setTitle("BooTel");
        this.setResizable(false);
      
        /*
        JLabel lblBooTel = new JLabel("BooTel");
        lblBooTel.setBounds(302, 310, 413, 113);
        lblBooTel.setFont(new Font("Arial Black", Font.PLAIN, 80));
        lblBooTel.setForeground(new Color(0, 0, 0));
        contentPane.add(lblBooTel);
        */
        
        JLabel creators = new JLabel(" Created by : V. Vinett, C. Herrera, J. LLanos");
        creators.setBounds(20, 0 , 400, 50);
        creators.setFont(new Font("Arial Black", Font.PLAIN, 12));
        creators.setForeground(new Color(0, 0, 0));
        contentPane.add(creators);       
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(410, 500, 97, 25);
	btnLogin.setForeground(new Color(100,40,40));
	btnLogin.setBackground(new Color(255, 255, 130));
	btnLogin.setFont(new Font("Arial Black", Font.PLAIN, 13));
	btnLogin.addActionListener(this);
	contentPane.add(btnLogin);
        
        btnLoginAd = new JButton("Admin login");
        btnLoginAd.setBounds(446,660,140,17);
        btnLoginAd.setForeground(new Color(100,40,40));
        btnLoginAd.setBackground(new Color(255,255,130));
        btnLoginAd.setFont(new Font("Arial Black",Font.PLAIN, 13));
        btnLoginAd.addActionListener(this);
        contentPane.add(btnLoginAd);
        
        btnRegister = new JButton("Register");
        btnRegister.setBounds(530,500,97,25);
        btnRegister.setForeground(new Color(100,40,40));
        btnRegister.setBackground(new Color(255, 255, 130));
        btnRegister.setFont(new Font("Arial Black", Font.PLAIN, 13));
        btnRegister.addActionListener(this);
        contentPane.add(btnRegister);
        
        img = new ImageIcon("z_Imagenes/inicio.png");
        etiqueta = new JLabel(img);
        etiqueta.setBounds(355, 140 , 320, 300);
        this.add(etiqueta);             
    }    
           
    @Override
    public void actionPerformed(ActionEvent ae) {
            if(btnLogin == ae.getSource() ){               
                JLogin login = new JLogin(this,true);
                login.setVisible(true); 
                dispose();
                    
            }else if (btnLoginAd == ae.getSource()) {
                JLoginAdmin loginAd = new JLoginAdmin(this,true);
                loginAd.setVisible(true);
                
                
                
            }else if (btnRegister == ae.getSource()) {
                JRegister register = new JRegister (this,true);
                register.setVisible(true);                
        }
    }    
}
