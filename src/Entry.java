public class Entry
{
    public static void main(String[] args) {
        Jacket jacket = new Jacket(4499.10, "BLACK");
        Shirt shirt = new Shirt("BLUE", jacket);
        Pant pant = new Pant(28, "western");
        Shoes shoes = new Shoes(6, "crocs", "WHITE");

        Fashion fashion = new Fashion(shirt, pant, shoes);
        fashion.ready();
        System.out.println(fashion);
    }
}
