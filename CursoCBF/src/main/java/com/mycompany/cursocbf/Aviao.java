package com.mycompany.cursocbf;

import com.krodrigodev.protecte.Veiculo;

/**
 *
 * @author Kauã Rodrigo
 */
public class Aviao extends Veiculo {
    
    private int categoria;
    
    public Aviao(String nome, int categoria){
        super(nome,10);
        setCategoria(categoria);
        
    }
    
    // Método com informações
    public void infoAviao(){
        super.infoVeiculo();
        System.out.printf("Categoria... : %d", getCategoria());
    }

    // gets e sets
    
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    
    
}
