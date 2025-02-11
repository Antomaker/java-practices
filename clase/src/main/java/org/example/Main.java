package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Docentes docentes= new Docentes();
        Estudiantes estudiantes= new Estudiantes();
        try{
        while (true){
            System.out.println("seleccione su rol:"+"\n1.Docente"+"\n2.Estudiante");
            int control=Integer.parseInt(entrada.next());
            switch (control){
                case 1:{
                    String nombre= docentes.nombre;
                    int edad= docentes.edad, codigo=docentes.codigo_docente;
                    System.out.println("ingrese su nombre:");
                    nombre=entrada.next();
                    System.out.println("ingrese su edad:");
                    edad=entrada.nextInt();
                    System.out.println("ingrese su codigo:");
                    codigo=entrada.nextInt();
                    System.out.println("resultado:"+nombre+" "+edad+" "+codigo);

                }
                case 2:{
                    String nombre= estudiantes.nombre,curso= estudiantes.curso;
                    int edad= estudiantes.edad;
                    System.out.println("ingrese su nombre:");
                    nombre=entrada.next();
                    System.out.println("ingrese su edad:");
                    edad=entrada.nextInt();
                    System.out.println("ingrese su nombre del curso:");
                    curso=entrada.next();
                    System.out.println("resultado:"+nombre+" "+edad+" "+curso);

                }
                default:
                    System.out.println("notacion incorrecta");
            }
        }
        }catch (Exception e){
            System.out.println("parametro in adecuado:"+e.getMessage());
        }
    }
}
