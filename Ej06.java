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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        //Llenar matriz
        System.out.println("Ingrese 9 numeros del 1 al 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese posición : " + i + "," + j);
                int n = leer.nextInt();
                if (n > 0 && n < 10) {
                    matriz[i][j] = n;
                } else {
                    System.out.println("Numero incorrecto, ingrese nuevamente...");
                    j--;
                }
            }
        }


        //Imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //Suma Diagonal 1
        int sumadiag1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumadiag1 = sumadiag1 + matriz[i][j];
                }
            }
        }
        //Suma Diagonal 2
        int sumadiag2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 3 - 1) {
                    sumadiag2 = sumadiag2 + matriz[i][j];
                }
            }
        }
        //Sumar Lineas Hori
        int[] vectoH = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vectoH[i] = vectoH[i] + matriz[i][j];
            }
        }
        //Sumar Lineas Vert
        int[] vectoV = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vectoV[i] = vectoV[i] + matriz[j][i];
            }
        }
        //Comparar Vectores H y V
        int igualdades = 0;
        for (int i = 0; i < 3; i++) {
            if (vectoH[i] == vectoV[i]) {
                igualdades++;
            }
        }
        if (sumadiag1 == sumadiag2 && igualdades == 3) {
            System.out.println("Es una matriz magica Guachin!");
        } else {
            System.out.println("No es una matriz magica Salame :/");
        }
        System.out.println("Suma diagonal 1: " + sumadiag1);
        System.out.println("Suma diagonal 2: " + sumadiag2);
        System.out.println("Suma Horizontal: " + vectoH[0]);
        System.out.println("Suma Vertical: " + vectoV[0]);
    }

}
    
