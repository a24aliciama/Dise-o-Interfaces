import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EditorTexto extends JFrame {
    private JTextArea textArea;
    private File archivoActual;
    private boolean cambiosRealizados;

    public EditorTexto() {
        setTitle("Editor de Texto");
        setSize(600, 400);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");

        abrir.addActionListener(e -> abrirArchivo());
        guardar.addActionListener(e -> guardarArchivo());
        salir.addActionListener(e -> salirAplicacion());

        menuArchivo.add(abrir);
        menuArchivo.add(guardar);
        menuArchivo.addSeparator();
        menuArchivo.add(salir);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);

        textArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { cambiosRealizados = true; }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { cambiosRealizados = true; }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { cambiosRealizados = true; }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                salirAplicacion();
            }
        });
    }

    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivoActual = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(archivoActual))) {
                textArea.read(br, null);
                cambiosRealizados = false;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void guardarArchivo() {
        if (archivoActual == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
            int seleccion = fileChooser.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivoActual = fileChooser.getSelectedFile();
                if (!archivoActual.getName().endsWith(".txt")) {
                    archivoActual = new File(archivoActual.getAbsolutePath() + ".txt");
                }
            } else {
                return;
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoActual))) {
            textArea.write(bw);
            cambiosRealizados = false;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void salirAplicacion() {
        if (cambiosRealizados) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios antes de salir?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                guardarArchivo();
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EditorTexto().setVisible(true));
    }
}