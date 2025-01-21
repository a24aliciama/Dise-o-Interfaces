package org.example;

import javax.swing.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700, 500);
        ventana.setResizable(false);

        ventana.setLayout(new java.awt.GridLayout(6, 2));

        ButtonGroup grupoOpciones = new ButtonGroup();

        JRadioButton ventanaBasicaR;
        grupoOpciones.add( ventanaBasicaR = new JRadioButton("Ventana Basica"));

        JRadioButton ventanaBotonesR;
        grupoOpciones.add(ventanaBotonesR = new JRadioButton("Ventana Botones"));

        JRadioButton ventanaNombreR;
        grupoOpciones.add(ventanaNombreR = new JRadioButton("Ventana Nombre"));

        JRadioButton ventanaTextoEtiquetaR;
        grupoOpciones.add( ventanaTextoEtiquetaR = new JRadioButton("Ventana Texto Etiqueta"));

        JRadioButton ventanaDialogoR;
        grupoOpciones.add(ventanaDialogoR = new JRadioButton("Ventana Dialogo"));

        JRadioButton ventanaDesplegableR;
        grupoOpciones.add(ventanaDesplegableR = new JRadioButton("Ventana Desplegable"));

        JRadioButton ventanaContrasenhaR;
        grupoOpciones.add( ventanaContrasenhaR = new JRadioButton("Ventana Contraseña"));

        JRadioButton ventanaBotonesRadioR;
        grupoOpciones.add(ventanaBotonesRadioR = new JRadioButton("Ventana Botones Radio"));

        JRadioButton ventanaCheckBoxR;
        grupoOpciones.add(ventanaCheckBoxR = new JRadioButton("Ventana CheckBox"));

        JRadioButton ventanaMenuR;
        grupoOpciones.add(ventanaMenuR = new JRadioButton("Ventana Menu"));


        JButton abrir = new JButton("Abrir");
        abrir.addActionListener(e -> {
            if (ventanaBasicaR.isSelected()) {
                VentanaBasica.cerrar();
                VentanaBasica.ventana();
            }
            if (ventanaBotonesR.isSelected()) {
                VentanaBotones.cerrar();
                VentanaBotones.ventana();
            }
            if (ventanaNombreR.isSelected()) {
                VentanaNombre.cerrar();
                VentanaNombre.ventana();
            }
            if (ventanaTextoEtiquetaR.isSelected()) {
                VentanaTextoEtiqueta.cerrar();
                VentanaTextoEtiqueta.ventana();
            }
            if (ventanaDialogoR.isSelected()) {
                VentanaDialogo.cerrar();
                VentanaDialogo.ventana();
            }
            if (ventanaDesplegableR.isSelected()) {
                VentanaDesplegable.cerrar();
                VentanaDesplegable.ventana();
            }
            if (ventanaContrasenhaR.isSelected()) {
                VentanaContrasenha.cerrar();
                VentanaContrasenha.ventana();
            }
            if (ventanaBotonesRadioR.isSelected()) {
                VentanaBotonesRadio.cerrar();
                VentanaBotonesRadio.ventana();
            }
            if (ventanaCheckBoxR.isSelected()) {
                VentanaCheckBox.cerrar();
                VentanaCheckBox.ventana();
            }

            if (ventanaMenuR.isSelected()) {
                VentanaMenu.cerrar();
                VentanaMenu.ventana();
            }

        });

        JButton cerrar = new JButton("Cerrar todo");
        cerrar.addActionListener(e -> {
                    cerrarVentanas();
                    grupoOpciones.clearSelection();
        });

        ventana.add(ventanaBasicaR);
        ventana.add(ventanaBotonesR);
        ventana.add(ventanaNombreR);

        ventana.add(ventanaTextoEtiquetaR);
        ventana.add(ventanaDialogoR);
        ventana.add(ventanaDesplegableR);

        ventana.add(ventanaContrasenhaR);
        ventana.add(ventanaBotonesRadioR);
        ventana.add(ventanaCheckBoxR);

        ventana.add(ventanaMenuR);
        ventana.add(abrir);
        ventana.add(cerrar);

        ventana.setVisible(true);
    }

    public static void cerrarVentanas(){
        VentanaBasica.cerrar();
        VentanaBotones.cerrar();
        VentanaNombre.cerrar();

        VentanaTextoEtiqueta.cerrar();
        VentanaDialogo.cerrar();
        VentanaDesplegable.cerrar();

        VentanaContrasenha.cerrar();
        VentanaBotonesRadio.cerrar();
        VentanaCheckBox.cerrar();

        VentanaMenu.cerrar();
    }
}