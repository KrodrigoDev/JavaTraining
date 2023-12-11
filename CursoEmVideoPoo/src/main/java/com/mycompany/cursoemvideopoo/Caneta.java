package com.mycompany.cursoemvideopoo;

/**
 *
 * @author Kauã Rodrigo
 */
public class Caneta {

    private String marca, cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String marca, String cor) {
        
        this.setMarca(marca);
        this.setCor(cor);
        
        this.setTampada(true);
        this.setCarga(100);
    }

    // método 
    public void rabiscar() {
        if (tampada == false) {
            System.out.println("Riscando");
        } else {
            System.out.println("A caneta está tampada");
        }
    }

    // método  
    public void tampar() {
        this.tampada = true;
    }

    // método  
    public void destampar() {
        this.tampada = false;
    }

    // método  
    public void infoCaneta() {
        System.out.println( "Marca :" + this.getMarca() + "\n Cor: " + this.getCor()
                + "\n Ponta : " + this.getPonta() + "\n Carga : " + this.getCarga()
                + "\n Tampada : " + this.isTampada() );
    }

    // sets e gets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

}
