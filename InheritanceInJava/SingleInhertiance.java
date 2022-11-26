class Parent{
    void Cycle(){
        System.out.println("Hero");
    }
}
class Child extends Parent{
    void Bike(){
        System.out.println("Atluse");
    }
}
public class SingleInhertiance{
    public static void main(String[] args){
        Child c=new Child();
        c.Bike();
        c.Cycle();
    }
}