package com.mycompany.atividadesextras;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class ForRepeticao {
    
    public static void main(String[] args) {
        
        
        
        
        /*for(int i = 0; i <=10; i++) {
            
           int resultado = i * numero;
            
            System.out.println(i + "X" + numero + " = " + resultado);
            
            
            
        } */
        
        
        
        /*for (int nDescre = numero; nDescre >= 0; nDescre-=50){
            
            System.out.println(nDescre);
            System.out.println("teste");
        }*/
        
        /*for (int nMultiplos = 0; nMultiplos <= 100; nMultiplos++ ){
            
            if(nMultiplos % 7 == 0) {
                System.out.println("Multiplos " + nMultiplos);
            } else {
                System.out.println("Não Multiplos " + nMultiplos);
            }
        }*/
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        
        int fibona = teclado.nextInt();
        
        int primeiroN = 0;
        
        int segundoN = 1;
        
        System.out.println("Sequência de Fibonacci:");
        System.out.print(primeiroN + " " + segundoN + " ");
        
        for(int numero = 0; segundoN < fibona; numero++ ) {
            
            int proximoN = primeiroN + segundoN;
            
            System.out.print(proximoN + " ");
            
            primeiroN = segundoN;
            segundoN = proximoN;
            
            
        }
            
        
            
        
        
        
    }
    
}
