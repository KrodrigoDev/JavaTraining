package com.mycompany.cursoemvideopoo;

/**
 *
 * @author Kauã Rodrigo
 */
public class ControleRemoto implements Controlador{

    // atributos
    
    private int volume;
    private boolean ligado, tocando;
    
    // construtor
    
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);   
    }
    
    // métodos da interface
  
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {

        System.out.println("Ligado... : " + isLigado());
        System.out.print("Volume... : " );
         for(int contador = 0; contador < getVolume(); contador += 10){
            System.out.print(" |");
        }
   
        System.out.println("\nTocando... : " + isTocando());
      
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado() == true){
            setVolume(getVolume() + 10);
        } else {
            System.out.println("O controle está desligado");
        }  
    }

    @Override
    public void menosVolume() {
        if(isLigado() == false){
            setVolume(getVolume() - 10);
        } else {
            System.out.println("O controle está desligado");
        }    
    }

    @Override
    public void ligarMudo() {
        if(isLigado() == true && getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() == true && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() == true && isTocando() == false){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigado() == true && isTocando() == true){
            setTocando(false);
        }
    }
    
    // gets e sets 

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    
}
