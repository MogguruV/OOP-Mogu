package UTS;

public class Permanent extends Employee {
    private String transportation;
    private String takedayoff;


    public Permanent(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
        super(nik, name, position_name, basic_salary, transport_allowance, position_allowance);
    }

    public void setTakedayoff(String takedayoff){
        this.takedayoff = takedayoff;
        System.out.println("Mendapatkan " + this.takedayoff);
    }

    public void setTransportation(String transportation){
        this.transportation = transportation;
        System.out.println("Mendapatkan " + this.transportation);
    }

    public void getBenefit(){
        
    }
}