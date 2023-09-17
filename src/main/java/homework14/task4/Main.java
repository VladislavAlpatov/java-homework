package homework14.task4;

public class Main {
    public static void main(String[] args) {
        String correctExpression = "(1 + 8) - 9 / 4";
        String wrongExpression = "6 / 5 - 2 * 9";

        System.out.println("В правильном выражении все цифры после +: " + HasPlusAfterNumber(correctExpression));
        System.out.println("В неправильном выражении все цифры после +: " + HasPlusAfterNumber(wrongExpression));
    }

    public static boolean HasPlusAfterNumber(String expression) {
        boolean bIsAfterNumber = false;


        for (int i = 0; i < expression.length(); i++)
        {
            if (expression.charAt(i) == ' ')
                continue;

            if (expression.charAt(i) == '+' && bIsAfterNumber)
                return true;

            bIsAfterNumber = Character.isDigit(expression.charAt(i));
        }
        return false;

    }
}


