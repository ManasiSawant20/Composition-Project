public class Shoes {
    private int size;
    private String brand;
    private String colour;

    public Shoes(int size, String brand, String colour) {
        this.size = size;
        this.brand = brand;
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void ready()
    {
        System.out.println("Shoes selected");
    }
}
