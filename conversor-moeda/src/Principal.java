import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args){
        Gson gson = new Gson();
        Req r = new Req();
        Moeda m = gson.fromJson(r.obterCotacoes("USD"), Moeda.class);
        
        System.out.println(m);
    }
}
