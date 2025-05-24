import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Req {
    public String obterCotacoes(String moeda) {
        String resposta = null;
        try{
            String endereco = "https://v6.exchangerate-api.com/v6/68b383d9b70b7fcee570817a/latest/" + moeda;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

            HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

            resposta = response.body();

        }catch(IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

        return resposta;
    }   
}
