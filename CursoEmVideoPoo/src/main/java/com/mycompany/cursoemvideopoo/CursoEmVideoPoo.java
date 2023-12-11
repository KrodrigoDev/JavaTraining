package com.mycompany.cursoemvideopoo;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class CursoEmVideoPoo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um EU : ");
        String res = teclado.next();
        
        if(res.equalsIgnoreCase("eu")){
            System.out.println("è igual");
        } else {
            System.out.println("é diferente");
        }
        
    }
}
