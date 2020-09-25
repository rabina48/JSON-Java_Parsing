package httpurl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpResponse {

    protected  void getResponse() throws IOException {
        URL url = new URL(WebPageSource.url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        int responseCode = connection.getResponseCode();
        if(responseCode != HttpURLConnection.HTTP_OK){
            System.out.println("Server returned response code " + responseCode + ". Download failed.");
            System.exit(0);
        }else if (responseCode == HttpURLConnection.HTTP_NOT_FOUND){
            System.out.println(" Error " +responseCode);
        }else {
            System.out.println("Connected Response is  "+responseCode);
        }


    }
}
