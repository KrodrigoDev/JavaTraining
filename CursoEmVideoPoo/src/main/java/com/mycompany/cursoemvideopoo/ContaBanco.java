package com.mycompany.cursoemvideopoo;

import java.util.Random;

/**
 *
 * @author Kauã Rodrigo
 */
public class ContaBanco {

    // cc é conta corrente e cp é conta poupança
    private int numConta;
    private String tipo;
    private boolean status;
    private float saldo;

    // Construtor
    public ContaBanco() {
        setSaldo(0);
        setStatus(false);
    }

    // Método informativo
    public void infoConta() {
        System.out.println("-------------------------------");
        System.out.println("Conta : " + getNumConta());
        System.out.println("Saldo : " + getSaldo());
        System.out.println("Tipo : " + getTipo());
        System.out.println("Status : " + isStatus());
    }

    // Método
    public void abrirConta(String tipo) {

        double gerador = new Random().nextInt(256);
        int numConta = (int) gerador;

        setTipo(tipo);
        boolean contaValida = false;

        if (getTipo().equalsIgnoreCase("CC")) {
            setSaldo(50);
            contaValida = true;
        } else if (getTipo().equalsIgnoreCase("CP")) {
            setSaldo(150);
            contaValida = true;
        } else {
            System.out.println("Tipo inválido");
        }

        if (contaValida) {
            setStatus(true);
            setNumConta(numConta);
        }

    }

    // Método
    public void fecharConta() {

        if (this.saldo > 0) {
            System.out.println("Vc não pode fechar a conta, ainda tem saldo lá");
        } else if (this.saldo < 0) {
            System.out.println("Vc está no negativo, então não pode fechar a conta");
        } else {
            System.out.println("Sua conta de nº " + getNumConta() + " foi fechada !");
            setStatus(false);
        }

    }

    // Método
    public void depositar(float valorDeposito) {

        if (isStatus() == true) {
            System.out.println("Depósito realizado com sucesso !");
            setSaldo(getSaldo() + valorDeposito);
        } else {
            System.out.println("Sua conta está fechada, por favor abra sua conta para realizar um depósito");
        }

    }

    // Método
    public void sacar(float valorSaque) {

        if (getSaldo() >= valorSaque && isStatus() == true) {
            System.out.println("Saque realizado com sucesso");
            setSaldo(getSaldo() - valorSaque);
        } else if (getSaldo() >= valorSaque && isStatus() == true) {
            System.out.println("Vc está no negativo, não pode sacar");
        } else {
            System.out.println("Sua conta está fechada ou sem saldo");
        }

    }

    // Método
    public void pagarMensal() {

        int valorMensa;

        if (getTipo().equalsIgnoreCase("CC") && isStatus() == true) {
            valorMensa = 12;
            if (getSaldo() > valorMensa) {
                setSaldo(getSaldo() - valorMensa);
            }
        } else if (getTipo().equalsIgnoreCase("CP") && isStatus() == true) {
            valorMensa = 20;
            if (getSaldo() > valorMensa) {
                setSaldo(getSaldo() - valorMensa);
            }
        } else {
            System.out.println("Impóssivel pagar");
        }

    }

    // Gets e Sets
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
