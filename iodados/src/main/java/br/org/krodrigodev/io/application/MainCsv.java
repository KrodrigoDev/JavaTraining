package br.org.krodrigodev.io.application;

import br.org.krodrigodev.io.repository.AgriculturaRepository;
import br.org.krodrigodev.io.service.CsvAgricultura;

import javax.swing.JOptionPane;


public class MainCsv {

    public static void main(String[] args) {

        String codigo = JOptionPane.showInputDialog(
                null,
                "Digite o tipo de arquivo que vamos trabalhar:",
                "Insira o tipo",
                JOptionPane.QUESTION_MESSAGE);

        String caminho = JOptionPane.showInputDialog(
                null,
                "Agora insira o caminho do arquivo:",
                "Insira o caminho",
                JOptionPane.QUESTION_MESSAGE);

        if (codigo.equalsIgnoreCase("csv")) {

            CsvAgricultura csvAgricultura = new CsvAgricultura(caminho);
            csvAgricultura.ler();

            AgriculturaRepository agriculturaRepository = new AgriculturaRepository();
            agriculturaRepository.salvar(csvAgricultura.getAgriculturas());
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Só existe um tipo por enquanto...");
        }


    }
}