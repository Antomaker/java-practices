/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

/**
 *
 * @author jocde
 */
import java.util.Scanner;
import proyecto.modelo.AsercionesJava;
import proyecto.vista.VistaAsercionesJava;

public class ControladorAsercionesJava {
    private AsercionesJava modelo;
    private VistaAsercionesJava vista;
    private Scanner scanner;

    public ControladorAsercionesJava(AsercionesJava modelo, VistaAsercionesJava vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Aserciones en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}

