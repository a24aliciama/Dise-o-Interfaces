package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
                JFrame frame = new JFrame("Formulario de Registro");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

                JLabel nameLabel = new JLabel("Nombre:");
                JTextField nameField = new JTextField();
                nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

                JLabel emailLabel = new JLabel("Correo Electrónico:");
                JTextField emailField = new JTextField();
                emailField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

                JLabel passwordLabel = new JLabel("Contraseña:");
                JPasswordField passwordField = new JPasswordField();
                passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

                JButton submitButton = new JButton("Enviar");
                JLabel errorMessage = new JLabel("", JLabel.CENTER);
                errorMessage.setForeground(Color.RED);

                JLabel successMessage = new JLabel("", JLabel.CENTER);
                successMessage.setForeground(new Color(0, 128, 0));

                frame.add(nameLabel);
                frame.add(nameField);
                frame.add(emailLabel);
                frame.add(emailField);
                frame.add(passwordLabel);
                frame.add(passwordField);
                frame.add(submitButton);
                frame.add(errorMessage);
                frame.add(successMessage);

                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Limpiar mensajes previos
                        errorMessage.setText("");
                        successMessage.setText("");

                        StringBuilder errorBuilder = new StringBuilder();
                        String name = nameField.getText().trim();
                        String email = emailField.getText().trim();
                        String password = new String(passwordField.getPassword()).trim();

                        // Validación del nombre
                        if (name.isEmpty()) {
                            errorBuilder.append("- El nombre no puede estar vacío\n");
                        }

                        // Validación del correo electrónico
                        if (!isValidEmail(email)) {
                            errorBuilder.append("- Formato de correo inválido\n");
                        }

                        // Validación de la contraseña
                        if (password.length() < 8) {
                            errorBuilder.append("- La contraseña debe tener al menos 8 caracteres\n");
                        }

                        // Mostrar errores o éxito
                        if (errorBuilder.length() > 0) {
                            errorMessage.setText("<html>" + errorBuilder.toString().replace("\n", "<br>") + "</html>");
                        } else {
                            successMessage.setText("Formulario enviado con éxito!");
                            errorMessage.setText("");
                            // Limpiar los campos
                            nameField.setText("");
                            emailField.setText("");
                            passwordField.setText("");
                        }
                    }
                });

                frame.setVisible(true);
            }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}
