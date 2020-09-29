package httpurl;


import java.io.*;

import java.net.URL;

    public class ImageDownload {
        String fileName = "tz_logo.9f3bae80.png";
        String website = "http://ares.rasxp.com:8888/login"+fileName;

        public  void dwn(){

            try{


                System.out.println("Downloading File From: " + website);

                URL url = new URL(website);




                InputStream inputStream = url.openStream();
                OutputStream fileOutputStream = new FileOutputStream(fileName);


                byte[] buffer = new byte[2048];

                int length = 0;

                while ((length = inputStream.read(buffer)) != -1) {
                    System.out.println("Buffer Read of length: " + length);
                    fileOutputStream.write(buffer, 0, length);
                }
                System.out.println("Download Sucess!");

                inputStream.close();
               fileOutputStream.close();

            } catch(Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        public  static  void main (String[] args){
            ImageDownload im = new ImageDownload();
            im.dwn();
        }
    }

