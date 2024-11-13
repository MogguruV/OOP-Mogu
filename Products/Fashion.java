package Products;

public class Fashion extends Products {
    String size;

    public Fashion(String name, String description, int price, String size) {
        super(name, description, price);
        this.size = size;
    }
}
