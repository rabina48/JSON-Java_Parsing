package json.parsing;



import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args){

        FileReader fileReader = new FileReader(Parsing.path1);
        fileReader.read();
        Parsing.jsonParser();


    }



    }

