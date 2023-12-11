package com.mycompany.cursoemvideopoo;
/**
 *
 * @author Kauã Rodrigo
 */
public class Bolsista extends Aluno {

    // atributos
    private int desconto;
    private float mensalidadeDesconto;

    // construtor com herança 
    public Bolsista(String nome, int idade, String sexo, String nascimento, String curso, ContaBanco conta, int desconto) {
        super(nome, sexo, nascimento, curso, conta);
        setDesconto(desconto);
    }

    // método com sobrecarga 
    @Override
    public void pagarMensalidade() {
        getConta().setSaldo(getConta().getSaldo() - getMensalidadeDesconto());
    }

    public void informacoesBolsista() {
        super.informacoesAluno();
        System.out.println("Informações do Bolsista:");
        System.out.println("Desconto: " + getDesconto() + "%");
        System.out.println("Mensalidade com desconto: " + getMensalidadeDesconto());

    }

    // gets e sets 
    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public float getMensalidadeDesconto() {
        return this.mensalidadeDesconto = getMensalidade()
                - (getMensalidade() * (getDesconto() / 100f));
    }

}
