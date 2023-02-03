import java.util.ArrayList;

public class Calc {

    public static String Calculator(String polecenie) {
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        boolean ifOperator = true;

        int counterSubString = 0;
        int countMultiplyAndDivide = 0;
        for (int i = 0; i < polecenie.length(); i++) {
            if (polecenie.charAt(i) == '+' || polecenie.charAt(i) == '-' ||
                    polecenie.charAt(i) == 'x' || polecenie.charAt(i) == '/') {
                operators.add(polecenie.charAt(i));
                numbers.add(polecenie.substring(counterSubString, i));
                counterSubString = i + 1;
                if (polecenie.charAt(i) == 'x' || polecenie.charAt(i) == '/') {
                    countMultiplyAndDivide++;
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).charAt(numbers.get(i).length() - 1) == '%')
                numbers.set(i, Double.toString(Double.valueOf(numbers.get(i).substring(0,numbers.get(i).length() - 1)) / 100));
        }
        if (ifOperator) {
            numbers.add(polecenie.substring(counterSubString));
            int countOperators = operators.size();
            Double Sum = Double.valueOf(0);

            while (countOperators > 0) {
                if (countMultiplyAndDivide > 0) {
                    for (int i = 0; i < operators.size(); i++) {

                        if (operators.get(i).equals('x')) {
                            numbers.set(i, Double.toString(multiply(numbers.get(i), numbers.get(i + 1))));

                            numbers.remove(i + 1);
                            operators.remove(i);
                            countOperators--;
                            countMultiplyAndDivide--;

                        } else if (operators.get(i).equals('/')) {
                            numbers.set(i, Double.toString(divide(numbers.get(i), numbers.get(i + 1))));
                            numbers.remove(i + 1);
                            operators.remove(i);
                            countOperators--;
                            countMultiplyAndDivide--;
                        }
                    }
                } else {
                    for (int i = 0; i < operators.size(); i++) {
                        if (operators.get(i).equals('+')) {
                            numbers.set(i, Double.toString(add(numbers.get(i), numbers.get(i + 1))));
                            numbers.remove(i + 1);
                            operators.remove(i);
                            countOperators--;

                        } else if (operators.get(i).equals('-')) {
                            numbers.set(i, Double.toString(del(numbers.get(i), numbers.get(i + 1))));
                            numbers.remove(i + 1);
                            operators.remove(i);
                            countOperators--;

                        } else {
                            ;
                        }
                    }
                }
            }
            for (String num : numbers) {
                Sum += Double.valueOf(num);
            }
            return Sum.toString();
        }
        return polecenie;
    }


    public static Double add(String num1, String num2) {

        return Double.valueOf(num1) + Double.valueOf(num2);
    }

    public static Double del(String num1, String num2) {
        return Double.valueOf(num1) - Double.valueOf(num2);
    }

    public static Double multiply(String num1, String num2) {
        return Double.valueOf(num1) * Double.valueOf(num2);
    }

    public static Double divide(String num1, String num2) {
        return Double.valueOf(num1) / Double.valueOf(num2);
    }
}