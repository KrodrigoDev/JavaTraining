package com.krodrigodev.protecte;

/**
 *
 * @author Kauã Rodrigo
 */
public class Veiculo {
    
    protected String nome;
    protected int tipo;
    
    // Construtor 
    public Veiculo(String nome, int tipo){ 
         setNome(nome);
         setTipo(tipo);
    }
    
    // Método com as informações
    public void infoVeiculo(){
        System.out.printf("%n Nome... : %s%n Tipo... : %d%n", getNome(),getTipo());
    }
    
    // gets e sets 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
