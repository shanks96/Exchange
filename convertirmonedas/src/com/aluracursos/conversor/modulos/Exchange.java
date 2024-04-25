package com.aluracursos.conversor.modulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchange {

    public String Exchange() throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/47815d900b581c4d29b756a3/latest/USD";

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
