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
        private JLabel etiquetaBuscar;
        private JTextField textoMatricula;
        private JTextField textoModelo;
        private JTextField textoBuscar;
        private JButton botonCrearCoche;
        private JButton botonSubirVelocidad;
        private JButton botonBajarVelocidad;
        private JButton botonBuscar;

        /**
         * Function that begin the components for the UserInterface
         */
        public void iniciarComponentes(){
                marco = new JFrame("Marco polo");
                marco.setSize(600,400);
                panel = new JPanel();
                etiquetaMatricula = new JLabel("Ingrese la Matricula, porfavor");
                etiquetaModelo = new JLabel("Ingrese el Modelo, porfavor");
                etiquetaBuscar = new JLabel("Ingrese el Matricula a buscar, porfavor");
                textoMatricula = new JTextField();
                textoModelo = new JTextField();
                textoBuscar = new JTextField();
                botonCrearCoche = new JButton("Crear Coche");
                botonSubirVelocidad = new JButton("Subir Velocidad");
                botonBajarVelocidad = new JButton("Bajar Velocidad");
                botonBuscar = new JButton("Buscar Coche");

                //Gestón de Eventos
                botonCrearCoche.addActionListener(this); // en la misma clase
                botonSubirVelocidad.addActionListener(this); // en la misma clase
                botonBajarVelocidad.addActionListener(this); // en la misma clase
                botonBuscar.addActionListener(this); // en la misma clase
        }


        /**
         * Method that add the components for the UserInterface
         */
        public void disGridLayout() {
                iniciarComponentes();
                panel.setLayout(new GridLayout(4, 1));
                panel.add(etiquetaMatricula);
                panel.add(textoMatricula);
                panel.add(etiquetaModelo);
                panel.add(textoModelo);
                panel.add(etiquetaBuscar);
                panel.add(textoBuscar);
                panel.add(botonCrearCoche);
                panel.add(botonSubirVelocidad);
                panel.add(botonBajarVelocidad);
                panel.add(botonBuscar);
                marco.add(panel);
                computoVentana();
        }

        /**
         * Method that set everything to the correct close of the View
         */
        public void computoVentana(){
                // Para que cierre y sea visible
                marco.setLocationRelativeTo(marco);
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                marco.setVisible(true);
        }

        /**
         * Event to create, decreace/increase the speed or search a Coche
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
                Object botonPorPerformirizar = e.getSource();
                Controller con = new Controller();
                Integer ve=5;
                if (botonPorPerformirizar == botonCrearCoche){
                        //respetando a MVC
                        con.crearCoche(textoMatricula.getText(),textoModelo.getText());
                        System.out.println("Coche Creado");
                }
                else if (botonPorPerformirizar == botonSubirVelocidad){
                        //respetando a MVC
                        con.subirVelocidad(textoMatricula.getText(), ve);
                        System.out.println("Velocidad subida");
                }
                else if (botonPorPerformirizar == botonBajarVelocidad){
                        //respetando a MVC
                        con.bajarVelocidad(textoMatricula.getText(), ve);
                        System.out.println("Velocidad bajada");
                }
                else if (botonPorPerformirizar == botonBuscar){
                        //respetando a MVC
                        con.buscarYMostrar(textoMatricula.getText());
                        System.out.println("Coche Mostrado");
                }System.exit(0);
        }
}