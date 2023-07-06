package com.mycompany.swingprontoscomrepitas;

import javax.swing.JOptionPane;

/**
 *
 * @author Kauã Rodrigo
 */
public class SwingProntosComRepitas {

    public static void main(String[] args) {

        int numeros;
        
        int totNumeros = 0;
        int totPares = 0;
        int totImpares = 0;
        int totAcimaCem = 0;
        int media;
        int soma = 0;
        
        do {

            numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número ou 0 para sair: </html>", "Números", JOptionPane.WARNING_MESSAGE));

            // total de vezes que digitou
            totNumeros++;
            
            soma += numeros;
            
            // total de números pares e impares
            if (numeros % 2 == 0) {
                totPares++;
            } else {
                totImpares++;
            }
            
            // total de números maiores que cem 
            if (numeros > 100) {
                totAcimaCem++;
            }               
            
        } while (numeros != 0);
        
        // média dos números 
        media = (int) soma / totNumeros;
        
        JOptionPane.showMessageDialog(null, "<html>Resultados <hr><br> Total de Valores: " + totNumeros + "<br> Total de Pares : " + totPares + "<br> Total de impares : " + totImpares + "<br> Acima de 100 : " + totAcimaCem + "<br> Média dos valores : " + media +"</html>");
        
        

    }
}
