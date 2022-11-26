class Nanaji{
    void NameOfNanaji(){
        System.out.println("Swamy Badam");
    }
}
class Ammaa extends Nanaji{
    void NameOfAmmaa(){
        System.out.println("Padma Barad");
    }
}
class Daughter extends Ammaa{
    void NameOfDaughter(){
        System.out.println("Shreya Barad");
    }
}
public class MultiLevelInheritance{
    public static void main(String[] args){
        Daughter d=new Daughter();
        d.NameOfAmmaa();
        d.NameOfNanaji();
        d.NameOfDaughter();    
    }
}