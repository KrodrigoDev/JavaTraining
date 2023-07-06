package com.mycompany.atividadesextras;
/**
 *
 * @author Kauã Rodrigo
 */
public class SomaPares {
    
    public static void main(String[] args) {
        
        int numeros = 0;
        int qNumerosPares = 0;
        
        do {
            
            
            System.out.println("Numero: " + numeros);
            
            if (numeros % 2 == 0) {
                
                // só vai cair aqui dentro os números pares
                qNumerosPares += numeros;
            }
            
            numeros++;
                
        } while (numeros != 100);
        
        System.out.println("A soma de todos os números pares entre 1 e 100 é : " + qNumerosPares);
    }
    
}
