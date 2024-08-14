public class Jacket {
    private double price;
    private String colour;

    public Jacket(double price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void ready()
    {
        System.out.println("Jacket selected");
    }
}
