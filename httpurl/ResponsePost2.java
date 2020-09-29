package httpurl;

import netscape.javascript.JSObject;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class ResponsePost2 {

    private  String urlPath = "https://reqres.in/api/users";
    private String name = "rabina";
    private  String id ="0001";
    private  String job = "intern";



    ResponsePost2(String urlPath){
        this.urlPath = urlPath;
    }

    public void sendPostReq() throws IOException {
        URL url = new URL(urlPath);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-type", "application/json; utf-8");
        urlConnection.setRequestProperty("Accept", "application/json");
        urlConnection.setDoOutput(true);
        String jsonInputString = "{\"name\": \"Rabina\", \"id\":\"001\"}";
        String jsonArrayInputString = "[\"Rabina\",\"Sabina\"]";


        // String jsonInputString = "{"name", "id", "job"}";


        try (OutputStream os = urlConnection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        } catch (Exception e) {

        }
    }
}

