package com.mycompany.atividadesextras;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class DoWhileAdivinhacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número entre 0 e 50 :");
        int palpite = teclado.nextInt();
        
        double GeradoAleatorio = 0 + Math.random() * (50 - 0);
        int nAleatorio = (int) GeradoAleatorio;

        do {
            
            if(nAleatorio < palpite) {
                System.out.println("Pensei em um número menor " );
            } else if ( nAleatorio > palpite) {
                System.out.println("Pensei em um número maior " );
            }
            
            System.out.print("Tente novamente : ");
            palpite = teclado.nextInt();
            
        } while (palpite != nAleatorio);
        
        System.out.println("Meus parabêns, vc acertou");

    }

}
