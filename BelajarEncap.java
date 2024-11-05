public class BelajarEncap {
    private float pi;
    private int r;
    private float L;

    public void luasLingkaran(float pi, int r){
        this.pi = pi;
        this.r = r;
        L = this.pi * (this.r*this.r);
        System.out.println(L);
    }

}