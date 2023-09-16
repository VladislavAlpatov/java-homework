package homework6.task11;
import java.util.Locale;
import java.util.Scanner;

interface Convertable {
    double convert(double value);
}
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double value) {
        return value + 273.15;
    }
}

class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double value) {
        return (value * 9.0 / 5.0) + 32.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите температуру в градусах Цельсия:");
        double celsius = scanner.nextDouble();

        Convertable toKelvin = new CelsiusToKelvinConverter();
        Convertable toFahrenheit = new CelsiusToFahrenheitConverter();

        double kelvin = toKelvin.convert(celsius);
        double fahrenheit = toFahrenheit.convert(celsius);

        System.out.println("Температура в Кельвинах: " + kelvin);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);

        scanner.close();
    }
}

