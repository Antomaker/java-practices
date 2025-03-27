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
import proyecto.modelo.EntradaSalidaConsola;
import proyecto.vista.VistaEntradaSalidaConsola;

public class ControladorEntradaSalidaConsola {
    private EntradaSalidaConsola modelo;
    private VistaEntradaSalidaConsola vista;
    private Scanner scanner;

    public ControladorEntradaSalidaConsola(EntradaSalidaConsola modelo, VistaEntradaSalidaConsola vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Entrada y Salida por Consola en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}

