package br.org.krodrigodev.io.service;

import br.org.krodrigodev.io.domain.Agricultura;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kauã Rodrigo
 */
public class CsvAgricultura {

    // atributos

    private String caminho;
    private List<Agricultura> agriculturas = new ArrayList<>();

    // construtor

    public CsvAgricultura(String caminho) {
        this.caminho = caminho;
    }

    // métodos de leitura, conversão e adição

    public void ler() {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {

            leitor.readLine(); // pular a linha do cabeçalho

            String linha;

            while ((linha = leitor.readLine()) != null) {
                converterObjeto(linha);
            }

            JOptionPane.showMessageDialog(null,
                    "Leitura do arquivo finalizada!");

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro na leitura do arquivo");
        }
    }

    private Agricultura criarObjeto(String[] valores) {
        long id = Long.parseLong(valores[0]);
        Double coUf = Double.parseDouble(valores[1]);
        String noUf = valores[2];
        int ano = Integer.parseInt(valores[3]);
        String variavel = valores[4];
        String produtoTipo = valores[5];
        String produtoVariavel = valores[6];
        String valor = valores[7];

        return new Agricultura(id, coUf, noUf, ano,
                variavel, produtoTipo, produtoVariavel, valor);
    }

    private void converterObjeto(String linha) {
        String[] valores = linha.split(",");
        Agricultura agricultura = criarObjeto(valores);
        agriculturas.add(agricultura);
    }

    // gets e sets...

    public List<Agricultura> getAgriculturas() {
        return agriculturas;
    }

}
