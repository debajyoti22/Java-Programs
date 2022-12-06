class animal{
    animal(){
        System.out.println("Animal 1"); 
    }
    animal(String name){
        System.out.println("Welcome : "+name);
    }
    void print(){
        System.out.println("Animal 2");
    }
}
class dog extends animal{
    void print(){
        System.out.println("Dog");
    }
    void work(){    
    super.print();
    print();
    System.out.println("Printed by Super key");
    }

    dog(){
        super();
        System.out.println("Printed by super method");        
    }

    dog(String name){
        super(name);
        System.out.println("Parameter passed by super method");    
    }
}
class superkey{
    public static void main(String args[]){    
    dog d2 = new dog("cat");
    d2.work();
    
    }
}
