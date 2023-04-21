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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
        //y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B 
        //y se obtiene cambiando sus filas por columnas (o viceversa).
        
        Random azar = new Random();
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                matriz[i][j]= azar.nextInt(10);
            }
        }
            
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println("");
            }
        
        System.out.println(""); 
         for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("[" + matriz[j][i] + "]");
                
            }
             System.out.println("");
         }
    }
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
