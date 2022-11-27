public class trow {
    static void check(int a){
        if(a<98)
        throw new ArithmeticException("You are Safe");
        else 
        throw new ArithmeticException("You are Not Safe");

    }
    public static void main(String args[]){
        try{
            check(555);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Thank you");
    }
}
