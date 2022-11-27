class outer{
    int a = 10;
    // static 
    class inner{
        int b = 20;
    }
}

public class outerinner {
    public static void main(String args[]){
        outer o = new outer();
        outer.inner i = o.new inner();
        // outer.inner i = new outer.inner();
        System.out.println(i.b);

    }
}
