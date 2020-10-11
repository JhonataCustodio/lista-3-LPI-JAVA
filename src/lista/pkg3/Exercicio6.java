/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg3;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int contador = 0;
        
        do{
            System.out.println("Digite um número");
            num = ent.nextDouble(); 
            
            if(num >= 0){ 
                soma = num + soma; 
                contador++; 
            }
        } while(num >= 0); 
        
	// Numeros negativos sai do loop
        System.out.println("A média é " + soma / contador); // média
    }
    
}
