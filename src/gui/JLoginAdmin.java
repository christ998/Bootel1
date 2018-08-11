/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bootel.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author V. Vinett, C. Herrera, J. Jhanos.
 */

public class JLoginAdmin extends JDialog implements ActionListener{
    private final JPanel contentPanel;
    private JTextField textField;
    private JTextField textField_cod;
    private JPasswordField textField_1;
    private JButton btnIngresar;
    private VentanaInicio ventanaPrincipal;
    private ImageIcon img;
    private JLabel userimg;
    
    
    public JLoginAdmin (VentanaInicio ventana, boolean b){
        super(ventana,b);
        this.contentPanel = new JPanel();
        this.ventanaPrincipal = ventana;       
        setResizable(false);       
        setTitle("Login");
        
        
        img = new ImageIcon("z_Imagenes/loginImage/usuario.png");
        userimg = new JLabel(img);
        userimg.setBounds(60, 1 , 120, 100);
        this.add(userimg);
        
        contentPanel.setBackground(new Color(255, 255 ,120));
        
        setBounds(this.getParent().getX() + 600, this.getParent().getY() + 150, 260, 410);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(150, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(4, 4, 5, 40));               
        
        {
            JLabel lblNewLabel = new JLabel("Usuario:");           
            contentPanel.add(lblNewLabel);
        }
        {
            textField = new JTextField();
            contentPanel.add(textField);
            textField.setColumns(10);
        }
        {
            JLabel lblNewLabel_1 = new JLabel("Password");
            contentPanel.add(lblNewLabel_1);
        }
        {
            textField_1 = new JPasswordField();          
            contentPanel.add(textField_1);
            textField_1.setColumns(10);
        }
        {
            JLabel lblNewLabel_cod = new JLabel("Codigo");
            contentPanel.add(lblNewLabel_cod);
        }
        {
            textField_cod = new JTextField();
            contentPanel.add(textField_cod);
            textField.setColumns(10);
        }    
        {
            JLabel lblNewLabel_2 = new JLabel("");
            contentPanel.add(lblNewLabel_2);
        }
        {
            btnIngresar = new JButton("Ingresar");
            btnIngresar.addActionListener(this);
            contentPanel.add(btnIngresar);
        }                
    }     

    @Override
    public void actionPerformed(ActionEvent ae) {
        InterfaceMenuAdmin imd = new InterfaceMenuAdmin();
        if (btnIngresar == ae.getSource()) {
            Login log = new Login(textField.getText(),String.copyValueOf(textField_1.getPassword()),textField_cod.getText());
            if(log.usuarioAdminExiste()) { // Este se ejecutara si un cliente ingresa a la app
                
                
                imd.setDefaultCloseOperation(3);
                imd.setSize(300,480);
               
                imd.setLocationRelativeTo(null);
                imd.setResizable(false);
                imd.setTitle("Modo Administrador");
                imd.setVisible(true);   
                dispose();                                   
            }else if (textField.getText().isEmpty() && textField_1.getText().isEmpty() && textField_cod.getText().isEmpty()) {  
                JOptionPane.showMessageDialog(this, "Los campos de texto estan vacio, asegurece de ingresar un nombre y una contraseña");
                this.textField.setText("");
                this.textField_1.setText("");
                              
                    }else if ((textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_cod.getText().isEmpty())){
                    JOptionPane.showMessageDialog(this, "Debe ingresar datos en todos los campos");
                    this.textField.setText("");
                    this.textField_1.setText("");
                    
                    } else {
                       JOptionPane.showMessageDialog(this, "El usuario no existe");
                        this.textField.setText("");
                        this.textField_1.setText(""); 
                }          
            }           
        }
    }
    
