package json.parsing.information;

import java.io.IOException;

public class DisplayOutput {


    public DisplayOutput() throws IOException {
        System.out.println("Thank you!");
    }



//obj as a parameter
    public   void showDisplay(Information information){


        System.out.println("The Schema is = "+information.items.info.$schema);
        System.out.println("The title is = "+information.items.info.title);
        System.out.println("The type is = "+information.items.info.type);
        System.out.println("The require is ="+information.items.info.required);
        System.out.println("The Properties id and its type ="+information.items.info.properties.id.type);
        System.out.println("The Properties id and its description ="+information.items.info.properties.id.description);

        System.out.println("The Properties name type =in "+information.items.info.properties.name.type+ "  and its description = "+information.items.info.properties.name.description);
        System.out.println("The Properties price type = "+information.items.info.properties.price.type+ "  and its minimum = "+information.items.info.properties.price.minimum);
        System.out.println("The properties tag type = "+information.items.info.properties.tags.type);

        System.out.println("The Properties tag items type = "+information.items.info.properties.tags.items.type);


        System.out.println("The ware house  have  id = "+information.items.info.properties.stock.properties.warehouse.get(0).id+" type = "+information.items.info.properties.stock.properties.warehouse.get(0).type+" presence = "+information.items.info.properties.stock.properties.warehouse.get(0).presence);
        System.out.println("The retails is = "+information.items.info.properties.stock.properties.retail.type);


    }
}
