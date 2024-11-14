package UTS;

public class Employee { 

    int nik, basic_salary, transport_allowance, position_allowance, takehomepay;
    String name, position_name;

    public Employee(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
        this.nik = nik;
        this.name = name;
        this.position_name = position_name;
        this.basic_salary = basic_salary;
        this.transport_allowance = transport_allowance;
        this.position_allowance = position_allowance;
    }
        
    public void setEmployee(int nik, String name, String position_name, int basic_salary, int transport_allowance, int position_allowance){
        this.nik = nik;
        this.name = name;
        this.position_name = position_name;
        this.basic_salary = basic_salary;
        this.transport_allowance = transport_allowance;
        this.position_allowance = position_allowance;
        System.out.println("Berhasil menambahkan karyawan baru, " + name);
    }

    public void getEmployee(){
        System.out.println(name + " - " + nik + " menduduki posisi " + position_name);
    }

    public void getSalary(){
        takehomepay = basic_salary + transport_allowance + position_allowance;
        System.out.println(name + " | " + position_name + " mendapatkan total gaji, +" + takehomepay + " Rupiah");
    }
}