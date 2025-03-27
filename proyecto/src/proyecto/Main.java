/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;
import proyecto.controlador.*;
import proyecto.modelo.*;
import proyecto.vista.*;

/**
 *
 * @author jocde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Conceptos de POO");
            System.out.println("2. Estructura de un programa en Java");
            System.out.println("3. Tipos de Datos");
            System.out.println("4. Variables y Constantes");
            System.out.println("5. Modificadores de visibilidad");
            System.out.println("6. Expresiones y operadores");
            System.out.println("7. Entrada-Salida por consola");
            System.out.println("8. Estructuras condicionales y repetitivas");
            System.out.println("9. Arrays y Matrices");
            System.out.println("10. Excepciones");
            System.out.println("11. Paquetes String, Math");
            System.out.println("12. Aserciones");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ConceptosPOO modelo = new ConceptosPOO();
                    VistaConceptosPOO vista = new VistaConceptosPOO();
                    ControladorConceptosPOO controlador = new ControladorConceptosPOO(modelo, vista, scanner);
                    controlador.iniciar();
                    break;
                case 2:
                    EstructuraProgramaJava modeloEstructura = new EstructuraProgramaJava();
                    VistaEstructuraProgramaJava vistaEstructura = new VistaEstructuraProgramaJava();
                    ControladorEstructuraProgramaJava controladorEstructura = new ControladorEstructuraProgramaJava(modeloEstructura, vistaEstructura, scanner);
                    controladorEstructura.iniciar();
                    break;
                case 3:
                    TiposDeDatos modeloTipos = new TiposDeDatos();
                    VistaTiposDeDatos vistaTipos = new VistaTiposDeDatos();
                    ControladorTiposDeDatos controladorTipos = new ControladorTiposDeDatos(modeloTipos, vistaTipos, scanner);
                    controladorTipos.iniciar();
                    break;
                case 4:
                    VariablesYConstantes modeloVariables = new VariablesYConstantes();
                    VistaVariablesYConstantes vistaVariables = new VistaVariablesYConstantes();
                    ControladorVariablesYConstantes controladorVariables = new ControladorVariablesYConstantes(modeloVariables, vistaVariables, scanner);
                    controladorVariables.iniciar();
                    break;
                case 5:
                    ModificadoresVisibilidad modeloVisibilidad = new ModificadoresVisibilidad();
                    VistaModificadoresVisibilidad vistaVisibilidad = new VistaModificadoresVisibilidad();
                    ControladorModificadoresVisibilidad controladorVisibilidad = new ControladorModificadoresVisibilidad(modeloVisibilidad, vistaVisibilidad, scanner);
                    controladorVisibilidad.iniciar();
                    break;
                case 6:
                    ExpresionesOperadores modeloExpresiones = new ExpresionesOperadores();
                    VistaExpresionesOperadores vistaExpresiones = new VistaExpresionesOperadores();
                    ControladorExpresionesOperadores controladorExpresiones = new ControladorExpresionesOperadores(modeloExpresiones, vistaExpresiones, scanner);
                    controladorExpresiones.iniciar();
                    break;
                case 7:
                    EntradaSalidaConsola modeloIO = new EntradaSalidaConsola();
                    VistaEntradaSalidaConsola vistaIO = new VistaEntradaSalidaConsola();
                    ControladorEntradaSalidaConsola controladorIO = new ControladorEntradaSalidaConsola(modeloIO, vistaIO, scanner);
                    controladorIO.iniciar();
                    break;
                case 8:
                    EstructurasCondicionalesRepetitivas modeloCond = new EstructurasCondicionalesRepetitivas();
                    VistaEstructurasCondicionalesRepetitivas vistaCond = new VistaEstructurasCondicionalesRepetitivas();
                    ControladorEstructurasCondicionalesRepetitivas controladorCond = new ControladorEstructurasCondicionalesRepetitivas(modeloCond, vistaCond, scanner);
                    controladorCond.iniciar();
                    break;
                case 9:
                    ArraysMatrices modeloArr = new ArraysMatrices();
                    VistaArraysMatrices vistaArr = new VistaArraysMatrices();
                    ControladorArraysMatrices controladorArr = new ControladorArraysMatrices(modeloArr, vistaArr, scanner);
                    controladorArr.iniciar();
                    break;
                case 10:
                    Excepciones modeloEx = new Excepciones();
                    VistaExcepciones vistaEx = new VistaExcepciones();
                    ControladorExcepciones controladorEx = new ControladorExcepciones(modeloEx, vistaEx, scanner);
                    controladorEx.iniciar();
                    break;
                case 11:
                    PaquetesStringMath modeloSM = new PaquetesStringMath();
                    VistaPaquetesStringMath vistaSM = new VistaPaquetesStringMath();
                    ControladorPaquetesStringMath controladorSM = new ControladorPaquetesStringMath(modeloSM, vistaSM, scanner);
                    controladorSM.iniciar();
                    break;
                case 12:
                    AsercionesJava modeloA = new AsercionesJava();
                    VistaAsercionesJava vistaA = new VistaAsercionesJava();
                    ControladorAsercionesJava controladorA = new ControladorAsercionesJava(modeloA, vistaA, scanner);
                    controladorA.iniciar();
                    break;
                case 13:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 13);

        scanner.close();
    }

}
