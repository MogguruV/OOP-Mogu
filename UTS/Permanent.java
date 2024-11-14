package UTS;

// Class
public class Permanent extends Employee {
    // Attributes
    private String transportation;
    private Boolean takedayoff;

    // Constructor
    // public Permanent(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
    //     super(nik, name, position_name, basic_salary, transport_allowance, position_allowance);
    // }

    // Encapsulation
    public void setTakedayoff(Boolean takedayoff){
        this.takedayoff = takedayoff;
        if (this.takedayoff == true){
            System.out.println("Mendapatkan Cuti");
        }
        else {
            System.out.println("Tidak mendapatkan Cuti");
        }
    }

    // Method
    public void setTransportation(String transportation){
        this.transportation = transportation;
        System.out.println("Mendapatkan " + this.transportation);
    }

    // Method
    public void getBenefit(){
        System.out.println("Benefit : " + transportation + " dan " + takedayoff);
    }
}