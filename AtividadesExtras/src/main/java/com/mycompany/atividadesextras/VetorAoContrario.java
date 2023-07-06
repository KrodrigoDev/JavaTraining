package com.mycompany.atividadesextras;

import java.util.Arrays;

/**
 *
 * @author Kauã Rodrigo
 */
public class VetorAoContrario {
    
    public static void main(String[] args) {
        
        int num[] = new int[5];
        
        Arrays.fill(num, 15);
        
        for(int c = num.length - 1 ;c >= 0 ; c--){
            System.out.println("vetor na posição " + c + " = " + num[c]);
            
        }
        
        
    }
    
}
