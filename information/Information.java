package json.parsing.information;

public class Information {
    public Information items;
    public Info info;

    Information(){

    }
    public Information(Information items, Info info) {
        this.items = items;
        this.info = info;
    }
}