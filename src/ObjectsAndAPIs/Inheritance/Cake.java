package ObjectsAndAPIs.Inheritance;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor, double price) {
        this.flavor = "Orange";
        this.price = 5.50;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
