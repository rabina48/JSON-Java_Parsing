package httpurl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class UtilityClass {
    private String path = "http://ares.rasxp.com:8888/login";
    private String boundary = "---" + "*-*-*-*-*-*-*-*--*-*" + "----";
    private static String LINE_SPACE = "\r\n";
    private String charSet;

    public UtilityClass(String type, String charSet) {
        this.charSet = charSet;
    }

    public void setData() throws IOException {
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-type","multipart/form-data; boundary =" +boundary);

    }

    public  void addFormField(String name, String value) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(path);

        writer.append("--"+boundary).append(LINE_SPACE);
        writer.append("Content-Disposition: form-data").append(LINE_SPACE);
    }
}
