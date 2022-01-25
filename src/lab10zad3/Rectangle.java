package lab10zad3;

public class Rectangle extends Shape{
    protected double width,height;

    public Rectangle(String name,double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
        System.out.println(name+" construed");
    }
    
    @Override
    public double area() {
       return width*height;
    }   
}