package com.mycompany.vetores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class Vetores {

    public static void main(String[] args) {

        /* int[] n = {0,4,7,5,9,2,9};
        int n2[] = new int[7];
        
        System.out.println("Total de casas de N : " + n.length );
        
        for (int c = 0; c < n.length; c++) {
            
            double nAle =  0 + Math.random() * (7-0);
            int ale = (int) nAle;
            
            n2[c] = ale;
            
            System.out.println("Testando um vetor com valores aleatórios : " + n2[c]);
            
            System.out.println("Na posição " + c + " temos o valor : " + n[c]);
            
        } */
 /*Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano estamos ? ");
        int ano = teclado.nextInt();

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
            "Ago", "Set", "Out", "Nov", "Dez"};

        int tot[] = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        
        if(ano % 4 == 0 || ano % 100 == 0 ||  ano % 400 == 0) {
            tot[1] = 29;
        }
        
        int contador = 0;
        
           for (int dias : tot) {
            System.out.println("No ano de " + ano + " teremos o mês de " + mes[contador] + " com " + dias + " dias");
            contador++;
        }
        
        for (int contador = 0; contador < tot.length; contador++) {
     
            System.out.println("No ano de " + ano + " teremos o mês de " + mes[contador] + " com " + tot[contador] + " dias");
        }*/
 
         String y[] = {"v","A", "M", "O","S"};

         int pos = Arrays.binarySearch(y, "A");
         
         System.out.println(pos);
        
        
        for (String valor : y) {
            System.out.println(valor + " ");
        }
        
        int vetor[] = new int[5];
        
        Arrays.fill(vetor, 20);
        
        for (int i = 0; i < 5; i++){
            
            System.out.println(vetor[i]);
        }
       
    

    }
}
