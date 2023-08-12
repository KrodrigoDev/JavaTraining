package com.mycompany.cursocbf;

/**
 *
 * @author Kauã Rodrigo
 */
public class CarroCombate extends Carro{
    
    private final int maxArmamento = 100, minArmamento = 0;
    private int qtDeArmamento;
    
    // contrutor que usa herança
    public CarroCombate(String nome, int blindagem, int qtDeArmamento) {
        super(nome); // chamando o contrutor da classe Carro
        super.setArmamento(true);
        super.setBlidagem(blindagem);
        this.qtDeArmamento = qtDeArmamento; 
    }
    
    // método atirar
    public void atirar(){
        if(this.qtDeArmamento > minArmamento){
            System.out.println("Bang...bang..");
            setQtDeArmamento(-1);
        } else {
            System.out.println("Sem armamento");
        }
    }
    
    // Método info com super
    public void infoDoCarroCombate(){
        super.infoDoCarro();
        System.out.println("Qtd.Armamento... : " + this.qtDeArmamento);
        
    }
    
    
    // gets e sets

    public int getQtDeArmamento() {
        return qtDeArmamento;
    }

    public void setQtDeArmamento(int qtDeArmamento) {
        this.qtDeArmamento += qtDeArmamento;
        if(this.qtDeArmamento > maxArmamento ){
            this.qtDeArmamento = maxArmamento;
            System.out.println("100 é o número máximo");
        } else if(this.qtDeArmamento < minArmamento){
            this.qtDeArmamento = minArmamento;
        
    }
    
    
    
    
    
    } 
    
}
