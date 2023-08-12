/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursocbf;

/**
 *
 * @author Kauã Rodrigo
 */
public class Aranha extends Animal {
    
    private int veneno;
    
    // construtor
    public Aranha(int velocidade, int massa, int forca, int veneno) {
        super(velocidade, massa, forca);
        setVeneno(veneno);
    }
    
    @Override
    public void atacar(Animal animal){
         if(isVivo() == true){
            if((getForca() + getVeneno()) > animal.getForca()){
                setForca(getForca() + animal.getMassa());
                animal.setVivo(false);
            } else {
                animal.setForca(animal.getForca() + getMassa());
                setVivo(false);
            }
        } else {
            System.out.println("--------------------------");
            System.out.println(getClass().toGenericString() + " está morto, não pode atacar");
            System.out.println("--------------------------");
        }
        
    }
    
    // gets e sets

    public int getVeneno() {
        return veneno;
    }

    public void setVeneno(int veneno) {
        this.veneno = veneno;
    }
    
    
    
}
