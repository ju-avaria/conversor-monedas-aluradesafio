import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public MonedaAPI datosDivisaBase(String monedaBase){
        // Creando la url
        String contrasenha = "6ee0fb3cf10236c4cee09d3b";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+contrasenha+"/latest/"+monedaBase);
        // Creando Gson para convertir json a clase moneda
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            // System.out.println(json);

            // Accedo a los datos a traves de la clase Moneda para posteriormente hacer la conversion
            MonedaAPI monedaApi = gson.fromJson(json, MonedaAPI.class);
            // System.out.println("Moneda: " + monedaApi);
            return monedaApi;

        } catch (Exception e){
            throw new RuntimeException("No encontre esa divisa");
        }
    }
}
