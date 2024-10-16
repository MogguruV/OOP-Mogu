public class ProductBasket{
    int qtyProduct;

    public void getInfoProductBasket(){
        System.out.println("Isi keranjang :" + this.qtyProduct);
    }

    public void addProduct(int qty){
        this.qtyProduct += qty;
    }

    public void removeProduct(int qty){
        this.qtyProduct -= qty;
        if (this.qtyProduct <= 0){
            this.qtyProduct = 0;
        }
        
    }
}