package com.krodrigodev.operadoresternariologico;

import java.util.Scanner;

/**
 *
 * @author Kauã Rodrigo
 */
public class OperadoresTernarioLogico {

    public static void main(String[] args) {
       
       /** Scanner teclado = new Scanner(System.in);
        
        int n1 = teclado.nextInt(), n2 = teclado.nextInt();
        
        int res = (n1>n2)? n2:n1;
        
        System.out.println(res); **/
       
       int n1 = 8 , n2 = 10 , n3 = 7;
       boolean r;
       
       r = (n1 == n3 ^ n2>n3) ? true:false;
       
        System.out.println(r);
        
    }
}
