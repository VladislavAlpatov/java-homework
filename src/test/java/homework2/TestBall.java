package homework2;

import homework1.Ball;

public class TestBall {
    public static void main(String[] args)
    {
        homework1.Ball b1 = new Ball(100.0f, 100.0f);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
