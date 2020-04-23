public class breadType {
    private String breadType;
    private double breadPrice;

    public breadType(String breadType) {
        this.breadType = breadType;
        this.breadPrice = 0.49; //cents
    }

    public String getBreadType() {
        return breadType;
    }

    public double getBreadPrice() {
        return breadPrice;
    }
}
