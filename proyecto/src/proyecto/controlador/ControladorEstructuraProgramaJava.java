/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.EstructuraProgramaJava;
import proyecto.vista.VistaEstructuraProgramaJava;

/**
 *
 * @author jocde
 */
public class ControladorEstructuraProgramaJava {
    private EstructuraProgramaJava modelo;
    private VistaEstructuraProgramaJava vista;
    private Scanner scanner;

    public ControladorEstructuraProgramaJava(EstructuraProgramaJava modelo, VistaEstructuraProgramaJava vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Estructura de un Programa en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    } 
}
