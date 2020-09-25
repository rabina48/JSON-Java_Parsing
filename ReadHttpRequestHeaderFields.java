package httpurl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

public class ReadHttpRequestHeaderFields {

    public  HttpURLConnection getFields(HttpURLConnection httpURLConnection ) throws IOException {
//      URL u = new URL(WebPageSource.url);
  //  HttpURLConnection httpURLConnection =(HttpURLConnection) u.openConnection();
//        ReadWebPage rd = new ReadWebPage(WebPageSource.url);

        Map<String, List<String>> map = httpURLConnection.getHeaderFields();
        for(String key :map.keySet())

        {
            System.out.println(key + ":");

            List<String> values = map.get(key);

            for (String aValue : values) {
                System.out.println("\t" + aValue);
            }
        }
     return httpURLConnection;
    }


    }


