package com.mycompany.cursocbf;
/**
 *
 * @author Kauã Rodrigo
 */
public class Carro {
    
   // Atributos
   private String nome;
   private boolean ligado,destruido,armamento;
   private int blidagem;
   
   // Contrutor
   public Carro(String nome){
       this.nome = nome;
       this.ligado = false;
       this.destruido = false;
       this.armamento = false;
       this.blidagem = 0;
       
   }
   
   // Método para verificar o dano
   public void sofrerDano(int dano){
       this.blidagem -= dano;
       if(this.blidagem <= 0){
           this.blidagem = 0;
           this.ligado = false;
           this.destruido = true;
       }
   }
   
   // Método com as informações
   public void infoDoCarro(){
       System.out.println("-----------------------");
       System.out.printf("Nome.... : %s%n " , this.nome);
       System.out.printf("Ligado... : %s%n ", this.ligado ? "Sim":"Não");
       System.out.printf("Destruido... : %s%n ", this.destruido ? "Sim":"Não");
       System.out.printf("Blindagem... : %d%n ", this.blidagem);
       System.out.printf("Armamento... : %s%n ", this.armamento ? "Sim":"Não");
   }

   // Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public boolean isArmamento() {
        return armamento;
    }

    public void setArmamento(boolean armamento) {
        this.armamento = armamento;
    }

    public int getBlidagem() {
        return blidagem;
    }

    public void setBlidagem(int blidagem) {
        this.blidagem = blidagem;
    }
   
   
   
    
}
