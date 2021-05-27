package xyz.eric;

public class Logic {

    public static int sumNumbersIn(String expression) {

        int sum = 0;
        String splitter;

        if (expression.startsWith("/")) {
            splitter = expression.substring(2, expression.lastIndexOf('/'));
            expression = expression.substring(expression.lastIndexOf('/')+1);
        } else {
            splitter = ",";
        }

        for (String number : expression.split(splitter)) {

            String trimmedNumer = number.trim();

            if (trimmedNumer.chars().allMatch(Character::isDigit))
                sum += Integer.parseInt(trimmedNumer);
        }

        return sum;
    }
}