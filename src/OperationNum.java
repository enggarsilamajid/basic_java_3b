import java.util.Scanner;

public class OperationNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = Double.parseDouble(input.nextLine());
        double num2 = Double.parseDouble(input.nextLine());
        String oprt = input.nextLine();
        double num3 = 0;
        if ((oprt.equals("+")) || (oprt.equals("-")) || (oprt.equals("*")) ) {
            if (oprt.equals("+")) {
                num3 = num1 + num2;
            } else if (oprt.equals("-")) {
                num3 = num1 - num2;
            } else if (oprt.equals("*")) {
                num3 = num1 * num2;
            }
            if (num3 % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, oprt, num2, num3);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, oprt, num2, num3);
            }
        }
        if ((oprt.equals("/")) || (oprt.equals("%"))) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", num1);
            }
            else if (oprt.equals("/")) {
                num3 = num1 / num2;
                System.out.printf("%.0f %s %.0f = %.2f", num1, oprt, num2, num3);
            } else if (oprt.equals("%")) {
                num3 = num1 % num2;
                System.out.printf("%.0f %s %.0f = %.0f", num1, oprt, num2, num3);
            }
        }
    }
}