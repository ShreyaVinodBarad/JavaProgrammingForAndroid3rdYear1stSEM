interface Writeable{
    void Writes();
}
interface Readable{
    void Reads();
}
class Shreya implements Writeable, Readable{
    public void Writes(){
        System.out.println("Shreya Writes");     
    }
    public void Reads(){
        System.out.println("Shreya Reads");   
    }
}
public class MultipleInheritance{
    public static void main(String[] args){
        Writeable write=new Shreya();
        write.Writes();
        Readable read=new Shreya();
        read.Reads();
    }
}