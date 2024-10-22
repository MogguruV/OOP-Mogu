public class HatsuneMiku {
    String nama;
    int umur;
    String warna;
    String agensi;
    private String pacar;

    public HatsuneMiku(){
        nama = "Hatsune Miku";
        umur = 17;
        warna = "blue";
        agensi = "Vocaloid";
    }

    public void GetInfoMiku(){
        System.out.println("Informasi Hatsune Miku \nNama : " + nama + "\nUmur : " +umur+ "\nWarna Rambut : " + warna + "\nAgensi : " + agensi );
    }

    public void PacarMiku(String pacar){
        this.pacar = pacar;
        System.out.println("Pacar Miku adalah " + pacar);
    }
}