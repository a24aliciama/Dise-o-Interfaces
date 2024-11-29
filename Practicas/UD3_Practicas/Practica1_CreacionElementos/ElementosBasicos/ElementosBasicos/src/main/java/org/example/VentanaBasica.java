package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBasica  {

    static JFrame ventana = new JFrame();

    public static void ventana(){
        ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        panel.setLayout(new java.awt.BorderLayout());

        JButton boton = new JButton("Añadir mensaje en consola");
        boton.addActionListener(new Accion());
        boton.setVisible(true);

        panel.add(boton, java.awt.BorderLayout.CENTER);


        ventana.setVisible(true);
    }

     static class Accion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hola soy la ventana basica");
        }
    }

    public static void cerrar(){
        ventana.dispose();
    }
}
