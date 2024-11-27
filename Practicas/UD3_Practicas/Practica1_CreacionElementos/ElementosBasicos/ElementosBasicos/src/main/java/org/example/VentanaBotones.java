package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBotones {
    public static void ventana(){
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);


        ventana.setLayout(new java.awt.GridLayout(2, 1));

        JButton botonAceptado = new JButton("Aceptado");
        botonAceptado.addActionListener(e -> System.out.println("Aceptado"));
        botonAceptado.setVisible(true);

        ventana.add(botonAceptado);

        JButton botonCancelado = new JButton("Cancelar");
        botonCancelado.addActionListener(e -> System.out.println("Cancelado"));
        botonCancelado.setVisible(true);

        ventana.add(botonCancelado);

        ventana.setVisible(true);
    }
}
