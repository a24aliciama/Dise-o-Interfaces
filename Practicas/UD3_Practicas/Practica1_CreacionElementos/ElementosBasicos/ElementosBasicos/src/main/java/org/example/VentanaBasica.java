package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBasica  {
    public static void ventana(){
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);


        ventana.setLayout(new java.awt.BorderLayout());

        JButton boton = new JButton("Añadir mensaje en consola");
        boton.addActionListener(new Accion());
        boton.setVisible(true);

        ventana.add(boton, java.awt.BorderLayout.CENTER);

        ventana.setVisible(true);
    }

     static class Accion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hola soy la ventana basica");
        }
    }
}
