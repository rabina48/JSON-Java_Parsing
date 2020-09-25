package httpurl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class ReadCommonHeader {
    private int responseCode ;
    private String responseMessage ;
    private String contentType;
    private String contentEncoding ;
    private int contentLength ;
    private long date ;
    private long expiration;
    private long lastModified ;



    public HttpURLConnection commonReader() throws IOException {

        URL urlObj = new URL(WebPageSource.url);
        HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();

        return httpCon;


    }

    public   void displayAll(HttpURLConnection httpCon) throws IOException {
        System.out.println("Response Code: " + httpCon.getResponseCode());
        System.out.println("Response Message: " + httpCon.getResponseMessage());
        System.out.println("Content Type: " + httpCon.getContentType());
        System.out.println("Content Encoding: " + httpCon.getContentEncoding());
        System.out.println("Content Length: " + httpCon.getContentLength());
        System.out.println("Date: " + new Date(httpCon.getDate()));
        System.out.println("Expiration: " + new Date(httpCon.getExpiration()));
        System.out.println("Last Modified: " + new Date(httpCon.getLastModified()));
    }


    public static  void  main (String[] args) throws IOException {
        ReadCommonHeader rd = new ReadCommonHeader();
        HttpURLConnection read = rd.commonReader();
        rd.displayAll(read);
    }
}

