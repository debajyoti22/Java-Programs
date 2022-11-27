class demo{
private int d;
public int print(){
    return d;
}
public void id(int a){
    d = a;
}
}

public class encapsule {
    public static void main(String args[]){
        demo d = new demo();
        d.id(5);
        System.out.println("Hi user " + d.print());
        
    }
}
