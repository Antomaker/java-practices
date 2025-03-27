/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.Scanner;
import proyecto.modelo.TiposDeDatos;
import proyecto.vista.VistaTiposDeDatos;

/**
 *
 * @author jocde
 */
public class ControladorTiposDeDatos {
    private TiposDeDatos modelo;
    private VistaTiposDeDatos vista;
    private Scanner scanner;

    public ControladorTiposDeDatos(TiposDeDatos modelo, VistaTiposDeDatos vista, Scanner scanner) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = scanner;
    }

    public void iniciar() {
        vista.mostrarMensaje("\n--- Tipos de Datos en Java ---");
        vista.mostrarMensaje(modelo.obtenerExplicacion());
        vista.mostrarMensaje("Presione Enter para regresar al menú principal...");
        scanner.nextLine();
    } 
}
