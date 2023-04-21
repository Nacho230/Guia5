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
public class EjEx04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
        //por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
        //Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
        //Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
//Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
//teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
Scanner leer = new Scanner(System.in);
        int notaestu[][], notafinal[], aprobados, desaprobados;
        aprobados=0;
        desaprobados=0;
        notaestu = new int [10][4];
        notafinal = new int[10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                Random rand = new Random();
                notaestu[i][j] = rand.nextInt(10)+1;
            }
            notafinal[i]=(int)(notaestu[i][0]*.1 + notaestu[i][1]*.15 + notaestu[i][2]*.25 + notaestu[i][3]*.5);
            
            if (notafinal[i] >= 7){
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + notaestu[i][j] + "]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(notafinal[i]);
        }
 
        
        System.out.println("Los aprobados son: " + aprobados);
        System.out.println("Los desaprobados son: " + desaprobados);
    }
    
}