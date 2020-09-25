package httpurl;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ResponePost {
    String url = "http://ares.rasxp.com:8888/login";
    String email = "rabina@gmail.com";
    String password = "ur/*/--pass";

public void getPost() throws IOException {
    URL urlObj = new URL(url);
    HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();

    httpCon.setDoOutput(true);
    httpCon.setRequestMethod("POST");

    String parameters = "username=" + email;
    parameters += "password=" + password;
    System.out.println("Success = "+httpCon.getResponseCode());



    OutputStreamWriter writer = new OutputStreamWriter(
            httpCon.getOutputStream());


    writer.write(parameters);
    writer.flush();

}

public static  void main(String[] args) throws IOException {
    ResponePost rs = new ResponePost();
    rs.getPost();
}
}
