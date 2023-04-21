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
public class EjEx06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        System.out.println("");
        String palabra = "";
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {
                sopa[i][j] = " ";
            }
            
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra que contenga entre 3 y 5 caractreres: ");

            palabra = leer.next();
            num1 = (int) (Math.random() * 20);
            num2 = (int) (Math.random() * 15);
            for (int j = 0; j < 5; j++) {
            sopa[num1][num2+j] = palabra.substring(j, j+1);    
            }
            
            
            //sopa[num1][num2] = palabra.substring(i, i+1);
        }

        /*for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+ sopa[i][j] +"]");
            }
            System.out.println("");
        }*/
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
               String aleatorio = Integer.toString((int) (Math.random()* 10));
              if((sopa[i][j]).equals(" ")){
               (sopa[i][j])=Integer.toString((int)(Math.random()*10));
            }
                
        }
        }
            for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+ sopa[i][j] +"]");
            }
            System.out.println("");
        }
    }

    }
        
        
    