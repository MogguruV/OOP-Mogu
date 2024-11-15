package UTS;

// Class
public class Permanent extends Employee {
    // Attributes
    private String transportation;
    private String takedayoff;

    // Constructor
    // public Permanent(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
    //     super(nik, name, position_name, basic_salary, transport_allowance, position_allowance);
    // }

    // Encapsulation
    public void setTakedayoff(Boolean takedayoff){
        if (takedayoff == true){
            System.out.println("Mendapatkan Cuti");
            this.takedayoff = "Mendapatkan cuti";
        }
        else {
            System.out.println("Tidak mendapatkan Cuti");
            this.takedayoff = "Tidak mendapatkan cuti";
        }
    }

    // Method
    public void setTransportation(Boolean transportation){
        if (transportation == true){
            this.transportation = "Mobil Lamborghini";
            System.out.println("Mendapatkan " + this.transportation);
        }
        else{
this.transportation = "Tidak mendapatkan mobil";
System.out.println(this.transportation);
        }
    }

    // Method
    public void getBenefit(){
        System.out.println("Benefit : " + transportation + " dan " + takedayoff);
    }
}