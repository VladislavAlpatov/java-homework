package homework3.shell;

public class Main {
    public static void main(String[] args) {
        // 1. Создание объекта класса Double с помощью метода valueOf()
        Double myDouble = Double.valueOf(10.5);

        // 2. Преобразование строки в double
        double fromString = Double.parseDouble("10.5");

        // 3. Преобразование объекта Double ко всем примитивным типам
        byte myByte = myDouble.byteValue();
        short myShort = myDouble.shortValue();
        int myInt = myDouble.intValue();
        long myLong = myDouble.longValue();
        float myFloat = myDouble.floatValue();

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Значение myDouble: " + myDouble);

        // 5. Преобразование литерала типа double в строку
        String fromDouble = Double.toString(3.14);

        // Вывод всех преобразованных значений для проверки
        System.out.println("Преобразованная строка в double: " + fromString);
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Integer value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double to String: " + fromDouble);
    }
}
