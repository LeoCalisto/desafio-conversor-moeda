package requisicao;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.Gson;

import dados.Moeda;

public class Req {
    public Moeda obterCotacoes(String codigoMoeda) {
        Moeda resposta = null;
        try{
            String endereco = "https://v6.exchangerate-api.com/v6/68b383d9b70b7fcee570817a/latest/" + codigoMoeda;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

            HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

            Gson gson = new Gson();
            resposta = gson.fromJson(response.body(), Moeda.class);

        }catch(IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

        return resposta;
    }   
}
