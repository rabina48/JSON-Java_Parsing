package httpurl;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URL;


public class FileDownload {
    private  String path = "https://github.com/";

    public  void download() {


        try {
            URL url = new URL(path);
            try {
                BufferedInputStream inputStream = new BufferedInputStream(new URL(path).openStream());

                FileOutputStream fileOutputStream = new FileOutputStream("/home/rabina/Documents/http.txt");
                    byte data[] = new byte[2048];
                    int byteContent;
                    while ((byteContent = inputStream.read()) != -1) {
                        fileOutputStream.write(data, 0, byteContent);
                    }


                System.out.println("Download Sucess!");
            } catch (IOException e) {
                System.out.println("Error! ");
            }


        } catch(IOException e) {
            e.printStackTrace();

        }
    }

    public static  void main (String[] args){
        FileDownload fd = new FileDownload();
        fd.download();
    }

}
