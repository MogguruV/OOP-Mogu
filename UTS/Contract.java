package UTS;

public class Contract extends Employee{
        String contract_duration;

        public Contract(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
            super(nik, name, position_name, basic_salary, transport_allowance, position_allowance);
        }

        public void getContractDuration(String contract_duration){
            System.out.println("Dikontrak selama " + contract_duration);
        }
}
