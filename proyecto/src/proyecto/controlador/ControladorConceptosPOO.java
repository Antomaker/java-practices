/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.ConceptosPOO;
import proyecto.vista.VistaConceptosPOO;

/**
 *
 * @author jocde
 */
public class ControladorConceptosPOO {
    private ConceptosPOO modelo;
    private VistaConceptosPOO vista;
    private Scanner scanner;

    public ControladorConceptosPOO(ConceptosPOO modelo, VistaConceptosPOO vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Conceptos de Programación Orientada a Objetos ---");
        vista.mostrarMensaje(modelo.obtenerDefinicion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}