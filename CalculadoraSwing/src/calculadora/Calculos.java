package calculadora;
/**
 *
 * @author Kauã Rodrigo
 */
public class Calculos {
    
    private int numerosInteiros;
    private double numerosComPontos;
    
    
    public int somar(int...numerosInteiros){
        int resultado = 0;
        for(int numeros : numerosInteiros){
            resultado += numeros;
        }
            return resultado;
    } 
    
    
    // Gets e Sets

    public int getNumerosInteiros() {
        return numerosInteiros;
    }

    public void setNumerosInteiros(int numerosInteiros) {
        this.numerosInteiros = numerosInteiros;
    }

    public double getNumerosComPontos() {
        return numerosComPontos;
    }

    public void setNumerosComPontos(double numerosComPontos) {
        this.numerosComPontos = numerosComPontos;
    }
    
    
    
        
    
}
