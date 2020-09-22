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
    private JSONObject object = new JSONObject(read);
    JSONObject itemObj = object.getJSONObject("items");

    public InfoParser() throws IOException {
    }


    public Information parseInformation(String json) throws IOException {

        Items items = new Items();
        Info info = new Info();
        JSONObject infoObj = itemObj.getJSONObject("info");
        JSONArray requiredArr = infoObj.getJSONArray("required");
        List<String> required = new ArrayList<>();
        for (int i = 0; i < requiredArr.length(); i++) {
          String arrayValue = requiredArr.getString(i);
          required.add(arrayValue);
        }

        info.$schema = infoObj.getString("$schema");
        info.title = infoObj.getString("title");
        info.type = infoObj.getString("type");
        info.required = required;
        info.properties =  getProperties(infoObj);

        items.info = info;


        Information information = new Information(items);
  return information;
    }

    private  Properties getProperties( JSONObject infoObj){
        Properties properties = new Properties();
        JSONObject propertiesObj = infoObj.getJSONObject("properties");
        properties.id = getPropertiesId(propertiesObj);
        properties.name = getName(propertiesObj);
        properties.price = getPrice(propertiesObj);
        properties.tags = getTags(propertiesObj);
        properties.stock = getStock(propertiesObj);
        return properties;
    }
    private PropertiesId getPropertiesId(JSONObject propertiesObj) {

        PropertiesId id = new PropertiesId();
        JSONObject idObj = propertiesObj.getJSONObject("id");
        id.type = idObj.getString("type");
        id.description = idObj.getString("description");
        return id;
    }


     private PropertiesName getName(JSONObject propertiesObj) {

         PropertiesName name = new PropertiesName();

         JSONObject nameObj = propertiesObj.getJSONObject("name");
         name.type = nameObj.getString("type");
         name.description = nameObj.getString("description");

         return name;
     }


     private PropertiesPrice getPrice(JSONObject propertiesObj) {

         PropertiesPrice price = new PropertiesPrice();
         JSONObject priceObj = propertiesObj.getJSONObject("price");
         price.type = priceObj.getString("type");
         price.minimum = priceObj.getInt("minimum");

         return price;
     }


    private PropertiesTag getTags(JSONObject propertiesObj) {
        PropertiesTag tags = new PropertiesTag();
        JSONObject tagsObj = propertiesObj.getJSONObject("tags");
        tags.type = tagsObj.getString("type");

        TagsItem items = new TagsItem();
        JSONObject itemsObj = tagsObj.getJSONObject("items");
        items.type = itemsObj.getString("type");
        tags.items = items;
        return tags;

    }
    public PropertiesStock getStock(JSONObject propertiesObj){
        PropertiesStock stock = new PropertiesStock();
        JSONObject stockObj = propertiesObj.getJSONObject("stock");
        stock.type = stockObj.getString("type");


        StockProperties properties = new StockProperties();
        JSONObject stockPropertiesObj = stockObj.getJSONObject("properties");

        Warehouse warehouse = new Warehouse();
        List<Warehouse> warehouse1 = new ArrayList<>();
        JSONArray warehouseArray = stockPropertiesObj.getJSONArray("warehouse");
        warehouse.id = warehouseArray.getJSONObject(1).getInt("id");
        warehouse.type = warehouseArray.getJSONObject(1).getString("type");
        warehouse.presence = warehouseArray.getJSONObject(1).getBoolean("presence");

        for (int i = 0; i < warehouseArray.length(); i++) {
            System.out.println("===========================================");
            System.out.println("Batters id = " + (warehouseArray.getJSONObject(i)).getInt("id"));
            System.out.println(" and  type = " + (warehouseArray.getJSONObject(i)).get("type"));
        }
        warehouse1.add(warehouse);
        properties.warehouse = warehouse1;

        stock.properties = properties;


                JSONObject retailObj = stockObj.getJSONObject("retail");
        Retail retail = new Retail();
        retail.type = stockObj.getString("type");
        properties.retail =retail;



   return  stock;

    }





}
