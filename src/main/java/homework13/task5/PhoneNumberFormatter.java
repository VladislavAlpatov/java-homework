package homework13.task5;

public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String input) {
        String digitsOnly = input.replaceAll("[^0-9]", "");

        if (digitsOnly.startsWith("8")) {
            digitsOnly = "+7" + digitsOnly.substring(1);
        }

        StringBuilder formattedNumber = new StringBuilder();
        int length = digitsOnly.length();

        if (length == 11) {
            formattedNumber.append("+").append(digitsOnly.substring(1, 4))
                    .append("-").append(digitsOnly.substring(4, 7))
                    .append("-").append(digitsOnly.substring(7));
        } else if (length == 12) {
            formattedNumber.append("+").append(digitsOnly.substring(2, 5))
                    .append("-").append(digitsOnly.substring(5, 8))
                    .append("-").append(digitsOnly.substring(8));
        } else {
            formattedNumber.append(digitsOnly);
        }
        String out = "";

        for (int i = 0; i < (input.replace("+", "").length() - 10); i++)
        {
            out += input.replace("+", "").charAt(i);
        }


        return "+"+out+formattedNumber.toString().replace("+", "");
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        String formatted1 = formatPhoneNumber(phoneNumber1);
        String formatted2 = formatPhoneNumber(phoneNumber2);
        String formatted3 = formatPhoneNumber(phoneNumber3);

        System.out.println("Formatted 1: " + formatted1);
        System.out.println("Formatted 2: " + formatted2);
        System.out.println("Formatted 3: " + formatted3);
    }
}
