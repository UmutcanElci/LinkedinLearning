package ObjectsAndAPIs.Inheritance;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(String flavor, double price, int candles) {
        super("Chocolate", price);
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
