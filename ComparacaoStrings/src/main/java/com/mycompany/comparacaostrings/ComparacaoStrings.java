package com.mycompany.comparacaostrings;
/**
 *
 * @author Kauã Rodrigo
 */
public class ComparacaoStrings {

    public static void main(String[] args) {
       
        String nome1 = "Kauã"; 
        String nome2 = "Kauã";
        
        // perceba o new na criação deste objetivo
        String nome3 = new String("Kauã");
        
        // equals vai compaarar o contéudo
        String res = (nome1.equals(nome3)) ? "Igual":"Diferente";
        
        
        System.out.println(res);
    }
}
