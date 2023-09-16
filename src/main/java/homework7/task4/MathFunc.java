package homework7.task4;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleCircumference(double radius) {
        return 2 * PI * radius;
    }
}
