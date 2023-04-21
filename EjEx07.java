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
public class EjEx07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos que desea generar: ");
        int n = leer.nextInt();
        n += 1;
        int[] fibonacci = new int[n];

        // Generar los primeros dos términos de la sucesión de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generar el resto de los términos
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir la sucesión de Fibonacci generada
        System.out.print("La sucesión de Fibonacci generada es: ");
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}