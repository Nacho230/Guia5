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
public class EjEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realizar un algoritmo que calcule la suma de todos los elementos 
        //de un vector de tamaño N, con los valores ingresados por el usuario.

        Scanner leer = new Scanner(System.in);
       
        int tamaño;
        
        int suma;
        suma=0;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = leer.nextInt();
         int[] vector = new int[tamaño];
         
        System.out.println("Ingrese los valores del vector");
        
       for (int i = 0 ; i < tamaño; i++){
           
           vector[i] = leer.nextInt();
           suma = suma + vector[i];
       }
       
       for (int i = 0 ; i < tamaño; i++){
           System.out.println("[" + vector[i] + "]");
       }
       
        System.out.println("la suma es " +  suma);
    }
    
    
}
