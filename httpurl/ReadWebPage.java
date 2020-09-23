package httpurl;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadWebPage {
    static String url;

    ReadWebPage(String url){
        this.url = url;

    }

    public  HttpURLConnection urlReader() throws IOException {
        URL u = new URL(url);
        HttpURLConnection httpURLConnection =(HttpURLConnection) u.openConnection();
try{
    int responseCode = httpURLConnection.getResponseCode();
    if (responseCode == HttpURLConnection.HTTP_OK){

        InputStream input = httpURLConnection.getInputStream();
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
        String readLine = bufferedReader.readLine();
        while (readLine != null){

            System.out.println(readLine);
            readLine = bufferedReader.readLine();
        }
    }

    }catch (IOException e){
    e.printStackTrace();
    }

        return httpURLConnection;
}}
