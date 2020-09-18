package json.parsing.information;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
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
    JSONObject propertiesObj = infoObj.getJSONObject("properties");
    JSONObject idObj = propertiesObj.getJSONObject("id");
    JSONObject nameObj = propertiesObj.getJSONObject("name");
    JSONObject priceObj = propertiesObj.getJSONObject("price");
    JSONObject tagsObj = propertiesObj.getJSONObject("tags");
    JSONObject itemsObj = tagsObj.getJSONObject("items");
    JSONObject stockObj = propertiesObj.getJSONObject("stock");
    JSONObject stockPropertiesObj = stockObj.getJSONObject("properties");
    JSONArray warehouseArray = stockPropertiesObj.getJSONArray("warehouse");

     JSONObject retailObj = stockObj.getJSONObject("retail");


    public InfoParser() throws IOException {
    }


    public Information parseInformation(String json) throws IOException {

        Information items = new Information();

        Info info = new Info();


        List<String> required = new ArrayList<>();

        for (int i = 0; i < requiredArr.length(); i++) {
          String arrayValue = requiredArr.getString(i);
          required.add(arrayValue);

        }

        info.$schema = infoObj.getString("$schema");
        info.title = infoObj.getString("title");
        info.type = infoObj.getString("type");
        info.required = required;







        System.out.println("The Schema is = "+info.$schema);
        System.out.println("The title is = "+info.title);
        System.out.println("The type is = "+info.properties);
        System.out.println("The require is ="+info.required);
      //  System.out.println("The Properties id = "+id.type+ "  and its type = "+id.description);




        Information infor = new Information();
return infor;
    }

    public Properties getProperties(){

        Properties properties = new Properties();

        PropertiesId id = new PropertiesId();
        id.type = idObj.getString("type");
        id.description = idObj.getString("description");
        properties.id = id;
        System.out.println("The Properties id = "+id.type+ "  and its type = "+id.description);


        PropertiesName name = new PropertiesName();
        name.type = nameObj.getString("type");
        name.description = nameObj.getString("description");
        properties.name = name;
        System.out.println("The Properties name type = "+name.type+ "  and its description = "+name.description);


        PropertiesPrice price = new PropertiesPrice();
        price.type = priceObj.getString("type");
        price.minimum = priceObj.getInt("minimum");
        properties.price =price;

        System.out.println("The Properties price type = "+price.type+ "  and its minimum = "+name.description);


         PropertiesTag tags = new PropertiesTag();
         tags.type =  tagsObj.getString("type");
          properties.tags = tags;

          System.out.println("The properties tag type = "+tags.type);

          TagsItem tagsItem = new TagsItem();
          tagsItem.type = itemsObj.getString("type");
          tags.item = tagsItem;
          System.out.println("The Properties tag items type = "+tagsItem.type);


        PropertiesStock stock = new PropertiesStock();
        stock.type = stockObj.getString("type");
        properties.stock = stock;

        StockProperties stockProperties = new StockProperties();
        Warehouse warehouse = new Warehouse();
        warehouse.id = warehouseArray.getJSONObject(1).getInt("id");
        warehouse.type = warehouseArray.getJSONObject(1).getString("type");
        warehouse.presence = warehouseArray.getJSONObject(1).getBoolean("presence");

        System.out.println("The ware house  have  id = "+warehouse.id +" and its Type is = "+warehouse.type+ " and its presence is = "+warehouse.presence);

        List<Properties> wareHouseObj = new ArrayList<>();
        for (int i = 0; i < warehouseArray.length(); i++) {
            System.out.println("===========================================");
            System.out.println("Batters id = " + (warehouseArray.getJSONObject(i)).getInt("id"));
            System.out.println(" and  type = " + (warehouseArray.getJSONObject(i)).get("type"));
        }
        wareHouseObj.add(properties);
        //stockProperties



        Retail retail = new Retail();
        retail.type = stockObj.getString("type");
        stockProperties.retail =retail;

        System.out.println("The retails is = "+retail.type);


        Properties info = new Properties( id,  name,  price,  tags,  stock);
        return info;
    }





}
