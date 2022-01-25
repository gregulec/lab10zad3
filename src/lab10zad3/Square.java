package lab10zad3;

public class Square extends Rectangle{

    public Square(String name,double width) {
        super(name,width,width);
        System.out.println(name+" construed");
    }
    
    @Override
    public double area(){
        return width*width;
    }
}
