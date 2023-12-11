package com.mycompany.cursoemvideopoo;
import java.util.Random;
/**
 *
 * @author Kauã Rodrigo
 */
public class Aluno extends Pessoa {

    private int matricula;
    private String curso;
    private boolean ativo;
    private ContaBanco conta;
    private float mensalidade = 1200f;

    // construtor
    public Aluno(String nome, String sexo, String nascimento, String curso, ContaBanco conta) {
        super(nome, sexo, nascimento);
        setCurso(curso);
        setMatricula();
        setAtivo(true);
        setConta(conta);
    }

    // método
    public void cancelarMatricula() {
        setAtivo(false);
    }

    public void pagarMensalidade() {
        try {
            if (getConta().getSaldo() >= getMensalidade()) {
                getConta().setSaldo(getConta().getSaldo() - getMensalidade());
                setAtivo(true);
            } else {
                System.out.println("Vc está sem dinheiro na conta, por favor realize um depósito");
                setAtivo(false);
            }
        } catch (Exception erro) {
            System.out.println("Erro : " + erro.getMessage());
        }
    }

    // método com sobrecarga e herança 
    public void informacoesAluno() {
        super.informacoesPessoa();
        System.out.println("Curso : " + getCurso());
        System.out.println("Matrícula : " + getMatricula());
        System.out.println("Número da conta : " + getConta().getNumConta() + " " + getConta().getTipo());
        System.out.printf("Valor da mensalidade: %.2f %n" , getMensalidade());
        System.out.println("Ativo : " + (isAtivo() ? " Sim " : " Não "));
    }

    // gets e sets
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        Random geradorMatricula = new Random();
        this.matricula = geradorMatricula.nextInt(5000) + 2000;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public ContaBanco getConta() {
        return conta;
    }

    public void setConta(ContaBanco conta) {
        this.conta = conta;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}
