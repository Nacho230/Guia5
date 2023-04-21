/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_5;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = Scan.nextInt();
        int[] vector = new int[tamaño];
        int[] vector2 = new int[tamaño];

        System.out.println(" Ingrese los valores del vector 1");

        for (int i = 0; i < tamaño; i++) {

            vector[i] = Scan.nextInt();

        }

        System.out.println(" Ingrese los valores del vector 2");

        for (int i = 0; i < tamaño; i++) {

            vector2[i] = Scan.nextInt();
        }
        boolean soniguales = true;

        for (int i = 0; i < tamaño; i++) {

            if (vector[i] != vector2[i]) {

                soniguales = false;
                break;
            }

        }
        if (soniguales) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");

        }

    }
}
