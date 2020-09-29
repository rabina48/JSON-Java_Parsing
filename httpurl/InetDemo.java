package httpurl;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetDemo {

    String url = "www.github.com";


    public  void getInetAddress() throws UnknownHostException {

        try{

            InetAddress ip= InetAddress.getByName(url);
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
            System.out.println("IP Local: "+ip.getLocalHost() );
            System.out.println("Public IPv6 Address: "+ip.getByName("2400:1a00:b010:81d9:999c:239d:d5b6:13e0"));

        }catch(Exception e){
            System.out.println(e);}

    }

    public static  void main(String[] args) throws UnknownHostException {
      InetDemo in = new InetDemo();
      in.getInetAddress();
    }
}



