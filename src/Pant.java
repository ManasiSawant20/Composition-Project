public class Pant {
    private int size;
    private String brand;

    public Pant(int size, String brand) {
        this.size = size;
        this.brand = brand;
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

    @Override
    public String toString() {
        return "Pant{" +
                "size=" + size +
                ", brand=" + brand +
                '}';
    }

    public void ready()
    {
        System.out.println("Pant selected");
    }
}
