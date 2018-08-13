package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.ImageIcon;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class InterfaceDeptoInfo extends JFrame {

    private JPanel contentPane;
    private JTextArea infoDepto;
    private JTextArea agregados;
    private FileReader fr;
    private BufferedReader lector;
    private String agregado;

    public InterfaceDeptoInfo(String descripcion, int nro) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 768);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        initComponents(descripcion, nro);

    }

    public void initComponents(String descripcion, int nro) {

        try {
            fr = new FileReader("InfoDepto.txt");
            lector = new BufferedReader(fr);
        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        }

        JLabel lblDepartamento = new JLabel("Departamento");
        lblDepartamento.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblDepartamento.setBounds(32, 244, 128, 26);
        contentPane.add(lblDepartamento);

        JLabel imagen3 = new JLabel("");
        imagen3.setBounds(267, 13, 222, 159);
        if (nro == 1) {
            imagen3.setIcon(new ImageIcon("z_Imagenes/depto1/img1.png"));
        }
        if (nro == 2) {
            imagen3.setIcon(new ImageIcon("z_Imagenes/depto2/img3.jpg"));
        }
        contentPane.add(imagen3);

        JLabel imagen2 = new JLabel("");
        imagen2.setBounds(548, 13, 260, 159);
        if (nro == 1) {
            imagen2.setIcon(new ImageIcon("z_Imagenes/depto1/img2.png"));
        }
        if (nro == 2) {
            imagen2.setIcon(new ImageIcon("z_Imagenes/depto2/img2.jpg"));
        }
        contentPane.add(imagen2);

        JLabel imagen1 = new JLabel("");
        imagen1.setBounds(267, 185, 222, 162);
        if (nro == 1) {
            imagen1.setIcon(new ImageIcon("z_Imagenes/depto1/img3.png"));
        }
        if (nro == 2) {
            imagen1.setIcon(new ImageIcon("z_Imagenes/depto2/img1.jpg"));
        }
        contentPane.add(imagen1);

        infoDepto = new JTextArea();
        infoDepto.setEditable(false);
        infoDepto.setBounds(139, 384, 814, 176);
        contentPane.add(infoDepto);
        infoDepto.setColumns(10);
        infoDepto.setText(descripcion);

        agregados = new JTextArea();
        agregados.setEditable(false);
        agregados.setBounds(139, 611, 134, 77);
        contentPane.add(agregados);
        agregados.setColumns(10);
        agregado = "Wifi";
        agregados.setText(agregado);

        JLabel lblWifi = new JLabel("");
        lblWifi.setBounds(116, 611, 22, 20);
        lblWifi.setIcon(new ImageIcon("z_imagenes/iconImage/icon_wifi.png"));
        contentPane.add(lblWifi);

        JButton btnReservar = new JButton("Reservar");
        btnReservar.setBounds(771, 663, 97, 25);
        contentPane.add(btnReservar);
        ActionListener reservar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaReserva vr = new VentanaReserva();
                vr.setDefaultCloseOperation(3);
                vr.setSize(420, 520);
                vr.setLocationRelativeTo(null);
                vr.setResizable(false);
                vr.setTitle("Reserva");
                vr.setVisible(true);
                dispose();

            }
        };
        btnReservar.addActionListener(reservar);

    }

}
