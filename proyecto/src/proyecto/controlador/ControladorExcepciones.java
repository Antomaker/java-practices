/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.Excepciones;
import proyecto.vista.VistaExcepciones;

/**
 *
 * @author jocde
 */
public class ControladorExcepciones {
    private Excepciones modelo;
    private VistaExcepciones vista;
    private Scanner scanner;

    public ControladorExcepciones(Excepciones modelo, VistaExcepciones vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Manejo de Excepciones en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}
