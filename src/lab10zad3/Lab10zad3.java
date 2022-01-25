package lab10zad3;

public class Lab10zad3 {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle("ksztalt",2,3);
        Square square=new Square("kwadrat",2);
        System.out.println(rectangle.area());
        System.out.println(square.area());
        Rectangle rectangle2 = square;
        System.out.println(rectangle2.area());
    }
    
}
