package homework3;

public class TestShapes
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle("RED", false, 5.5); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.GetArea()); // which version?
        System.out.println(s1.GetPerimeter()); // which version?
        System.out.println(s1.GetColor());
        // System.out.println(s1.IsFilled());
        // System.out.println(s1.GetRadius());
        Circle c1 = (Circle)s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        // System.out.println(c1.IsFilled());
        System.out.println(c1.GetRadius());
        // shape s2 = new Shape();
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // upcast
        System.out.println(s3);
        System.out.println(s3.GetArea());
        System.out.println(s3.GetPerimeter());
        System.out.println(s3.GetColor());

        // System.out.println(s3.GetLength());
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.GetArea());
        System.out.println(r1.GetColor());
        System.out.println(r1.GetLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.GetArea());
        System.out.println(s4.GetColor());
        // System.out.println(s4.GetSide());
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.GetArea());
        System.out.println(r2.GetColor());
        // System.out.println(r2.GetSide());
        System.out.println(r2.GetLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.GetArea());
        System.out.println(sq1.GetColor());
        System.out.println(sq1.GetSide());
        System.out.println(sq1.GetLength());

    }
}
