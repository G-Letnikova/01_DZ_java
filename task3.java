//---- калькулятор ----------------------

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
  


        Scanner sc = new Scanner(System.in);
        System.out.printf("int number: ");
        int num1 = sc.nextInt();
        System.out.printf("int action: ");
        String act = sc.next();
        System.out.printf("int number: ");
        int num2 = sc.nextInt();
        int result = 0;
        switch (act) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
            result = num1 - num2;
            break;

            case "*":
            result = num1 * num2;
            break;

            case "/":
            result = num1 / num2;
            break;

            default:
            System.out.println("error");
            break;
        }
        System.out.println(result);

        sc.close();



    }
}
