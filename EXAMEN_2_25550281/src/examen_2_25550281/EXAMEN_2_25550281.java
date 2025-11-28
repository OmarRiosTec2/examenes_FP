/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_2_25550281;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN_2_25550281 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor3, valor4;
        char simbolo = '*';
        boolean Primo;
        do{
        System.out.println("****NUMEROS PRIMOS Y NO PRIMOS****");
            System.out.println("Seleccione una de las dos opcciones: ");
            System.out.println("1.Seleccionar un valor:");
            System.out.println("2. Salir");
            valor3 = input.nextInt();
            
            if (valor3 == 1) {
            System.out.println("introduzca un valor");
            valor4 = input.nextInt();
            System.out.println("Preciona una opcion de las siguientes: ");
            System.out.println("1. Numeros primos");
            System.out.println("2. Numeros no primos");
            valor1 = input.nextInt();
            
            
            switch(valor1){
                case 1:
                System.out.println("*NUMERO PRIMO*");
                    for (int i = 2; i <= valor4; i++) {
                    for (int j = 2; j <= i; j++) {
                        int valor2 = valor4 % i;
                    System.out.print(valor2);
                    }
                    System.out.println("");
                    }
                    break;
                case 2:
                System.out.println("*NUMERO NO PRIMO*");
                    for (int i = 2; i <= valor4; i++) {
                    for (int j = 2; j <= i; j++) {
                        int valor2 = valor4 * i;
                    System.out.print(valor2);
                    }
                    System.out.println("");
                    }
                    break;
            }
            }
        }while(valor3 != 2);
        System.out.println("GRACIAS POR PARTICIPAR");
    }
    
}
