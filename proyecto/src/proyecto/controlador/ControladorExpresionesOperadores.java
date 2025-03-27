/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.ExpresionesOperadores;
import proyecto.vista.VistaExpresionesOperadores;

/**
 *
 * @author jocde
 */
public class ControladorExpresionesOperadores {
    private ExpresionesOperadores modelo;
    private VistaExpresionesOperadores vista;
    private Scanner scanner;

    public ControladorExpresionesOperadores(ExpresionesOperadores modelo, VistaExpresionesOperadores vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Expresiones y Operadores en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}