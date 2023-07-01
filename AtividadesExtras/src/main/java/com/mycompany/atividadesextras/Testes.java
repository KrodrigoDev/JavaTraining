package com.mycompany.atividadesextras;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class Testes {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int maxIdade = 0;
        int quantiF = 0;
        int quantiM = 0;
        int idadeMJovem = Integer.MAX_VALUE; // isso vai fazer a variável começar com o valor max

        int decisao = 1;

        while (decisao == 1) {

            System.out.print("Digite \"M\" ou \"F\" : ");

            String sexo = teclado.next();

            System.out.print("Digite a idade: ");

            int idade = teclado.nextInt();

            if (sexo.equals("M")) {

                quantiM++;

            } else if (sexo.equals("F") && idade < idadeMJovem) {

                quantiF++;
                idadeMJovem = idade;

            }

            if (idade > maxIdade) {
                maxIdade = idade;
            }

            System.out.println("Deseja continuar ? digite 1 para sim ou 0 para sair");
            decisao = teclado.nextInt();

        }

        System.out.println("Maior idade digitada: " + maxIdade);
        System.out.println("Total de mulheres : " + quantiF);
        System.out.println("total de homens : " + quantiM);
        System.out.println("Idade da mulher mais jovem : " + idadeMJovem);
        
    }

}
