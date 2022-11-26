class Employee{
    int id;
    String name;
}
public class CreatingAClassInJava{
    public static void main(String[] args){
        System.out.println("Creating A Class!");
        Employee Shreya=new Employee();
        Shreya.id=15;
        Shreya.name="Shreya Vinod Barad";
        System.out.println(Shreya.id);
        System.out.println(Shreya.name);
    }
}