package httpurl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import static httpurl.WebPageSource.url;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadWebPage readWebPage = new ReadWebPage(WebPageSource.url);
        HttpURLConnection data = readWebPage.urlReader();


        ReadHttpRequestHeaderFields h = new ReadHttpRequestHeaderFields();
        h.getFields(data);

//        readWebPage.urlReader();



//        HttpResponse response = new HttpResponse();
//        response.getResponse();
      // ReadHttpRequestHeaderFields h = new ReadHttpRequestHeaderFields();
        //HttpURLConnection u = h.getFields(data);





    }
}
