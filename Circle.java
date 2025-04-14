public class Circle extends Shape{
    public double x;
    public Circle(double x){
       this.x = x;
    }

    public double calculateArea(){
        return Math.PI * x * x;
    }

    public void display(){
        System.out.println("Circle with radius : " + x);
    }
}
