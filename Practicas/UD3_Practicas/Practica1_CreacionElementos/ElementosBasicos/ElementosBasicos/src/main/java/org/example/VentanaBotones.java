package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBotones {
    static JFrame ventana = new JFrame();

    public static void ventana(){

        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        panel.setLayout(new java.awt.GridLayout(2, 1));

        JButton botonAceptado = new JButton("Aceptado");
        botonAceptado.addActionListener(e -> System.out.println("Aceptado"));
        botonAceptado.setVisible(true);

        panel.add(botonAceptado);

        JButton botonCancelado = new JButton("Cancelar");
        botonCancelado.addActionListener(e -> System.out.println("Cancelado"));
        botonCancelado.setVisible(true);

        panel.add(botonCancelado);

        ventana.setVisible(true);
    }

    public static void cerrar(){
        ventana.dispose();
    }
}
