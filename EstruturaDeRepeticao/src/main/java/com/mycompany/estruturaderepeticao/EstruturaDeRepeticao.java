package com.mycompany.estruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 *
 * Este arquivo contém um breve treino de estruturas de repetição
 *
 */
public class EstruturaDeRepeticao {

    public static void main(String[] args) {

        int contador = 0;

        /** while (contador < 10) {

            contador++;

            if (contador == 2 || contador == 5 || contador == 6) {
                continue;
                
                esse if faz com que o programa pule as etapas 
                de baixo caso tenha um retorno true
                 
            }
            
            if (contador == 9) {
                break;
            }
        

            System.out.println("Caiu aqui... \n contador... " + contador);
        } **/
        
        /* while (contador <= 50) {
            
            System.out.println(contador);
            contador++;
        } */

        Scanner teclado = new Scanner(System.in);
        
        String nome;
         
        System.out.print("Digite 1 para digitar seu nome ou 2 para sair : ");
        
        nome = teclado.nextLine();
        
        while (!nome.equals("1")) {
            System.out.println("Bem vindo " + nome);
            System.out.println("Digite seu nome ou s para sair: ");
            nome = teclado.nextLine();
        }
        
        System.out.println("Fim da execução");
        
        
        
        
        
        /*switch (opcoes) {
            case 1:
                System.out.print("Hi, what your name? ");
                String nome = teclado.next();
                System.out.println("Seja bem vindo " + nome);
                
            break;
            
            case 2: 
                System.out.println("Bye, bye");
            break;
                
        }*/
        
        
        
        
    }
}
