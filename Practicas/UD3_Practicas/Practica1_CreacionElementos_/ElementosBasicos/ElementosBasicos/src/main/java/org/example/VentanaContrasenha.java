package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VentanaContrasenha {
    static JFrame ventana = new JFrame();

    public static void ventana() {

        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        panel.setLayout(new java.awt.GridLayout(5, 1));

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
        panel.add(new JLabel("Usuario: "));
        panel.add(usuario);
        panel.add(new JLabel("Contraseña: "));
        panel.add(contrasenha);
        panel.add(botonLogin);

        ventana.setVisible(true);


        SwingUtilities.invokeLater(usuario::transferFocus);
        SwingUtilities.invokeLater(contrasenha::transferFocus);
    }

    public static void cerrar(){
        ventana.dispose();
    }
}
