package org.example;

import javax.swing.*;

public class VentanaDesplegable {

    static JFrame ventana = new JFrame();

    public static void ventana() {

        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        String[] colores = {"Rojo", "Verde", "Azul"};
        JComboBox<String> desplegable = new JComboBox<>(colores);

        desplegable.addActionListener(e -> {
            String colorSeleccionado = (String) desplegable.getSelectedItem();
            System.out.println("Color seleccionado: " + colorSeleccionado);
        });

        panel.add(desplegable);

        ventana.setVisible(true);
    }
    public static void cerrar(){
        ventana.dispose();
    }
}

