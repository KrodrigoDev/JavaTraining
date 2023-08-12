package com.mycompany.cursocbf;

import java.util.List;

/**
 *@since 11/08/2023
 * @author Kauã Rodrigo
 */
public class CursoCBF {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, -1);

        /**
         * @param abs para retornar o valor absoluto
         * @param min vai me retornar o valor minimo
         * @param random vai gerar valores aleatorios entre
         * @param pow vai me retornar uma potência 
         * @param floor vai me voltar a parte inteira mais próxima de um n
         */
        
        
        //double geradorAle = 0 + Math.random() * (10 - 0); tem essas duas manieras de pegar valores ale
        for (int c = 0; c < 10; c++) {
            double geradorAle = Math.random() * 11;
            System.out.println(Math.floor(geradorAle));
        }

        // pegando o valor mínimo
        int valorMin = Integer.MAX_VALUE;
        for (int n : numeros) {
            valorMin = Math.min(valorMin, n);
        }
        System.out.println(valorMin);

        // retornar a raiz quadrada 
        System.out.println(((int) Math.sqrt(25)));

    }

}
