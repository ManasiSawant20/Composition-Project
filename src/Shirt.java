public class Shirt
{
    private String colour;
    private Jacket jacket;

    public Shirt(String colour, Jacket jacket) {
        this.colour = colour;
        this.jacket = new Jacket(jacket.getPrice(), jacket.getColour());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Jacket getJacket() {
        return new Jacket(jacket.getPrice(), jacket.getColour());
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "colour='" + colour + '\'' +
                ", jacket=" + jacket +
                '}';
    }

    public void ready()
    {
        jacket.ready();
        System.out.println("Shirt selected");
    }
}
