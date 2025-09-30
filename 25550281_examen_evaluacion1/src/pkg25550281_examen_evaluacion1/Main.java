/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550281_examen_evaluacion1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    public static void main(String[] args) {
        int trialaton, natacion, ciclismo, carrera;
        Scanner captu = new Scanner(System.in);
        System.out.println("felicidades por completar el trialaton!");
        System.out.print("tiempo de natacion: ");
        natacion = captu.nextInt();
         System.out.print("tiempo de ciclismo: ");
        ciclismo = captu.nextInt();
         System.out.print("tiempo de carrera: ");
        carrera = captu.nextInt();
        trialaton = natacion + ciclismo + carrera;
        if(trialaton <= 120 && natacion >= 60 && ciclismo >= 60 && carrera >= 60){
        System.out.println("Calificacion: excelente");
        }else if(trialaton <= 150 && natacion >= 70 && ciclismo >= 70 && carrera >= 70){
        System.out.println("Calificacion: buena");
        }else{
        System.out.println("Calificacion: regular");
    }
    }
    
}
