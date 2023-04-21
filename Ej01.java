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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int[100]; 
        
for (int i = 0; i < 99; i++) {
vector[i] = i + 1;
}

for (int i = 99; i < 1 ; i--) {
System.out.println("[" + vector[i] + "]");
}
    }
}

    

