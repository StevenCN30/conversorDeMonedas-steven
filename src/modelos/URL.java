package modelos;
import com.google.gson.GsonBuilder;
import principal.Principal;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class URL extends Principal {

    public double miMetodo(String monedaBase, String monedaDestino
                           , double valor) throws IOException, InterruptedException {


        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String direccion = "https://v6.exchangerate-api.com/v6/ddf7e3cd40368f744b9e3feb/pair/"+monedaBase+"/"
                +monedaDestino+"/"+valor;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        //System.out.println(json);


        if (monedaBase == "USD" && monedaDestino == "ARS") {
            FormatoOmdb formato1 = gson.fromJson(json, FormatoOmdb.class);
            Formato miFormato = new Formato(formato1);
            System.out.println("El valor de " + valor + " Dolares a Pesos Argentinos es de " + miFormato +
                    "\n---------------------------------------------");
        } else if(monedaBase == "ARS" && monedaDestino == "USD"){
            FormatoOmdb formato1 = gson.fromJson(json, FormatoOmdb.class);
            Formato miFormato = new Formato(formato1);
            System.out.println("El valor de " + valor + " Pesos Argentinos a Dolares es de " + miFormato +
                    "\n---------------------------------------------");
        } else if (monedaBase == "USD" && monedaDestino == "BRL") {
            FormatoOmdb formato1 = gson.fromJson(json, FormatoOmdb.class);
            Formato miFormato = new Formato(formato1);
            System.out.println("El valor de " + valor + " Dolares a Reales Brasileños es de " + miFormato +
                    "\n---------------------------------------------");
        } else if (monedaBase == "BRL" && monedaDestino == "USD") {
            FormatoOmdb formato1 = gson.fromJson(json, FormatoOmdb.class);
            Formato miFormato = new Formato(formato1);
            System.out.println("El valor de " + valor + " Reales Brasileños a Dolares es de " + miFormato +
                    "\n---------------------------------------------");
        }else if(monedaBase == "USD" && monedaDestino == "COP"){
            FormatoOmdb formato1 = gson.fromJson(json, FormatoOmdb.class);
            Formato miFormato = new Formato(formato1);
            System.out.println("El valor de " + valor + " Dolares a Pesos Colombianos es de " + miFormato +
                    "\n---------------------------------------------");
        } else if (monedaBase == "COP" && monedaDestino == "USD") {
            FormatoOmdb formato1 = gson.fromJson(json, FormatoOmdb.class);
            Formato miFormato = new Formato(formato1);
            System.out.println("El valor de " + valor + " Pesos Colombianos a Dolares es de " + miFormato +
                    "\n---------------------------------------------" );
        }

        return valor;
    }

}
