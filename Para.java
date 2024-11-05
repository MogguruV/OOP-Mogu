public class Para {
    String nama;
    int umur;
    String hobi;

    public void perkenalan(String nama, int umur, String hobi){
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;

        System.out.println("Nama : " + this.nama + "\nUmur : " + this.umur + "\nHobi : " + this.hobi);
    }


    public void namaku(){
        System.out.println("Nama Asli : " + nama);
    }

}