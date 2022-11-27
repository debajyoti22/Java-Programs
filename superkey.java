class animal{
    void bark(){
        System.out.println("Animal is barking ");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dog is barking ");
    }
    void eat(){
        System.out.println("Dog is eating ");
    }
    void work(){
        super.bark(); // super is written to return the parent class of the current object/method
        eat();
    }
}

class superkey{
    public static void main(String args[]){
        dog d = new dog();
        d.work();
    }
}