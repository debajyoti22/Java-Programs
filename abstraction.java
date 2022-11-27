abstract class shape{
    abstract void print();
}
class circle extends shape{
    void print(){
        System.out.println("Circle printed");
    }
}

public class abstraction {
    public static void main(String args[]){
    circle c = new circle();
    c.print();
    }
}
