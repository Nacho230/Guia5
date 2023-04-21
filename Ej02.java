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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio = new Random();
          Scanner leer = new Scanner(System.in);
          System.out.println(" Favor de ingresar el tamaño del Vector: ") ;
          int tamaño = leer.nextInt();
     
         int vector[];
      vector=new int[tamaño];
            
for (int i = 0; i <tamaño; i++) {
  vector[i] = aleatorio.nextInt(5);
}

System.out.println(" ingrese el numero entero a buscar ") ;
          int opcion = leer.nextInt();
       int aux=0;   
// Muestro el vector
for (int i = 0; i <tamaño; i++) {
   if (vector[i] == opcion) {
      aux=aux+1;
       System.out.println("el numero: " + vector[i] + " esta en la posicion: " + i);
   }
}
      if (aux>1){
    System.out.println("el numero esta repetido " + aux + " veces");
}else{
           System.out.println("el numero no esta en el vector");
}
    }
}
