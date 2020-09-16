package json.parsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    private  String fileName;

    FileReader(String fileName){
        this.fileName = fileName;
    }

    public  String read(){

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("No file exist");
        }
        try {
        FileInputStream reader = new FileInputStream(fileName);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

//        int data;
//        while ((data = reader.read()) > 0){
//            System.out.println((char)data);
        }
            reader.close();

        }catch (FileNotFoundException e){
            System.out.println("We didnot Recognized the fileName");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }


}
