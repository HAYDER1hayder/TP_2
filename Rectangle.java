public class Rectangle extends Shape {
    public double x;
    public double y;
    public Rectangle(double x, double y){
       this.x = x;
       this.y = y;
    }

    public double calculateArea(){
        return  x * y;
    }

    public void display(){
        System.out.println("Rectangle with length:"+ x + "and width" + y);
    }
}
