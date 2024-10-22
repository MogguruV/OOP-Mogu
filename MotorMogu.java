public class MotorMogu {
    private String merek;
    String warna;
    String harga;

    public MotorMogu(){
        this.merek = "CBR";
        warna = "Merah";
        harga = "Rp 16.000.000";
    }

    // public void

    public void AsuMerek(String merek){
        this.merek = merek;
        System.out.println("Merek Motor : " + merek);
    }

    public void AsuWarna(String warnaBaru){
        warna = warnaBaru;
        warna = "merah";
        System.out.println(this.merek + " berwarna " + warna);
    }

    public void AsuHarga(){
        harga = "Rp 16.000.000";
        System.out.println(this.merek + " Harga " + harga);
    }
}