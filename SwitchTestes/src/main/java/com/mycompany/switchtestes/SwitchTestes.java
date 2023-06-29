package com.mycompany.switchtestes;

import java.util.Scanner;
/**
 * 
 * Este programa será para testes 
 * 
 * @author Kauã Rodrigo
 * 
 */
public class SwitchTestes {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
          
        System.out.print("Quantas pernas ? ");
        int pernas = teclado.nextInt();
        
        System.out.print("Isso é um(a) " );
        
        String tipo;
        
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipéde";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4: 
                tipo = "Quadrúpede";
                break;
            case 5:
                tipo = "Aranha";
                break;
            default: 
                tipo = "ET";
                break;
                
        }
        
        System.out.println(tipo);
        
    }
    
}
