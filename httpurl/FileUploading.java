package httpurl;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class FileUploading {

    private static String urlpath = "https://github.com";
    private String filePath = "/home/rabina/Documents/file.txt";
    // private  String boundary = "---------------------------7d226f700d0";


    public void fileUpload() throws MalformedURLException {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File Does not Exist");
        }
        try {
            URL url = new URL(urlpath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);

            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String readLine = bufferedReader.readLine();
            String data = "";

            while (readLine != null) {

                data = data + readLine;
                System.out.println(readLine);
                readLine = bufferedReader.readLine();
            }
            System.out.println(data);

            //if ((responseCode >= 200) && (responseCode <= 202)) {
                OutputStream outputStream = connection.getOutputStream();
                FileInputStream inputStream = new FileInputStream(filePath);

                byte[] buffer = new byte[1024];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                inputStream.close();
                outputStream.close();

                System.out.println("File uploaded");

            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  void main (String[] args) throws MalformedURLException {
        FileUploading uploading = new FileUploading();
        uploading.fileUpload();

    }
}