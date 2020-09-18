package json.parsing.information;

import java.io.IOException;

public class DisplayOutput extends  InfoParser {


    public DisplayOutput() throws IOException {
        System.out.println("I/O not defined");
    }

    public   void showDisplay(Information information){


        System.out.println("The Schema is = "+information.items.info.$schema);
        System.out.println("The title is = "+information.items.info.title);
        System.out.println("The type is = "+information.items.info.type);
        System.out.println("The require is ="+information.items.info.required);
        System.out.println("The Properties id and its type ="+information.items.info.properties.id.type);
        System.out.println("The Properties id and its description ="+information.items.info.properties.id.description);


    }
}
