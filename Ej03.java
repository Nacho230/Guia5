/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_5;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
        //cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Random azar = new Random();
        int vector[] = new int[10];
        int aux = 0;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;

        for (int i = 0; i < 10; i++) {
            vector[i] = azar.nextInt(99999) - 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + vector[i] + "]");
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                aux++;
            }
            switch (aux) {

                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
            }
            aux = 0;
        }
        System.out.println("Hay " + dig1 + " numeros, de 1 digitos");
        System.out.println("Hay " + dig2 + " numeros, de 2 digitos");
        System.out.println("Hay " + dig3 + " numeros, de 3 digitos");
        System.out.println("Hay " + dig4 + " numeros, de 4 digitos");
        System.out.println("Hay " + dig5 + " numeros, de 5 digitos");
    }

}
