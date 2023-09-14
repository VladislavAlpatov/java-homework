package homework2.task8;

public class ReverseArray {
    public static void main(String[] args) {
        // Исходный массив строк
        String[] arr = {"one", "two", "three", "four", "five"};

        // Выводим исходный массив
        System.out.println("Original array: " + String.join(", ", arr));

        // Меняем элементы местами
        reverseArrayInPlace(arr);

        // Выводим обратный массив
        System.out.println("Reversed array: " + String.join(", ", arr));
    }

    public static void reverseArrayInPlace(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            // Меняем элементы с индексами i и n-i-1
            String temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}

