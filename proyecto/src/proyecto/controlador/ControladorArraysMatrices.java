/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.ArraysMatrices;
import proyecto.vista.VistaArraysMatrices;

/**
 *
 * @author jocde
 */
public class ControladorArraysMatrices {
    private ArraysMatrices modelo;
    private VistaArraysMatrices vista;
    private Scanner scanner;

    public ControladorArraysMatrices(ArraysMatrices modelo, VistaArraysMatrices vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Arrays y Matrices en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}
