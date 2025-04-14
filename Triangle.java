public class Triangle extends Shape {
    public double x;
    public double y;
    public Triangle(double x, double y){
       this.x = x;
       this.y = y;
    }

    public double calculateArea(){
        return  (x * y)/2;
    }

    public void display(){
        System.out.println("Rectangle with base:"+ x + "and height" + y);
    }

}
