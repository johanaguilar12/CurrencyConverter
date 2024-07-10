package Cons;

import Currency.Currency;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultation {

    public Currency searchCurrency(String baseCurrency, String targetCurrency) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/3e56b2a336d50ce3ba16441a/pair/" + baseCurrency + "/" + targetCurrency);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("Currency not found");
        }
    }
}
