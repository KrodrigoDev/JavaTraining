package br.org.krodrigodev.io.application;

import br.org.krodrigodev.io.repository.PercuariaRepository;
import br.org.krodrigodev.io.service.JsonPercuaria;

public class MainJson {

    public static void main(String[] args) {

        PercuariaRepository percuariaRepository = new PercuariaRepository();

        JsonPercuaria jsonPercuaria = new JsonPercuaria();

        percuariaRepository.salvar(jsonPercuaria.obterDados());

    }
}
