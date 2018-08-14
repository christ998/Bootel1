package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class InterfaceBorrarUsuario extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private FileReader fr;
    private BufferedReader lector;
    private DefaultTableModel modelo;
    private File registro;
    private FileWriter fw;
    private FileWriter writer;
    private File tempFile ;
    private JButton btnGuardar;

    public InterfaceBorrarUsuario() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(468, 501);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        initComponent();

    }

    public void initComponent() throws IOException {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(27, 55, 193, 234);
        contentPane.add(scrollPane);

        table = new JTable();
        modelo = new DefaultTableModel();
        modelo.addColumn("Usuario");
        modelo.addColumn("Rut");
        table.setModel(modelo);
        scrollPane.setViewportView(table);
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(298, 371, 97, 25);
        contentPane.add(btnGuardar);

        JButton btnBanear = new JButton("Banear");
        btnBanear.setBounds(298, 154, 97, 25);
        contentPane.add(btnBanear);
        buscaUsuarios();
        ActionListener ban = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = table.getSelectedRow();
                String nombre = (String) modelo.getValueAt(fila, 0);
                modelo.removeRow(fila);
                System.out.println(nombre);
                removeUser(nombre);
            }
        };
        btnBanear.addActionListener(ban);
        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
            }
        };
        btnGuardar.addActionListener(guardar);
                
    }

    public void buscaUsuarios() throws IOException {
        try {

            fr = new FileReader("Registro.txt");
            lector = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        String usuario, rut, lee;
        String datos[] = new String[4];
        String fila[] = new String[2];
        while ((lee = lector.readLine()) != null) {
            datos = lee.split(";");
            usuario = datos[0];
            rut = datos[2];
            fila[0] = usuario;
            fila[1] = rut;
            modelo.addRow(fila);

        }
    }

    public void removeUser(String nombre) {
        try {
            registro = new File("Registro.txt");
            tempFile = new File("Reserva.txt");
            fr       = new FileReader("Registro.txt");
            lector   = new BufferedReader(fr);
            writer   = new FileWriter(tempFile,true);
            fw       = new FileWriter(registro);                               
            String cadena;
            
            while ((cadena=lector.readLine()) != null) {
                System.out.println(cadena);
               if(!cadena.contains(nombre)){
                   writer.write(cadena);
               }               
            }
            writer.close();

            //Renombra el archivo nuevo
            if (!tempFile.renameTo(registro)) {
                System.out.println("Archivo no renombrado");
            }      
            }catch (IOException ex) {
            System.out.println(ex.getMessage());
            }                               
    }

   /* public String eliminaLineasBlancas() throws FileNotFoundException, IOException {
        registro = new File("Registro.txt");
        fr = new FileReader(registro);
        fw = new FileWriter(registro);
        lector = new BufferedReader(fr);
        writer = new PrintWriter(fw);
        String lee;
        String texto = "";
        while ((lee = lector.readLine()) != null) {
            if (!lee.isEmpty()) {
                writer.println(texto);
                writer.flush();
            }
        }

        writer.close();
        lector.close();
        System.out.println(texto);
        return texto;

    }*/
    
}
