import UTS.Contract;
import UTS.Permanent;

public class Main {
     public static void main(String[] args) {

          Contract contract = new Contract(332111090, "Putri", "Sutradara", 100000000, 2000000, 4000000);
          contract.getEmployee();
          contract.getContractDuration("10 Tahun\n");


          Permanent permanent = new Permanent(332106090, "Kobo", "V-Tuber", 1000000000, 1000000, 3000000);
          permanent.getSalary();
     }
}