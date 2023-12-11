package br.org.krodrigodev.io.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agricultura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private Double co_uf;
    private String no_uf, variavel, produto_tipo, produto_variavel, valor;
    private int ano;


    public Agricultura() {
    }

    /**
     * Construtor que inicializa os atributos da Agricultura.
     *
     * @param _id              Identificador único da agricultura.
     * @param co_uf            Coordenada geográfica relacionada à UF.
     * @param no_uf            Nome da Unidade Federativa.
     * @param variavel         Variável associada aos dados.
     * @param produto_tipo     Tipo de produto agrícola.
     * @param produto_variavel Variável específica do produto.
     * @param valor            Valor associado aos dados.
     * @param ano              Ano ao qual os dados se referem.
     */
    public Agricultura(Long _id, Double co_uf, String no_uf, int ano, String variavel, String produto_tipo, String produto_variavel, String valor) {
        this._id = _id;
        this.co_uf = co_uf;
        this.no_uf = no_uf;
        this.variavel = variavel;
        this.produto_tipo = produto_tipo;
        this.produto_variavel = produto_variavel;
        this.valor = valor;
        this.ano = ano;
    }

    // gets e sets...

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Double getCo_uf() {
        return co_uf;
    }

    public void setCo_uf(Double co_uf) {
        this.co_uf = co_uf;
    }

    public String getNo_uf() {
        return no_uf;
    }

    public void setNo_uf(String no_uf) {
        this.no_uf = no_uf;
    }

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }

    public String getProduto_tipo() {
        return produto_tipo;
    }

    public void setProduto_tipo(String produto_tipo) {
        this.produto_tipo = produto_tipo;
    }

    public String getProduto_variavel() {
        return produto_variavel;
    }

    public void setProduto_variavel(String produto_variavel) {
        this.produto_variavel = produto_variavel;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

