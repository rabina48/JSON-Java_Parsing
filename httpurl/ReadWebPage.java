package httpurl;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadWebPage {
    String url;

    ReadWebPage(String url){
        this.url = url;

    }

    public  String urlReader()  {
try{
    URL u = new URL(url);
    HttpURLConnection httpURLConnection =(HttpURLConnection) u.openConnection();

    //httpURLConnection.setRequestMethod("GET");

       // System.out.println(httpURLConnection.getResponseCode());
    if (httpURLConnection.getResponseCode() == 200){

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

        return url;
}}
