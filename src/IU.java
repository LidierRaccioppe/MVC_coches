import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * IU
 * User Interface
 * Version: Undefined
 * @LidierRaccioppe
 */
public class IU implements ActionListener {

        private JFrame marco;
        private JPanel panel;
        private JLabel etiquetaMatricula;
        private JLabel etiquetaModelo;
        private JTextField textoMatricula;
        private JTextField textoModelo;
        private JButton botonCrearCoche;

        /**
         * Function that begin the components for the UserInterface
         */
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


        /**
         * Function that add the components for the UserInterface
         */
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

        /**
         * Function that set everything to the correct close of the View
         */
        public void computoVentana(){
                // Para que cierre y sea visible
                marco.setLocationRelativeTo(marco);
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                marco.setVisible(true);
        }

        /**
         * Event to create a Coche
         * @param e the event to be processed
         */
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