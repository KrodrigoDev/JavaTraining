package com.mycompany.atividadesextras;

import java.util.Scanner;
/**
 *
 * @author Kauã Rodrigo
 */
public class DescontoAumento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<|----------------------------------|>>>>");
        
        System.out.print("Valor do produto : R$ ");
        float valorProduto = teclado.nextFloat();
        
        System.out.print("Desconto em cima do valor : ");
        float porcentagemDesconto = teclado.nextFloat();

        float desconto =  valorProduto - (valorProduto * (porcentagemDesconto/100));
        System.out.println("O desconto de " + porcentagemDesconto + " sob o valor de " + valorProduto + " é de : " + desconto );
        
        System.out.println("<<<<|----------------------------------|>>>>");
        
        System.out.print("Salário : ");
        float salarioBase = teclado.nextFloat();
        
        System.out.print("Aumento : ");
        float aumentoPorcento = teclado.nextFloat();
        
        float salarioComAumento = salarioBase + (salarioBase * (aumentoPorcento/100));
        
        System.out.println("Seu salaário foi de R$ " + salarioBase + " para R$ " + salarioComAumento );
        
        System.out.println("<<<<|----------------------------------|>>>>");
        
        
        
    

    }

}
