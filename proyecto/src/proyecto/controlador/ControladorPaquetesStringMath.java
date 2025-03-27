/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.PaquetesStringMath;
import proyecto.vista.VistaPaquetesStringMath;

/**
 *
 * @author jocde
 */
public class ControladorPaquetesStringMath {
    private PaquetesStringMath modelo;
    private VistaPaquetesStringMath vista;
    private Scanner scanner;

    public ControladorPaquetesStringMath(PaquetesStringMath modelo, VistaPaquetesStringMath vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Paquetes String y Math en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    }
}
