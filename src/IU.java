import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU implements ActionListener {

        JFrame marco;
        JPanel panel;
        JLabel etiquetaMatricula;
        JLabel etiquetaModelo;
        JTextField textoMatricula;
        JTextField textoModelo;
        JButton botonCrearCoche;

        public void iniciarComponentes(){
                marco = new JFrame("Marco polo");
                marco.setSize(600,400);
                panel = new JPanel();
                etiquetaMatricula = new JLabel("Ingrese la Matricula, porfavor");
                etiquetaModelo = new JLabel("Ingrese el Modelo, porfavor");
                textoMatricula = new JTextField();
                textoModelo = new JTextField();
                botonCrearCoche = new JButton("Crear Coche");

                //Gestón de Eventos
                botonCrearCoche.addActionListener(this); // en la misma clase
        }



        public void disGridLayout() {
                iniciarComponentes();
                panel.setLayout(new GridLayout(3, 1));
                panel.add(etiquetaMatricula);
                panel.add(textoMatricula);
                panel.add(etiquetaModelo);
                panel.add(textoModelo);
                panel.add(botonCrearCoche);
                marco.add(panel);
                computoVentana();
        }

        public void computoVentana(){
                // Para que cierre y sea visible
                marco.setLocationRelativeTo(marco);
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                marco.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                Object botonPorPerformirizar = e.getSource();
                if (botonPorPerformirizar == botonCrearCoche){
                        Controller con = new Controller();
                        con.crearCoche(textoMatricula.getText(),textoModelo.getText());
                        System.out.println("Coche Creado");
                }
                else System.exit(0);
                }

}