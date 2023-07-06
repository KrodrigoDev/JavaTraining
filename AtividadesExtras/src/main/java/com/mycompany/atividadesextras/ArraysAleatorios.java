package com.mycompany.atividadesextras;

import java.util.Arrays;

/**
 *
 * @author Kauã Rodrigo
 */
public class ArraysAleatorios {
    
    public static void main(String[] args) {
        
        int numeros[] = new int[20];
        
        int nAcima5 = 0, divivelPor3 = 0;
        
        for(int contador = 0; contador < numeros.length; contador++){
           
            int numerosAleatorios = (int) (0 + Math.random() * (10-0));
            
            numeros[contador] = numerosAleatorios;
            
            System.out.print(numeros[contador] + " ");
            
            if (numeros[contador] > 5) {
                nAcima5 += 1;
            }
            
            if (numeros[contador] % 3 == 0){
                divivelPor3 += 1;
            }
            
        }
        
        System.out.println("\nTotal de números acima de 5 : " + nAcima5 + "\n Total de números divisíveis por 3 :  " + divivelPor3);
        
        
        
    }
    
}
