/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_5;

/**
 *
 * @author nacho
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realice un programa que compruebe si una matriz dada es antisimétrica. 
        //Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
        //pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
        //La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
        
      
        int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};
        int auxTraspuesta = 0;
        int auxAntisimetrica= 0;
       
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
         
          for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
          if (matriz[i][j] != -matriz[j][i]){
                    auxTraspuesta++;
                }else{
                    auxAntisimetrica++;
                }
                    
            }
          }
          
         if (auxTraspuesta ==1){
             System.out.println("Es traspuesta");
    }else{
             System.out.println("Es antisimetrica");
         }
         
         
    }
        
    }
    



