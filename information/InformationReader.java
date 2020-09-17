package json.parsing.information;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InformationReader {

    public String filePath;

    InformationReader(String filePath){
        this.filePath = filePath;

    }

    public String fileRead(){
        try {
            FileInputStream reader = new FileInputStream(filePath);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
    }
            reader.close();

       } catch (FileNotFoundException e) {
            System.out.println("Doesn't exist!");
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }

        return filePath;
        }}
