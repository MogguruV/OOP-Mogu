package Products;

public class Electronics extends Products{

    int warranty;

    public Electronics(String name, String description, int price, int warranty) {
        super(name, description, price);
        this.warranty = warranty;
    }
    
    public void getInfoWarranty(){
        System.out.println("Dengan garansi " + this.warranty + " Tahun");
    }
    
}
