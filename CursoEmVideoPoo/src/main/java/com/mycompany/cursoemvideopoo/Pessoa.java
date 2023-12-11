package com.mycompany.cursoemvideopoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Pessoa {

    // atributos
    private String nome, sexo;
    private int idade;
    private LocalDate nascimento;

    // construtor
    public Pessoa(String nome, String sexo, String nascimento) {
        try {
            setNome(nome);
            setSexo(sexo);
            setNascimento(nascimento);
            fazerAniver();
        } catch (DateTimeParseException e) {
            System.out.println("Erro ao processar a data de nascimento. Certifique-se de que a data esteja no formato dd/MM/yyyy.");
        } catch (Exception erro) {
            System.out.println("Erro ao criar a pessoa: " + erro.getMessage());
        }
    }

    // métodos
    public void informacoesPessoa() {
        System.out.println("-------------------------");
        System.out.println("Nome : " + getNome());
        System.out.println("Sexo : " + getSexo());
        System.out.println("Data de nascimento : " + getNascimento());
        System.out.println("Idade : " + getIdade());
    }

    public void fazerAniver() {
        LocalDate anoAtual = LocalDate.now();

        if (anoAtual.getMonthValue() >= getNascimento().getMonthValue() 
            && anoAtual.getDayOfMonth() >= getNascimento().getDayOfMonth()) {
            setIdade(getIdade() + 1);
        }

    }

    // gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        LocalDate anoAtual = LocalDate.now();
        return anoAtual.getYear() - getNascimento().getYear();
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nascimento = LocalDate.parse(nascimento, formatoData);
    }

}
