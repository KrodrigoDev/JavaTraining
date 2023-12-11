package br.org.krodrigodev.io.service;

import br.org.krodrigodev.io.domain.Percuaria;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class JsonPercuaria {

    public List<Percuaria> obterDados() {

        String json = sendRequest();
        List<Percuaria> percuarias = new ArrayList<>(jsonParaObjeto(json));

        if (!percuarias.isEmpty()) {
            percuarias.remove(0); // removendo o cabeçalho
        }
        return percuarias;

    }

    private String sendRequest() {
        try {
            System.out.println(criarConexao().body());
            return criarConexao().body();
        } catch (IOException | InterruptedException erro) {
            System.out.println("Ocorreu um erro ao realizar a solicitação:" + erro.getLocalizedMessage());
        }
        return null;
    }

    private List<Percuaria> jsonParaObjeto(String json) {
        Gson gson = new GsonBuilder().create();
        Percuaria[] percuariaArray = gson.fromJson(json, Percuaria[].class);
        return List.of(percuariaArray);
    }

    private HttpResponse<String> criarConexao() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(5))
                .uri(URI.create(UrlConstants.IBGE_PERCUARIA_API))
                .headers("Accept", "application/json")
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

}

