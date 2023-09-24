package Work13.Num4;

public class Shirt {
    String info;
    Shirt(String info){
        this.info = info;
    }
    @Override
    public String toString() {
        String[] part = info.split(",");
        return "Num: " + part[0] + ", Type: " + part[1] + ", Color: " + part[2] + ", Size: " + part [3];
    }
}
