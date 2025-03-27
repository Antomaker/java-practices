/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.EstructurasCondicionalesRepetitivas;
import proyecto.vista.VistaEstructurasCondicionalesRepetitivas;

/**
 *
 * @author jocde
 */
public class ControladorEstructurasCondicionalesRepetitivas {
    private EstructurasCondicionalesRepetitivas modelo;
    private VistaEstructurasCondicionalesRepetitivas vista;
    private Scanner scanner;

    public ControladorEstructurasCondicionalesRepetitivas(EstructurasCondicionalesRepetitivas modelo, VistaEstructurasCondicionalesRepetitivas vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Estructuras Condicionales y Repetitivas en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}
