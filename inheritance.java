class parent{
    void parent1(){
        System.out.println("Hi I am parent ");
    }
}
class child1 extends parent{
    void child(){
        System.out.println("Hi I am child 1 ");        
    }
}
class child2 extends parent{
    void child(){
        System.out.println("Hi I am child 2 ");
    }
}
class grandchild extends child1{
    void grandchild1(){
        System.out.println("Hi I am Grandchild");
    }
}
class inheritance{
    public static void main(String args[]){
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        grandchild obj3 = new grandchild();
        obj1.parent1();
        obj2.child();
        obj3.parent1();
    }
}