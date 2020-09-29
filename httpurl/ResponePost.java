package httpurl;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ResponePost {
    String url = "http://ares.rasxp.com:8888/auth/login";
    String email = "rabina@gmail.com";
    String password = "ur/*/--pass";

public void getPost() throws IOException {
    URL urlObj = new URL(url);
    HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();

    httpCon.setDoOutput(true);
    httpCon.setRequestMethod("POST");

    String parameters = "username=" + email;
    parameters += "&password=" + password;




    OutputStreamWriter writer = new OutputStreamWriter(
            httpCon.getOutputStream());


    writer.write(parameters);
    writer.flush();
    try(InputStream inputStream = httpCon.getInputStream()){
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String response = "";
        String line;
        while ((line = reader.readLine()) != null){
            response += line;
        }

        System.out.println(response);
        System.out.println(httpCon.getResponseCode());
        reader.close();

    }

}

public static  void main(String[] args) throws IOException {
    ResponePost rs = new ResponePost();
    rs.getPost();
}
}
