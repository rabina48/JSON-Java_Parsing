package json.parsing.information;

import java.io.IOException;

public class Main {

    public  static  void main(String[] args) throws IOException {
        InformationReader informationReader = new InformationReader(InfoParser.path);
        informationReader.fileRead();

       InfoParser parser = new InfoParser();
       parser.parser();
    }
}
