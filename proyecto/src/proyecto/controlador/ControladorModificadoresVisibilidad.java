/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.ModificadoresVisibilidad;
import proyecto.vista.VistaModificadoresVisibilidad;

public class ControladorModificadoresVisibilidad {
    private ModificadoresVisibilidad modelo;
    private VistaModificadoresVisibilidad vista;
    private Scanner scanner;

    public ControladorModificadoresVisibilidad(ModificadoresVisibilidad modelo, VistaModificadoresVisibilidad vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Modificadores de Visibilidad en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}
