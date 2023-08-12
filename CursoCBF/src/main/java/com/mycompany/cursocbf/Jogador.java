package com.mycompany.cursocbf;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class Jogador {
    
    private String nome, posicao;
    private int qntGols;
    static int totalJogadores = 0;
    private boolean ativo = false;
    
    public Jogador(String nome, String posicao, int qntGols){
       this.setNome(this.nome = nome);
       this.setPosicao(this.posicao = posicao);
       this.setQntGols(this.qntGols = qntGols);
       totalJogadores++;
    }
    
    
    public void infoParticular(){
        System.out.println(this.isAtivo() ? "Pagou":"Não Pagou");
        System.out.println("Nome do jogador: " + this.nome);
        System.out.println("Posiçõa do jogador: " + this.posicao);
        System.out.println("Quantidade de gols: " + this.qntGols);
    }
    
    static void infTime(){
        System.out.println("Total de jogadores presente " + totalJogadores);
    }
    
    public void pagarMensalidade(){
        System.out.print("Pagar mensalidade: ");
        Scanner teclado = new Scanner(System.in);
        String decisao = teclado.nextLine();
        
        if(decisao.equalsIgnoreCase("Sim")){
            ativo = true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQntGols() {
        return qntGols;
    }

    public void setQntGols(int qntGols) {
        this.qntGols = qntGols;
    } 

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    
    
}
