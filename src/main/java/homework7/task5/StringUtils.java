package homework7.task5;

public interface StringUtils {
    // Функция для подсчета символов в строке
    int countCharacters(String s);

    // Функция, возвращающая строку, содержащую символы на нечетных позициях
    String getOddPositionCharacters(String s);

    // Функция для инвертирования строки
    String reverseString(String s);
}
