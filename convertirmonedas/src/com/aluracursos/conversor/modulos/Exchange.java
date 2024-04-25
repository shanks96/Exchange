package com.aluracursos.conversor.modulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchange {

    public String Exchange() throws IOException, InterruptedException {
        //Genera y coloca tu API para que la consulta funcione
        String url = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";

        // Making Request
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
}
