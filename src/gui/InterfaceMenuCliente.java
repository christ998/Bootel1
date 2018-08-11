/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author V. Vinett, C. Herrera, J. LLanos
 */

public class InterfaceMenuCliente extends javax.swing.JFrame implements ActionListener{
    
    private JLabel lblDepto1,lblImg1,lblImg2,lblImg3,lblImg4,lblImg5,lblImg6,lbldescript;
    private JTextField num1,num2, num3;
    private JComboBox operacion;
    private JButton btnver1,btnver2,btnver3,btnver4,btnreserva,btnsiguiente;
    private JPanel miPanel;
    private ImageIcon img1,img2,img3,img4,img5,iconImgWifi,iconImgNf;
    private JScrollPane scrollPane;
    private JTextArea textarea ,textarea2;
    private String texto,texto2;
    
    public InterfaceMenuCliente() {        
        setSize (420,250);
        
        setLocationRelativeTo(null);
        scrollPane = new JScrollPane();
        scrollPane.setBounds(5,10,1000,720);
        
        IniciaMenuDepto();
        miPanel.setPreferredSize(new Dimension(1024,1024));       
        scrollPane.setViewportView((miPanel));
        this.add(scrollPane);    
        
    }   
 
    private void  IniciaMenuDepto(){  
        miPanel = new JPanel();
        miPanel.setLayout(null);
        
        img1 = new ImageIcon("z_Imagenes/depto1/img1.png");
        lblImg1 = new JLabel(img1);
        lblImg1.setBounds(200, 50 , 220, 200);
        this.add(lblImg1);
               
        img2 = new ImageIcon("z_Imagenes/depto1/img2.png");
        lblImg2 = new JLabel(img2);
        lblImg2.setBounds(200, 260 , 220, 200);
        this.add(lblImg2);
        
        img2 = new ImageIcon("z_Imagenes/depto1/img3.png");
        lblImg3 = new JLabel(img2);
        lblImg3.setBounds(440, 260 , 220, 200);
        this.add(lblImg3);
        
        img3= new ImageIcon("z_Imagenes/depto1/img4.png");
        lblImg4 = new JLabel(img3);
        lblImg4.setBounds(440, 50 , 400, 200);
        this.add(lblImg4);   
        
        iconImgWifi = new  ImageIcon("z_Imagenes/iconImage/icon_wifi.png");
        lblImg5 = new JLabel(iconImgWifi);
        lblImg5.setBounds(75,800,20,20);
        this.add(lblImg5);
        
        iconImgNf = new  ImageIcon("z_Imagenes/iconImage/icon_nofumadores.png");
        lblImg6 = new JLabel(iconImgNf);
        lblImg6.setBounds(75,825,20,20);
        this.add(lblImg6);
        
        texto = " El Hotel Boutique Goblin´s House se encuentra a 300 metros de la zona comercial de Temuco\ny ofrece habitaciones con WiFi gratuita y TV de plasma. También facilita aparcamiento gratuito.\n" +
"\n" +
"Las habitaciones del Hotel Boutique Goblin´s House son muy amplias, están decoradas con muebles elegantes \ny disponen de baño privado.\n" +
"\n" +
"El desayuno se sirve a diario en la cafetería \"Cafe Peregrino\", ubicada a 30 metros del albergue.\n" +
"\n" +
"El Hotel Boutique Goblin's House está a 100 km del volcán Villarrica y a 7,2 km del aeropuerto de Manquehue. \n" +
"\n" +
"Nuestros clientes dicen que esta parte de Temuco es su favorita, según los comentarios independientes.\n" +
"\n" +
"A las parejas les encanta la ubicación — Le han puesto un 9,3 para viajes de dos personas.";
        
        
        texto2 = "Conexión WiFi gratuita "
                + "\nHabitaciones no fumadores " 
                + "\nIdeal para estudiantes";
        
        textarea = new JTextArea();
        textarea.setText(texto);
        textarea.setBounds(100,500,780,260);        
        textarea.setEditable(false);
        
        textarea2 = new JTextArea();
        textarea2.setText(texto2);
        textarea2.setBounds(100,800,160,80);
        textarea2.setEditable(false);
        
        this.setLayout(null);
        lblDepto1 = new JLabel("Departamento 1:");
        lblDepto1.setBounds(100, 20 , 200, 300);
        this.add(lblDepto1);
        
        
        btnreserva = new JButton("Reservar");
        btnreserva.setBounds(750,800,120,20);
        btnreserva.addActionListener(this);
        this.add(btnreserva);
        
        
        
        
        miPanel.add(lblDepto1);
        miPanel.add(lblImg1);
        miPanel.add(lblImg2);
        miPanel.add(lblImg3);
        miPanel.add(lblImg4); 
        miPanel.add(textarea);
        miPanel.add(textarea2);
        miPanel.add(lblImg5);
        miPanel.add(lblImg6);
        miPanel.add(btnreserva);
        
      /* 
        this.setLayout(null);
        etiqueta2 = new JLabel("Departamento 2:");
        etiqueta2.setBounds(50, 150, 110, 20);
        this.add(etiqueta2);
        
        this.setLayout(null);
        etiqueta3 = new JLabel("Departamento 3:");
        etiqueta3.setBounds(50, 250, 110, 20);
        this.add(etiqueta3);
        
        this.setLayout(null);
        etiqueta4 = new JLabel("Departamento 4 :");
        etiqueta4.setBounds(50, 350, 110, 20);
        this.add(etiqueta4);
        
        num1 = new JTextField();
        num1.setBounds(200, 50, 100, 20);
        this.add(num1);
        
        num2 = new JTextField();
        num2.setBounds(200, 150, 100, 20);
        this.add(num2);
        
        num3 = new JTextField();
        num3.setBounds(200, 250, 100, 20);
        this.add(num3);
     
       
        operacion = new JComboBox();
        operacion.setBounds(200, 350, 150, 20);
        this.add(operacion);
        operacion.addItem("1");
        operacion.addItem("2");
        operacion.addItem("3");
        
        
        btnver1 = new JButton("Ver");
        btnver1.setBounds(340, 50, 55, 20);
        this.add(btnver1);
        
        btnver2 = new JButton("Ver");
        btnver2.setBounds(340, 150, 55, 20);
        this.add(btnver2);
        
        btnver3 = new JButton("Ver");
        btnver3.setBounds(340, 250, 55, 20);
        this.add(btnver3);
        
        btnver4 = new JButton("Ver");
        btnver4.setBounds(350, 350, 55, 25);
        this.add(btnver4);
        
        */
        
        
    }
    

        
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        VentanaReserva vr = new VentanaReserva();
        if(btnreserva == ae.getSource()){
            
                vr.setDefaultCloseOperation(3);
                vr.setSize(420,520);
                vr.setLocationRelativeTo(null);
                vr.setResizable(false);
                vr.setTitle("Reserva");
                vr.setVisible(true);   
                dispose();
        
    }
    }
    
}
