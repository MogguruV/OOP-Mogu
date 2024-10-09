import java.time.LocalDateTime;
import java.time.LocalDate;

public class ProviderTelecom {
    String name;
    int mobileBalance;
    int mobileData;
    LocalDate expireMobileBalance;
    LocalDateTime expireMobileData;

     public void getInfo(String name, int mobileBalance, int mobileData){
        System.out.println("Berikut Ini adalah informasi kartumu \nProvider : " + name + "\nPulsa Anda : " + mobileBalance + " Rupiah" + "\nKuota Anda : " + mobileData + " GB");
     }

     public void tambahPulsa(int a){
        mobileBalance = mobileBalance + a;
        System.out.println("Pulsa anda ditambah " + mobileBalance + " Rupiah");
     }
     public void kurangiPulsa(int a){
        System.out.println("Pulsa anda dikurangi " + a + " Rupiah");
        mobileBalance = mobileBalance - a;
        System.out.println("Sisa pulsa anda " + mobileBalance + " Rupiah");
     }

     public void tambahKuota(int a){
        mobileData = a;
        System.out.println("Kuota anda ditambah " + a + " GB");
     }
     public void kurangiKuota(int a){
        System.out.println("Kuota anda dikurangi " + a + " GB");
        mobileData = mobileData - a;
        System.out.println("Sisa Kuota anda " + mobileData + " GB");
     }

     public void perpanjangMasaBerlakuPulsa(){
        expireMobileBalance = LocalDate.of(2024, 10, 11);
        System.out.println("Masa berlaku Pulsa anda sampai "+ expireMobileBalance);
     }
     
}
