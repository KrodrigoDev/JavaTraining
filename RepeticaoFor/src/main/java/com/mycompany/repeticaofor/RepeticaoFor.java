package com.mycompany.repeticaofor;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class RepeticaoFor {

    public static void main(String[] args) {

        /* int numeros;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        
        numeros = teclado.nextInt();

        for (int n = numeros; n >= 0; n--) {

            System.out.println(n);

        }
        
        System.out.println("Aqui ó " + numeros);
        
         
        for (int a = 0; a <= 3; a++) {

            System.out.println(a + "a");

            for (int b = 0; b <= 2; b++) {
                System.out.println(b + "b");
            }

        }*/
        
        Scanner teclado = new Scanner(System.in);

        String nome, nomeMax = null, nomeMin = null;
        int maiorLetras = 0, menorLetras = 0 ;
        
        System.out.print("(S/N) : ");

        String sN = teclado.nextLine();
        

        while (!sN.equals("N")) {

            System.out.print("Digite um nome : ");
            nome = teclado.nextLine();
            
            if(nome.length() > maiorLetras) {
                //nome com a maior quantidade de letras
                maiorLetras = nome.length();
                nomeMax = nome;
            } else if (nomeMin == null || nome.length() < menorLetras ) {
                menorLetras = nome.length();
                nomeMin = nome;
            }
            
            System.out.print("Deseja continuar : ");

            sN = teclado.nextLine();
           
        }
        
        System.out.println("o nome com a maior quantidades de letras é " + nomeMax + " com : " + maiorLetras);
        System.out.println("o nome com a menor quantidades de letras é " + nomeMin + " com : " + menorLetras);

    }
    
}
