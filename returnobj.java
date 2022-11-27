class student{
    int r;
    student(int roll){
        r = roll;
    }
    student increase(){
        student s = new student(r*10);
        return s;
    }
    }
 //here object is being returned as an parameter to check

class returnobj{
    public static void main(String args[]){
        student obj1 = new student(5);
        student obj2;
        obj2 = obj1.increase();
        
        System.out.println("obj1 val "+obj1.r);
        System.out.println("obj2 val "+obj2.r);
    }
}