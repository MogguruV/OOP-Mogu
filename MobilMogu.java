public class MobilMogu{
    private String merek;
    String warna;

    public void SetMerek(String merek){
        this.merek = merek;
        System.out.println("Merek Mobil : " + this.merek);
    }

    public void SetWarna(){
        warna = "hitam";
        System.out.println(this.merek + " Berwarna : " + warna);
    }
}