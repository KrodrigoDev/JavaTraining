package com.mycompany.atividadesextras;

import java.util.Scanner;

/**
 * Calcula a multa por excesso de velocidade com base na velocidade registrada
 * em uma corrida. Caso a velocidade exceda 80Km/h, é exibida uma mensagem
 * informando o valor da multa. A multa é calculada cobrando R$5 por cada Km
 * acima da velocidade permitida.
 *
 * @author Kauã Rodrigo
 */
public class Multas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual foi a velocidade do veículo nessa corrida? ");

        float km = teclado.nextFloat();

        float multa = km - 80;

        if (km > 80) {

            multa *= 5;

            System.out.println("Sua multa é de : R$" + multa);

        } else {
            System.out.println("Você correu dentro do limite");
        }

    }

}
