/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una función rellene un vector con números aleatorios, 
        //pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño;
        tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        
        
        aleatorio(vector);
        imprimir(vector);

    }
    

public static void aleatorio(int[] vector){
    Random azar = new Random();
    for (int i = 0 ; i < vector.length; i++){
        vector[i] = azar.nextInt(10-1)+1;
}

}


public static void imprimir(int[]vector){
for (int i = 0 ; i < vector.length; i++){
    System.out.println("[" +   vector[i] + "]" );
}
}
}