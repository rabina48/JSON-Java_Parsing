//package httpurl;
////class to make connection to a server, send data to and read data from that server
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.UnknownHostException;
//
//public class Socket {
//    String hostname = "time.nist.gov";
//    int port = 13;
//
//    Socket(){
//
//    }
//    Socket(String hostname, int port) {
//        this.hostname = hostname;
//        this.port = port;
//
//    }
//
//    private void getConnectSocket() {
//
////        try {
////            Socket socket = new Socket(hostname, port);
////           // InputStream input = socket.getInputStream();
////            //InputStreamReader reader = new InputStreamReader(input);
////
////            int character;
////            StringBuilder data = new StringBuilder();
////
////            while ((character = reader.read()) != -1) {
////                data.append((char) character);
////            }
///
//            System.out.println(data);
//
//
//        } catch (UnknownHostException ex) {
//
//            System.out.println("Server not found: " + ex.getMessage());
//
//        } catch (IOException ex) {
//
//            System.out.println("I/O error: " + ex.getMessage());
//        }
//
//
//    }
//
////    private InputStream getInputStream() {
////
////        return getInputStream();
////    }
//
//    public  static  void main (String[] args) {
//        Socket sc = new Socket();
//        sc.getConnectSocket();
//
//    }
//
//}
//
//
