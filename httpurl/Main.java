package httpurl;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        ReadWebPage readWebPage = new ReadWebPage(WebPageSource.url);
        String data = readWebPage.urlReader();
        readWebPage.urlReader();
    }
}
