package br.org.krodrigodev.io.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Percuaria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String
            NC, NN, MC, MN, V, D1C, D1N, D2C, D2N, D3C, D3N, D4C, D4N;

    // Construtores

    public Percuaria() {

    }

    public Percuaria(String NC, String NN, String MC, String MN,
                     String V, String D1C, String D1N, String D2C,
                     String D2N, String D3C, String D3N,
                     String D4C, String D4N) {
        this.NC = NC;
        this.NN = NN;
        this.MC = MC;
        this.MN = MN;
        this.V = V;
        this.D1C = D1C;
        this.D1N = D1N;
        this.D2C = D2C;
        this.D2N = D2N;
        this.D3C = D3C;
        this.D3N = D3N;
        this.D4C = D4C;
        this.D4N = D4N;
    }

    // gets e sets....

}
