public class Person {
    String name;
    int age;

    // public void person(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void getInfo(){
        System.out.println("Ini info person \nNama : " + name + "\nUmur : " + age);
    }
}
