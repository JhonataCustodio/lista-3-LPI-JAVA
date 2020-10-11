/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exercicio5 {

    public static void main(String[] args) {

        int valores[] = new int[10];

        for (int i = 0; i < 10; i++) {
            valores[i] = i;

        }

        for (int i = 0; i < 10; i++) {     
            while (valores[i] < 10) {
                System.out.println(valores[1] + valores[2] + valores[3]+" "+valores[1] +" "+ valores[2] +" "+ valores[3]+" "+valores[4]+" "+valores[5]+" "+valores[6]+" "+valores[7]+" "+valores[8]+" "+valores[9]);
                return;
            }
            
        }
    }
}
