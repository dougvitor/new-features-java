package br.com.home.java9.http2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http2Example {

    public static void main(String[] args) {
        var client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        try {
            var targetURL = "https://www.uol.com.br/";

            var request = HttpRequest.newBuilder().GET().uri(new URI(targetURL)).build();

            final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        } catch (Exception e) {
            // Manipula a exceção aqui.
        }
    }
}
