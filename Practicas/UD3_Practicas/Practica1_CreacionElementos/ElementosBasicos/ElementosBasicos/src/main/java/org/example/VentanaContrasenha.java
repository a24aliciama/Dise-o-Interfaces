package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VentanaContrasenha {
    public static void ventana() {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        ventana.setLayout(new java.awt.GridLayout(5, 1));

        JTextField usuario = new JTextField("Introduce tu nombre de usuario");
        JPasswordField contrasenha = new JPasswordField("contraseña");
        JButton botonLogin = new JButton("Iniciar sesión");

        usuario.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usuario.getText().equals("Introduce tu nombre de usuario")) {
                    usuario.setText("");
                    usuario.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usuario.getText().isEmpty()) {
                    usuario.setText("Introduce tu nombre de usuario");
                    usuario.setForeground(Color.GRAY);
                }
            }
        });

        contrasenha.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (contrasenha.getText().equals("contraseña")) {
                    contrasenha.setText("");
                    contrasenha.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (contrasenha.getText().isEmpty()) {
                    contrasenha.setText("contraseña");
                    contrasenha.setForeground(Color.GRAY);
                }
            }
        });


        // Acción para el botón
        botonLogin.addActionListener(e -> {

            if (!usuario.getText().equals("Introduce tu nombre de usuario") && !usuario.getText().trim().isEmpty()
                    && !contrasenha.getText().equals("contraseña") && !contrasenha.getText().trim().isEmpty()) {

                System.out.println("Usuario: " + usuario.getText());
                System.out.println("Contraseña: " + contrasenha.getText());
            } else {
                System.out.println("Completa los campos");
            }

        });

        // Añadir componentes al panel
        ventana.add(new JLabel("Usuario: "));
        ventana.add(usuario);
        ventana.add(new JLabel("Contraseña: "));
        ventana.add(contrasenha);
        ventana.add(botonLogin);

        ventana.setVisible(true);


        SwingUtilities.invokeLater(usuario::transferFocus);
        SwingUtilities.invokeLater(contrasenha::transferFocus);
    }

}
