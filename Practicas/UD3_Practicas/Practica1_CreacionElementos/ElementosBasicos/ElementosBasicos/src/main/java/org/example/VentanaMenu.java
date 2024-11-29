package org.example;

import javax.swing.*;

public class VentanaMenu {

    static JFrame ventana = new JFrame();

    public static void ventana() {
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEdicion = new JMenu("Edición");
        JMenuItem abrirItem = new JMenuItem("Abrir");
        JMenuItem guardarItem = new JMenuItem("Guardar");

        menuArchivo.add(abrirItem);
        menuArchivo.add(guardarItem);

        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);

        abrirItem.addActionListener(e ->  {
            System.out.println("Abrir seleccionado");
        });

        guardarItem.addActionListener(e ->  {
            System.out.println("Guardar seleccionado");
        });

        panel.add(barraMenu);

        ventana.setVisible(true);
    }

    public static void cerrar(){
        ventana.dispose();
    }
}
