class animal{
    void barking(){
        System.out.println("Animal is barking ");
    }
}
class dog extends animal{
    void barking(){
        System.out.println("Dog is barking ");
    }
}
class cat extends animal{
    void barking(){
        System.out.println("Cat is crying ");
    }
}

class overriding{
    public static void main(String args[]){
        animal ref;
        cat c = new cat();        
        dog d = new dog();
        ref = d;
        c.barking();
        ref = c;
        d.barking();
        ref = d;
        ref.barking();
    }
}