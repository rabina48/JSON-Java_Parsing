package json.parsing;



import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(FoodParser.path1);
        fileReader.read();

        FoodParser foodParser = new FoodParser();
        foodParser.parseFood();
        foodParser.display();










    }



    }

