/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg3;

/**
 *
 * @author silva
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int numeroAtual = 2000;
        int numeroDesejado = 3500;
        
        while(numeroAtual <= numeroDesejado){
            if(numeroAtual % 2 == 1){
                System.out.println("Numero: "+ numeroAtual);
            }
            numeroAtual++;
        }
    }
}
