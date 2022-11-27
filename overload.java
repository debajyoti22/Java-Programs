class student{
    int r=5;
    String s;
    student(int roll,String name){
        r = roll;
        s = name;
    }
    student(int roll){
        r = roll;
    }
    student(String name){
        s = name;
    }
    void print(){
        System.out.println("Hello "+s+" roll "+r);
    }

}

class overload{
    public static void main(String args[]){
        student obj1 = new student(1,"Sai");
        student obj2 = new student(1);
        student obj3 = new student("Deb");
        obj1.print();
        obj2.print();
        obj3.print();
    }
}