package com.mycompany.cursoemvideopoo;

/**
 *
 * @author Kauã Rodrigo
 */
public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    // construtor
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setLeitor(leitor);
        setAberto(false);
        setPagAtual(0);
    }
    
    // método para mostrar os detalhes
    
    public String detalhes() {
        return " \n Livro{ \n" + " titulo = " + titulo + "\n autor = " + autor + "\n totPaginas = " + totPaginas + "\n pagAtual = " + pagAtual + "\n aberto = " + (aberto?" Sim ":" Não ") + "\n leitor = " + leitor.getNome() + " \n }";
    }
    
    // implementação
    
    @Override
    public void abrir() {
        setAberto(true);
        setPagAtual(1);
    }

    @Override
    public void fechar() {
        setAberto(false);
        setPagAtual(0);
    }

    @Override
    public void folhear(int pagina) {
        if(pagina > getTotPaginas() && isAberto()){
            setPagAtual(getTotPaginas()); // vai para o final do livro
        } else if(pagina < 0 && isAberto()) {
            setPagAtual(1); // vai para o inicio do livro
        } else if(isAberto()){
            setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        if(isAberto()){
              setPagAtual(getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if(isAberto()){
            setPagAtual(getPagAtual() - 1);
        }
    }
    
    
    // gets e sets 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

  
    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
}
