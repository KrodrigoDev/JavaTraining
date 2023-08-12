package com.mycompany.cursocbf;

public class Vegetal {
    
    private boolean vivo;
    private int massa;
    
    public Vegetal(int massa){
        setVivo(true);
        setMassa(massa);
    }
    
    // métodos
    
    public void info() {
        System.out.println("Tipo... : " + getClass().toString());
        System.out.println("Vivo... : " + (isVivo()?"Sim":"Não"));
        System.out.println("Massa... : " + getMassa());
        System.out.println("-----------------------------");
    }
    
    // gets e sets
    
    public int getMassa(){
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    
    
    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }

    public boolean isVivo() {
        return vivo;
    }
    
    
    
    
}
