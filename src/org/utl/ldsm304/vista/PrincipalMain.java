/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.vista;

import java.util.Scanner;
import org.utl.ldsm304.controlador.ControladorEjercicio1;
import org.utl.ldsm304.controlador.ControladorEjercicio2;

/**
 *
 * @author 52472
 */
public class PrincipalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static void menu(){
          Scanner sc = new Scanner(System.in);
        int opcionGeneral;
        
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Ejercicio 1 (Arreglo de numeros)");
            System.out.println("2. Ejercicio 2 (Arreglo de cadenas)");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcionGeneral = sc.nextInt();

            switch (opcionGeneral) {
                case 1 -> menuEjercicio1();
                case 2 -> menuEjercicio2();
                case 0 -> System.out.println("Adios");
                default -> System.out.println("Opción inválida");
            }
        } while (opcionGeneral != 0);
    }
    
     public static void menuEjercicio1() {
        ControladorEjercicio1 ce1 = new ControladorEjercicio1();
        
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("\n-- Ejercicio 1 --");
        System.out.println("1. Número mas repetido");
        System.out.println("2. Cantidad de pares");
        System.out.println("3. Cantidad de impares");
        System.out.println("4. Suma de diagonal");
        System.out.println("5. Múltiplos de 5");
        System.out.print("Elige una opcion: ");
        op = sc.nextInt();
        

        int[][] matriz = {
            {10, 5, 3},
            {5, 3, 3},
            {1, 3, 10}
        };

        switch (op) {
            case 1 -> System.out.println("Mas repetido: " + ce1.obtenerNumeroRepetido(matriz));
            case 2 -> System.out.println("Cantidad pares: " + ce1.contarPares(matriz));
            case 3 -> System.out.println("Cantidad impares: " + ce1.contarImpares(matriz));
            case 4 -> System.out.println("Suma diagonal: " + ce1.sumarDiagonal(matriz));
            case 5 -> System.out.println("Multiplos de 5: " + ce1.contarMultiplosDe5(matriz));
            default -> System.out.println("Opción invalida");
        }
    }

    public static void menuEjercicio2() {
           ControladorEjercicio2 ce2 = new ControladorEjercicio2();
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("\n-- Ejercicio 2 --");
        System.out.println("1. Cadenas que empiezan con 'o'");
        System.out.println("2. Cadenas con 5 vocales");
        System.out.println("3. Cadenas que contienen 'sa'");
        System.out.print("Elige una opcion: ");
        op = sc.nextInt();

        String[][] cadenas = {
            {"oso", "amigo", "educacion"},
            {"oscuro", "murcielago", "sala"},
            {"orden", "universo", "santo"}
        };

        /*switch (op) {
            case 1 -> ce2.mostrarEmpiezanConO(cadenas);
            case 2 -> ce2.mostrarConCincoVocales(cadenas);
            case 3 -> ce2.mostrarConSilabaSa(cadenas);
            default -> System.out.println("Opción inválida");
        }*/
    }


    
    
}
