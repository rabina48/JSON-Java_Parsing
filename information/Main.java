package json.parsing.information;

import java.io.IOException;

public class Main  {

    public Main() throws IOException {
    }

    public  static  void main(String[] args) throws IOException {
        InformationReader informationReader = new InformationReader(InfoParser.path);
        String json = informationReader.fileRead();




       InfoParser parser = new InfoParser();
       parser.parseInformation(json);
       parser.getProperties();

       DisplayOutput displayOutput = new DisplayOutput();
       displayOutput.showDisplay();





    }
}
