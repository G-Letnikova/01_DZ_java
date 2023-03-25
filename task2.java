// --- сумма и факториал введенного числа ---
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
  


Scanner sc = new Scanner(System.in);
    System.out.printf("int number: ");
    boolean flag = sc.hasNextInt();
    if (flag) {
        int summa = 0;
        int factrl = 1;
        int number = sc.nextInt();
        for (int i= 1; i <= number; i++) {
            summa += i;
            factrl *= i;
        }
        System.out.print("summa = ");
        System.out.println(summa);
        System.out.print("factorial = ");
        System.out.println(factrl);
    }  
    else
        System.out.println("error");
      
    sc.close();


    }
}
