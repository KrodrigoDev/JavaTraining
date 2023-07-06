package com.mycompany.atividadesextras;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class PedraPapelTesoura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quer jogar S ou N ? ");
        String jogar = teclado.nextLine();

        while (!jogar.equals("N")) {

            double decisaoAleMaquina = 1 + Math.random() * (4 - 1);
            int decisaoIntMaquina = (int) decisaoAleMaquina;

            System.out.println(" \n 1 para pedra \n 2 para papel \n 3 para tesoura");
            System.out.print("Escolha: ");
            int decisaoJogador = teclado.nextInt();
            
            teclado.nextLine(); // Consumir a quebra de linha pendente

            switch (decisaoJogador) {

                case 1:

                    if (decisaoIntMaquina == 1) {
                        System.out.println("Pedra X Pedra = Empatou");
                    } else if (decisaoIntMaquina == 2) {
                        System.out.println("Pedra X Papel = Perdeu");
                    } else if (decisaoIntMaquina == 3) {
                        System.out.println("Pedra X Tesoura = Ganhou");
                    }

                    break;

                case 2:

                    if (decisaoIntMaquina == 1) {
                        System.out.println("Papel X Pedra = Ganhou");
                    } else if (decisaoIntMaquina == 2) {
                        System.out.println("Papel X Papel = Empatou");
                    } else if (decisaoIntMaquina == 3) {
                        System.out.println("Papel X Tesoura = Perdeu");
                    }

                    break;

                case 3:

                    if (decisaoIntMaquina == 1) {
                        System.out.println("Tesoura X Pedra = Perdeu");
                    } else if (decisaoIntMaquina == 2) {
                        System.out.println("Tesoura X Papel = Ganhou");
                    } else if (decisaoIntMaquina == 3) {
                        System.out.println("Tesoura X Tesoura = Empatou");
                    }

                    break;

            }

            System.out.print("Quer jogar novamente S ou N ? ");
            jogar = teclado.nextLine();

        }
    }

}
