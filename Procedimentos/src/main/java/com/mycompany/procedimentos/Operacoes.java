/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.procedimentos;

/**
 *
 * @author Kauã Rodrigo
 */
public class Operacoes {

    public static String contador(int inicio, int fim) {
        
        String s = " ";
        for (int contador = inicio; contador <= fim; contador++) {
            s += contador + " ";
        }
        return s;
        
    }

}
