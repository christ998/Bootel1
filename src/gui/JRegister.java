/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bootel.Register;
import bootel.Validador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 * @author Vinett
 */
public class JRegister extends JDialog implements ActionListener {
    private final JPanel contentPanel;
    private final JTextField textField,textField_r1,textField_r2;
    private final JPasswordField textField_1;
    private JButton btnIngresar;
    private VentanaInicio ventanaPrincipal;
    
    public JRegister(VentanaInicio ventana, boolean b){
        super(ventana,b);
        this.contentPanel = new JPanel();
        
        this.ventanaPrincipal = ventana;
        setResizable(false);
        setTitle("Register");
        
        contentPanel.setBackground(new Color(255,255,120));
        setBounds(this.getParent().getX() + 600, this.getParent().getY() + 350, 325, 279);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(5, 3, 5, 25));
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
            JLabel lblNewLabel_1 = new JLabel("Contrasena");
            contentPanel.add(lblNewLabel_1);
        }
        {
            textField_1 = new JPasswordField();
            contentPanel.add(textField_1);
            textField_1.setColumns(10);
        }
         {
            JLabel lblNewLabel_r1 = new JLabel("RUT");
            contentPanel.add(lblNewLabel_r1);     
        }
        {
                textField_r1 = new JTextField();
                contentPanel.add(textField_r1);
                textField_r1.setColumns(10);
        }
                 {
            JLabel lblNewLabel_r2 = new JLabel("Institucion");
            contentPanel.add(lblNewLabel_r2);     
        }
        {
                textField_r2 = new JTextField();
                contentPanel.add(textField_r2);
                textField_r2.setColumns(10);
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
        Validador vd = new Validador();
       String contrasegnaRegister = new String (textField_1.getPassword());
       
        
       if (ae.getSource() == btnIngresar){
            if (vd.validarNombre(textField.getText()) && vd.validarPass(contrasegnaRegister) && vd.validarRut(textField_r1.getText()) && vd.validarTexto(textField_r2.getText()) ){
                    Register register = new Register(textField.getText(),contrasegnaRegister,textField_r1.getText(),textField_r2.getText());
                    register.registrarUsuario();    
                    dispose();
                    JOptionPane.showMessageDialog(this, "Te has registrado exitosamente");
                    this.textField.setText("");
                    this.textField_1.setText("");
            }else if(textField.getText().isEmpty() && contrasegnaRegister.isEmpty() && textField_r1.getText().isEmpty() && textField_r2.getText().isEmpty()) {
                
                    JOptionPane.showMessageDialog(this, "ERROR, los campos de texto se encuentran vacios");
                    this.textField.setText("");
                    this.textField_1.setText("");
                    
            }else if (!vd.validarNombre (textField.getText() ) ){
                    JOptionPane.showMessageDialog(this, "ERROR, Asegurate de que la primera letra de tu nombre se encuentre en Mayuscula");
                    this.textField.setText("");
                    this.textField_1.setText("");
                            
                    
                   } else if (!vd.validarPass(contrasegnaRegister)) {
                    JOptionPane.showMessageDialog(this, "ERROR, Asegurate de que tu contraseña contenga lo siguiente.\n1. Minimo 6 caracteres\n2. Mínimo 1 numero despues de los caracteres");
                    
                    //this.textField.setText("");
                    this.textField_1.setText("");
                
            }else if (!vd.validarRut(textField_r1.getText())) {
                    JOptionPane.showMessageDialog(this, "ERROR, Asegurate de escribir el rut con puntos y guion (o sin puntos y guion)");
                    this.textField.setText("");
                    this.textField_1.setText("");
                
            }else if (!vd.validarTexto(textField_r2.getText())) {
                    JOptionPane.showMessageDialog(this, "ERROR, Asegurate de que en insititucion solo ingreses letras");
                    this.textField.setText("");
                    this.textField_1.setText("");
           }                      
        }
    }     
}
