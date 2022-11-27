class demo{      
    final int d=5;  
    void print(){
           
        d=10; 
        d =5;
        System.out.println("d "+d);
    }
}


class finale{
    public static void main(String args[]){
        demo d = new demo();       
        d.print();

    }
}