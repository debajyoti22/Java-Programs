class student{
    int r;
    student(int roll){
        r = roll;
    }
    boolean check(student s){
        return r==s.r;
    }
} //here object is being passed as an parameter to check

class passobj{
    public static void main(String args[]){
        student obj1 = new student(5);
        student obj2 = new student(5);
        student obj3 = new student(15);
        System.out.println("obj1 == obj2 ? "+obj2.check(obj1));
        System.out.println("obj1 == obj3 ? "+obj3.check(obj1));
    }
}