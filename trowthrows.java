import java.io.IOException;

public class trowthrows {
    void pqr()throws IOException{
        throw new IOException("Input Output Issue ");
    }
    void sql()throws IOException{
        pqr();
    }
    void abc(){
        try{
            sql();
        }
        catch(Exception e){
            System.out.println("Hello Exception "+e);
        }
    }
    
    public static void main(String args[]){
        trowthrows obj = new trowthrows();
        obj.abc();
    }
}
