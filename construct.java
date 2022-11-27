//write a program to implement different types of constructor
class student{    
    String name;
    student(){
        name = "Sai"; //default constructor
        System.out.println("Hello student "+name);
    }
    student(String s){
        this.name = s;  //parameterized constructor   
    }
    student(student s){                
        name = s.name;  //copy constructor      
    }
    void print(){
        System.out.println("Hello student "+name);
    }
    
}

class construct{
    public static void main(String args[]){
        student obj = new student();
        student obj2 = new student("Deb");
        student obj3 = new student(obj2);
      
        obj2.print();
        obj3.print();
    }
}