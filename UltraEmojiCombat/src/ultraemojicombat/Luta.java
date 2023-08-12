package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Kauã Rodrigo
 */
public class Luta {

    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            setDesafiado(desafiado);
            setDesafiante(desafiante);
            setAprovada(true);
            System.out.println("A luta foi aprovada");
        } else {
            setAprovada(false);
            System.out.println("A luta não foi aprovada ");
        }
    }

    public void lutar() {

        // 0 é empate, 1 é vítoria e 2 derrota
        Random gerador = new Random();
        int vencedor = gerador.nextInt(3);

        if (isAprovada() == true) {
            getDesafiado().apresentar();
            getDesafiante().apresentar();

            switch (vencedor) {
                case 0: // empatou
                    System.out.println("Empatou");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;
                case 1: // ganhou desafiado
                    System.out.println(desafiado.getNome() + " Ganhou a luta");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: // ganhou desafiante
                    System.out.println(desafiante.getNome() + " Ganhou a luta");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
            }
        }

    }

    // gets e sets 
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
