package com.mycompany.atividadesextras;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class NotasComFor {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float n;
        float media = 0;
        int contador = 0;
        
        
        System.out.print("Digite S ou N : ");
        String decisao = teclado.next();
        
        for(int i = 1; !decisao.equals("N"); i++) {
            
            System.out.print("Digite a nota  " + i + " : ");
            n = teclado.nextFloat();
            
            media += n;
            contador++;
             
            System.out.print("Deseja continuar ?");
            decisao = teclado.next();
        
        }
        
        
        media /= contador;
        
        System.out.printf("A média das notas digitadas é %.2f ", media);
        
        
        
    }
    
}
