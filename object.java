class demo{
    void print(int a){
        System.out.println("Hello user "+a);
    }
    void print2(int a){
        System.out.println("Bye User "+a);
    }
}

class object{
    public static void main(String args[]){
        demo obj = new demo();
        obj.print(5);
        obj.print2(10);
    }
}