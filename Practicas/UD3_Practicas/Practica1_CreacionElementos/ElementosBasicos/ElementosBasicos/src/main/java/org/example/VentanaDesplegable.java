package org.example;

import javax.swing.*;

public class VentanaDesplegable {
    public static void ventana() {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        String[] colores = {"Rojo", "Verde", "Azul"};
        JComboBox<String> desplegable = new JComboBox<>(colores);

        desplegable.addActionListener(e -> {
            String colorSeleccionado = (String) desplegable.getSelectedItem();
            System.out.println("Color seleccionado: " + colorSeleccionado);
        });

        ventana.add(desplegable);

        ventana.setVisible(true);
    }
}

