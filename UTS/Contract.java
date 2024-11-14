package UTS;

// Class
public class Contract extends Employee{

        // Attributes
        private String contract_duration;

        // Constructor
        public Contract(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
            super(nik, name, position_name, basic_salary, transport_allowance, position_allowance);
        }
        
        // Method
        public void getContractDuration(String contract_duration){
            this.contract_duration = contract_duration;
            System.out.println("Dikontrak selama " + contract_duration);
        }
}
