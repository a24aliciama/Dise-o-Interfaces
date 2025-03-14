package org.example;

import javax.swing.*;

public class VentanaBotonesRadio {
    private static final JFrame ventana = new JFrame();

    public static void ventana() {
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        panel.setLayout(new java.awt.GridLayout(4, 1));
        JRadioButton tarjetaCredito;
        JRadioButton paypal;
        JRadioButton transferenciaBancaria;

        ButtonGroup grupoOpciones = new ButtonGroup();
        grupoOpciones.add(tarjetaCredito = new JRadioButton("Tarjeta de Crédito"));
        grupoOpciones.add(paypal = new JRadioButton("PayPal"));
        grupoOpciones.add(transferenciaBancaria = new JRadioButton("Transferencia Bancaria"));

        JButton botonConfirmar = new JButton("Confirmar");
        botonConfirmar.addActionListener(e -> {
            if (tarjetaCredito.isSelected()) {
                System.out.println("Opción seleccionada: Tarjeta de Crédito");
            } else if (paypal.isSelected()) {
                System.out.println("Opción seleccionada: PayPal");
            } else if (transferenciaBancaria.isSelected()) {
                System.out.println("Opción seleccionada: Transferencia Bancaria");
            }
        });

        panel.add(tarjetaCredito);
        panel.add(paypal);
        panel.add(transferenciaBancaria);
        panel.add(botonConfirmar);

        ventana.setVisible(true);
    }

    public static void cerrar(){
        ventana.dispose();
    }
}
