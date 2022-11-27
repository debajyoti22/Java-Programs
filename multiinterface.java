interface a{
    public void print();
}
interface b{
    public void print();
}
class test implements a,b{
   public void print(){
        System.out.println("Hello World");
    }
}

public class multiinterface {
    public static void main(String args[]){
        test t = new test();
        t.print();
    }
}
