public class Fashion {
    private Shirt shirt;
    private Pant pant;
    private Shoes shoes;

    public Fashion(Shirt shirt, Pant pant, Shoes shoes) {
        this.shirt = shirt;
        this.pant = pant;
        this.shoes = shoes;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Pant getPant() {
        return pant;
    }

    public void setPant(Pant pant) {
        this.pant = pant;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "Fashion{" +
                "shirt=" + shirt +
                ", pant=" + pant +
                ", shoes=" + shoes +
                '}';
    }

    public void ready()
    {
        shirt.ready();
        pant.ready();
        shoes.ready();
        System.out.println("Fashion is finalized ....... THANK YOU !!!!!");
    }
}
