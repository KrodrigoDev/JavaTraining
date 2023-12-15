package br.org.krodrigodev.io.service.csv;

import br.org.krodrigodev.io.domain.EstacaoAgua;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CsvEstacaoAgua {

    // atributos

    private String caminho;
    private List<EstacaoAgua> estacaoAguas = new ArrayList<>();

    // construtor

    public CsvEstacaoAgua(String caminho) {
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

        } catch (IOException | ParseException erro) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro na leitura do arquivo");
        }
    }

    private Double converterParaDouble(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return 0.0;  // ou você pode retornar 0.0, dependendo do comportamento desejado
        }

        return Double.parseDouble(valor.replace(",", "."));
    }

    private EstacaoAgua criarObjeto(String[] valores) throws ParseException {

        EstacaoAgua estacaoAgua = new EstacaoAgua();

        estacaoAgua.setEstacaoCodigo(valores[0]);
        estacaoAgua.setNivelConsistencia(valores[1]);
        estacaoAgua.setData(new SimpleDateFormat("dd/MM/yyyy").parse(valores[2]));
        estacaoAgua.setHora(valores[3]);
        estacaoAgua.setNumMedicao(converterParaDouble(valores[4]));
        estacaoAgua.setPosHorizColeta(valores[5]);
        estacaoAgua.setPosVertColeta(valores[6]);
        estacaoAgua.setChoveu(converterParaDouble(valores[7]));
        estacaoAgua.setProfundidade(converterParaDouble(valores[8]));
        estacaoAgua.setTempAr(converterParaDouble(valores[9]));
        estacaoAgua.setTempAmostra(converterParaDouble(valores[10]));
        estacaoAgua.setpH(converterParaDouble(valores[11]));
        estacaoAgua.setCor(converterParaDouble(valores[12]));
        estacaoAgua.setTurbidez(converterParaDouble(valores[13]));
        estacaoAgua.setCondutividadeEletrica(converterParaDouble(valores[14]));
        estacaoAgua.setDurezaTotal(converterParaDouble(valores[15]));
        estacaoAgua.setDureza(converterParaDouble(valores[16]));
        estacaoAgua.setDQO(converterParaDouble(valores[17]));

        // Continue preenchendo os atributos conforme necessário...

        return estacaoAgua;
    }

    private void converterObjeto(String linha) throws ParseException {
        String[] valores = linha.split(";");
        EstacaoAgua estacaoAgua = criarObjeto(valores);
        estacaoAguas.add(estacaoAgua);
    }

    // gets e sets...

    public List<EstacaoAgua> getEstacaoAguas() {
        return estacaoAguas;
    }

}
