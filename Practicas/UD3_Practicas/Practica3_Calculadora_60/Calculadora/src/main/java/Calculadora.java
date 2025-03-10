import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField textField;
    private double primerNumero = 0;
    private int segundoNumero = 0;
    private String operacion = "";
    private boolean nuevaOperacion = true;

    public Calculadora() {
        setTitle("Calculadora Simple");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setResizable(false);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setFont(new Font("Monospaced", Font.PLAIN, 20));
        textField.setBackground(Color.GREEN);
        add(textField, BorderLayout.NORTH);

        // Panel para  los botones
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String txt : botones) {
            JButton boton = new JButton(txt);
            boton.setFont(new Font("Monospaced", Font.BOLD, 20));
            boton.setBorderPainted(false);
            boton.setBackground(Color.GREEN);
            boton.setForeground(Color.BLACK);
            boton.addActionListener(this);
            panel.add(boton);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();


        if (comando.matches("[0-9]")) {
            if (nuevaOperacion) {
                textField.setText("");
                nuevaOperacion = false;
            }
            textField.setText(textField.getText() + comando);
        }
        // Botón para limpiar el campo
        else if (comando.equals("C")) {
            textField.setText("");
            primerNumero = 0;
            segundoNumero = 0;
            operacion = "";
            nuevaOperacion = true;
        }
        // Botones de operaciones
        else if (comando.equals("+") || comando.equals("-") ||
                comando.equals("*") || comando.equals("/")) {
            if (!textField.getText().isEmpty()) {
                try {
                    primerNumero = Double.parseDouble(textField.getText());
                } catch(NumberFormatException ex) {
                    textField.setText("Error");
                    return;
                }
                operacion = comando;
                textField.setText("");
            }
        }
        // Botón de resultado
        else if (comando.equals("=")) {
            if (textField.getText().isEmpty() || operacion.equals("")) {
                nuevaOperacion = true;
                return;
            }
            try {
                segundoNumero = Integer.parseInt(textField.getText());
            } catch(NumberFormatException ex) {
                textField.setText("Error");
                nuevaOperacion = true;
                return;
            }

            double resultado = 0;
            switch (operacion) {
                case "+":
                    resultado = primerNumero + segundoNumero;
                    primerNumero = resultado;
                    break;
                case "-":
                    resultado = primerNumero - segundoNumero;
                    primerNumero = resultado;
                    break;
                case "*":
                    resultado = primerNumero * segundoNumero;
                    primerNumero = resultado;
                    break;
                case "/":
                    // Manejo de división por 0
                    if (segundoNumero == 0) {
                        textField.setText("Error");
                        nuevaOperacion = true;
                        return;
                    } else {
                        resultado =(double) primerNumero / segundoNumero;
                        primerNumero = resultado;
                    }
                    break;
            }
            textField.setText(String.valueOf(resultado));
            nuevaOperacion = true;

        }
    }

    public static void main(String[] args) {
        // Se ejecuta la interfaz en el hilo de despacho de eventos
        SwingUtilities.invokeLater(Calculadora::new);
    }
}
