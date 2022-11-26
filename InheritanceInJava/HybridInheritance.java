interface Reliance{
    void Gift();
}
interface RelianceFresh extends Reliance{
    void RelianceSalary();

}
interface Dainikbhasker{
    void DainiSalary();
}
class Employee implements RelianceFresh, Dainikbhasker{
    public void RelianceSalary(){
        System.out.println("Employee get Salary of 10000");
    }
    public void DainiSalary(){
        System.out.println("Employee get Salary of 3000");
    }
    public void Gift(){
        System.out.println("Reliance gives 3000rs. Bonus");
    }

}
public class HybridInheritance{
    public static void main(String[] args){
        RelianceFresh rf=new Employee();
        rf.RelianceSalary();
        Dainikbhasker db=new Employee();
        db.DainiSalary();
        Reliance r=new Employee();
        r.Gift();
    }
}