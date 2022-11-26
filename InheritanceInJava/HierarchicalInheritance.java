class MainClass{
    void Car(){
        System.out.println("BMW");
    }
}
class ChildClass1 extends MainClass{
    void Bike(){
        System.out.println("Hero");
    }
}
class ChildClass2 extends MainClass{
    void Cycle(){
        System.out.println("Altuse");
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args){
        ChildClass1 cone=new ChildClass1();
        cone.Car();
        cone.Bike();
        ChildClass2 ctwo=new ChildClass2();
        ctwo.Car();
        ctwo.Cycle();
    }
}