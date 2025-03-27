/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.VariablesYConstantes;
import proyecto.vista.VistaVariablesYConstantes;

/**
 *
 * @author jocde
 */
public class ControladorVariablesYConstantes {
     private VariablesYConstantes modelo;
    private VistaVariablesYConstantes vista;
    private Scanner scanner;

    public ControladorVariablesYConstantes(VariablesYConstantes modelo, VistaVariablesYConstantes vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Variables y Constantes en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}
