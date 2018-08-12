/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import archivo.ArchivoDepto;
import bootel.Reserva;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vinett
 */
public class VentanaReserva extends JFrame implements ActionListener {

    

    private JLabel lbl1, lbl2, lbl3, lbl4;
    public JTextField cuadroNombre, cuadroRut, numero, precio;
    private JButton btnaceptar;
    private JComboBox operacion;
    ArchivoDepto depto ;

    public VentanaReserva() {

        this.setLayout(null);
        lbl1 = new JLabel("Nombre");
        lbl1.setBounds(50, 50, 110, 20);
        this.add(lbl1);

        this.setLayout(null);
        lbl2 = new JLabel("Rut");
        lbl2.setBounds(50, 150, 110, 20);
        this.add(lbl2);

        this.setLayout(null);
        lbl3 = new JLabel("numero");
        lbl3.setBounds(50, 250, 110, 20);
        this.add(lbl3);

        this.setLayout(null);
        lbl4 = new JLabel("precio");
        lbl4.setBounds(50, 350, 110, 20);
        this.add(lbl4);

        cuadroNombre = new JTextField();
        cuadroNombre.setBounds(200, 50, 100, 20);
        this.add(cuadroNombre);

        cuadroRut = new JTextField();
        cuadroRut.setBounds(200, 150, 100, 20);
        this.add(cuadroRut);

        numero = new JTextField();
        numero.setBounds(200, 250, 100, 20);
        numero.setEditable(true);
        this.add(numero);

        precio = new JTextField();
        precio.setBounds(200, 350, 100, 20);
        precio.setEditable(true);
        this.add(precio);

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

        depto = new ArchivoDepto();

        if (btnaceptar == ae.getSource()) {
            System.out.println(cuadroNombre.getText() + " - " + cuadroRut.getText());

            if (cuadroNombre.getText().isEmpty() && cuadroRut.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, asegurece de ingresar datos en los campos que se le pide");

            } else if (cuadroNombre.getText().isEmpty() || cuadroRut.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Asegurece de que en ambos campos tengan datos ");

            } else {
                Reserva r = new Reserva(cuadroNombre.getText(), cuadroRut.getText(), numero.getText(), precio.getText());
                depto.reservarDepto(r);
                

            }

        }
    }

}
