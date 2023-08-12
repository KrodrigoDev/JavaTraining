package com.mycompany.cursocbf;

/**
 * classes abtradas só servem para serem herdados
 *
 * @author Kauã Rodrigo
 */
public abstract class Animal implements SerVivo {

    private boolean vivo;
    private int x, y, velocidade, forca, massa;

    // Contrutor
    public Animal(int velocidade, int massa, int forca) {
        setVivo(true);
        setVelocidade(velocidade);
        setMassa(massa);
        setForca(forca);
        setX(0);
        setY(0);
    }

    // métodos implementados
    @Override
    public void mover() {
        if (isVivo() == true) {
            setX(getX() + getVelocidade());
            setY(getY() + getVelocidade());
        } else {
            System.out.println("--------------------------");
            System.out.println(getClass().toGenericString() + " está morto, não pode mover");
            System.out.println("--------------------------");
        }
    }

    @Override
    public void comer(int massa) {
        if(isVivo() == true){
            setForca(getForca() + massa);
        } else {
            System.out.println("--------------------------");
            System.out.println(getClass().toGenericString() + " está morto, não pode comer");
            System.out.println("--------------------------");
        }
    }

    @Override
    public void info() {
        System.out.println("Tipo... : " + getClass().toString());
        System.out.println("Vivo... : " + (isVivo()?"Sim":"Não"));
        System.out.println("Massa... : " + getMassa());
        System.out.println("Velocidade... :" + getVelocidade());
        System.out.println("Força... : " + getForca());
        System.out.println("-----------------------------");
    }

    @Override
    public void atacar(Animal animal) {
        if(isVivo() == true ){
            if(getForca() > animal.getForca()){
                setForca(getForca() + animal.getMassa());
                comer(animal.getMassa());
                animal.setVivo(false);
            } else {
                animal.setForca(animal.getForca() + getMassa());
                setVivo(false);
            }
        } else {
            System.out.println("--------------------------");
            System.out.println(getClass().toGenericString() + " está morto, não pode atacar");
            System.out.println("--------------------------");
        }
    }

    // gets e sets
    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

}
