public class excep {
    public static void main(String args[]){
        try{
            int a = 9/0;
        }
        catch(ArithmeticException e){
            System.out.println("Hello error "+e);
        }
        finally{
            System.out.println("Due to Finally block");
        }
        System.out.println("hello World");
    }
}
