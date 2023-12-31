package alexQI.java.day14_multi_branch_if_statements;

/**
 num1, num2
 char operator -> -, +, *, /

 when operator: + : add num1, num2
 when operator: - : add num1, num2
 when operator: * : add num1, num2
 when operator: / : add num1, num2
 any other: "invalid operator"
 */



public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 2.5;
        char operator = '-';

        if (operator == '+') {
            System.out.println(num1+num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator - " + operator);
        }
    }
}
