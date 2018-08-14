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
import java.nio.file.Files;
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
    private File registro = new File("Registro.txt");
    private FileWriter fw;
    public Files files;
    private FileWriter wr;
    private BufferedWriter writer;
    private File tempFile;
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
                try {
                    removeUser(nombre);

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
        btnBanear.addActionListener(ban);
        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceMenuAdmin menu = new InterfaceMenuAdmin();

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

    public void removeUser(String nombre) throws IOException {

        String lee = null;
        String usuario = "";
        CharSequence aux = nombre;
        try {
            tempFile = new File(registro.getAbsolutePath() + ".tmp");
            fr = new FileReader(registro);
            lector = new BufferedReader(fr);
            fw = new FileWriter(tempFile);
            writer = new BufferedWriter(fw);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        while ((lee = lector.readLine()) != null) {
            System.out.println(aux);
            if (lee.contains(nombre)) {
                continue;
            } else {

                writer.write(lee);

            }
        }
        writer.close();
        fr.close();
        fw.close();
        lector.close();
        
        borrar();
        cambiar();
        dispose();
    }

    public void borrar() {
        registro.delete();
    }

    public void cambiar() {
        tempFile.renameTo(registro);
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
