package httpurl;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.net.URL;


public class FileDownload {
    private  String path = "https://github.com/";
   private  String saveFile = "Project.zip";



    public  void download() {


        try {
            URL url = new URL(path);
            try (BufferedInputStream inputStream = new BufferedInputStream(new URL(path).openStream());
                 FileOutputStream fileOS = new FileOutputStream("/home/rabina/Documents/http.txt")) {
                byte data[] = new byte[1024];
                int byteContent;
                while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
                    fileOS.write(data, 0, byteContent);
                }

                System.out.println("Download!");
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
