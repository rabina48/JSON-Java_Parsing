package json.parsing.information;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.annotation.Native;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InfoParser {

    static String path = "src/json/parsing/information/itemfile.json";
    String read = new String(Files.readAllBytes(Path.of(path)));
    JSONObject object = new JSONObject(read);
    JSONObject itemObj = object.getJSONObject("items");
    JSONObject infoObj = itemObj.getJSONObject("info");
    JSONArray requiredArr = infoObj.getJSONArray("required");

    public InfoParser() throws IOException {
    }


    public Information parser() throws IOException {

        Items items = new Items();

        Info info = new Info();


        List<Object> reqArr = requiredArr.toList();
        for (Object required : reqArr) {
            System.out.println((String)required);
        }

        info.$schema = infoObj.getString("$schema");
        info.title = infoObj.getString("title");
        info.type = infoObj.getString("type");
      //  info.required =
        reqArr.add(info);




        // reqArray.add(info);


        System.out.println("The Schema is = "+info.$schema);
        System.out.println("The title is = "+info.title);
        System.out.println("The type is = "+info.type);
        System.out.println("The require is ="+reqArr);


        Information information = new Information(items);
return information;
    }

    protected  void showDisplay(){

        for (int i = 0; i < requiredArr.length(); i++) {
            JSONObject jsonobject = requiredArr.getJSONObject(i);

        }
    }
}
