package agenda;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public class Agenda extends JFrame implements ActionListener{
    //Variables Swing
    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;
    private JTextField camponuevonombre, camponuevotelefono, campobuscarnombre;
    private JLabel etiquetanuevonombre, etiquetanuevotelefono, imprimenombre, imprimetelefono, nombreprograma, nombreautor, numeroversion, dibusca;
    private JButton boton, botonnuevo, botonbusca;
    
    //Resto de Variables
    File archivo = new File("/home/yo/Escritorio");
    Formatter nuevoarchivo;
    Scanner x;

    public Agenda(){
    setLayout(null);
    
    //Texto de Introduccion
    nombreprograma = new JLabel("Agenda Telefonica");
        nombreprograma.setBounds(0,0,180,30);
        add(nombreprograma);
    nombreautor = new JLabel("Alfredo Bravo Cuero");
        nombreautor.setBounds(0,30,180,30);
        add(nombreautor);
    numeroversion = new JLabel("version 1.0");
        numeroversion.setBounds(0,50,180,30);
        add(numeroversion);
    
    //Menu Superior
    barra = new JMenuBar();
        setJMenuBar(barra);
    menu1 = new JMenu("Archivo");
        barra.add(menu1);
    mi1 = new JMenuItem("Nuevo");
        mi1.addActionListener(this);
        menu1.add(mi1);

    mi2 = new JMenuItem("Buscar");
        mi2.addActionListener(this);
        menu1.add(mi2);

    mi3 = new JMenuItem("Salir");
        mi3.addActionListener(this);
        menu1.add(mi3);
    }
    
    public void actionPerformed(ActionEvent e){
        Container f=this.getContentPane();
        if(e.getSource()==mi1){
            nombreprograma.setVisible(false);
            nombreautor.setVisible(false);
            numeroversion.setVisible(false);
            
            //Formulario
            etiquetanuevonombre = new JLabel("Nuevo Nombre");
                etiquetanuevonombre.setBounds(0,0,180,30);
                add(etiquetanuevonombre);
                etiquetanuevonombre.setVisible(true);
                
            camponuevonombre = new JTextField();
                camponuevonombre.setBounds(200,0,180,30);
                add(camponuevonombre);
                camponuevonombre.setVisible(true);
            
            etiquetanuevotelefono = new JLabel("Nuevo Telefono");
                etiquetanuevotelefono.setBounds(0,50,180,30);
                add(etiquetanuevotelefono);
                etiquetanuevotelefono.setVisible(true);
            
           camponuevonombre = new JTextField();
                camponuevonombre.setBounds(200,50,180,30);
                add(camponuevonombre);
                camponuevonombre.setVisible(true);
                
            botonnuevo = new JButton("Crear");
                botonnuevo.setBounds(200,100,180,30);
                add(botonnuevo);
                botonnuevo.setVisible(true);
        }
        if(e.getSource()==mi2){
            
        }
        if(e.getSource()==mi3){
          
        }
 
        if(e.getSource()==botonnuevo){
          
        }
    }
    public static void main(String[] args) {
        Agenda ventana = new Agenda();
        ventana.setBounds(10,20,450,250);
        ventana.setVisible(true);
    }
    
}
