// Meng-import class dari folder UTS
import UTS.Contract;
import UTS.Permanent;

public class Main {
     public static void main(String[] args) {
          // Membuat object contract
          Contract contract = new Contract(332111090, "Putri", "Manajer", 100000000, 2000000, 4000000);
          // Contract contract = new Contract();
          
          // Memanggil object Method contract
          contract.setEmployee(332111090, "Joy", "Manajer", 100000000, 2000000, 4000000);
          contract.getEmployee();
          contract.getSalary();
          contract.getContractDuration("10 Tahun\n");

          // Memanggil object Method permanent
          Permanent permanent = new Permanent(332106090, "Kobo", "V-Tuber", 1000000000, 1000000, 3000000);
          // Permanent permanent = new Permanent();

          // Memanggil object Method permanent
          permanent.setEmployee(332106090, "Kobo", "V-Tuber", 1000000000, 1000000, 3000000);
          permanent.getEmployee();
          permanent.getSalary();
          permanent.setTakedayoff("Cuti");
          permanent.setTransportation("Mobil Lamborghini");
          permanent.getBenefit();
     }
}