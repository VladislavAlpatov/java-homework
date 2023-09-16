package homework7.task4;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("2^3 = " + mc1.power(2, 3));
        System.out.println("Modulus of complex number (3, 4) = " + mc1.complexModulus(3, 4));

        // Не правильно, нельзя создать экземпляр интерфейса
        // MathCalculable mc2 = new MathCalculable();

        // Использование дополнительного метода
        MathFunc mathFunc = (MathFunc) mc1; // явное приведение типов
        System.out.println("Circumference of circle with radius 5 = " + mathFunc.circleCircumference(5));
    }
}
