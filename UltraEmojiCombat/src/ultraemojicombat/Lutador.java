package ultraemojicombat;

/**
 *
 * @author Kauã Rodrigo
 */
public class Lutador {

    // Categorias peso leve , peso médio, peso pesado
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float peso, altura;

    // Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setPeso(peso);
        setAltura(altura);
        setIdade(idade);
        setVitorias(vitoria);
        setDerrotas(derrota);
        setEmpates(empate);        
    }

    // Métodos
    public void apresentar() {
        System.out.printf("%n Lutador : %s Origem : %s%n Com %d anos %n %.2f n de altura %n %.2f Kg %n Ganhou : %d%n Perdeu : %d%n Empatou : %d%n",  
                getNome(), getNacionalidade(),getIdade(),
                getAltura(), getPeso(), getVitorias(), 
                getDerrotas(),getEmpates());
    }
    
    public void status() {
        System.out.printf("%n%s é um peso %s%n vitórias %d%n derrotas %d%n empates %d%n",
                getNome(), getCategoria(),
                getVitorias(),getDerrotas(),
                getEmpates());
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    // gets e sets
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        
        if(getPeso() < 52.2f){
            this.categoria = "Inválido";
        } else if(getPeso() <= 70.3f){
            this.categoria = "Leve";
        } else if(getPeso() <= 83.9f){
            this.categoria = "Médio";
        } else if(getPeso() <= 120.2f){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
