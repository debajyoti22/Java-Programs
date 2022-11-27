interface hello{
    void draw();
}
class rectangle implements hello{
     public void draw(){
        System.out.println("Rectangle drawn");
    }
}
class circle implements hello{
    public void draw(){
        System.out.println("Circle drawn");
    }
}

class inter{
    public static void main(String args[]){
    circle c = new circle();
    c.draw();

    }
}